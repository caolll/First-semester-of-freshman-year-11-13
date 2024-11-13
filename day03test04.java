import java.util.Scanner;
public class day03test04 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        int result=0;
        int a=0;
        while(x>0){
            a=x%10;
            x=x/10;
            result=result*10+a;
        }
        System.out.println(result==temp);
    }
}
