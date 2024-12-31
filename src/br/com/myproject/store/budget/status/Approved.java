package br.com.myproject.store.budget.status;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends Status{
    @Override
    public BigDecimal calculateExtraDiscountAmount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }
    @Override
    public void conclude(Budget budget) {
        budget.setStatus(new Completed());
    }
    @Override
    public String toString() {
        return "Approved";
    }
}
