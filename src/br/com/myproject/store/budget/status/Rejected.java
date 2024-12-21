package br.com.myproject.store.budget.status;

import br.com.myproject.store.budget.Budget;

import java.math.BigDecimal;

public class Rejected extends Status{
    @Override
    public void conclude(Budget budget) {
        budget.setStatus(new Completed());
    }
}
