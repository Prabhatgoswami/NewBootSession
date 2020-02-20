public class DeadlockQues10 {
   final String string1="Deadlock1";
    final String string2="Deadlock2";

    Thread thread1=new Thread("Child Thread-1")
    {
        public void run()
        {

                synchronized (string1)
                {
                    System.out.println("Thread-1 LOCKED string1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (string2)
                    {
                        System.out.println(string1+string2);
                    }
                }

        }

    };

    Thread thread2=new Thread("Child Thread-2")
    {
        public void run()
        {

                synchronized (string2)
                {
                    System.out.println("Thread-2 LOCKED string2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (string1)
                    {
                        System.out.println(string1+string2);
                    }
                }

        }

    };

    public static void main(String[] args) throws InterruptedException {
        DeadlockQues10 mydeadlock=new DeadlockQues10();
        mydeadlock.thread1.start();
        mydeadlock.thread2.start();
        mydeadlock.thread1.join();
        mydeadlock.thread2.join();
    }
}
