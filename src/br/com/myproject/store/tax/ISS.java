package br.com.myproject.store.tax;

import br.com.myproject.store.models.Budget;

import java.math.BigDecimal;

public class ISS implements Tax {
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
