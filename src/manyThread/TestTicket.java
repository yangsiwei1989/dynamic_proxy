package manyThread;

public class TestTicket {
    public static void main(String[] args) {
        SaleTicket st = new SaleTicket(100);
        Thread t1 = new Thread(st,"windows1");
        Thread t2 = new Thread(st,"windows2");
        Thread t3 = new Thread(st,"windows3");
         t1.start();
         t2.start();
         t3.start();
    }
}
