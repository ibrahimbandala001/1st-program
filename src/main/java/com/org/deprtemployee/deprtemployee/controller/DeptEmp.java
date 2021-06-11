package com.org.deprtemployee.deprtemployee.controller;


import com.org.deprtemployee.deprtemployee.modeldept.Department;
import com.org.deprtemployee.deprtemployee.repositary.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/DepartmentEmployeeEmplyAndDept")
public class DeptEmp {
@Autowired
DeptRepo dRepo;

@PostMapping("create emply")
    public void createEmply(@RequestBody Department dep )
{
dRepo.save(dep);
}

    @GetMapping("getdepartment")
    public void get(){
    dRepo.findAll();


}


}
