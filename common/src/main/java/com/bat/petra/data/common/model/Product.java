package com.bat.petra.data.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name = "Product2", schema = "salesforce")
public class Product implements Serializable {



    @Column(name = "Id")
    private String id;

    @Column(name= "ProductCode")
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
