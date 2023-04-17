package com.hr.validate;

import com.hr.model.Worker;

import java.math.BigDecimal;

public interface ValidateReadjustment {

    void validate(Worker worker, BigDecimal salaryIncrease) throws Exception;

}
