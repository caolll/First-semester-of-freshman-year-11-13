package 接口test;
//防止外界创建人
public abstract class person {
    private String name;
    private int age;

    public person() {
    }
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
