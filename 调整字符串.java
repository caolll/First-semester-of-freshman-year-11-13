package day13;
import java.util.Scanner;
public class 调整字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入字符串
        String strA = sc.next();
        String strB = sc.next();
        //判断是否会相等
        boolean result=check(strA ,strB);
        System.out.println(result);

    }
    //判段A旋转后是否会和B相同
     public static boolean check(String strA ,String strB){
         for(int i=0;i<strA.length()-1;i++){
             strA=xuan(strA);
             if(strB.equals(strA)){
                 return true;
             }
         }
         return false;
     }
    //定义方法旋转字符串
    public static String xuan(String str){
        String end=str.substring(0,1);
        String start=str.substring(1,str.length());
        return start+end;
    }
}
