package day12;
import java.util.Scanner;
public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String str1=reverse(str);
        System.out.println(str1);
    }
    public static String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
