
import java.util.concurrent.Semaphore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class SemaphoreQues8 {
    private static SemaphoreQues8 instance = new SemaphoreQues8();
    private Semaphore sem = new Semaphore(10, true); // it will create only 10 connection
    private int connections = 0;
    private SemaphoreQues8() {
    }
    public static SemaphoreQues8 getInstance() {
        return instance; }

    public void connect() {
        try {
            sem.acquire();
        } catch (InterruptedException e1) {

            e1.printStackTrace();
        }
        try {
            doConnect();
        } finally {

            sem.release();
        }
    }

    public void doConnect() {

        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        synchronized (this) {
            connections--;
        }
    }
}

class CallSemaphore {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0; i < 200; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    SemaphoreQues8.getInstance().connect();
                }
            });
        }

        executor.shutdown();
    }

}


