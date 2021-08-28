package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/22 - 23:50
 */
public class PrintYangHuiTriangle2 {
        public static int number(int x,int y){
            if(y==1 || x==y){
                return 1;
            }else{
                return number(x-1,y-1)+number(x-1,y);
            }
        }
        public static void prints(int row){
            for (int i = 0; i <= row; i++) {
                //打印空格
                for (int j = 1; j <= row-i ; j++) {
                    System.out.print(" ");
                }
                //打印数字
                for (int k = 1; k <= i; k++) {
                    System.out.print(number(i,k)+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入要打印几行啊？");
            int row = sc.nextInt();
            prints(row);
            // 此方法为网上大佬的方法，看不太懂，不过确实可以打出来结果
        /*int rows = 10;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            //打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }*/
        }


}
