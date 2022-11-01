package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/20 - 23:25
 */
/*
 *题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
 * */
public class JudgeNumber2 {
    public static void main(String[] args) {
        System.out.println("请输入一个5位数的数字");
        int number=new Scanner(System.in).nextInt();
        System.out.println(judge(number)?"您输入的数字确认是回数":"您输入的有误？？请重新输入");
    }

    private static boolean judge(int number) {
//        万位
        int tenThousand = number/10000%10;

//      个位
        int onePlace = number%10;

//      十位
        int ten = number/10%10;

//      千位
        int thousands=number/1000%10;
        return onePlace == tenThousand && ten == thousands;

    }
}
/*
* 这个例子最重要的是弄明白运算符%，还有布尔类型的返回值，最后的返回值，值得自己探索，还有一点要注意就是java的代码规范
* */
