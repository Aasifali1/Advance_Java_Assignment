package com.knoldus.kup.advanceJava.ques13;

//We created a class named Printer and a static method named print that we are using for print.
import com.knoldus.kup.advanceJava.Printer;
import java.util.Random;
import java.util.Scanner;

public class MultiThreadingSystem {
    public static void main(String[] args) {
        RandomNumber th=new RandomNumber();
        th.run();
    }
}
class RandomNumber extends Thread {
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of random numbers do you want to generate.");
        int numOfRandom= scanner.nextInt();
        Random random = new Random();
        for(int i=0;i<numOfRandom;i++){
            int randomNumber = random.nextInt(100);
            System.out.print("Generating");
            for (int j =0; j<5; j++){
//                we are printing . every half second for waiting
                System.out.print(".");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            Printer.print("");
            if(randomNumber % 2==0){
                SquareThread squareThread=new SquareThread(randomNumber);
                squareThread.start();
            }else{
                CubeThread cubeThread=new CubeThread(randomNumber);
                cubeThread.start();
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
class SquareThread extends Thread {
    int number;
    SquareThread(int number){
        this.number = number ;
    }
    public void run(){
        Printer.print("Square of "+number+" : "+number * number);
    }
}
class CubeThread extends Thread{
    int number;
    CubeThread(int number){
        this.number = number;
    }
    public void run(){
        Printer.print("Cube of "+number+" : "+number*number*number);
    }
}
