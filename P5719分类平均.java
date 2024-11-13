import java.util.Scanner;
public class P5719分类平均 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double sum1=0,sum2=0;
		double m=0,j=0;
		for(int i = 1; i <= n; i++) {
			if(i % k == 0) {
				sum1 += i;
				m++;
			}else {
				sum2 += i;
				j++;
			}
		}
		System.out.printf("%.1f %.1f", sum1/m,sum2/j);
	}
 
}