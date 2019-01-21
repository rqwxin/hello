package com.cgx.springboot.hello;

import com.cgx.springboot.hello.mongodb.Customer;
import com.cgx.springboot.hello.config.MongoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
//@SpringBootTest(classes = HelloApplication.class)
public class MongoTest {
    @Autowired
    private MongoTemplate mongoTemplate;
  //  @Autowired
   // private CustomerRepository customerRepository;

    @Test
    public void testSave(){
        Customer c = new Customer("chen","hongyuan");
        c.setId((UUID.randomUUID().toString()));
        mongoTemplate.save(c);
        System.out.println("保存mongo成功");
       // repository.save(c);
    }
    @Test
    public void testQuery(){
        List<Customer> ls = mongoTemplate.findAll(Customer.class);
     //   List<Customer> ls =  customerRepository.findByFirstName("chen");
        ls.forEach(c -> {
        //    System.out.println("第"+i+"个人");
            System.out.println("first-name："+c.getFirstName());
            System.out.println("last-name："+c.getLastName());
        });
      //  ls.stream().filter(customer -> customer.getLastName().length()>6 ).map()
    }

}
