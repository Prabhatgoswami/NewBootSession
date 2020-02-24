interface upper
{
    String upper(String name);
}

public class Ques1_d {

    public static void main(String[] args) {
        upper newupper=(String name)->
        {
            return name.toUpperCase();
        };
        System.out.println("Upper Case of give String "+ newupper.upper("prabhat"));
    }

}
