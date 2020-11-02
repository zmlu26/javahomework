package homework;

import java.util.Scanner;

public class sumDiagonal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] array = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");

        double n;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                n = input.nextDouble();
                array[i][j] = n;
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(array));

        //close
        input.close();

    }

    public static double sumMajorDiagonal(double[][] m){
        double sum=0;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==j) sum+=m[i][j];
            }
        }
        return sum;
    }

}
