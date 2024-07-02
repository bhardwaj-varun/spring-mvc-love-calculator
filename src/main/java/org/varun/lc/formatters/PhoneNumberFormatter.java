package org.varun.lc.formatters;

import org.springframework.format.Formatter;
import org.varun.lc.dto.Phone;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
        System.out.println("Inside PhoneNumberFormatter parse");
        Phone phone = new Phone();

        String[] splittedPhoneNumber = completePhoneNumber.split("-");
        String number="";
        String countryCode= "";
        if(splittedPhoneNumber.length==2
                && !splittedPhoneNumber[0].isBlank()
                && !splittedPhoneNumber[1].isBlank()){
          countryCode=splittedPhoneNumber[0];
          number=splittedPhoneNumber[1];
        }else if(!completePhoneNumber.contains("-") || completePhoneNumber.startsWith("-")){
            countryCode = "91";
            number = splittedPhoneNumber[splittedPhoneNumber.length-1];
        }
        phone.setCountryCode(countryCode);
        phone.setNumber(number);
        return phone ;
    }


    @Override
    public String print(Phone phone, Locale locale) {
        return phone.toString();
    }
}
