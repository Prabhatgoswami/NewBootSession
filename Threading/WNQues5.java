import javax.annotation.processing.Processor;
import java.util.Scanner;
public class WNQues5 {
    public void Producer() throws InterruptedException {
        synchronized (this)
        {
            System.out.println("Producer Thread is working");
            wait();
            System.out.println("Producer Thread Resumed");
        }
    }

    public void Consumer() throws InterruptedException {
        Scanner Scan=new Scanner(System.in);
        Thread.sleep(1000);
        synchronized (this)
        {
            System.out.println("Waiting for User to press return KEy");
            Scan.nextLine();
            System.out.println("Return Key is Passed");
            notify();
            Thread.sleep(1000);
        }
    }
}
class Wait
{
    public static void main(String[] args)
    {
        final WNQues5 process=new WNQues5();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.Producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.Consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
