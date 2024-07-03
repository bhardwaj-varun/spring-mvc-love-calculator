package org.varun.lc.converters;

import org.springframework.core.convert.converter.Converter;
import org.varun.lc.dto.Card;

public class CreditCardConverterObjectToString implements Converter<Card, String> {
    @Override
    public String convert(Card source) {
        return source.toString();
    }
}
