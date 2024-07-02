package org.varun.lc.dto;

public class Card {
    private String firstFourDigits;
    private String secondFourDigits;
    private String thirdFourDigits;
    private String fourthFourDigits;

    public String getFirstFourDigits() {
        return firstFourDigits;
    }

    public void setFirstFourDigits(String firstFourDigits) {
        this.firstFourDigits = firstFourDigits;
    }

    public String getSecondFourDigits() {
        return secondFourDigits;
    }

    public void setSecondFourDigits(String secondFourDigits) {
        this.secondFourDigits = secondFourDigits;
    }

    public String getThirdFourDigits() {
        return thirdFourDigits;
    }

    public void setThirdFourDigits(String thirdFourDigits) {
        this.thirdFourDigits = thirdFourDigits;
    }

    public String getFourthFourDigits() {
        return fourthFourDigits;
    }

    public void setFourthFourDigits(String fourthFourDigits) {
        this.fourthFourDigits = fourthFourDigits;
    }

    @Override
    public String toString() {
        return firstFourDigits + '-' +
                secondFourDigits + '-' +
                thirdFourDigits + '-' +
               fourthFourDigits ;
    }
}
