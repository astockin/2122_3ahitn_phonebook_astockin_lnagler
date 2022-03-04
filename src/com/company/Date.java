package com.company;

/**
 * @autor astockin
 *
 */

public class Date {

    public int day;
    public int mon;
    public int year;

    /**
     * @Konstruktor
     * @autor astockin
     * @param m Monat
     * @param d Tag
     * @param y Jahr
     */

    public Date(int m,int d,int y){

        this.day=d;
        this.mon=m;
        this.year=y;

    }

    /**
     * @Konstruktor Date
     * @autor astockin
     * @param date Datum als Sting
     *
     * @beschreibung
     * Liest Datum als einen String ein
     * splitted ihn dann
     */

    public Date(String date){

        String[] stra;

        stra=date.split("\\.");//sollte dann tag.mon.jahr eingegben werden

        this.day= Integer.parseInt(stra[0]);
        this.mon= Integer.parseInt(stra[1]);
        this.year= Integer.parseInt(stra[2]);

    }

    /**
     * @getter getDay
     * @autor astockin
     * @return tag
     *
     * @beschreibug
     * getter für tag
     */

    public int getDay(){

        int tag=0;

        tag=this.day;



        return tag;
    }
    /**
     * @getter getMon
     * @autor astockin
     * @return monat
     *
     * @beschreibug
     * getter für Monat
     */

    public  int getMon(){

        int monat=0;

        monat=this.mon;

        return monat;

    }
    /**
     * @getter getYear
     * @autor astockin
     * @return jahr
     *
     * @beschreibug
     * getter für Jahr
     */
    public  int getYear(){

        int jahr=0;


        jahr=this.year;


        return jahr;
    }
    /**
     * @Methode isLeapYear
     * @autor astockin
     * @return boolean true/false
     *
     * @beschreibung
     * Prüft ob es ein Schaltjahr ist
     */

    public boolean isLeapYear(){

       boolean ret = false; //kein Schaltjahr

        if(this.year%4==0){

            ret=true;
        }


        return ret;
    }

    /**
     * @autor astockin
     * @param d
     * @return boolean false/true
     *
     * @beschreibung
     * Wirft exception falls falsch
     */

    public static boolean isValid(Date d){//beim aufruf wird die exeption throw erstellt

        boolean ret=true;

        if(d.mon<12||d.day>31){

            ret=false;


        }





        return ret;
    }



}