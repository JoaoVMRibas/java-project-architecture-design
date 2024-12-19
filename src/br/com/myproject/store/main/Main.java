package br.com.myproject.store.main;

import br.com.myproject.store.tax.ICMS;
import br.com.myproject.store.tax.ISS;
import br.com.myproject.store.tax.Tax;
import br.com.myproject.store.tax.TaxCalculator;
import br.com.myproject.store.models.Budget;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget,new ISS()));
    }
}