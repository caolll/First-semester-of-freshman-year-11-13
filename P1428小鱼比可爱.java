package com.itheima.test;
import java.util.Scanner;
public class P1428小鱼比可爱 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            int gao=0;
            for(int s=0;s<j;s++){
                if(a[j]>a[s])gao++;
            }
            System.out.print(gao+" ");
        }
    }
}
