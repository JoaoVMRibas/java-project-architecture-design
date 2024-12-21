package br.com.myproject.store.budget.status;

import br.com.myproject.store.budget.Budget;
import br.com.myproject.store.exception.DomainException;

import java.math.BigDecimal;

public abstract class Status {

    public BigDecimal calculateExtraDiscountAmount(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget){
        throw new DomainException("Cannot be approved");
    }

    public void disapprove(Budget budget){
        throw new DomainException("Cannot be rejected");
    }

    public void conclude(Budget budget){
        throw new DomainException("Cannot be completed");
    }
}
