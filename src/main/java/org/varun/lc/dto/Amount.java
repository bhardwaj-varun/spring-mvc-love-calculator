package org.varun.lc.dto;

import org.varun.lc.formatters.AmountFormatter;

public class Amount {
    private Double amount;
    private String currency;
    private String amountFormatted;
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmountFormatted() {
        return amountFormatted;
    }

    public void setAmountFormatted(String amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    @Override
    public String toString() {
        return amountFormatted;
    }
}
