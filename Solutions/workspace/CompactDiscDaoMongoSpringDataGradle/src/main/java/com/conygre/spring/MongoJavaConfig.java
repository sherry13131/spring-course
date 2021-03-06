package com.conygre.spring;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan
@EnableMongoRepositories(basePackages = "com.conygre.spring.data")
public class MongoJavaConfig extends AbstractMongoConfiguration{

    @Override
    protected String getDatabaseName() {
        return "mydatabase";
    }

	@Override
    public Mongo mongo() throws Exception {
        return new MongoClient("127.0.0.1", 27017);

    }  
    
    

}
