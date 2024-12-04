package 方法的重写;

public class test {
    public static void main(String[] args) {
        Husky h=new Husky();
        h.eat();
        h.breakHome();
        h.drink();
        h.lookHome();

        System.out.println("------------------------------------");
        sharpei s=new sharpei();
        s.eat();
        s.lookHome();
        s.drink();
        System.out.println("------------------------------------");

        ChineseDog c=new ChineseDog();
        c.eat();
        c.lookHome();
        c.drink();
        System.out.println("------------------------------------");






    }


}
