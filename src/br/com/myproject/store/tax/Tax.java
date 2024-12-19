package br.com.myproject.store.tax;

import br.com.myproject.store.models.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
