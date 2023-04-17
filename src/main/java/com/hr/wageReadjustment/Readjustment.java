package com.hr.wageReadjustment;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Readjustment {

    BigDecimal value();

    LocalDate date();
}
