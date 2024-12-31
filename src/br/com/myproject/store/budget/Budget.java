package br.com.myproject.store.budget;

import br.com.myproject.store.budget.status.Approved;
import br.com.myproject.store.budget.status.Completed;
import br.com.myproject.store.budget.status.Status;
import br.com.myproject.store.budget.status.UnderReview;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {
    private BigDecimal value;
    private Status status;
    private List<Budgetable> budgetItems;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.status = new UnderReview();
        this.budgetItems = new ArrayList<>();
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return budgetItems.size();
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

    public boolean isConcluded() {
        return this.status instanceof Completed;
    }

    public void add(Budgetable item) {
        this.value = this.value.add(item.getValue());
        budgetItems.add(item);
    }
}
