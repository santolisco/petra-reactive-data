package com.bat.petra.data.common.repository;

import com.bat.petra.data.common.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Long> {


    @Query("SELECT c.id FROM Account c WHERE c.SAPNumber = ?1")
    String getAccountId(String SAPNumber);
}
