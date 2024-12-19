package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if(isApplicable(budget)){
            return discountCalculationRule(budget);
        }
        return next.calculate(budget);
    }

    protected abstract BigDecimal discountCalculationRule(Budget budget);

    protected abstract boolean isApplicable(Budget budget);
}
