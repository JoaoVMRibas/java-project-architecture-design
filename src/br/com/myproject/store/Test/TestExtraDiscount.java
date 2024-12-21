package br.com.myproject.store.Test;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class TestExtraDiscount {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"),2);

        System.out.println(budget.getValue());
        budget.approve();
        budget.applyExtraDiscount();
        System.out.println(budget.getValue());
    }
}
