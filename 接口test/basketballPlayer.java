package 接口test;

public class basketballPlayer extends yunDongYuan implements studyEnglish{
    public basketballPlayer() {
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在练习篮球");

    }

    @Override
    public void studyEnglish() {
        System.out.println("篮球运动员在学英语");
    }
}
