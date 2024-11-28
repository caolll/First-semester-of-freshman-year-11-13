package day14;

import java.util.ArrayList;

public class phone返回多个数据 {
    public static void main(String[] args) {
        ArrayList<phone>list=new ArrayList<>();
        phone p1=new phone("小米",2999);
        phone p2=new phone("华为",8999);
        phone p3=new phone("苹果",5999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<phone>list2=new ArrayList<>();
        list2=get(list);
        for(int i=0;i<list2.size();i++){
            phone p=list2.get(i);
            System.out.println(p.getPhone()+","+p.getPrice());
        }
    }
    //查找价格大于5000的手机

    //方法里要返回集合的话方法命名要写ArrayList<>，注意要写泛明
    public static  ArrayList<phone> get(ArrayList<phone>list){
        ArrayList<phone>list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            phone p=list.get(i);
            int price=p.getPrice();
            if(price>5000){
                list1.add(p);
            }
        }
        //返回
        return list1;
    }
}

