import java.lang.String;
public class DuplicateWordQues2 {
    public static void main(String[] args)
    {
        String s1="big black bug bit a big black dog on his big black nose ";
        int count;
        System.out.println("Original String Passed");
            System.out.println(s1);
        s1=s1.toLowerCase();
        String newstring[]=s1.split(" ");
        System.out.println("Duplicate Words in a given Statement");
        for(int i=0;i<newstring.length;i++)
        {   count=1;
            for(int j=i+1;j<newstring.length;j++)
            {
                if(newstring[i].equals((newstring[j])))
                {
                    count ++;
                    newstring[j]="0";
                }
            }
            if(count>1&&newstring[i]!="0")
            {
                System.out.println("Count of "+"'"+newstring[i]+"'"+" is : "+ count);
            }
        }

    }
}
