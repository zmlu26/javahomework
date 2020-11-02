package homework;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] arg) {
        //close
        try(
        Scanner input = new Scanner(System.in);
        ) {
            //用户输入整数（假定用户输入的为一个有效值，暂不做判断）
            System.out.print("Please enter a number and I will reverse it for you: ");
            int number = input.nextInt();

            //调用方法
            reverse(number);
        }
    }

    public static void reverse(int number){
        int a;
        int b = -1;
        String rnumber = "";
        b = number;
        //不断取余
        while(b!=0){
            a = b % 10;
            b = number / 10;
            number = b;
            if(a==0 && rnumber.length()==0) {
                continue;
            }else{
                rnumber = rnumber + a;
            }
        }

        System.out.println("The reversed number is " + rnumber);

    }
}
