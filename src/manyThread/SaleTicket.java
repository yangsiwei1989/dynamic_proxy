package manyThread;

public class SaleTicket implements Runnable{
    private int num;
    public SaleTicket(int num){
        this.num = num;
    }

    Boolean flag = true;
    @Override
    public void run() {
        synchronized (this){
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
                }else {
                    System.out.println("00000");
                    flag = false;
                }
            }
        }



    }
}
