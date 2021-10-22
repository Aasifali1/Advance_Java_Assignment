package com.knoldus.kup.advanceJava.ques6;

import java.io.*;

public class HistogramBuilder {
    public static void main (String[] args)
    {
//      reading the file
        File file = new File("src/com/knoldus/kup/advanceJava/ques6/input");
        BufferedReader br = null;
        String line;
        int[] nums = new int[101];
        //There are in total (100-1+2) numbers between 1 and 100
        //including 1 and 100.
        int base10 = 0;
        try {
            br = new BufferedReader(new FileReader(file));
            int i = 0;
            int no = Integer.parseInt(br.readLine());
//            loading the array from the input.text file
            while ((line = br.readLine())!=null){
                nums[no]++;
                no = Integer.parseInt(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        for (int count = 1; count <=100;count+=10)
        {
            // print out the range limits
            //since the range right-limit always increases by 10
            //such as from 10 to 20 to 30
            //If we initialized base10 to 10 outside the loop then
            //we would've needed an if statement here just for count==1
            //to make sure we don't get 1-20
            System.out.print(count + " - " + (base10+=10) + "  \t| " );
            for (int index = count ; index<=base10 ; index++)
            {
                //We have to check if the numbers between our limits
                //appeared at least once in our array
                while(nums[index] > 0) {
                    System.out.print("* ");
                    nums[index]--;
                }
            }
            System.out.println();
        }
    }
}
