package day14;

public class phone {
    private String phone;
    private int price;

    //空参

    public phone() {
    }

    //参数

    public phone(String phone,  int price) {
        this.phone = phone;
        this.price = price;
    }

    //getter/setter

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
