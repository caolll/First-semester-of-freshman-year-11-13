package day14;

import java.util.ArrayList;
import java.util.Scanner;
public class student集合添加对象 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        //新定义的集合的长度位0；所以在下面的输入时不可写i<list.size();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            student s = new student();
            //输入学生的姓名和年龄
            System.out.println("请输入姓名：");
            String name=sc.next();
            System.out.println("请输入年龄：");
            int age=sc.nextInt();
            //将学生的姓名年龄赋给学生对象
            s.setName(name);
            s.setAge(age);
            //再添加到集合中
            list.add(s);
        }
        //遍历集合
        //list.get(i);只是将地址赋给集合，需要将其转换，重新定义变量接收，输出《《stu.getName()》》重点要进行获取
        for(int i=0;i<3;i++){
            student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }

    }
}
