package com.cgx.springboot.hello.mongodb;

import com.cgx.springboot.hello.mongodb.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findByFirstName(String firstName);

    public List<Customer> findByLasstName(String lastName);
}
