package com.itheima.test;
import java.util.Random;
import java.util.Scanner;
public class day04test01 {
    public static void main(String[]args){
        Random r=new Random();
        int num=r.nextInt(101)+1;//1~100;\
        Scanner sc=new Scanner(System.in);
        while(true){
    
    int gess=sc.nextInt();
    if(gess==num){
        System.out.println("恭喜猜对了！！");
        break;
    }
    else {
        System.out.println("猜错了，，，");
    }
        }
    }
}