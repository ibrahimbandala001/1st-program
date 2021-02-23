package com.org.deprtemployee.deprtemployee.repositary;

import com.org.deprtemployee.deprtemployee.modeldept.EmplyAndDept;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpAndDeptRepo extends MongoRepository<EmplyAndDept,Integer> {
}
