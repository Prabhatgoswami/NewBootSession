interface string{
    String concat(String str1,String str2);
}

public class Ques1_c {
    public static void main(String[] args) {
        string newstring=(String str1,String str2)->{
            return str1+str2;
        };

        System.out.println("Concatination of Two String : "+newstring.concat("hello ","Prabhat"));
    }

}
