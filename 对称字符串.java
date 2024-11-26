package day13;
import java.util.Scanner;
public class 对称字符串 {
    public static void main(String[] args) {
        //建立对象并输入
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        //将原输入的字符串还原
        String str1=sb.toString();
        //反转
        sb.reverse();
        //将反转的字符串还原
        String str2=sb.toString();
        //比较
        if(str1.equals(str2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
