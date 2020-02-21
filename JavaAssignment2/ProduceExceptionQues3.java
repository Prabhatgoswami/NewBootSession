package Java_Assignment2;

public class ProduceExceptionQues3 {
    public static void main(String args[]){
       //Class not Found Exception
        try
        {
            Class.forName("filenotfound");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

}
