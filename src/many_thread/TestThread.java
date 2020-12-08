package many_thread;

public class TestThread {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();
        //m1.run();
        m1.start();
        m2.start();
        m3.start();
    }
}
