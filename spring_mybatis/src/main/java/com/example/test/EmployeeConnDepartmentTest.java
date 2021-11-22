package com.example.test;

import com.example.dao.EmployeeMapper;
import com.example.pojo.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/21
 * \* Time: 22:56
 * \* Description:
 * \
 */
public class EmployeeConnDepartmentTest {

    @Test
    public void test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-mybatis.xml");
        EmployeeMapper employeeMapper = applicationContext.getBean(EmployeeMapper.class);
        Employee employee = employeeMapper.selectConnById(1);
        System.out.println(employee.toString());
    }
}
