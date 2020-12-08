package many_thread;

public class SynTest {
    public static void main(String[] args) {
        new Thread(new CountDown(), "倒计时").start();
    }
}
    class CountDown implements Runnable{
        private int time = 10;

        @Override
        public void run() {
            for(int i=0;i<=10;i++){
                if (time>=0){
                    System.out.println(Thread.currentThread().getName()+":"+time--);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }


