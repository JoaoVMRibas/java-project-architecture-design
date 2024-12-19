package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountByQuantityOfItems extends Discount {

    public DiscountByQuantityOfItems(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal discountCalculationRule(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return budget.getQuantityItems() > 5;
    }

}
