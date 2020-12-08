package many_thread;

import com.ccb.proxy.DateUtil;

import java.util.Date;

public class MyThread extends Thread {
    private int ticket = 5;
    @Override
    public void run(){
       // System.out.println("MyThread run()"+ "===>" + DateUtil.dateTransfe(new Date()));
        synchronized(this){
            for(int i=0;i<10;i++){
                if(ticket>0){
                    System.out.println("ticket" + ticket--);
                }
            }
        }

    }
}
