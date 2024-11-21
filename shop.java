package day10;

public class shop {
    private String id;
    private String name;
    private double price;
    private int count;
    //定义空参
    public shop(){}
    //定义全参
    public shop(String id,String name,double price,int count){
        this.id=id;
        this.name=name;
        this.price=price;
        this.count=count;
    }
    //写getter与setter
    //id
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    //name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    //count
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count=count;
    }

}
