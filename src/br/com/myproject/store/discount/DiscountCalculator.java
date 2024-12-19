package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discount = new DiscountByQuantityOfItems(
                new DiscountByBudgetValue(
                        new NoDiscount()));
        return discount.calculate(budget);
    }
}
