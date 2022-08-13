package com.atguigu.d.objective.obj1;

/**
 * @author Wint
 * @create 2022-06-22 10:33
 */
//\1_课件\第1部分：Java基础编程\第1部分：Java基础编程\尚硅谷_宋红康_第4章_面向对象编程(上)\实验1：Account_Customer.pdf
/*
     写一个测试程序。
    （1）	创建一个Customer ，名字叫 Jane Smith,
    他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
    （2）	对Jane Smith操作。
    存入 100 元，再取出960元。再取出2000元。
    打印出Jane Smith 的基本信息
    成功存入 ：100.0
    成功取出：960.0
    余额不足，取款失败
    Customer [Smith, Jane] has a account: id is 1000,
    annualInterestRate is 1.23％, balance is 1140.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane", "Smith");

        Account acct = new Account(1000, 2000, 0.0123);

        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() +
                "] has a account: id is " + cust.getAccount().getId() + ",annualInterestRate is " +
                cust.getAccount().getAnnualInterestRate() * 100 + "% ,balance is " + cust.getAccount().getBalance());
    }
}
