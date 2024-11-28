package 第一个项目学生管理系统;


import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class 学生管理系统 {
    public static void main(String[] args) {
        ArrayList<student>list = new ArrayList<>();
        Loop: while (true) {
            out.println("-------------------欢迎使用学生管理系统！---------------------");
            out.println("1:添加学生");
            out.println("2:删除学生");
            out.println("3:修改学生");
            out.println("4:查询学生");
            out.println("5:退出");
            out.println("请输入你的选择：");
            //输入选择
            Scanner sc=new Scanner(in);
            String choose=sc.next();

            //循环选择
            switch(choose){
                case "1"->tian(list);
                case "2"->shan(list);
                case "3"->xiu(list);
                case "4"->check(list);
                case "5"->{
                    out.println("退出");
                    break Loop;
                }
                default -> out.println("没有这个选项!");
            }
        }

    }
    //添加学生
    public static void tian(ArrayList<student>list) {
        //利用空参构造创建学生对象
        student s = new student();
        Scanner sc = new Scanner(in);
        //添加id
        while (true) {
            out.println("请输入学生ID：");
            String id = sc.next();
            //检验id的唯一性
            boolean flag = checkid(list, id);
            if (flag) {
                //存在重新输入
                out.println("id已存在，请重新输入");
            } else {
                //不存在，可以使用
                s.setId(id);
                break;
            }
        }

        //添加姓名
            System.out.println("请输入学生姓名：");
            String name=sc.next();
            s.setName(name);
        //添加年龄
            out.println("请输入学生年龄：");
            int age=sc.nextInt();
            s.setAge(age);
        //添加地址
            out.println("请输入学生地址：");
            String address=sc.next();
            s.setAddress(address);
        //添加到集合
            list.add(s);
         //提示用户
            System.out.println("信息添加成功！");
    }
    //删除学生
    public static void shan(ArrayList<student>list){
        System.out.println("请输入想删除的学生ID：");
        Scanner sc = new Scanner(in);
        String id=sc.next();
        int i=Index(list,id);
        list.remove(i);
        System.out.println("删除成功！");
    }
    //修改学生
    public static void xiu(ArrayList<student>list){
        System.out.println("输入你想修改学生的ID：");
        Scanner sc = new Scanner(in);
        String id=sc.next();
        int i=Index(list,id);
        if(i==-1){
            System.out.println("修改的信息不存在");
            return;
        }
        student stu = list.get(i);
        System.out.println("输入修改的ID");
        String newid=sc.next();
        stu.setId(id);
        System.out.println("输入修改的姓名");
        String newname=sc.next();
        stu.setName(newname);
        System.out.println("输入修改的年龄");
        int newage=sc.nextInt();
        stu.setAge(newage);
        System.out.println("输入修改的地址");
        String newaddress=sc.next();
        stu.setAddress(newaddress);

        //提示
        System.out.println("学生信息修改成功！");
    }
    //查询学生
    public static void check(ArrayList<student>list){
        if(list.isEmpty()){
            out.println("当前无学生信息，请添加后查询。");
        }
        out.println("ID\t"+"姓名\t"+"年龄\t"+"地址\t");
        for(int i=0;i<list.size();i++){
            student stu=list.get(i);
            out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t\t"+stu.getAddress());
        }

    }

    //查看id的唯一性
    public static boolean checkid(ArrayList<student>list,String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                //存在返回true
                return true;
            }
        }
        //不存在
        return false;
    }

    //返回id相同的id
    public static int Index(ArrayList<student>list,String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
