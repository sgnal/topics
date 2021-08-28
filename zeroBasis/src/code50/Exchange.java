package code50;

/**
 * @author shkstart
 * @date 2021/8/23 - 13:04
 */
/*
* 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
* */
public class Exchange {
    public static void main(String[] args) {
        ArrayChange ac=new ArrayChange(20);
        ac.insert(15);
        ac.insert(85);
        ac.insert(26);
        ac.insert(79);
        ac.insert(46);
        ac.insert(37);
        ac.insert(57);
        ac.insert(50);
        ac.insert(19);
        ac.insert(1045);
        ac.display();
        System.out.println("____________");
        ac.change();
        ac.display();
    }
}
class ArrayChange{
    int items;
    int[] array;

    public ArrayChange(int max){
        array=new int[max];
        items = 0;
    }
    public void insert(int k){
        array[items++]=k;
    }
    public void change() {
        int max = 0;
        int min = items - 1;
        for (int i = 0; i < items; i++) {
            // 取出最大值
            // 如果数组中的元素比最大值还大，就把数组中的那个元素的下标赋值给最大值的下标
            if (array[i] > array[max]) {
                max = i;
            }
            if (array[i] < array[min]) {
                min = i;
            }


        }
        //以上for循环找到最大值和最小值，max是最大值的下标，min是最小值的下标
        int temp1 = array[0];
        int temp2 = array[items-1]; //这两个temp只是为了在交换时使用

        array[0] = array[max];
        array[max] = temp1; //首先交换a[0]和最大值a[max]

        if (min != 0) { //如果最小值不是a[0]，执行下面
            array[items-1]=array[min];
            array[min]=temp2;
            //交换a[min]和a[n-1]
        } else { //如果最小值是a[0],执行下面
            array[max] = array[items - 1];
            // 这个temp1是没进行交换之前的最小值，把这个最小值赋值给最后一个值，这里有点难以理解
            // 但是这个最大值就是最小值，但是这个temp1把之前与最大值转换走的是一致的，所以直接可以进行这样转换，不用array[max]和array[items - 1]
            // 进行转换
            array[items - 1] = temp1;


        }
    }
    public void display(){
        for (int i = 0; i < items; i++) {
            System.out.println(array[i]+" ");

        }
        System.out.println();
    }
}
