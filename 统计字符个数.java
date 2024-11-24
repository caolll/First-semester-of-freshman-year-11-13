package day11;
import java.util.Scanner;
public class 统计字符个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daxie=0,xiaoxie=0,shuzi=0;
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')daxie++;
            if (str.charAt(i)>='a'&&str.charAt(i)<='z')xiaoxie++;
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')shuzi++;
        }
        System.out.println(daxie);
        System.out.println(xiaoxie);
        System.out.println(shuzi);
    }
}
