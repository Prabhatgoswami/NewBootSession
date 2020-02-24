@FunctionalInterface
interface myinterface1{
    void Operation(int a,int b);

}
public class Ques3 {
    //Static Method Reference
    static void multiply(int a, int b){
        System.out.println("Multiplication of two Numbers --> "+(a*b));

    }

    //Instance Method Reference
    void addsubtract(int a,int b)
    {
        System.out.println("Addition of Two Numbers --> "+(a+b));
        System.out.println("Subtraction of Two Numbers --> "+(a-b));
    }

    public static void main(String[] args)
    {
        myinterface1 perform=new Ques3()::addsubtract;
        perform.Operation(10,6);

        myinterface1 mul=Ques3::multiply;
        mul.Operation(5,6);




//        //Instance Method Reference
//        myinterface1 add=(a,b)->{
//            System.out.println("Sum of two Number is "+(a+b));
//            System.out.println("Subtract of Two Number is "+(a-b));
//        };
//        add.add(7,6);
//
//        //Static Method Reference
//        myinterface1 mul=Ques3::multiply;
//        mul.add(3,6);
    }
}
