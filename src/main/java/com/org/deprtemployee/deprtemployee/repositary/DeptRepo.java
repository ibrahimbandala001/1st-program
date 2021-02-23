package com.org.deprtemployee.deprtemployee.repositary;


import com.org.deprtemployee.deprtemployee.modeldept.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends MongoRepository<Department,Integer> {
}
