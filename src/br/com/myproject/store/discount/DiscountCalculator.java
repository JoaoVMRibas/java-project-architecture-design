package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discountChain = new DiscountByQuantityOfItems(
                new DiscountByBudgetValue(
                        new NoDiscount()));
        return discountChain.calculate(budget);
    }
}
