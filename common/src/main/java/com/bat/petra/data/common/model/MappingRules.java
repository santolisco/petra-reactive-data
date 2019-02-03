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

}
