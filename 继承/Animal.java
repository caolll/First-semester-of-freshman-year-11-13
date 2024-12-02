package 继承;

public class Animal {

    //***不可以写private，如写了，别的类就不能访问了
    //继承：java中的所有类都是直接或间接继承Object类
    //子类只能访问父类中的非私有成员

    public void eat(){
        System.out.println("吃东西");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
