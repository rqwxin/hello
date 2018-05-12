package com.cgx.springboot.hello.mongodb;

import com.mongodb.MongoClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.cgx.springboot.hello.mongodb"
                         ,basePackageClasses = CustomerRepositoryImpl.class)
public class MongoConfig {
    @Bean
    public MongoClient getMongo(){
        MongoClient mongo = new MongoClient();
        return  mongo;
    }
    @Bean
    public  CustomerRepository getCustomerRepository(){
        return  new CustomerRepositoryImpl();
    }

    @Bean
    public MongoOperations getMongoTemplate(){
        MongoClient mongo2 = getMongo();
        MongoTemplate mongoTemplate =  new MongoTemplate(mongo2,"mongodb");
        return  mongoTemplate;
    }
}
