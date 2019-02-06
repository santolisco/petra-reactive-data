package com.bat.petra.data.common.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "mappingrules__c", schema = "salesforce")
public class MappingRules implements Serializable {

    @NaturalId
    @Column(name = "id",  updatable=false, insertable=false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "TargetEntity")
    private String targetEntity;

    @Column(name = "TargetField")
    private String targetField;

    @Column(name = "TargetValue")
    private String targetValue;

    @Column(name = "SourceEntity")
    private String sourceEntity;

    @Column(name = "sourceField")
    private String sourceField;

    @Column(name = "sourceValue")
    private String sourceValue;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetEntity() {
        return targetEntity;
    }

    public void setTargetEntity(String targetEntity) {
        this.targetEntity = targetEntity;
    }

    public String getTargetField() {
        return targetField;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public String getSourceEntity() {
        return sourceEntity;
    }

    public void setSourceEntity(String sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    public String getSourceField() {
        return sourceField;
    }

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }



}
