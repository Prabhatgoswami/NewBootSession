public class SyncMethodQues5
{
    private int count=0;
    private int temp=0;
    public synchronized void increment() //synchronized method
    {
        count++;
    }

    void Increase()
    {
        synchronized (this) //synchronized block
        {
            temp++;
        }
    }
    public static void main(String args[])
    {
        SyncMethodQues5 s1=new SyncMethodQues5();
        s1.dowork();
    }
    public void dowork()
    {
        Thread t1=new Thread(new Runnable() {         //thread for synchronized method
            @Override
            public void run() {
                int i=0;
                while(i<1000)
                {
                    increment();
                    i++;
                }
            }
        });
        Thread t2=new Thread(new Runnable() {      //thread for synchronized method
            @Override
            public void run() {
                int i=0;
                while(i<1000)
                {
                    increment();
                    i++;
                }
            }
        });
        Thread t3=new Thread(new Runnable() {      //thread for synchronized Block
            @Override
            public void run() {
                int i=0;
                while(i<500)
                {
                    Increase();
                    i++;
                }
            }
        });
        Thread t4=new Thread(new Runnable() {        //thread for synchronized Block
            @Override
            public void run() {
                int i=0;
                while(i<500)
                {
                    Increase();
                    i++;
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value of Count using Synchronized method is:  "+count);
        System.out.println("Value of Temp using synchronzed block is: "+temp);
    }
}

