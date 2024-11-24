package day11;

import java.util.Scanner;

public class monni {
    public static void main(String[] args) {
        // 给定已知账号密码
        String user = "1879343740@qq.com";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("请输入账号：");
            String putUser=sc.next();
            System.out.println("请输入密码：");
            String putPassword=sc.next();
            if(putUser.equals(user) && putPassword.equals(password)){
                System.out.println("恭喜登录成功！");
                break;
            }
            else{
                System.out.println("账号或密码错误，请重新输入");
                System.out.println("还有"+(3-i)+"次机会！！！");
                if(i==3){
                    System.out.println("账号以冻结！请联系客服QQ1879343740");
                    break;
                }

            }
        }
    }
}