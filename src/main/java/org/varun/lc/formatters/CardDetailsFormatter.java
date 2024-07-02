package org.varun.lc.formatters;

import org.springframework.format.Formatter;
import org.varun.lc.dto.Card;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

public class CardDetailsFormatter implements Formatter<Card> {
    @Override
    public Card parse(String cardDetails, Locale locale) throws ParseException {

        String[] splittedCardDetails = cardDetails.split("-");
        Card card = new Card();
        if(Arrays.stream(splittedCardDetails).count() == 4){
            card.setFirstFourDigits(splittedCardDetails[0]);
            card.setSecondFourDigits(splittedCardDetails[1]);
            card.setThirdFourDigits(splittedCardDetails[2]);
            card.setFourthFourDigits(splittedCardDetails[3]);
        }
        return card;
    }

    @Override
    public String print(Card card, Locale locale) {
        return card.toString();
    }
}
