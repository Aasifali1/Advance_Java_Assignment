package com.knoldus.kup.advanceJava.ques15;

import com.knoldus.kup.Printer1;

import java.io.File;
import java.text.SimpleDateFormat;

public class GetModifiedTime {
    public static void main(String[] args) {
        File file = new File("src/com/knoldus/kup/advanceJava/ques15/test.text");
        long time = file.lastModified();
        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd H:mm");
        Printer1.print("Last Modified Time: "+formatter.format(time));
    }
}
