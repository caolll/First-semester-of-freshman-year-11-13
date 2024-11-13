import java.util.Scanner;
public class day02 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
     System.out.println("请输入一个整数:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     String result= a==b? "相同":"不同";
     System.out.println(result);
    }
}
