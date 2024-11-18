import java.util.Scanner;
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[][]=new int[100][100];
       int n=sc.nextInt();
       arr[0][0]=1;
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                arr[i][j]=1;
            }
            else {
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}
