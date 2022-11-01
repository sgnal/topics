package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/19 - 22:04
 */
public class JieChengSum {
    public static void main(String[] args) {
        System.out.println("请输入要相加的阶乘数字");
        long s=new Scanner(System.in).nextLong();
        sum(s);
    }

    private static void sum(long s) {

        long y=0;
        for (long i = 1; i <= s; i++) {
            long x =1;
            for (long j = 1; j <=i; j++) {

                x*=j;
            }

            y+=x;

        }
        System.out.println(y);


    }
}
