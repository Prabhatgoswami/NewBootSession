package Java_Assignment2;

public class SingletonQues4 {
    public static void main(String [] args)
    {
        //it will get the instance/object of the single class
        Single single=Single.getInstance();
    }
}
class Single
{
    // We MAke Static Object so That no further obj can be created
    //
    static Single Obj=new Single();
    //Private will not allow other classes to make call to default Constructor
    private Single(){

    }
    //It will return the static instance of the class
    public static Single getInstance()
    {   System.out.println("Inside get Instance() Function");
        return Obj;
    }
}