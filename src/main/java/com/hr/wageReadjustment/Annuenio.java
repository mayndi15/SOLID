package com.hr.wageReadjustment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Annuenio implements Readjustment {

    private BigDecimal value;
    private LocalDate date;

    public Annuenio(BigDecimal value) {
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
}
