package com.company;
/**
 * @author lnagler1
 */
public class IllegalPhoneNumberException extends Throwable {
    public int type;
    public static final int COUNTRY_ILLEGAL = 0;
    public static final int AREA_ILLEGAL = 1;
    public static final int NUMBER_ILLEGAL = 2;
    public static final int STRING_FORMAT_ILLEGAL = 3;

    IllegalPhoneNumberException(int type){

    }
}
