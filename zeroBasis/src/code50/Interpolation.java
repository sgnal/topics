package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/24 - 22:58
 */
/*
* 题目：有n个整数，使其前面个数顺序向后移m个位置，最后m个数变成最前面的m个数
* */
    // 插数
public class Interpolation {
    public static void main(String[] args) {
        change();

    }
    public static void change(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数的个数");
        int number = sc.nextInt();
        System.out.println("输入要移动多少个位置");
        int position = sc.nextInt();
        int[] array = new int[number];
        System.out.println("请输入每一个整数");
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();


        }
        int[] array1 = new int[position];

        for (int k=0;k < position;k++) {
            array1[k] = array[number-position+k];
        }
        for (int i = number-1; i>= position ; i--) {
                array[i] = array[i-position];

        }
        for (int i = 0; i < position; i++) {
            array[i] = array1[i];

        }


        for (int i = 0; i < number; i++) {
            System.out.println(array[i]+" ");

        }



    }

}
