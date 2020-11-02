package com.Homework_13;

import java.math.*;
import java.util.*;
import java.lang.*;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        //add elements to list
        list.add(15);
        list.add(new BigInteger("1235432"));
        list.add(13.2);

        //sort array
        if(list.size() ==0)
            System.out.println("The list is invalid.");
        else {
            System.out.println("===Before sorting===");
            System.out.println(list.toString());
            System.out.println("===After sorting===");
            System.out.println(sort(list).toString());
        }
    }

    public static ArrayList<Number> sort(ArrayList<Number> list) {
        //invalid list
        if (list == null || list.size() == 0)
            return null;

        //sort list
        if (list.size() == 1){}
            //return list;
        else {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size()-1-i; j++) {
                    if (list.get(j + 1).doubleValue() < list.get(j).doubleValue()) {
                        Number temp1 = list.get(j + 1);
                        Number temp2 = list.get(j);
                        list.set(j + 1, temp2);
                        list.set(j, temp1);
                    }
                }
            }
            //return list;
        }
        return list;
    }
}
