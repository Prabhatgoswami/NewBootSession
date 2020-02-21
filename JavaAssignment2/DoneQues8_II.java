package Java_Assignment2;
import java.util.Scanner;
public class DoneQues8_II {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        do
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = input.next();
        }while(!word.equals("done"));
    }
}
