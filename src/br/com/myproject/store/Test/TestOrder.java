package br.com.myproject.store.Test;

import br.com.myproject.store.order.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestOrder {
    public static void main(String[] args) {
        String client = "Pedro";
        BigDecimal budgetValue = new BigDecimal("600");
        int budgetItems = 3;

        List<OrderProcessor> ordersToProcess = new ArrayList<>();
        EmailService emailService = new EmailService();
        OrderRepository orderRepository = new OrderRepository();
        ordersToProcess.add(emailService);
        ordersToProcess.add(orderRepository);

        GenerateOrder generateOrder = new GenerateOrder(client,budgetValue,budgetItems);
        GenerateOrderHandler handler = new GenerateOrderHandler(ordersToProcess);
        handler.createOrder(generateOrder);
    }
}
