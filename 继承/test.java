package 继承;


public class test {
    public static void main(String[] args) {
        //创建并调用对象

        //布偶猫
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        //哈士奇
        Husky h=new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();


    }
}
