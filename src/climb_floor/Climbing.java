package climb_floor;

public class Climbing {
    public static void main(String[] args) {
//            boolean flag =true;
//            int num = 7;
//
//            while(flag){
//                if(num%7==0&&num%2==1&&num%3==2&&num%4==3&&num%5==4&&num%6==5){
//                    flag = false;
//                    System.out.println(num);
//                }
//                num = num + 7;
//            }
//            System.out.println(num-7);
        int num = f(4);
        System.out.println(num);

        }
    public static int f(int n){
        if(n<=2) return n;
        int x = f(n-1)+f(n-2);
        return x;
    }
    }

