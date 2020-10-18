package homework;

public class calDigits {
    public static void main(String[] args) {
        //生成一个存放随机数的一维数组
        int[] array = new int[100];

        //生成100个0和9之间的随机整数
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        //调用方法计算每个个位数出现的次数
        System.out.println("在100个随机生成的0-9之间的整数中：");
        for(int j=0; j<10; j++){
            countDigits(array, j);
        }
    }

    public static void countDigits(int[] array1, int n){
        //遍历每个数出现的次数
        int m=0;
        for(int i =0; i<100; i++){
            if(array1[i]==n){
                m++;
            }
        }
        System.out.println("'" + n + "'" + "出现了" + m + "次");
    }

}
