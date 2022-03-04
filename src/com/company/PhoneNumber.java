package com.company;

/**
 * @author lnagler1
 * Erstell eine Neue Telefonnummer und prüft ob sie valid ist
 */
public class PhoneNumber {
    private int country;
    private int areacode;
    private int number;

    PhoneNumber(int c, int a, int n) throws IllegalPhoneNumberException{
        if (c != 43){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.COUNTRY_ILLEGAL);
        }else if (a != 676){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.AREA_ILLEGAL);
        }else if (n >= 10000000){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.NUMBER_ILLEGAL);
        }

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

}
