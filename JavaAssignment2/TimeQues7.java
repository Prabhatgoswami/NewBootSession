package Java_Assignment2;

public class TimeQues7
{
    static void Convert(int n)
    {
        int day=(n/(24*3600));
        n=n%(24*3600);
        int hour=n/3600;

        n=n%3600;
        int minute=n/60;

        n=n%60;
        int seconds=n;

        System.out.println(day+" "+"Days "+hour+" "+"Hours "+minute+"Minutes "+seconds+" "+"Seconds");
    }
    public static void main(String[] args)
    {
        int n=123455;
        System.out.println("Time in Seconds is : "+n);
        Convert(n);
    }
}
