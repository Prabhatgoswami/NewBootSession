public class TThreadQues3 extends Thread {
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread made by Extending 'Thread Class' : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class TThreadinterface implements Runnable{

    @Override
    public void run() {
        int i=5;
        while(i<10){
            System.out.println("Thread made by Implementing the 'Runnable Interface' "+i);
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class MakeThread
{
    public static void main(String[] args)
    {
        TThreadQues3 thread1=new TThreadQues3(); // It will Create the thread using Thread Class
        Thread thread2=new Thread(new TThreadinterface()); //It will Create the thread by Implementing the interface
        thread1.start();
        thread2.start();
    }
}