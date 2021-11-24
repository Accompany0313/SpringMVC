package com.example.dao;

import com.example.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/22
 * \* Time: 19:00
 * \* Description:
 * \
 */
public interface EmployeeDao {
    /*
     * @params: [id]
     * @return: com.example.model.pojo.Employee
     * @author: ygc
     * @dateTime: 2021/11/22 19:08
     * @description: 实现对t_employee表通过id的查询
    */
    public Employee selectById(Integer id);

    /*
     * @params: []
     * @return: java.util.List<com.example.model.pojo.Employee>
     * @author: ygc
     * @dateTime: 2021/11/22 19:09
     * @description: 实现对t_employee表的全部查询
    */
    public List<Employee> selectAll();

    /*
     * @params: [id]
     * @return: void
     * @author: ygc
     * @dateTime: 2021/11/22 19:10
     * @description:实现对t_employee表的删除操作
    */
    public void delete(Integer id);

    /*
     * @params: [e]
     * @return: void
     * @author: ygc
     * @dateTime: 2021/11/22 19:11
     * @description:实现对t_employee表的插入
    */
    public void insert(Employee e);

    /*
     * @params: [e]
     * @return: void
     * @author: ygc
     * @dateTime: 2021/11/22 19:12
     * @description:实现对t_emplopee表的更新
    */
    public void update(Employee e);
}
