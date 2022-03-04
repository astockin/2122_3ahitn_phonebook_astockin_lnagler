package com.company;

/**
 * @author lnagler1
 */
public class PhoneNumber {
    private int country;
    private int areacode;
    private int number;

    PhoneNumber(int c, int a, int n) throws IllegalPhoneNumberException{
        country = c;
        areacode = a;
        number = n;

    }
    PhoneNumber(String number){

    }

    public int getNumber() {
        return number;
    }

    public int getAreacode() {
        return areacode;
    }

    public int getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", areacode=" + areacode +
                ", number=" + number +
                '}';
    }

    public void isValid(PhoneNumber d) throws IllegalPhoneNumberException {
        if (d.country != 43){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.COUNTRY_ILLEGAL);
        }
    }
}
