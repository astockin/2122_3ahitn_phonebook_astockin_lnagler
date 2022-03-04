package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            PhoneNumber p1 = new PhoneNumber(42, 676, 3704878);
        } catch (IllegalPhoneNumberException e) {
            if (e.type == 0){
                System.out.println("Country Illegal");
            }else if (e.type == 1){
                System.out.println("Area Illegal");
            }else if (e.type == 2){
                System.out.println("Number Illegal");
            }else {
                System.out.println("String Format Illegal");
            }
            e.printStackTrace();
        }

    }
    }
