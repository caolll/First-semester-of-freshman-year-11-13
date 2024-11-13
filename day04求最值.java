package com.itheima.test;

public class day04求最值 {
    public static void main(String[] args) {
    //1,定义数组储存5个值；
    int arr[]={33,34,55,11,77};
    //定义一个max和min来储存最大值和最小值。
    int max=arr[0];
    int min=arr[0];
    //遍历每个元素
    for(int i=0;i<5;i++){
        //将每个元素与max，min对比
        if(max<arr[i]){
            max=arr[i];
        }
        if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println(max);
    System.out.println(min);

    }
}
