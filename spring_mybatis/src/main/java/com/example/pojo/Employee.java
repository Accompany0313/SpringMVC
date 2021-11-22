package com.example.pojo;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/11/21
 * \* Time: 22:40
 * \* Description:
 * \
 */
public class Employee {
    private Integer id;
    private String username;
    private Integer balance;
    private Integer did;
//    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                ", did=" + did +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", balance=" + balance +
//                ", did=" + did +
//                ", department=" + department +
//                '}';
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
