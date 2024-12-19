package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountByBudgetValue extends Discount {

    public DiscountByBudgetValue(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {
        if(budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return next.calculate(budget);
    }
}
