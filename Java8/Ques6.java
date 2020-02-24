interface defaultinterface
{
    void show(String str1);
}
public class Ques6 {
    static void display(String str1)
    {
        System.out.println("Static Method to convert into UpperCase -->"+str1.toUpperCase());
    }

    public static void main(String[] args) {
        defaultinterface defaultinterface1=(String string)-> System.out.println("Default access to Convert String into Lowrercase -->"+string.toLowerCase());
        defaultinterface defaultinterface2=Ques6::display;
        defaultinterface1.show("PrabhaT");
        defaultinterface2.show("goswami");
    }
}
