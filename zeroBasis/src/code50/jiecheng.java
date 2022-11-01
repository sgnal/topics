package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/19 - 21:46
 */
public class jiecheng {
    public static void main(String[] args) {
        System.out.println("请输入您要进行阶乘的数字");
        int i=new Scanner(System.in).nextInt();
        System.out.println(sum(i));
    }

    private static int sum(int i) {
        if(i==1){
            return 1;
        }
       return sum(i-1)*i;
    }
}
