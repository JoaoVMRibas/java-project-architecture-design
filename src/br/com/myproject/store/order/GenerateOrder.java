package br.com.myproject.store.order;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {
    private String client;
    private BigDecimal budgetValue;
    private int budgetTotalItems;

    public GenerateOrder(String client, BigDecimal budgetValue, int budgetTotalItems) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.budgetTotalItems = budgetTotalItems;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public String getClient() {
        return client;
    }

    public int getBudgetTotalItems() {
        return budgetTotalItems;
    }
}
