package Java_Assignment2;

public class MultipleCatchQues6 {
    public static void main(String[] args) {
//        try{
//            System.out.println("Before Exception");
//            throw new NullPointerException();
//        }catch (NullPointerException npe){
//            System.out.println("Null Pointer Exception");
//            npe.printStackTrace();
//        }catch (Exception e)
//        {
//            System.out.println("Any Exception");
//            e.printStackTrace();
//        }finally {
//            System.out.println("Here we Release all resources and Locks");
//            System.out.println("finally block");
//        }
//        System.out.println("After finally Block");


        try
        {
            int a[]=new int[5];
            a[6]=100/2;
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of Bounds Exception");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occurs");
        }
        catch (Exception e)
        {
            System.out.println("Any Exception");
        }
        finally {
            System.out.println("Finally Block");
            System.out.println("All Locks and Resources are released here");
        }
        System.out.println("All Catch and Finally Block are done");
    }
}
