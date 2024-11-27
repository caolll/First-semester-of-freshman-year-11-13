package day14;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<String> list = new ArrayList<>();

        //add添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //删除元素remove（""）||remove（索引）；
        //1
        boolean str=list.remove("ddd");
        //2
        String str1=list.remove(1);

        //替换元素
        String str2=list.set(0,"eee");

        //查找元素
        String str3=list.get(1);
        System.out.println("是否删除成功:"+str+"    "+"删除的元素:"+str1+"    "+"替换的原元素:"+str2+"    "+"查找的元素:"+str3);
        System.out.print("修改后的集合：");
        System.out.println(list);
    }
}
