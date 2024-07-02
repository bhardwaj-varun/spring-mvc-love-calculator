package org.varun.lc.formatters;

import org.springframework.format.Formatter;
import org.springframework.format.number.CurrencyStyleFormatter;
import org.varun.lc.dto.Amount;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class AmountFormatter implements Formatter<Amount> {
    @Override
    public Amount parse(String amountString, Locale locale) throws ParseException {
        String[] splitAmountString = amountString.split(" ");
        Amount amount= new Amount();
        if(splitAmountString.length == 2) {
            amount.setAmount(Double.valueOf(splitAmountString[0]));
            amount.setCurrency(splitAmountString[1]);
            Currency currency = Currency.getInstance(amount.getCurrency());
            NumberFormat numberFormat
                    = NumberFormat.getCurrencyInstance(locale);
            numberFormat.setCurrency(currency);
            BigDecimal amt = BigDecimal.valueOf(amount.getAmount());
            String formattedAmount = numberFormat.format(amt);
            amount.setAmountFormatted(formattedAmount);
        }
        return amount;
    }

    @Override
    public String print(Amount amount, Locale locale) {
        return amount.toString();
    }
}
