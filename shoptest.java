package day10;

public class shoptest {
    public static void main(String[] args) {
       //创建一个数组
        shop[] arr=new shop[3];
       //创建三个商品对象
        shop g1=new shop("001","牛子",10000.0,10);
        shop g2=new shop("002","保温杯",100,10000);
        shop g3=new shop("003","枸杞",10,10000000);
        //将商品放入数组
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        //遍历
        for(int i=0;i<arr.length;i++){
            shop Goods=arr[i];
            System.out.println(Goods.getId()+","+Goods.getName()+","+Goods.getPrice()+","+Goods.getPrice()+","+Goods.getPrice());
        }
    }
}
