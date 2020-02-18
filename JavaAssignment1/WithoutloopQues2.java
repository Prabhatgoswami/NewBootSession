public class WithoutloopQues2
{   public static void main(String [] args)
{
    String str = "Java is the programming language. It is Portable";
    //Below Command will replace the 'a' from string and count that and subtract it from the length of the string
    int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurences of 'a' in "+"'"+str+"'"+" is: "+count);
}
}
