package many_thread.callableThread;

import java.util.concurrent.Callable;

public class MyCallThread implements Callable {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i=0;i<=100;i++){
            sum += i;
    }
        return sum;
    }
}
