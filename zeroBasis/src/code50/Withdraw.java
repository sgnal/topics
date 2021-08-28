package code50;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/26 - 8:47
 */
/*
* 题目：有n个人围成一圈，顺序排号。从第一个人开始报数(从1到3报数),凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
* */
    //去留
public class Withdraw {
    public static void main(String[] args) {
        Scanner people = new Scanner(System.in);
        System.out.println("请输入总人数");
        int allPerson=people.nextInt();
        // 淘汰
        // 总人数，
        boolean[] disuse = new boolean[allPerson];
        for (int i = 0; i < disuse.length; i++) {
            disuse[i] = true;
        }
        // 定义一个值为总人数的变量
        int len = disuse.length;
        // 打一个索引
        int t=0;
        // 当这个总人数大于1始终进行循环遍历
        while (len>1){
            // 遍历数组中的元素，每遍历一个元素，索引加1当索引达到3的时候，这个元素标记为false即淘汰，再次进行重新索引，总人数减一
            for (int i = 0; i < disuse.length; i++) {
                if (disuse[i]) {
                    t++;
                    if (t==3){
                        disuse[i] = false;
                        t = 0;
                        len--;
                    }
                }


            }
        }
        System.out.println("最后的情况："+Arrays.toString(disuse));

        for (int i = 0; i < disuse.length; i++) {
            if (disuse[i]){
                // 因为第一个数组下标为0，所以需要加一，因为报数是1到3循环报数，所以需要对三求余数
                System.out.println("原来喊得数："+(i+1)%3);
            }
            
        }
    }
}
