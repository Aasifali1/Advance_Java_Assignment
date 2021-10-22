package com.knoldus.kup.advanceJava.ques14;

//We created a class named Printer and a static method named print that we are using for print.
import com.knoldus.kup.advanceJava.Printer;
import java.util.Scanner;
import java.util.Vector;

public class NameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Name> vector=new Vector<Name>();
        int option;
        do {
            Printer.print("========= Enter your choice =========" +
                    "\n Press 1: to Enter First name and last SurName" +
                    "\n Press 2: to print the number of names" +
                    "\n Press 3: for exit application");
            option = scanner.nextInt();
            if(option == 1){
                Printer.print("Enter First Name");
                String firstName = scanner.next();
                Printer.print("Enter Last Name");
                String lastName = scanner.next();
                Name name = new Name(firstName, lastName);
                vector.add(name);
            }else if(option == 2){
                Printer.print("Total Names in Vector: "+vector.size());
            }
        }while (option != 3);
        Printer.print("Application Closed");
    }
}
