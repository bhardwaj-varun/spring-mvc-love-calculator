package org.varun.lc.converters;

import org.springframework.core.convert.converter.Converter;
import org.varun.lc.dto.Card;

import java.util.Arrays;

public class CreditCardConverter implements Converter<String, Card> {
    @Override
    public Card convert(String source) {

        String[] splittedCardDetails = source.split("-");
        Card card = new Card();
        if(Arrays.stream(splittedCardDetails).count() == 4){
            card.setFirstFourDigits(splittedCardDetails[0]);
            card.setSecondFourDigits(splittedCardDetails[1]);
            card.setThirdFourDigits(splittedCardDetails[2]);
            card.setFourthFourDigits(splittedCardDetails[3]);
        }
        return card;
    }
}
