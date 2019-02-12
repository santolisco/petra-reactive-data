package com.bat.petra.data.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name = "Petra_Order_Line_Item__c", schema = "salesforcedev04")
public class LineItem implements Serializable {


    @Column(name = "Petra_Order__c")
    private String orderId;

    @Column(name = "Product__c")
    private String productId;

    @Column(name = "Quantity__c")
    private Double Quantity;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "Heroku_Id__c")
    private UUID herokuId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getQuantity() {
        return Quantity;
    }

    public void setQuantity(Double quantity) {
        Quantity = quantity;
    }

    public UUID getHerokuId() {
        return herokuId;
    }

    public void setHerokuId(UUID herokuId) {
        this.herokuId = herokuId;
    }
}

