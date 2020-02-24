interface tolowerinterface{
    default String tolower(String string){

        return string ;
    }
}


interface toupperinterface{
    default String toupper(String string)
    {
        return string.toUpperCase();
    }
}

public class Ques8 implements tolowerinterface,toupperinterface {
    @Override
    public String tolower(String string) {
        return string.toLowerCase();
    }

    @Override
    public String toupper(String string) {
        return string.toUpperCase();
    }

    public static void main(String[] args) {
        Ques8 Multiple=new Ques8();
        System.out.println("<<-- Working of Multiple Inheritance -->>");
        System.out.println("Converting to LowerCase -> "+Multiple.tolower("HELLO"));
        System.out.println( "Converting to UpperCase -> "+Multiple.toupper("prabhat"));
    }


}
