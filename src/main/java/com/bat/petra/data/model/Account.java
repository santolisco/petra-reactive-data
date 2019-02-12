package com.bat.petra.data.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "Account", schema = "salesforcedev04")
public class Account implements Serializable {


    private static final Logger LOGGER = LoggerFactory.getLogger(Account.class);

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "ivybat__SAP_CustomerId__c")
    private String SAPNumber;


    public String getId() {

        LOGGER.info(id);
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSAPNumber() {
        return SAPNumber;
    }

}
