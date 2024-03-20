package com.emexo.dao;


import java.util.List;

public interface AccountDAO {

    int save(Account account);

    int update(Account account);

    int delete(int accountNo);

    List<Account> findAllAccounts();

    Account findByAccountId(int accountNo);

}
