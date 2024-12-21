package br.com.myproject.store.order;

import br.com.myproject.store.budget.Budget;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    List<OrderProcessor> orderActions;

    public GenerateOrderHandler(List<OrderProcessor> orderProcessor) {
        this.orderActions = orderProcessor;
    }

    public void createOrder(GenerateOrder data){
        Budget budget = new Budget(data.getBudgetValue(), data.getBudgetTotalItems());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        for (OrderProcessor orderAction : this.orderActions){
            orderAction.execute(order);
        }
    }
}
