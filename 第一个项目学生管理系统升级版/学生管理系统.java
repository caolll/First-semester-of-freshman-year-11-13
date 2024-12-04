package 第一个项目学生管理系统升级版;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class 学生管理系统 {
    public static void main(String[] args) {
        String choose1,choose;
        ArrayList<user>listUser=new ArrayList<>();
        loop1:while (true) {
            out.println("---------------------欢迎来到学生管理系统----------------------");
            out.println("1:登录账号");
            out.println("2:注册账号");
            out.println("3:忘记密码");
            out.println("4:退出");
            Scanner scanner = new Scanner(System.in);
            choose1 = scanner.next();
            switch (choose1) {
                case "1" -> {
                    int i=login(listUser);
                    if(i!=1){
                    break loop1;
                    }
                }
                case "2" -> register(listUser);
                case "3" -> wang(listUser);
                case "4" -> {
                    System.out.println("退出系统");
                    System.exit(0);
                    break loop1;
                }
                default -> {
                    System.out.println("没有这个选项，请重新输入");
                }
            }
        }

        ArrayList<student> list=new ArrayList<student>();
        loop2:while (true){
            out.println("-------------------欢迎登录学生管理系统！---------------------");
            out.println("1:添加学生");
            out.println("2:删除学生");
            out.println("3:修改学生");
            out.println("4:查询学生");
            out.println("5:退出");
            out.println("请输入你的选择：");
            //输入选择
            Scanner sc=new Scanner(in);
            choose=sc.next();

            //循环选择
            switch(choose){
                case "1"->tian(list);
                case "2"->shan(list);
                case "3"->xiu(list);
                case "4"->check(list);
                case "5"->{
                    out.println("退出");
                    break loop2;
                }
                default -> out.println("没有这个选项!");
            }
        }

    }
    //添加学生信息
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
    //删除学生信息
    public static void shan(ArrayList<student>list){
        System.out.println("请输入想删除的学生ID：");
        Scanner sc = new Scanner(in);
        String id=sc.next();
        int i=Index(list,id);
        list.remove(i);
        System.out.println("删除成功！");
    }
    //修改学生信息
    public static void xiu(ArrayList<student>list){
        System.out.println("输入你想修改学生的ID：");
        Scanner sc = new Scanner(in);
        String id=sc.next();
        int i=Index(list,id);
        if(i==-1){
            System.out.println("你要修改的"+id+"号学生不存在");
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
    //查询学生信息
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

    //查看id信息的唯一性
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

    //验证是否存在该账号
    public static int IndexUser(ArrayList<user>listUser,String id){
        for(int i=0;i<listUser.size();i++){
            if(listUser.get(i).getUser().equals(id)){
                return i;
            }
        }
        return -1;
    }
    //登录账号
    public static int login(ArrayList<user>listUser)
    {
        Scanner sc = new Scanner(in);
        //无账号时
        if(listUser.isEmpty()){
            System.out.println("当前系统无账号，请注册账号");
            return 1;
        }
        //输账号
        int i;
        while (true) {
            out.println("请输入账号:");
            String idName = sc.next();
            //验证账号的存在
            i=IndexUser(listUser,idName);
            if(i==-1){
                System.out.println("该账号不存在，请重新输入");
            }
            else break;
        }
        //输密码
        System.out.println("请输入密码:");
        String password = sc.next();
        if(!password.equals(listUser.get(i).getPassword())){
            out.println("密码错误，请重新输入");
        }
        //验证码
        String y=Verification(password);
        System.out.println(y);
        while (true) {
            System.out.println("请输入验证码");
            String yan=sc.next();
            if(!yan.equals(y)){
                System.out.println("验证码输入错误");
            }
            else{
                out.println("登录成功！！！");
                break;
            }
        }
        return 0;
    }
    //注册账号
    public static void register(ArrayList<user>listUser){
        user u=new user();
        Scanner sc = new Scanner(System.in);
        //账号
        System.out.println("输入用户名");
        String username=sc.next();
        //存入账号
        u.setUser(username);
        //密码
        String password1= null;
        while (true) {
            System.out.println("输入密码");
            out.println("密码最少由6位数组成");
            password1 = sc.next();
            if(password1.length()<6){
                out.println("密码格式有误，请重新输入");
            }
            else break;
        }
        while (true) {
            out.println("再次输入密码");
            String password2=sc.next();
            if(password1.equals(password2)){
                //存入密码
                u.setPassword(password1);
                break;
            }
            else{
                out.println("第二次密码错误，请重新输入");
            }
        }

        //身份证
        while (true) {
            System.out.println("请输入身份证号：");
            String ID=sc.next();
            if(ID.length()!=18) {
                out.println("身份证有误，请重新输入");
                continue;
            }
            for(int i=0;i<ID.length()-1;i++){
                if(ID.charAt(i)<='0'&&ID.charAt(i)>='9'){
                    out.println("身份证有误，请重新输入");
                }
            }
            if(ID.charAt(17)<='0'&&ID.charAt(17)>='9'&&ID.charAt(17)!='x'){
                out.println("身份证有误，请重新输入");
            }
            else {
                //存入身份证
                u.setID(ID);
                break;
            }
        }
        //手机号码，并获取验证码
        String phone1;
        while (true) {
            System.out.println("请输入手机号");
            phone1=sc.next();
            if(phone1.length()!=11){
                System.out.println("手机号码格式有误，请重新输入");
            }
            else break;
            for(int i=0;i<phone1.length();i++){
                if(phone1.charAt(i)<='0'&&phone1.charAt(i)>='9'){
                    System.out.println("手机号码格式有误，请重新输入");
                }
                else {
                    break;
                }
            }
            u.setPhoneNumber(phone1);
        }
        String verificationCode=Verification(phone1);
        System.out.println("验证码是："+verificationCode);
        while (true) {
            String code=sc.next();
            if(verificationCode.equals(code)){
                break;
            }else
            {
                out.println("验证码输入错误，请重新输入");
            }
        }
        //添加到集合中
        listUser.add(u);
        System.out.println("恭喜注册成功！！！");
    }

    //忘记密码
    public static void wang(ArrayList<user>listUser){
        System.out.println("输入账号：");
        Scanner sc = new Scanner(System.in);
        int i;
        //输入账号，查找是否存在
        String name=sc.next();
        i=IndexUser(listUser,name);
        if(i==-1){
            System.out.println("该账号不存在！");
        }
        //输入身份证
        System.out.println("输入身份证：");
        while (true) {
            String ID=sc.next();
            if(!listUser.get(i).getID().equals(ID)){
                out.println("身份证输入错误");
            }
            else break;
        }
        //手机号
        System.out.println("输入手机号");
        String phone=sc.next();
        //验证码
        String code=Verification(phone);
        while (true) {
            System.out.println(code);
            String yan=sc.next();
            if(!yan.equals(code)){
                System.out.println("验证码输入错误");
            }
            else break;
        }
        //更改密码
        System.out.println("输入修改的密码");
        String password=sc.next();
        listUser.get(i).setPassword(password);
        System.out.println("修改成功！！!");
    }
    //验证码
    public static String Verification(String phoneNumber){
        char[]zimu=new char[52];
        int[] shuzi=new int[10];
        for(int i=0;i<52;i++){
            if(i<=25){
                zimu[i]=(char)(97+i);
            }
            else {
                zimu[i]=(char)(65+i-26);
            }
        }
        for(int i=0;i<10;i++){
            shuzi[i]=i;
        }
        StringBuilder verificationCode = new StringBuilder();
        Random random = new Random();

        // 循环生成指定个数的字符或数字组成验证码
        for (int i = 0; i < 4; i++) {
            // 随机决定本次生成字母还是数字，比如这里简单以概率各50%决定
            if (random.nextBoolean()) {
                // 生成随机字母索引
                int randomCharIndex = random.nextInt(zimu.length);
                verificationCode.append(zimu[randomCharIndex]);
            } else {
                // 生成随机数字索引
                int randomNumIndex = random.nextInt(shuzi.length);
                verificationCode.append(shuzi[randomNumIndex]);
            }
        }
        return verificationCode.toString();
        }
    }



