package com.knoldus.kup.advanceJava.ques1;

import java.time.LocalTime;
import java.util.ArrayList;

public class Menu {

//    Here we are declaring an arraylist of menuList as class variable
     static ArrayList<Dish> menuList;

//     Using static block
    static {
//       Adding some dishes by using Dish class
        Dish chicken_afghani= new Dish(1, "Chicken Afghani", LocalTime.now());
        Dish chicken_changeji= new Dish(2, "Chicken Changeji", LocalTime.now());
        Dish chicken_tandoori= new Dish(3, "Chicken Tandoori", LocalTime.now());
        Dish matar_paneer= new Dish(4, "Matar Paneer", LocalTime.now());
        Dish dal_makhni= new Dish(5, "Dal Makhni", LocalTime.now());


//        Adding all created dishes to arraylist
        menuList = new ArrayList<Dish>();
        menuList.add(chicken_afghani);
        menuList.add(chicken_changeji);
        menuList.add(chicken_tandoori);
        menuList.add(matar_paneer);
        menuList.add(dal_makhni);
    }
}
