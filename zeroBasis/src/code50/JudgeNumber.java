package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/20 - 23:10
 */
/*
*题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
* */
public class JudgeNumber {
    public static void main(String[] args) {
        System.out.println("请输入您要输入的数字");
        int number=new Scanner(System.in).nextInt();
        judge(number);
    }

    private static void judge(int number) {
//        回文
        String palindrome=String.valueOf(number);
        char[] result=palindrome.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if(result[i]!=result[palindrome.length()-1-i]){
                System.out.println("该数字不是回文数");
                return;
            }


        }
        System.out.println("该数字是回文数");
    }
}

