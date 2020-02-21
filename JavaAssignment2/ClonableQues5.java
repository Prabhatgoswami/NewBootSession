package Java_Assignment2;

import java.sql.SQLOutput;

class call implements Cloneable {
    String name;
    int id;
    call(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void display()
    {
        System.out.println("Name= "+name);
        System.out.println("Id = "+id);
    }


    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class copy{
    int age;
    String name;
    copy(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public copy(copy obj)
    {
        this.age=obj.age;
        this.name=obj.name;
    }
    public void display()
    {
        System.out.println("Age = "+this.age);
        System.out.println("Name = "+this.name);
    }
}

class ClonableQues5
{
    public static void main(String [] args) throws CloneNotSupportedException {
        call object=new call("Prabhat",4086);
        call object2=(call)object.Clone();
        System.out.println("Original Object Data");
        object.display();
        System.out.println("\n Clonable Object Data");
        object2.display();

        copy c1=new copy(24,"Prabhat");
        copy c2=new copy(c1);
        System.out.println("\n \n Orginal data for Copy Constructor");
        c1.display();
        System.out.println("\n Copy Constructor");
        c2.display();
    }

}
