package com.example.impl;

import com.example.dao.EmployeeDao;
import com.example.pojo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/22
 * \* Time: 19:13
 * \* Description:
 * \
 */
@Repository("employeeDaoImpl")
public class EmployeeDaoImpl {

    public EmployeeDao creatXml() {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao employeeDao = ac.getBean(EmployeeDao.class);
        return employeeDao;
    }

    public Employee selectById(Integer id) {
        Employee employee = this.creatXml().selectById(id);
        return employee;
    }

    public List <Employee> selectAll() {
        List<Employee> list = this.creatXml().selectAll();
        return list;
    }

    public void delete(Integer id) {
        this.creatXml().delete(id);
    }

    public void insert(Employee e) {
        this.creatXml().update(e);
    }

    public void update(Employee e) {
        this.creatXml().insert(e);
    }
}
