package com.example.controller;

import ch.qos.logback.core.joran.event.SaxEvent;
import com.example.impl.EmployeeDaoImpl;
import com.example.pojo.Employee;
import com.sun.org.apache.xml.internal.serialize.IndentPrinter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

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
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/success", method = RequestMethod.POST)
    @ResponseBody
    public String success(String username, String password) {
        System.out.println("username : " + username);
        System.out.println("passwoed : " + password);
        return "";
    }

    @RequestMapping(name = "/jsonTest", method = RequestMethod.DELETE)
    @ResponseBody
    public Employee jsonTest() {
        return employeeDao.selectById(1);
    }

    @RequestMapping(value = "/testAjax")
    @ResponseBody
    public String testAjax(String username, String password) {
        System.out.println(username + ":" +password);
        return "hello world";
    }

    @RequestMapping(value = "/fileDown")
    public ResponseEntity<byte[]> fileDown(HttpSession session) throws IOException {
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/static/img/1.JPG");
        InputStream is = new FileInputStream(realPath);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=1.JPG");
        HttpStatus status = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity <byte[]>(bytes, headers, status);
        is.close();
        return responseEntity;
    }

//    文件上传
    @RequestMapping("/fileUp")
    public String fileUp(MultipartFile photo, HttpSession session) throws IOException {
        String fileName = photo.getOriginalFilename();
        //处理文件重名的问题
        String hzName = fileName.substring(fileName.lastIndexOf("."));
        fileName  = UUID.randomUUID().toString().replaceAll("-", "") + hzName;
        //获取服务器中的photo目录的路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getContextPath();
        File file = new File(photoPath);
        if (!file.exists()) {
            file.mkdir();
        }
        String finalPath = photoPath + File.separator + fileName;
        photo.transferTo(new File(finalPath));
        return "testAjax";
    }

}
