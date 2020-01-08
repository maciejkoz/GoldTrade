package com.example.goldTradeDemo.repository;

import com.example.goldTradeDemo.model.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
    List<UserAccount> findByOwnerEmail(String ownerEmail);
}

