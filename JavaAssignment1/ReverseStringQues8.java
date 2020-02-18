public class ReverseStringQues8
{   public static void main(String[] args)
    {   String string="HelloPrabhat";
        System.out.println("Original String is : "+string);
        StringBuilder reversestring=new StringBuilder();
        reversestring.append(string);
        System.out.println("Reversed String : "+reversestring.reverse());

        StringBuffer Removestring=new StringBuffer(reversestring);
        System.out.println("String After Removing data from index 4 to 9 : "+Removestring.delete(4,9));



    }


}
