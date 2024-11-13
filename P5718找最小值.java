import java.util.Scanner;
public class P5718找最小值 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=10000;
        int n=sc.nextInt();
        int a;
        for(int i=1;i<=n;i++){
            a=sc.nextInt();
            if(min>a)min=a;
        }
        System.out.println(min);
    }
}
