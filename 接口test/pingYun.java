package 接口test;

public class pingYun extends yunDongYuan implements studyEnglish {
    public pingYun() {
    }

    public pingYun(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在练习乒乓球");
    }
    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员在学英语");
    }
}
