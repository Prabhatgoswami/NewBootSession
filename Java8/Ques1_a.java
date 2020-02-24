interface Myinterface
{
    Boolean greater(int a,int b);
}
public class Ques1_a {
    public static void main(String[] args) {
            Myinterface myinterface=(int a, int b)->{
                if(a>b)
                    return true;
                else
                    return false;

            };
        System.out.println(myinterface.greater(6,7));
    }
}
