public class RepeatedElement_Ques6 {
    public static void main(String[] args)
    {
            int array[]={1,2,1,3,2};
           // int count=0;
            for(int i=0;i<array.length;i++)
                System.out.print(array[i]+" ");
            int result=array[0];
            for(int i=1;i<array.length;i++){
                result=result^array[i];

            }
            System.out.println("\nValue Which is written only once in given Array : "+result);

    }
}
