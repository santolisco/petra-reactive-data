package com.bat.petra.data.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.classify.annotation.Classifier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name = "Petra_order__C", schema = "salesforcedev04")
public class Order implements Serializable {



    @Column(name = "Account__c")
    private String accountId;

    @Column(name = "Order_Type__c")
    private String orderType;

    @Column(name = "Status__c")
    private String Status;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "Heroku_Id__c")
    private UUID herokuId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public UUID getHerokuId() {
        return herokuId;
    }

    public void setHerokuId(UUID herokuId) {
        this.herokuId = herokuId;
    }
}
