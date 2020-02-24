interface MyInterface
{
    int increment(int a);
}
public class Ques1_b {

    public static void main(String[] args) {
        MyInterface myinterface=(int a)->
        {

            return ++a;
        };
        System.out.println("Incremented Vale : "+myinterface.increment(7));
    }
}
