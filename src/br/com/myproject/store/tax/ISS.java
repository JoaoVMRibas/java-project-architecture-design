package br.com.myproject.store.tax;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Tax {
    public ISS(Tax otherTax) {
        super(otherTax);
    }

    @Override
    protected BigDecimal executeCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
