package many_thread;

public class MyThreadDemo implements Runnable {
    private int ticket = 300;

    @Override
    public  void run() {
                for(int i=0;i<=300;i++){
                   // synchronized(this){
                        if(this.ticket>=0){
                            System.out.println(Thread.currentThread().getName()+"正在运行"+"ticket"+ ticket--);
                        }
                    }

              //  }
            }


    }




