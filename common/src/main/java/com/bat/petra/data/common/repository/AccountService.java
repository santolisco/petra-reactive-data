package com.bat.petra.data.common.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);


    @Autowired
    AccountRepository MyAccountRepo;

    public String getAccountId(String SAPNumber) {
        return MyAccountRepo.getAccountId(SAPNumber);
    }

    public Integer getTotalRows() {
        System.out.print("Hola carola total");
        return MyAccountRepo.getTotalAccounts();
    }

    public List<String> getTotalIds() {
        LOGGER.info("hola");
       try {
           return MyAccountRepo.getAllIds();
       }
        catch (Exception e) {
            LOGGER.error(e.toString());
            return null;
           }

    }
}
