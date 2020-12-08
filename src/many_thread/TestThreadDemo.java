package many_thread;

public class TestThreadDemo {
    public static void main(String[] args) {
        MyThreadDemo m = new MyThreadDemo();

        Thread t1 = new Thread(m,"t1");
        Thread t2 = new Thread(m,"t2");
        Thread t3 = new Thread(m,"t3");

        t1.start();
        t2.start();
        t3.start();
                }
}
