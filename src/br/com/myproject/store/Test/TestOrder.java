package br.com.myproject.store.Test;

import br.com.myproject.store.budget.Budget;
import br.com.myproject.store.budget.BudgetItem;
import br.com.myproject.store.order.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestOrder {
    public static void main(String[] args) {
        String client = "Pedro";
        Budget budget = new Budget();

        budget.add(new BudgetItem(new BigDecimal("100")));
        budget.add(new BudgetItem(new BigDecimal("400")));

        List<OrderProcessor> ordersToProcess = new ArrayList<>();
        EmailService emailService = new EmailService();
        OrderRepository orderRepository = new OrderRepository();
        ordersToProcess.add(emailService);
        ordersToProcess.add(orderRepository);

        GenerateOrder generateOrder = new GenerateOrder(client,budget);
        GenerateOrderHandler handler = new GenerateOrderHandler(ordersToProcess);
        handler.createOrder(generateOrder);

        System.out.println(budget.getValue());
        System.out.println(budget.getQuantityItems());
    }
}
