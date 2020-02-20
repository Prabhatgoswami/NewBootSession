import java.util.concurrent.*;

public class C_FQues7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        System.out.println("sum of two number");

        Future<Long> result= executorService.submit(new Add(50,60));

        Long add=result.get();

        System.out.println("Sum of two number is "+add);

    }
    static class Add implements Callable<Long>
    {   private int num1,num2;
        public Add(int num1,int num2)
        {
            this.num1=num1;
            this.num2=num2;
        }

        @Override
        public Long call() throws Exception {
            return add();
        }
        private Long add()
        {
         long result=0;
         result=num1+num2;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return result;
        }
    }
}
