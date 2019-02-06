package com.bat.petra.data.common.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dataset__c", schema = "salesforcedev04")
public class Dataset implements Serializable {


        @NaturalId
        @Column(name = "id",  updatable=false, insertable=false)
        private String id;

        @Column(name = "name")
        private String name;

        @Column(name = "heroku_id__c")
        private String herokuid;

        @Column(name = "patch__c")
        private String path;

        @Enumerated(EnumType.STRING)
        @Column(name = "status__c")
        private String status;


        public Dataset() {}


        public String getId() {
        return id;
        }

        public String getName() {
        return name;
        }

        public String getherokuid() {
        return herokuid;
        }

        public String getStatus() {
        return status;
    }

        public void setStatus(ProcessStatus status) {

            this.status = status.toString();
        }



    @Override
    public String toString() {

        return "Dataset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fileUrl='" + herokuid + '\'' +
                ", status=" + status +
                '}';
    }
}
