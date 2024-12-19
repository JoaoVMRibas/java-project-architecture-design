package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountByQuantityOfItems extends Discount {

    public DiscountByQuantityOfItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {
        if(budget.getQuantityItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
