package homework;

import java.util.Scanner;

public class createMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //用户输入整数（假定用户输入的为一个有效值，暂不做判断）
        System.out.print("Enter n: ");
        int n = input.nextInt();

        //调用方法
        printMatrix(n);

        //close
        input.close();

    }

    public static void printMatrix(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int m = (int)(Math.random()*2); //随机产生0或1
                System.out.print(m + "  ");
            }
            System.out.println();
        }
    }
}
