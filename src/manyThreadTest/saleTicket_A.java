package manyThreadTest;

public class saleTicket_A implements Runnable {
    int num;
    public saleTicket_A(int num){
        this.num = num;

    }
    Boolean flag = true;
    @Override
    public void run(){
        synchronized(this){
            while(flag){
            if(num>=1){
                //模拟延时
                try {
                    Thread.sleep(300);  //sleep()不释放锁
                    //this.wait(300);     //wait() 释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("窗口"+Thread.currentThread().getName()+"在售卖"+"剩余票数：" + num--);
            }else{
                flag=false;
            }
            }

        }
    }
}
