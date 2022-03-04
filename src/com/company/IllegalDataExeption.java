package com.company;

/**
 * @author astockin
 * @konstruktor
 * Exception Klasse
 */

public class IllegalDataExeption extends Exception{

    public int type;
    public int Day_illegal=0;
    public int Mon_illegal=1;

    public IllegalDataExeption(int ext){
        this.type=ext;


    }

}
