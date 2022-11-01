package code50;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/22 - 22:03
 */
/*
* 题目：有一个已经排好序的数组。现输入一个数，要求它原来的规律将它插入数组中
* */
public class SortingInterpolation {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        int number=new Scanner(System.in).nextInt();
        interpolation(number);

    }

    private static void interpolation(int number) {
        int[] a={6,5,8,3,63};
        int[] b=new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];

        }

        b[b.length-1]=number;


        Arrays.sort(b);
        for(int dex:b) {
            System.out.println(dex);
        }


    }
}
