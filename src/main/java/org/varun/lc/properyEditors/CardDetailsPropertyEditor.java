package org.varun.lc.properyEditors;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.varun.lc.dto.Card;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class CardDetailsPropertyEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Card card = (Card) getValue();
        return card.toString();
    }
    @Override
    public void setAsText(String cardDetails) throws IllegalArgumentException {
        String[] splittedCardDetails = cardDetails.split("-");
        Card card = new Card();
        if(Arrays.stream(splittedCardDetails).count() == 4){
            card.setFirstFourDigits(splittedCardDetails[0]);
            card.setSecondFourDigits(splittedCardDetails[1]);
            card.setThirdFourDigits(splittedCardDetails[2]);
            card.setFourthFourDigits(splittedCardDetails[3]);
        }
        setValue(card);
    }

}
