package com.training.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.mongo.collections.MyEmployee;

public interface EmployeeRepository extends MongoRepository<MyEmployee, Long> {

}
