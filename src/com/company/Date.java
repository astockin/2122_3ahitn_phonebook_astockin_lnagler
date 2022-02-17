package com.company;

public class Date {

    public int day;
    public int mon;
    public int year;

    public Date(int m,int d,int y){

        this.day=d;
        this.mon=m;
        this.year=y;

    }
    public Date(String date){

        String[] stra;

        stra=date.split("\\.");//sollte dann tag.mon.jahr eingegben werden

        this.day= Integer.parseInt(stra[0]);
        this.mon= Integer.parseInt(stra[1]);
        this.year= Integer.parseInt(stra[2]);

    }
    public int getDay(){

        int tag=0;

        tag=this.day;



        return tag;
    }

    public  int getMon(){

        int monat=0;

        monat=this.mon;

        return monat;

    }
    public  int getYear(){

        int jahr=0;


        jahr=this.year;


        return jahr;
    }

    public boolean isLeapYear(){

       boolean ret = false; //kein Schaltjahr

        if(this.year%4==0){

            ret=true;
        }


        return ret;
    }

    public static boolean isValid(Date d){//beim aufruf wird die exeption throw erstellt

        boolean ret=true;

        if(d.mon<12||d.day>31){

            ret=false;


        }





        return ret;
    }



}