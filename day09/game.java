package day09;

import java.util.Random;
public class game {
    //人物属性
    private String name;
    private int blood;
    private String gender;

    //定义人物形象
    String[] boyImage={"风流倜傥","气宇轩昂","帅的一逼","面目狰狞"};
    //String[] girlImage={"闭月羞花","成鱼落雁","平平无奇","惨不忍睹"};

    //定义武功
    String[] kongFu={"九阴白骨爪","降龙十八🦌","猴子偷桃","玉女心经","平A"};

    //定义空参
    public game(){}

    //定义全参
    public game(String name,int blood,String gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
    }

    //对每个全局变量写getter和setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getBlood(){
        return blood;
    }
    public void setBlood(int blood){
        this.blood=blood;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    //定义一个攻击方式
    public void hit(game game){
        //写人物的形象
        Random rand=new Random();
        int image=rand.nextInt(boyImage.length);
        //人物的攻击方式
        Random way=new Random();
        int KongFU=way.nextInt(kongFu.length);
        //定义每次攻击造成的伤害 1~20每次
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        //定义剩余血量
        int nextBlood=game.getBlood()-hurt;
        nextBlood=nextBlood<0 ? 0:nextBlood;
        //修改人的剩余血量
        game.setBlood(nextBlood);
        //打架
        System.out.println(boyImage[image]+"的"+this.getName()+"使用了"+kongFu[KongFU]+"向"+boyImage[image]+game.getName()+"打去，使"+game.getName()+"掉了"+hurt+"血量，剩"+nextBlood+"血量。");

    }







}
