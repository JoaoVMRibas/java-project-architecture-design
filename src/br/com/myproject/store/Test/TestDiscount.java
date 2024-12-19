package br.com.myproject.store.Test;

import br.com.myproject.store.budget.Budget;
import br.com.myproject.store.discount.DiscountCalculator;
import br.com.myproject.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TestDiscount {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("200"),6);
        Budget budget2 = new Budget(new BigDecimal("1000"),3);
        DiscountCalculator calculator = new DiscountCalculator();
        BigDecimal discount;

        discount = calculator.calculate(budget);
        System.out.println("Discount: " + discount);

        discount = calculator.calculate(budget2);
        System.out.println("Discount: " + discount);
    }
}
