package com.itheima.test;
import java.util.Random;
public class day04打乱数组中的数据 {
    public static void main(String[] args) {
        //定义一个数组并存粗1，2，3，4，5；
        int arr[]={1,2,3,4,5};
        Random r=new Random();
        //定义一个临时变量
        int temp;
        //简单的借助第三变量换数
        for(int i=0;i<5;i++){
            //随机索引的数为0，1，2，3，4；
            int randomnum=r.nextInt(arr.length);
            temp=arr[i];
            arr[i]=arr[randomnum];
            arr[randomnum]=temp;
        }
        for(int j=0;j<5;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
