package com.bat.petra.data.common.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name = "product2", schema = "salesforcedev04")
public class Product implements Serializable {


    @NaturalId
    @Column(name = "id")
    private String id;

    @Column(name= "productcode")
    private String productId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


}
