package com.example.controller;

import com.example.impl.EmployeeDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/22
 * \* Time: 20:05
 * \* Description:
 * \
 */
@Controller
public class IndexController {

    @Resource(name = "employeeDaoImpl")
    private EmployeeDaoImpl employeeDao;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("employeeList", employeeDao.selectAll());
        mav.setViewName("/index");
        return mav;
    }
}
