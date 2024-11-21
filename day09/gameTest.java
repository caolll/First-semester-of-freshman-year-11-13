package day09;

public class gameTest {
    public static void main(String[] args) {
        game r1=new game("毛毛",100,"man");
        game r2=new game("钟憋",100,"man");
        while(true){
            r1.hit(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"k.o"+r2.getName());
                break;
            }
            r2.hit(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"k.o"+r1.getName());
                break;
            }
        }
    }
}
