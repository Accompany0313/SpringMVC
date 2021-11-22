package com.example.test;

import com.example.dao.DepartmentMapper;
import com.example.pojo.Department;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/21
 * \* Time: 23:19
 * \* Description:
 * \
 */
public class DepartmentConnEmployeeTest {

    @Test
    public void test() {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("spring-mybatis.xml");
        DepartmentMapper departmentMapper = ac.getBean(DepartmentMapper.class);
        Department department = departmentMapper.selectConn(1);
        System.out.println(department);
    }
}
