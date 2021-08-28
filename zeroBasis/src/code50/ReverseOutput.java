package code50;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 2021/8/22 - 22:35
 */
/*
* 将一个数组逆序输出
* */
//    逆序输出
public class ReverseOutput {
    public static void main(String[] args) {

        printInt();
    }

    private static void printInt() {
        int[] a={4520,63,962,98,987,52};
        Arrays.sort(a);
        for (int i = a.length-1; i >=0; i--) {
            System.out.println(a[i]);

        }
    }
}
