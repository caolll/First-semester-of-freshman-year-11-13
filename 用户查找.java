package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class 用户查找 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //定义集合并储存信息
        ArrayList<User>list = new ArrayList<>();
        User u1=new User("001","xihu","123456");
        User u2=new User("002","zhangsan","12345678");
        User u3=new User("003","lisi","123456");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //输入需要查找的id；
        String id=sc.next();
        //定义方法查找
        boolean result=check(list,id);
        if(result){
            System.out.println("此用户已存在！");
        }
        else{
            System.out.println("此用户不存在！");
        }

    }
    public static boolean check(ArrayList<User>list,String id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
