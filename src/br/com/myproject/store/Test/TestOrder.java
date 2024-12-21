package br.com.myproject.store.Test;

import br.com.myproject.store.order.GenerateOrder;
import br.com.myproject.store.order.GenerateOrderHandler;

import java.math.BigDecimal;

public class TestOrder {
    public static void main(String[] args) {
        String client = "Pedro";
        BigDecimal budgetValue = new BigDecimal("600");
        int budgetItems = 3;

        GenerateOrder generateOrder = new GenerateOrder(client,budgetValue,budgetItems);
        GenerateOrderHandler handler = new GenerateOrderHandler(/*Dependency Injection*/);
        handler.createOrder(generateOrder);
    }
}
