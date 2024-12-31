package br.com.myproject.store.Test;

import br.com.myproject.store.tax.ICMS;
import br.com.myproject.store.tax.ISS;
import br.com.myproject.store.tax.TaxCalculator;
import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class TestTaxes {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"),1);
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget,new ISS(null)));
        System.out.println(calculator.calculate(budget,new ICMS(null)));
        System.out.println(calculator.calculate(budget,new ICMS(new ISS(null))));
    }
}