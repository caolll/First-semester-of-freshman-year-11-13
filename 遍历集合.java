package day14;

import java.util.ArrayList;

public class 遍历集合 {
    public static void main(String[] args) {

        /*集合类型
        int-Integer
        char-Character
        其余的均是将首字母大写，如long-Long;
         */


        //字符串类型的
        ArrayList<String> list = new ArrayList<>();
        list.add("点赞");
        list.add("投币");
        list.add("转发");
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");



        //数字类型的
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        //遍历
        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if (i == list1.size() - 1) {
                System.out.print(list1.get(i));
            } else {
                System.out.print(list1.get(i) + ",");
            }
        }
        System.out.println("]");


        //字符类型
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('c');
        list2.add('d');
        //遍历
        System.out.print("[");
        for (int i = 0; i < list2.size(); i++) {
            if (i == list2.size() - 1) {
                System.out.print(list2.get(i));
            } else {
                System.out.print(list2.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
