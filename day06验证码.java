import java.util.Random;
import java.util.Scanner;
public class day06验证码 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] zimu=new char[52];
        int [] shuzi=new int[10];
        for(int i=0;i<52;i++){
            if(i<=25){
                zimu[i]=(char)(97+i);
            }
            else {
                zimu[i]=(char)(65+i-26);
            }
        }
        for(int i=0;i<10;i++){
            shuzi[i]=i;
        }
        for(int i=0;i<4;i++){
            Random r=new Random();
            int randomChar=r.nextInt(zimu.length);
            System.out.print(zimu[randomChar]);
        }
            Random r=new Random();
            int randomNum=r.nextInt(shuzi.length);
            System.out.print(shuzi[randomNum]);
    }
}
