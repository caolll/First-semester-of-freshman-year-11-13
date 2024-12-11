package 接口test;

public class basketballCoach extends teacher{
    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教运动员篮球");
    }
}
