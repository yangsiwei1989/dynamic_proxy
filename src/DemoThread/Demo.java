package DemoThread;



public class Demo {
    public static void main(String[] args) {
        SaleTickets st = new SaleTickets(1000);
        Thread t1 =  new Thread(st,"售票一窗口");
        Thread t2 =  new Thread(st,"售票二窗口");
        Thread t3 =  new Thread(st,"售票三窗口");
        t1.start();;
        t2.start();
        t3.start();

    }

}

//创建线程任务
class SaleTickets implements Runnable{
    private int tickets;
    public SaleTickets(int tickets){
        this.tickets = tickets;
    }
    @Override
    public void run(){
        boolean flag = true;
        while(flag) {
            synchronized (this) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "剩余票数" + tickets--);
                } else {
                    flag = false;
                    System.out.println(Thread.currentThread().getName() + "SALE TICKETS FINISH");
                }
            }
        }
    }
 }



