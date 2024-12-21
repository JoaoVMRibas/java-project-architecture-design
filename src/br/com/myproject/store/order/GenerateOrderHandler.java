package br.com.myproject.store.order;

import br.com.myproject.store.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {

    //Constructor with Dependency Injection (repository, service)

    public void createOrder(GenerateOrder data){
        Budget budget = new Budget(data.getBudgetValue(), data.getBudgetTotalItems());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        // save order in database

        // send email notifying about order
    }
}
