package com.bat.petra.data.common.repository;

import com.bat.petra.data.common.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AccountRepository extends JpaRepository<Account, Long> {


    @Query("SELECT c.id FROM Account c WHERE c.id = ?1")
    String getAccountId(String SAPNumber);

    @Query("SELECT '*' FROM Account")
    Integer getTotalAccounts();

    @Query("SELECT '*' FROM Account")
    List<String> getAllIds();
}
