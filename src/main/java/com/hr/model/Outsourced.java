package com.hr.model;

import java.math.BigDecimal;

public class Outsourced {

    private Data data;
    private  String company;

    public Outsourced(String name, String document, Position position, BigDecimal salary) {
        this.data = new Data(name, document, position, salary);
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
