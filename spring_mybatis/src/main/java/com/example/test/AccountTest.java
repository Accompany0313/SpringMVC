package com.example.test;

import com.example.dao.AccountDao;
import com.example.pojo.Account;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jca.context.ResourceAdapterApplicationContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/20
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class AccountTest {

    @Test
    public void test() {
        ApplicationContext act =
                new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AccountDao accountDao = act.getBean(AccountDao.class);
        Account account = accountDao.selectAll(3);
        System.out.println(account.toString());
    }
}
