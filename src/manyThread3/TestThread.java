package manyThread3;



public class TestThread {

    private byte[] tlock = new byte[1];

    public void testSyn() {
        Thread t1 = new Thread(new TestRunable(tlock));
        Thread t2 = new Thread(new TestRunable(tlock));
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new TestThread().testSyn();
    }


    class TestRunable implements Runnable{

        private byte[] lock;

        public TestRunable(byte[] lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized(lock){

                for(int i=0;i<10;i++) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
						/*lock.notify();
						if(i<9) {
							lock.wait();
						}*/
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }

    }

}

