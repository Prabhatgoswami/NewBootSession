public class PercentageQues4 {
     static void calculate(String str)
    {
        int totalcharacter=str.length();
        int uppercase=0,lowercase=0,digits=0,other=0;
        for(int i=0;i<totalcharacter;i++)
        {   char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uppercase++;
            }
            else if(Character.isLowerCase(ch))
            {
                lowercase++;
            }
            else if(Character.isDigit(ch))
            {
                digits++;
            }
            else
                other++;
        }

        System.out.println("Total Characters in the given string is : "+totalcharacter);
        System.out.println("Total Number of UpperCase in given String is : "+uppercase);
        System.out.println("Total Number of LowerCase in given String is : "+lowercase);
        System.out.println("Total Number of digits in given String is : "+digits);
        System.out.println("Total Number of other or special Character in given String is : "+other);
        System.out.println("PERCENTAGE OF DIFFERENT PARTS");
        System.out.println("Percentage of UpperCase in given String is : "+((uppercase*100)/totalcharacter)+"%");
        System.out.println("Total Number of LowerCase in given String is : "+((lowercase*100)/totalcharacter)+"%");
        System.out.println("Total Number of digits in given String is : "+((digits*100)/totalcharacter)+"%");
        System.out.println("Total Number of other or special Character in given String is : "+((other*100)/totalcharacter)+"%");
    }
    public static void main(String[] args)
    {
        String input="Hey Prabhat@22.1995";
        calculate(input);
    }
}
