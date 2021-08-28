package code50;

/**
 * @author shkstart
 * @date 2021/8/21 - 13:04
 */
/*
* 题目：求一个3*3矩阵对角线元素之和
* 1 2 3
* 4 5 6
* 7 8 9
* 题目要求是一个对角线，就是说 1 5 9或者说3 5 9这两条对角线中的一条
*
* */
// 求对角线元素之和
public class SumDiagonalElement {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(a[1][1]);
        int sum=0;
        for (int i = 0; i < a.length; i++) {

                    sum+=a[i][i];




        }
        System.out.println(sum);
    }
}
