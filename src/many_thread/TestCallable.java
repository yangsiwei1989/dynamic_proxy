package many_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) {
        MyCallable td = new MyCallable();

        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        FutureTask<Integer> result1 = new FutureTask<>(td);
        FutureTask<Integer> result2  =new FutureTask<>(td);
        FutureTask<Integer> result3  =new FutureTask<>(td);

        new Thread(result1).start();
        new Thread(result2).start();
        new Thread(result3).start();

        //2.接收线程运算后的结果
        try {
            Integer sum = result3.get();  //FutureTask 可用于 闭锁 类似于CountDownLatch的作用，在所有的线程没有执行完成之后这里是不会执行的
            System.out.println(sum);
            System.out.println("------------------------------------");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
