package many_thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int ticket = 100;
    @Override
    public Integer  call() throws Exception {
        for(int i = 0;i<100;i++){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName() +"在运行=======》"+ "剩余票数：" + ticket--);
            }
        }
        return ticket;
    }
}
