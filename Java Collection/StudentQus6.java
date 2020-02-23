import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentQus6 {
    public static void main(String[] args) {

        List<Student> Studentlist=new LinkedList<Student>();
        Studentlist.add(new Student("Prabbhat",100d,23d));
        Studentlist.add(new Student("Jerry",88.08d,24d));
        Studentlist.add(new Student("Zen",88.76d,24d));
        Studentlist.add(new Student("Tom",33.23d,21d));
        Studentlist.add(new Student("Akshita",98.09d,22d));
        Studentlist.add(new Student("Udit",77.45d,21d));
        Studentlist.add(new Student("Shreya",80.76d,23d));

        System.out.println("DATA BEFORE SORTING ");
        for(Student data:Studentlist)
        {
            System.out.println(data);
        }

        System.out.println("\n \n \n ");
        System.out.println("DATA AFTER SORTING ");
        Collections.sort(Studentlist,new CompareScore());



        for(Student data:Studentlist)
        {
            System.out.println(data);
        }

    }
}

class CompareScore implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getScore()>s2.getScore())
            return 1;
        else if(s1.getScore()<s2.getScore())
            return -1;
        else
            return s1.getStudentname().compareTo(s2.getStudentname());
    }
}

class Student
{
    String studentname;
    Double Score;
    Double Age;

    Student(String studentname, Double Score, Double Age)
    {
        this.studentname=studentname;
        this.Score=Score;
        this.Age=Age;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student Details --- " +
                "Student Name = " + studentname + " : " +
                "Score = " + Score +
                " : "+" Age = " + Age ;
    }
}
