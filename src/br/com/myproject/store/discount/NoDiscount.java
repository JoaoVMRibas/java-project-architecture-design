package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal discountCalculationRule(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return true;
    }
}
