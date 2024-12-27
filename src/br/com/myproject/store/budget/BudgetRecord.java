package br.com.myproject.store.budget;

import br.com.myproject.store.exception.DomainException;
import br.com.myproject.store.http.HttpAdapter;

import java.util.Map;

public class BudgetRecord {
    private HttpAdapter httpAdapter;

    public BudgetRecord(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void register(Budget budget) {
        if(!budget.isConcluded()){
            throw new DomainException("Budget is not finalized.");
        }
        // Fake URL
        String url = "http://external-api/budget";

        Map<String, Object> data = Map.of(
                "value", budget.getValue(),
                "numberOfItems", budget.getQuantityItems()
        );

        httpAdapter.post(url,data);
    }
}
