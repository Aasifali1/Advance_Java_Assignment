package com.knoldus.kup.advanceJava.ques11;

public class Output {
    void outerMethod() {
        System.out.println("Inside outerMethod");
// Inner class is local to outerMethod()
        class Inner {
            void innerMethod() {
                System.out.println("Inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class Test1 {
    public static void main(String[] args) {
        Output x = new Output();
        x.outerMethod();
    }
}
//************************************* Output ***************************************
//    Inside outerMethod
//    Inside innerMethod