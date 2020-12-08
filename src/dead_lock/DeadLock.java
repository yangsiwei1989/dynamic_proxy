package dead_lock;

public class DeadLock {
    public static void main(String[] args) {
        Mythread ms = new Mythread();
        Thread t1 = new Thread(ms,"一线程");
        Thread t2 = new Thread(ms,"二线程");
        t1.start();
        t2.start();

    }


}

class Mythread implements  Runnable{
    Object o1 = new Object();
    Object o2 = new Object();
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("一线程")){
            a();
        }else {b();
        }
    }
    public void a(){
        synchronized (o1){
            System.out.println(Thread.currentThread().getName()+"已获得了o1锁");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
               e.printStackTrace();
            }

            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"已获得了o2锁");
            }
            System.out.println("ok");
        }
    }

    public void b(){
        synchronized (o2){
            System.out.println(Thread.currentThread().getName()+"已获得了o2锁");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"已获得了o1锁");
            }
            System.out.println("ok");
        }
    }


    }
