package com.company;

/**
 * @author lnagler1
 * Erstell eine Neue Telefonnummer und prüft ob sie valid ist
 */
public class PhoneNumber {
    private int country;
    private int areacode;
    private int number;
    private String fullNumber;

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

        fullNumber = c + " ";
        fullNumber+= a + "/";
        fullNumber+= n;

    }
    PhoneNumber(String number){
        this.fullNumber = number;
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
        return "PhoneNumber={" +
                fullNumber +
                '}';
    }

    public String toFile(){
        return fullNumber;
    }

}
