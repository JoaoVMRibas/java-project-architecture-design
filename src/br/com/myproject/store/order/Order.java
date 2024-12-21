package br.com.myproject.store.order;

import br.com.myproject.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String client;
    private LocalDateTime dateTime;
    private Budget budget;

    public Order(String client, LocalDateTime dateTime, Budget budget) {
        this.client = client;
        this.dateTime = dateTime;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Budget getBudget() {
        return budget;
    }
}
