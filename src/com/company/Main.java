package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            PhoneNumber p1 = new PhoneNumber(42, 676, 3704878);
            p1.isValid(p1);
        } catch (IllegalPhoneNumberException e) {
            e.type
            e.printStackTrace();
        }

    }
    }
