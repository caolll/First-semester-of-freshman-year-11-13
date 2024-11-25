package day12;
import java.util.Scanner;
public class 手机号屏蔽 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入手机号码
        String phoneNumber = sc.next();
        //截取前三位
        String start=phoneNumber.substring(0,3);
        //截取后4位
        String end=phoneNumber.substring(7);
        //拼接
        String rusult=start+"****"+end;
        System.out.println(rusult);
    }
}
