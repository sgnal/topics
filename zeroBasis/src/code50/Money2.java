package code50;

/**
 * @author shkstart
 * @date 2021/8/13 - 19:01
 */
public class Money2 {
    public static void main(String[] args) {
        System.out.println(getTotal(1));
    }
    public static Integer getTotal(Integer n){
        if (n == 10) {
            return 1;

        }
//        什么是递归？
        /*
        -* 当n等于1时，会一直调用递归，直到n等于10返回1然后每个之前调用的方法都返回前面那个数的进行运算在返回值。
        * */
        return (getTotal(n+1)+1)*2;
    }
}
