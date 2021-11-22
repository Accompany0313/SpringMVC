package com.example.dao;

import com.example.pojo.Employee;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/21
 * \* Time: 22:45
 * \* Description:
 * \
 */
public interface EmployeeMapper {
    public Employee selectConnById(Integer id);
}
