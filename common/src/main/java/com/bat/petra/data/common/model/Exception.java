package com.bat.petra.data.common.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;



@Entity
@Table(name = "exception__c", schema = "salesforce")
public class Exception implements Serializable {




    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "heroku_id__c")
    private UUID herokuid;


    @Column(name = "Message__c")
    private String message;


    @Column(name = "error__c")
    private String errordesc;

    public String getErrordesc() {
        return errordesc;
    }

    public void setErrordesc(String errordesc) {
        this.errordesc = errordesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getHerokuid() {
        return herokuid;
    }

    public void setHerokuid(UUID herokuid) {
        this.herokuid = herokuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }






}
