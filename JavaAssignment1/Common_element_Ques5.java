public class Common_element_Ques5 {
    public static void main(String[] args)
    {
        int[] array1={1,2,3,4,8,6};
        int[] array2={2,3,8};
        System.out.println("First Array is :");
        for(int i=0;i<array1.length;i++)
            System.out.print(array1[i]+" ");
        System.out.println("\nSecond Array is :");
        for(int i=0;i<array2.length;i++)
            System.out.print(array2[i]+" ");
        System.out.println("\nCommon Element in these arrays are :");
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j])
                {
                    System.out.print(array1[i]+" ");
                }
            }
        }
    }
}
