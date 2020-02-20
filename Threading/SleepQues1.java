public class SleepQues1 extends Thread {
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        try {
            System.out.println("Thread is Sleeping ");
           Thread.sleep(1000);// Sleep function is used to pause the execution of the thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
}
class Call
{
    public static void main(String [] args)
    {
    SleepQues1 thread1=new SleepQues1();
        SleepQues1 thread2=new SleepQues1();
    thread1.start();
    thread2.start();
        try {
            System.out.println("Threads are Joining");
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
}