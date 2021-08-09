package com.example.WebFin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity // This tells Hibernate to make a table out of this class
public class CompanyInfo {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String ticker;
        private String value;

        private String filename;

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public CompanyInfo() { //обязательно конструктор без параметров, если @Entity
        }

        public CompanyInfo(String ticker, String value) {
            this.ticker = ticker;
            this.value = value;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTicker() {
            return ticker;
        }

        public void setTicker(String ticker) {
            this.ticker = ticker;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
