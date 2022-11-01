package code50;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2021/8/15 - 12:10
 */
public class PingpongBall {
    public static void main(String[] args) {
        String[] race={"x","y","z"};
        ArrayList<PingpongBall> arrayList=new ArrayList<>();
        //三次循环的目的是为了从三个数中选出合适的数字，最后进行条件的筛选，把不合适的淘汰掉，添加合适的放入集合中，遍历集合，并且重写toString方法
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    PingpongBall pb=new PingpongBall(race[i],race[j],race[k]);
                    //确保了只有一种可能的出现，就是答案
                    if (!pb.a.equals(pb.b)&&!pb.a.equals(pb.c)&&!pb.b.equals(pb.c)&&!pb.a.equals("x")&&!pb.c.equals("x")&&!pb.c.equals("z")) {
                        arrayList.add(pb);
                    }

                }
            }
        }
        for (Object obj:arrayList){
            System.out.println(obj);
        }

    }
    String a,b,c;

    public PingpongBall(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return ("a的对手是：" +a+ ",b的对手是：" + b + ",c的对手是：" + c);
    }
}
