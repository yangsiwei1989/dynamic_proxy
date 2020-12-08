package testRandom;


import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        //生成一个长车牌随机数 包含字母和数字
        getEng("豫A.");
    }
    public static String getEng(String str){
        Random r = new Random(System.currentTimeMillis());
        float a = r.nextFloat();
        String s = Float.toString(a);
        String b = s.substring(2,7);
        System.out.println(str + b);
        return str + b;
    }
}
