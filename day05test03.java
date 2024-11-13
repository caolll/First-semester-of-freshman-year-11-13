package com.itheima.test;
public class day05test03 {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66};
        int max=printArr(arr);
        System.out.println(max);
    }
    public static int printArr(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
            max=arr[i];
           }
        }
        return max;
    }
}
