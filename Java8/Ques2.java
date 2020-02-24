@FunctionalInterface
interface fun{
    int num(int a,int b);
}
public class Ques2 {
    public static void main(String[] args) {
        fun f=(a,b)->a+b;
        System.out.println("Sum of Two Number is :"+f.num(5,10));
    }
}
