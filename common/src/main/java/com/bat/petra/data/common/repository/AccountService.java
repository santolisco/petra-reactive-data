package com.bat.petra.data.common.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {

    @Autowired
    AccountRepository MyAccountRepo;

    public String getAccountId(String SAPNumber) {
        return MyAccountRepo.getAccountId(SAPNumber);
    }
}
