package com.emexo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.emexo.dao");

        AccountDAO accountDAO = applicationContext.getBean("accountDAOImpl", AccountDAOImpl.class);

        Account account = new Account();
        account.setAccountName("Regu");
        account.setAccountType("Saving");
        accountDAO.save(account);

        Account account1 = new Account();
        account1.setAccountNo(1);
        account1.setAccountName("Ajay");
        int response = accountDAO.update(account1);
        System.out.println(response);

       int deleteResponse = accountDAO.delete(1);
        System.out.println(deleteResponse);

        List<Account> accounts = accountDAO.findAllAccounts();
        for(Account acc: accounts){
            System.out.println(acc.getAccountNo() + " : " + acc.getAccountName() + " : "+ acc.getAccountType());
        }

        Account account2 = accountDAO.findByAccountId(1);
        System.out.println(account2.getAccountNo() + " : " + account2.getAccountName() + " : "+ account2.getAccountType());

    }
}
