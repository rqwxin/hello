package com.cgx.springboot.hello.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Customer> findByFirstName(String firstName) {

        Criteria c = Criteria.where("firstName").is(firstName);
        Query query = new Query();
        query.addCriteria(c);
        List<Customer> ls = mongoTemplate.find(query,Customer.class);
        return ls;
    }

    @Override
    public List<Customer> findByLasstName(String lastName) {
        Criteria c = Criteria.where("lastName").is(lastName);
        Query query = new Query();
        query.addCriteria(c);
        List<Customer> ls = mongoTemplate.find(query,Customer.class);
        return ls;
    }
}
