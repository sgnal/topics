package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/19 - 23:00
 */
public class PrintNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个不多于5位数的正整数");
        int s=new Scanner(System.in).nextInt();
        try {
            printnumber(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printnumber(int s) throws Exception {
        String a= String.valueOf(s);
        if(a.length()>=5){
            throw new Exception("输入错误，请输入不多于5位的正整数");
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));


        }

    }
}
