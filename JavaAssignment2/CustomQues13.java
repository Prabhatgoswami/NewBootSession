package Java_Assignment2;

import java.awt.datatransfer.StringSelection;

public class CustomQues13{
    public static void main(String[] args) {
        try{
            throw new MyException("Custom Exception");
        }
        catch (MyException e)
        {
            System.out.println("Exception Caught...");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
class MyException extends Exception{
    public MyException(String s)
    {
        super(s);
    }
}
