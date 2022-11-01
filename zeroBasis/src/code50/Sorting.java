package code50;

import java.util.*;

/**
 * @author shkstart
 * @date 2021/8/21 - 12:37
 */
// 排序
    /*
    * 题目：对10个数进行排序
    * */
public class Sorting {
    public static void main(String[] args) {
        int dex=0;
        Set<Integer> box=new TreeSet();
        while (dex<10){
            dex++;
            System.out.println("请输出第"+dex+"个数");
            int number=new Scanner(System.in).nextInt();
            box.add(number);
        }
        System.out.println("排序结果为：");
        for (Integer integer : box) {
            System.out.println(integer);
        }
    }
}
