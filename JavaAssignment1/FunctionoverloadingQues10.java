public class FunctionoverloadingQues10 {
    int add(int number1,int number2){
        return number1+number2;
    }
    double add(double number1,double number2){
        return number1+number2;
    }
    float multiple(float number1,float number2)
    {
        return number1*number2;
    }
    int multiple(int number1,int number2){
        return number1*number2;
    }
    String concat(String str1,String str2)
    {
        return str1+str2;
    }
    String concat(String str1,String str2,String str3)
    {
        return str1+str2+str3;
    }
    public static void main(String[] args){
        FunctionoverloadingQues10 object=new FunctionoverloadingQues10();
        System.out.println("Addition of two Integer Values is : "+ object.add(10,20));
        System.out.println("Addition of two Double Values is : "+ object.add(10.987,20.673));
        System.out.println("Multiplication of two Integer Values is : "+ object.multiple(10,20));
        System.out.println("Multiplication of two Float Values is : "+ object.multiple(9.34f,42.23f));
        System.out.println("Concatination of two String Values is : "+ object.concat("hey"," prabhat"));
        System.out.println("Concatination of two String Values is : "+ object.concat("hey"," prabhat"," byebye"));

    }
}
