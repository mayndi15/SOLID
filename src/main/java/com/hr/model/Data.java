package com.hr.model;

import java.math.BigDecimal;

public class Data {

    private String name;
    private String document;
    private Position position;
    private BigDecimal salary;

    public Data(String name, String document, Position position, BigDecimal salary) {
        this.name = name;
        this.document = document;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
