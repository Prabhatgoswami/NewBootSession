package Java_Assignment2;

import java.util.Scanner;

public class DoneQues8_I {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Words : ");
       String word=input.next();
        while (!word.equals("done"))
        {
            if (word.charAt(0)==word.charAt(word.length()-1))
            {
                System.out.println("First and Last character are equals for word :"+word);
            }
            else
            {
                System.out.println("First and Last Character is not equal "+word);
            }
            word=input.next();

        }
    }
}
