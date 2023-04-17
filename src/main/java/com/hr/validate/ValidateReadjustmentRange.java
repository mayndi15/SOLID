package com.hr.validate;

import com.hr.model.Worker;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidateReadjustmentRange implements ValidateReadjustment {

    public void validate(Worker worker, BigDecimal salaryIncrease) throws Exception {
        LocalDate dateLastReadjustment = worker.getDateReadjustment();
        LocalDate dateNow = LocalDate.now();
        long readjustmentRange = ChronoUnit.MONTHS.between(dateLastReadjustment, dateNow);

        if (readjustmentRange < 6) {
            throw new Exception();
        }
    }
}
