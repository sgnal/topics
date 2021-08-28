package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/20 - 23:58
 */
/*
* 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母
* Monday Tuesday Wednesday Thursday Friday Saturday Sunday
* */
public class JudgeTheDayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("请输入第一个字母，判断星期，如果第一个字母相同，就输入第二个字母");
        String word=new Scanner(System.in).nextLine();
        judge(word);
    }

    private static void judge(String word) {
//        字母
        char[] letter=word.toCharArray();
        if (letter[0]=='M'){
            System.out.println("星期一");
        }else if (letter[0]=='W'){
            System.out.println("星期三");
        }else if (letter[0]=='T'){
            if (letter[1]=='u'){
                System.out.println("星期二");
            }else if (letter[1]=='h'){
                System.out.println("星期四");
            }
        }else if (letter[0]=='F'){
            System.out.println("星期五");
        }else if (letter[0]=='S'){
            if (letter[1]=='a'){
                System.out.println("星期六");
            }else if (letter[1]=='u'){
                System.out.println("星期日");
            }
        }
    }
}
