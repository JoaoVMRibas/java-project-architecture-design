package br.com.myproject.store.Test;

import br.com.myproject.store.budget.Budget;
import br.com.myproject.store.budget.BudgetItem;

import java.math.BigDecimal;

public class CompositeTest {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.add(new BudgetItem(new BigDecimal("200")));
        budget.disapprove();

        Budget budget2 = new Budget();
        budget2.add(new BudgetItem(new BigDecimal("500")));
        budget2.add(budget);

        System.out.println(budget2.getValue());
    }
}
