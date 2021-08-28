package code50;

/**
 * @author shkstart
 * @date 2021/8/19 - 21:05
 */
public class Sum {
    public static void main(String[] args) {
        double a=2,b=1;
        double sum=0;
        for (int i = 0; i < 20; i++) {
            sum+=a/b;
            a=a+b;
            b=a-b;

        }
        System.out.println(sum);
    }
}
