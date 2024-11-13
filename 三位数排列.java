import java.util.Scanner;

public class 三位数排列 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 读取三个整数
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 使用简单的排序逻辑排序三个数
            int temp;
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (a > c) {
                temp = a;
                a = c;
                c = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }

            // 输出排序后的结果
            System.out.println(a + " " + b + " " + c);
        }
    }
}