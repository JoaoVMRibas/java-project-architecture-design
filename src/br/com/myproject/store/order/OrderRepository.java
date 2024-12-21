package br.com.myproject.store.order;

public class OrderRepository implements OrderProcessor {
    @Override
    public void execute(Order order) {
        // Logic to save the order to the database
    }
}
