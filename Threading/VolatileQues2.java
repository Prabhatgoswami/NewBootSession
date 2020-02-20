import java.util.Scanner;

class ShutDown  extends  Thread {
    private volatile Boolean counter = true;

    public void run() {

        while (counter) {
            System.out.println("hey");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void shut() {
        counter = false;
    }
}


   public class VolatileQues2 {
        public static void main(String[] args) {

            ShutDown thread1 = new ShutDown();
            thread1.start();

            System.out.println("Press Enter to stop");
            Scanner input = new Scanner(System.in);
            input.nextLine();
            thread1.shut();
        }
    }

