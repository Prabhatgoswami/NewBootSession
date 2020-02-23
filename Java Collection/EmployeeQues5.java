import com.sun.org.apache.bcel.internal.generic.LLOAD;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public class EmployeeQues5 {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<Employee>();

        employeeList.add(new Employee("Prabhat",10000d,24d));
        employeeList.add(new Employee("Mohit",10050d,23d));
        employeeList.add(new Employee("Akshita",20992d,24d));
        employeeList.add(new Employee("Drishti",14300d,24d));
        employeeList.add(new Employee("Nisha",10232d,22d));

        System.out.println("EMPLOYEE DETAILS BEFORE SORTING ");
        for(Employee Emp:employeeList)
        {
            System.out.println(Emp);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary()>e1.getSalary())
                    return 1;
                else if(e1.getSalary()<e2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });

        System.out.println("EMPLOYEE DETAIL AFTER SORTING ON THE BASIS OF SALARY");
        for(Employee Emp:employeeList)
        {
            System.out.println(Emp);
        }
    }
}
class Employee{
    String Name;
    Double Salary;
    Double Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return
                "Name = " + Name + "  :  " +
                "Salary = " + Salary +
                "  :  "+ "Age = " + Age ;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

    Employee(String Name, Double Salary, Double age)
    {
        this.Name= Name;

        this.Salary=Salary;
        this.Age=age;
    }
}
