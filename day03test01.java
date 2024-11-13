import java.util.Scanner;
public class day03test01 {
    public static void main(String[]args){
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    for(int i=a;i<=b;i++){
        if(i%3==0&&i%5==0){
            sum++;
            System.out.println(i);
        }
    }
    System.out.println(sum);
    }
}
