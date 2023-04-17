package com.hr.validate;

import com.hr.model.Worker;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidatePercentageReadjustment implements ValidateReadjustment {

    public void validate(Worker worker, BigDecimal salaryIncrease) throws Exception {
        BigDecimal salary = worker.getData().getSalary();
        BigDecimal percentageReadjustment = salaryIncrease.divide(salary, RoundingMode.HALF_UP);

        if (percentageReadjustment.compareTo(new BigDecimal("0.4")) > 0) {
            throw new Exception();
        }
    }
}
