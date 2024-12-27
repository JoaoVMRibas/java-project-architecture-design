package br.com.myproject.store.Test;

import br.com.myproject.store.budget.Budget;
import br.com.myproject.store.budget.BudgetRecord;
import br.com.myproject.store.http.JavaURLAdapter;

import java.math.BigDecimal;

public class TestHttpAdapter {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("1000"), 3);
        budget.approve();
        budget.conclude();

        BudgetRecord budgetRecord = new BudgetRecord(new JavaURLAdapter());
        budgetRecord.register(budget);
    }
}
