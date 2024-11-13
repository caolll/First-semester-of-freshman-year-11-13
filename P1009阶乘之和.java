import java.util.Scanner;
public class P1009阶乘之和 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int temp=1;
    for(int i=1;i<=n;i++)
    {
        temp*=i;
        sum+=temp;
    }
    System.out.println(sum);
    }
}
