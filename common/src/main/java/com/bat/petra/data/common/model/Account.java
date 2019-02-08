package com.bat.petra.data.common.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "Account", schema = "salesforcedev04")
public class Account implements Serializable {

    @NaturalId
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "ivybat__SAP_CustomerId__c")
    private String SAPNumber;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSAPNumber() {
        return SAPNumber;
    }

}
