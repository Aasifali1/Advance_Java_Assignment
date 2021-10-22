package com.knoldus.kup.advanceJava.ques9.P;

//We created a class named Printer and a static method named print that we are using for print.
import com.knoldus.kup.advanceJava.Printer;
import com.knoldus.kup.advanceJava.ques9.P1.TwoDim;
import com.knoldus.kup.advanceJava.ques9.P2.ThreeDim;

public class Main{
    public static void main(String[] args) {
        TwoDim reference;           // obtain a reference of type TwoDim
        reference = new TwoDim(1,5);   // object of type TwoDim
        Printer.print(reference);

        // // object of type ThreeDim
        reference =new ThreeDim(2,4,6);
        Printer.print(reference.toString());
    }
}
