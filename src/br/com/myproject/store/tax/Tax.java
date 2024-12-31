package br.com.myproject.store.tax;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {
    private Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal executeCalculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        BigDecimal taxRate = executeCalculation(budget);
        BigDecimal otherTaxRate = BigDecimal.ZERO;
        if(otherTax != null){
            otherTaxRate = this.otherTax.executeCalculation(budget);
        }
        return taxRate.add(otherTaxRate);
    }
}
