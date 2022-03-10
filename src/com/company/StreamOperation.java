package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamOperation {

    public void toStream(Writer w, Person p) {
        BufferedWriter bw = new BufferedWriter(w);
        try {
            bw.append(p.toFile());
            bw.newLine();
            System.out.println(p.toFile());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Person fromStream(Reader r) throws IOException {
        BufferedReader br = new BufferedReader(r);
        String line = "";
        final String spliter = ";";
        ArrayList<Person> al = new ArrayList<>();
        String[] lines;
        try {
            while ((line = br.readLine()) != null) {
                lines = line.split(spliter);

                    Date d = new Date(lines[3]);
                    PhoneNumber ph = new PhoneNumber(lines[4]);

                    al.add(new Person(lines[0], lines[1], lines[2], d, ph));
                System.out.println("");
            }
            r.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return al.get(0);
    }
}
