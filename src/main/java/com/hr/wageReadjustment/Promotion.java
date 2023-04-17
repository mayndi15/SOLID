package com.hr.wageReadjustment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion implements TaxReadjustment {

    private BigDecimal value;
    private LocalDate date;

    public Promotion(BigDecimal value) {
        this.value = value;
        this.date = LocalDate.now();
    }

    @Override
    public BigDecimal value() {
        return value;
    }

    @Override
    public LocalDate date() {
        return date;
    }

    @Override
    public BigDecimal incomeTax() {
        return value.multiply(new BigDecimal("0.1"));
    }
}
