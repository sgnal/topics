package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/16 - 12:22
 */
public class PrintStar {
    public static void main(String[] args) {
        System.out.println("请输入要输入几行星星数");
        int n=new Scanner(System.in).nextInt();
        printStar(n);
    }

    private static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if(j<n-i){
                    System.out.print(" ");
                }
                if (j>=n-i&&j<=n+i) {
                    System.out.print("*");
                }
            }
            System.out.println( );
        }
        for (int i = 1; i <n ; i++) {
            System.out.print(" ");
            for (int j = 0; j < 2*n-1; j++) {
                if(j<i){
                    System.out.print(" ");
                }
                if(j>=i&&j<2*n-i-1){
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
