package com.org.deprtemployee.deprtemployee.repositary;

import com.org.deprtemployee.deprtemployee.modeldept.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,Integer> {
}
