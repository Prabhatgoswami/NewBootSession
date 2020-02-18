public class StaticblockQues7 {
    static String Firstname;
    static String Lastname;
    static int age;
    static void setdetails(String str1,String str2,int a){
        Firstname=str1;
        Lastname=str2;
        age=a;
        System.out.println("First Name is : "+Firstname);
        System.out.println("Last Name is : "+Lastname);
        System.out.println("Age is : "+age);
    }
    static {
        String F ="Static Prabhat";
        String L ="Static Goswami";
        int age=20;
        System.out.println(F);
    }

}
