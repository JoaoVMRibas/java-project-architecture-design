package br.com.myproject.store.budget;

import br.com.myproject.store.budget.status.Approved;
import br.com.myproject.store.budget.status.Status;
import br.com.myproject.store.budget.status.UnderReview;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int quantityItems;
    private Status status;

    public Budget(BigDecimal value, int quantityItems) {
        this.value = value;
        this.quantityItems = quantityItems;
        this.status = new UnderReview();
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscount = this.status.calculateExtraDiscountAmount(this);
        this.value = this.value.subtract(extraDiscount);
    }

    public void approve(){
        this.status.approve(this);
    }

    public void disapprove(){
        this.status.disapprove(this);
    }

    public void conclude(){
        this.status.conclude(this);
    }
}
