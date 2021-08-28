package code50;

/**
 * @author shkstart
 * @date 2021/8/13 - 18:38
 */
public class Monkey {
    public static void main(String[] args) {
        int x=1;
        for (int i = 1; i < 10; i++) {
            x=(x+1)*2;
        }
        System.out.println(x);
    }
}