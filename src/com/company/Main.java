package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        PhoneNumber p1 = null;
        Person pe = null;
        try {
            pe = new Person("Lukas", "Nagler", "Luki", new Date(1,12,2022), new PhoneNumber(43, 676, 3704878));
        } catch (IllegalPhoneNumberException e) {
            e.printStackTrace();
        }
        StreamOperation st = new StreamOperation();
        try {
            FileWriter writer = new FileWriter("person.csv", true);
            st.toStream(writer, pe);
        } catch (IOException e) {

        }

        try {
            FileReader reader = new FileReader("person.csv");
            System.out.println(st.fromStream(reader));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            p1 = new PhoneNumber(43, 676, 3704878);
        } catch (IllegalPhoneNumberException e) {
            e.printStackTrace();
        }

    }
    }
