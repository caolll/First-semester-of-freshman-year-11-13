    import java.util.Random;
    import java.util.Scanner;

//游戏规则：
    //总共有5次猜数字的机会。
    //每次猜完数会有中文提示。
    //猜完一边自动进行下一次。如果想退出输入 -1。


    public class gameGess {
        public static void main(String[] args) {
            top1:while(true){
                int number;//随机数
                int gessNumber;//猜的数
                int i = 5;//定义次数
                int tool;//判断游戏的进行。

                //生成随机数
                Random rand = new Random();
                number = rand.nextInt(100) + 1;
                Scanner sc = null;


                    //输入选择
                    System.out.println("---------GESSGAME---------");
                    System.out.println(" ");
                    System.out.println("进行你的选择：");
                    System.out.println("输入 “1” 进行游戏");
                    System.out.println("输入 “-1” 退出游戏");
                    System.out.println(" ");
                    System.out.println("==========================");
                    sc = new Scanner(System.in);

                    //提前对tool进行判定
                    while(true){
                        tool = sc.nextInt();
                        if(tool==1||tool==-1){
                            break;
                        }
                        else{
                            System.out.println("输入有误，请从新输入。");
                        }
                    }


                    switch (tool) {
                        case 1: {
                            System.out.println("游戏开始！！！");
                            break;
                        }
                        default: {
                                System.out.println("游戏结束。");
                                break top1;
                        }

                    }


                //进行比较
                while (true) {
                    i--;
                    System.out.print("输入你猜的数：");
                        gessNumber = sc.nextInt();
                    if (gessNumber == number) {
                        System.out.println("恭喜你猜对了！！！");
                        break;
                    }

                    tiShi(gessNumber, number);

                    if (i == 0) {
                        System.out.println("你的机会已用完！你输了！！！");
                        break;
                    }
                    if (gessNumber != number) {
                        System.out.println("你还有" + i + "次机会。请重新回答。");
                    }
                }
            }
        }
        //提示方法
        public static int tiShi(int num1,int num2) {
            if (num1 > num2) {
                System.out.print("猜大了  ");
            } else if (num1 < num2) {
                System.out.print("猜小了  ");
            }
            return 0;

        }
    }

