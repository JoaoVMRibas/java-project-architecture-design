package br.com.myproject.store.budget.status;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class UnderReview extends Status {
    @Override
    public BigDecimal calculateExtraDiscountAmount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }
    @Override
    public void approve(Budget budget) {
        budget.setStatus(new Approved());
    }
    @Override
    public void disapprove(Budget budget) {
        budget.setStatus(new Rejected());
    }
    @Override
    public String toString() {
        return "UnderReview";
    }
}
