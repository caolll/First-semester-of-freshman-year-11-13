import java.util.Scanner;
public class P5721数字直角三角形 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=1;
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=1;j--){
                if(num1<10)System.out.print("0"+num1);
                else System.out.print(num1);
                num1++;
            }
            System.out.printf("\n");
        }
    }
}
