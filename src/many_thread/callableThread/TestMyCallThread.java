package many_thread.callableThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestMyCallThread {
    public static void main(String[] args) {
        MyCallThread mct = new MyCallThread();
        //通过实现callable接口的多线程，需要FutureTask类提供支持，用来接收现成的计算结果
        FutureTask <Integer>result = new FutureTask(mct);

        new Thread(result).start();

        try {
            Integer sum = result.get();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
