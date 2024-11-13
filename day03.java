import java.util.Scanner;
public class day03{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
       switch(data){
        case 1->
           { System.out.println("跑步");}
        case 2->
            {System.out.println("游泳");}
        case 3->
    {System.out.println("慢走");}
            case 4->
        {System.out.println("动感单车");}
            case 5->
        {System.out.println("拳击");}
            case 6->
        {System.out.println("爬山");}
        default ->
        {System.out.println("好好吃一顿");}
       }


    }
}