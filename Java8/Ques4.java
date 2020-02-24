import java.util.Arrays;
import java.util.List;

interface  emp
{
    Employee display(String name, int age,String city);
}

class Employee
{
    String name;
    int age;
    String city;

    Employee(String name, int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class Ques4 {
    public static void main(String[] args) {

        Employee employee;
        emp newemp=Employee::new;
        emp newemp2=Employee::new;
      employee= newemp.display("Prabhat",21,"Delhi");
      System.out.println(employee);


    }
}
