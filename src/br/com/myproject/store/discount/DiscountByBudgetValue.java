package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountByBudgetValue extends Discount {

    public DiscountByBudgetValue(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal discountCalculationRule(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
