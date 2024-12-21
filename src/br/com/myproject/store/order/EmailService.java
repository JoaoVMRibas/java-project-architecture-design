package br.com.myproject.store.order;

public class EmailService implements OrderProcessor{
    @Override
    public void execute(Order order) {
        // Logic to send email notifying about order
    }
}
