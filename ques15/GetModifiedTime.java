package com.knoldus.kup.advanceJava.ques15;

import com.knoldus.kup.Core_Java.Printer;

import java.io.File;
import java.text.SimpleDateFormat;

public class GetModifiedTime {
    public static void main(String[] args) {
        File file = new File("src/com/knoldus/kup/advanceJava/ques15/test.text");
        long time = file.lastModified();
        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd H:mm");
        Printer.print("Last Modified Time: "+formatter.format(time));
    }
}
