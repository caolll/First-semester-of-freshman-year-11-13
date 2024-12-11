package 接口test;

public class test {
    public static void main(String[] args) {
        pingYun p= new pingYun("马龙",32);
        System.out.println(p.getName()+", "+p.getAge());
        p.study();
        p.studyEnglish();
    }
}
