package homework;

import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Please enter 10 integers: ");

        for(int i = 0; i<10; i++){
            int number = input.nextInt();
            array[i] = number;
        }

        System.out.println("在整数数组中，最小元素的下标为" + indexOfSmallestElement(array));

        //close
        input.close();
    }

    public static int indexOfSmallestElement(double[] array){
        int min=0;
        for(int i=0; i<10; i++){
            if(array[i]<array[min]){
                min = i;
            }
            i++;
        }
        return min;
    }
}
