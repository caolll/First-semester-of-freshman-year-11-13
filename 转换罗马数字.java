package day13;
import java.util.Scanner;
public class 转换罗马数字 {
    public static void main(String[] args) {
        //建立对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str;
        //判断字符串是否符合规定
        while(true){
            str = sc.nextLine();
            boolean flag=bool(str);
            if(flag){
                break;
            }
            else{
                System.out.println("输入有误，请重新输入！");
            }
        }
        //进行住转换
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int number=c-'0';
            String s=Exchange(number);
            System.out.print(s+" ");
        }
    }
    //转换数字
    public static String Exchange(int number){
        String []luoma={" ","Ⅰ", "Ⅱ","Ⅲ","Ⅳ", "Ⅴ","Ⅵ","Ⅶ", "Ⅷ","Ⅸ"};
        return luoma[number];
    }

    //字符串的数字判断
    public static boolean bool(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
}
