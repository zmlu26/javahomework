package com.Homework_9;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date date = new Date(); //object
        //set timesets
        long[] timesets = new long[8];
        for(int i = 0; i < timesets.length; i++){
            if(i == 0) {
                timesets[0] =10000;
            }
            else{
                timesets[i]=timesets[i-1]*10;
            }
        }

        for(int i = 0; i < timesets.length; i++) {
            //set the time
            date.setTime(timesets[i]);
            //print the result
            System.out.println("After set elapseTime " + timesets[i] +
                    ", the time after set is " + date.toString() + ".");
        }
    }
}
