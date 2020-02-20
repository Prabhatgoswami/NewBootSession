import java.util.concurrent.CountDownLatch;

public class LatchQues9 {
    public static void main(String[] args) throws InterruptedException {
        //Create task which will wait for 3 threads to complete the task
        CountDownLatch latch=new CountDownLatch(3);
        Call_Latch first=new Call_Latch(1000,latch,"Thread 1");
        Call_Latch second=new Call_Latch(2000,latch,"Thread 2");
        Call_Latch third=new Call_Latch(5000,latch,"Thread 3");

        first.start();
        second.start();
        third.start();


        latch.await();

        System.out.println(Thread.currentThread().getName()+" has Funished ..");

    }
    static class Call_Latch extends Thread
    {
        private int delay;
        private CountDownLatch latch;

        public Call_Latch(int delay, CountDownLatch latch, String msg)
        {
            super(msg);
            this.delay=delay;
            this.latch=latch;
        }
        public void run()
        {
            try {
                Thread.sleep(delay);
                latch.countDown();
                System.out.println(Thread.currentThread().getName()+" is Finished..");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

