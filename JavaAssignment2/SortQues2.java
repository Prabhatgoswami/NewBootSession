package Java_Assignment2;

public class SortQues2
{
    public static void main(String [] args)
    {
        String OriginalString="prabhat";
        System.out.println("Original String which is Entered is : "+OriginalString);
        char temp=0;
        char[] newstring=OriginalString.toCharArray();
        for(int i=0;i<newstring.length;i++)
        {
            for(int j=0;j<newstring.length;j++)
            {
                if(newstring[j]>newstring[i])
                {
                    temp=newstring[i];
                    newstring[i]=newstring[j];
                    newstring[j]=temp;
                }
            }
        }
        System.out.println("Sorting of given Strings ");
        for (int k=0;k<newstring.length;k++)
        {
            System.out.print(newstring[k]);
        }
    }
}
