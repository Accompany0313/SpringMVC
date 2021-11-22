package com.example.pojo;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/21
 * \* Time: 22:39
 * \* Description:
 * \
 */
public class Department {
    private Integer id;
    private String department;
    private List<Employee> employee;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", employee=" + employee +
                '}';
    }

    public List <Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List <Employee> employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
