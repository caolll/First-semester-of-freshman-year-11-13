package day10;

public class car {
    private String brand;
    private int price;
    private String color;

    //空参
    public car() {
    }
    //全参
    public car(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    //getter/setter
    public  String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
