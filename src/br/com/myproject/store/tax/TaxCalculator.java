package br.com.myproject.store.tax;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
