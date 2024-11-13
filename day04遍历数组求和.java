package com.itheima.test;
import java.util.Random;
public class day04遍历数组求和 {
    public static void main(String[] args) {
    Random r=new Random();
    //定义sum为所有数据和，ave为平均数，计数器content
    int sum=0;
    int ave=0;
    int content=0;
    //定义一个动态数组
    int arr[]=new int[10];
    //将随机数组存入数组当中
    for(int i=0;i<arr.length;i++){
        //每循环一次生成一个随机数并存入数组
        int num=r.nextInt(100)+1;
        arr[i]=num;
        sum+=num;
    }
    ave=sum/10;
    for(int j=0;j<10;j++){
        if(arr[j]<ave)content++;
    }
    System.out.println(sum);
    System.out.println(ave);
    System.out.println(content);
    for(int s=0;s<10;s++){
        System.out.print(arr[s]+" ");
    }
    }
}
