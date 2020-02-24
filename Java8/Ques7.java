interface concatInterface
{
    default String concat(String string1, String string2) {
        return null;
    }
}

public class Ques7 implements concatInterface {
@Override

    public String concat(String string1, String string2)
    {
        return string1+string2;
    }

    public static void main(String[] args) {
        Ques7 concate=new Ques7();
        String newstring=concate.concat("Prabhat ","Goswami");
        System.out.println("Concatination of String Using Default Method of the Interface -->"+newstring);
    }


}
