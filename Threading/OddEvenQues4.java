import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable {
    public synchronized void run() {
        try {
            //String  tt=Thread.currentThread().getName();
            for (int i = 1; i <= 5; i++) {

              {
                    if (i % 2 == 0) {
                        System.out.println( "Printing Even Numbers");
                        System.out.println(i);
                        Thread.sleep(200);
                    }
                }


                    {
                        if (i % 2 != 0) {
                            System.out.println( "Printing ODD Numbers");
                            System.out.println(i);
                            Thread.sleep(300);
                        }
                    }
                }

                Thread.sleep(500);

            System.out.println("Printing Number Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
public class OddEvenQues4{
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();

       ExecutorService threadpool= Executors.newFixedThreadPool(2);
        threadpool.execute(t1);
       threadpool.execute(t2);
    }

}
