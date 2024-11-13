import java.util.Scanner;
public class day03test02 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double hou=0.1;
        int time=0;
        while(hou<=8844430){
            hou*=2;
            time++;
        }
        System.out.println(time);
    }
}
