package com.hr.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Worker {

    private Data data;
    private LocalDate dateReadjustment;

    public Worker(String name, String document, Position position, BigDecimal salary) {
        this.data = new Data(name, document, position, salary);
    }

    public void updateSalary(BigDecimal newSalary) {
        this.data.setSalary(newSalary);
        this.dateReadjustment = LocalDate.now();
    }

    public void jobPromotion(Position newPosition) {
        this.data.setPosition(newPosition);
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public LocalDate getDateReadjustment() {
        return dateReadjustment;
    }

    public void setDateReadjustment(LocalDate dateReadjustment) {
        this.dateReadjustment = dateReadjustment;
    }
}
