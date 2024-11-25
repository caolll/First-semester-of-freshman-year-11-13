package day12;

public class 屏蔽敏感词 {
    public static void main(String[] args) {
        //输入说的话
        String talk="你玩的真好，下次别玩了,CNM,MLGB,TMD";
        //设置敏感词库
        String[] keywords={"TMD","MLGB","CNM","SB"};
        //替换敏感词
        for(int i=0;i<keywords.length;i++){
            talk=talk.replace(keywords[i],"***");
        }
        System.out.println(talk);
    }
}
