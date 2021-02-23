package com.org.deprtemployee.deprtemployee.modeldept;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {
    private int deptid;
    private double deptsalary;
    private String deptname;

    public double getDeptsalary() {
        return deptsalary;
    }

    public void setDeptsalary(double deptsalary) {
        this.deptsalary = deptsalary;
    }



    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }


    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }


}
