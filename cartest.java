package day10;
import java.util.Scanner;
public class cartest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        car[] arr=new car[3];
        for(int i=0;i<arr.length;i++){
            car c=new car();
            System.out.println("请输入车的品牌：");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入车的价格：");
            int price=sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入车的颜色：");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;
        }
        for(int j=0;j<arr.length;j++){
            car c=arr[j];
            System.out.println(c.getBrand()+","+c.getPrice()+","+c.getColor());
        }
    }
}
