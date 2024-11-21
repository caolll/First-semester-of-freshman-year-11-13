package day09;

public class test01 {
    //属性定义
    private String name;
    private int age;
    private String Gender;

    //name
   public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }

    //age
    public void setAge(int age){
        if(age>=18&&age<=25){
            this.age = age;
        }
        else System.out.println("数据有误");
    }
    public int getAge(int age){
        return age;
    }

    //Gender
    public void setGender(String Gender){
        this.Gender=Gender;
    }
    public String getGender(String Gender){
        return Gender;
    }

    //定义行为
    public void eat(){
        System.out.println("吃食");
    }
    public void play(){
        System.out.println("luguan");
    }



}
