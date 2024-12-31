package br.com.myproject.store.order;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class GenerateOrder {
    private String client;
    private Budget budget;

    public GenerateOrder(String client, Budget budget) {
        this.client = client;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public Budget getBudget() {
        return budget;
    }
}
