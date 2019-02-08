package com.bat.petra.data.common.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "External_Mapping_Rule__c", schema = "salesforcedev04")
public class MappingRules implements Serializable {


    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "target_object__c")
    private String targetEntity;

    @Column(name = "target_field__c")
    private String targetField;

    @Column(name = "target_value__c")
    private String targetValue;

    @Column(name = "source_object__c")
    private String sourceEntity;

    @Column(name = "source_field__c")
    private String sourceField;

    @Column(name = "source_value__c")
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
