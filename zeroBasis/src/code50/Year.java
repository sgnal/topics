package code50;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2021/8/19 - 22:54
 */
public class Year {
    public static void main(String[] args) {
        System.out.println("请输入第几人的年龄？");
        int person=new Scanner(System.in).nextInt();
        System.out.println(Person(person));
    }

    private static int Person(int person) {
        if(person==1){
            return 10;
        }
        return Person(person-1)+2;
    }
}
