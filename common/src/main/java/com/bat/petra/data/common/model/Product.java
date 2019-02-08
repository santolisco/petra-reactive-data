package com.bat.petra.data.common.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name = "product2", schema = "salesforcedev04")
public class Product implements Serializable {


    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "productcode")
    private String productId;



}