package br.com.myproject.store.discount;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    public BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }
}
