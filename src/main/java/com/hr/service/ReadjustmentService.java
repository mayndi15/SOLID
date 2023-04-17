package com.hr.service;

import com.hr.model.Worker;
import com.hr.validate.ValidateReadjustment;

import java.math.BigDecimal;
import java.util.List;

public class ReadjustmentService {

    private List<ValidateReadjustment> validates;

    public ReadjustmentService(List<ValidateReadjustment> validates) {
        this.validates = validates;
    }

    public void updateSalary(Worker worker, BigDecimal salaryIncrease) {
        this.validates.forEach(v -> v.validate(worker, salaryIncrease));

        BigDecimal newSalary = worker.getData().getSalary().add(salaryIncrease);
        worker.updateSalary(newSalary);
    }
}
