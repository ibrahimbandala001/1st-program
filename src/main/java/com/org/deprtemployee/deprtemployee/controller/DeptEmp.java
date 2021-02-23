package com.org.deprtemployee.deprtemployee.controller;


import com.org.deprtemployee.deprtemployee.modeldept.Department;
import com.org.deprtemployee.deprtemployee.modeldept.Employee;
import com.org.deprtemployee.deprtemployee.modeldept.EmplyAndDept;
import com.org.deprtemployee.deprtemployee.repositary.DeptRepo;
import com.org.deprtemployee.deprtemployee.repositary.EmpAndDeptRepo;
import com.org.deprtemployee.deprtemployee.repositary.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DepartmentEmployeeEmplyAndDept")
public class DeptEmp {
@Autowired
DeptRepo dRepo;
@Autowired
EmpAndDeptRepo empAndDeptRepo;
@Autowired
EmployeeRepo eRepo;
@PostMapping("create emply")
    public void createEmply(@RequestBody Department dep )
{
dRepo.save(dep);
}
@PostMapping("create dept")
    public void creatDept(@RequestBody Employee emp)
{
eRepo.save(emp);
}
@PostMapping("create empdept")
    public void createEmpAndDept(@RequestBody EmplyAndDept ead)
{
    empAndDeptRepo.save(ead);
}
@GetMapping("create dept")
public List<Department> createdept()
{
    List<Department> all = dRepo.findAll();
    return all;
}
@GetMapping
public List<Employee> createsmply()
    {
        List<Employee> all = eRepo.findAll();
        return all;
    }
@GetMapping("retrive")
    public void creatEmpAndDept()
{
    List<Department> all = dRepo.findAll();
    List<Employee> all1 = eRepo.findAll();
    for(int i=0;i<all.size();i++)
    {
        for(int j=0;j<all1.size();j++)
        {
            Department department = all.get(i);
            Employee employee = all1.get(j);
            if(department.getDeptid()== employee.getDeptid())
            {
EmplyAndDept emplyAndDept=new EmplyAndDept();
emplyAndDept.setDeptname(department.getDeptname());
emplyAndDept.setDeptid(department.getDeptid());
emplyAndDept.setDeptid(employee.getDeptid());
emplyAndDept.setEmpsalary(employee.getEmpsalary());
emplyAndDept.setEmplid(employee.getEmplid());
emplyAndDept.setEmpname(employee.getName());
empAndDeptRepo.save(emplyAndDept);
            }
        }
    }

}


}
