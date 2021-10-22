package com.knoldus.kup.advanceJava.ques8;

//We created a class named Printer and a static method named print that we are using for print.
import com.knoldus.kup.advanceJava.Printer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            Printer.print("================ Enter Choice ================\n" +
                    "Press 1 for print your name\n" +
                    "Press 2 for divide\n" +
                    "Press 0 for exit");
            choice = sc.nextInt();
            if(choice == 2){
                try {
                    Printer.print("Enter numbers for divide");
                    int a = Integer.parseInt(sc.next());
                    int b = Integer.parseInt(sc.next());
                    Printer.print(a/b);
                }
                catch (ArithmeticException ex){
                    Printer.print("Invalid arguments, you can't divide by zero");
                }catch (NumberFormatException ex){
                    Printer.print("Invalid Input, please enter numbers");
                }catch (InputMismatchException ex){
                    ex.printStackTrace();
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }else if(choice == 1){
                try {
                    Printer.print("Enter your name");
                    String name = sc.next();
                    Printer.print("Hello Mr."+name);
                }catch (NumberFormatException ex){
                    Printer.print("Invalid arguments, you can't divide by zero");
                }catch (Exception ex){
                    Printer.print(ex.getMessage());
                }
            }
        }while (choice != 0);
    }
}
