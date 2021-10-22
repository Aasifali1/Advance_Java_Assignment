package com.knoldus.kup.advanceJava.ques5;

//We created a class named Printer and a static method named print that we are using for print.
import com.knoldus.kup.advanceJava.Printer;
import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount {
    public static void main(String[] args) throws Exception {
        String line ;
        int wordCount =0;
        int lineCount =0;
        int characterCount=0;
        FileReader file =new FileReader("src/com/knoldus/kup/advanceJava/ques5/lear.txt");
        BufferedReader br=new BufferedReader(file);
        while ((line = br.readLine()) != null){
            lineCount++;
            String words[] = line.split(" ");
            characterCount += line.length();
            wordCount += words.length;
        }
        Printer.print("Words: "+wordCount+"\nLines: "+lineCount+"\nCharacters: "+characterCount);
    }
}
