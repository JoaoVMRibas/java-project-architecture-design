package br.com.myproject.store.Test;

import br.com.myproject.store.budget.Budget;
import br.com.myproject.store.budget.BudgetItem;

import java.math.BigDecimal;

public class TestExtraDiscount {
    public static void main(String[] args) {
        Budget budget = new Budget();
        BudgetItem item = new BudgetItem(new BigDecimal("100"));
        budget.add(item);

        System.out.println(budget.getValue());
        budget.approve();
        budget.applyExtraDiscount();
        System.out.println(budget.getValue());
    }
}
