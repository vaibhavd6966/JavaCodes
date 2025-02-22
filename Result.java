//package MultiLevel;
import java.util.Scanner;

 class Student {

    private int id;
    private String name;
    private long Number;
       public Student() {
    
       }
    public Student(int id, String name, long Number) {
        super();
        this.id = id;
        this.name = name;
        this.Number = Number;
    }
    Scanner sc = new Scanner(System.in);
    public Student setData(){
        System.out.println("Enter the id of the student");
        id = sc.nextInt();
        System.out.println("Enter the name of the student");
        name = sc.next();
        System.out.println("Enter the num of the student");
        Number= sc.nextLong();
        return new Student(id, name, Number);
    }

    public void getData() {
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student Number: " + Number);
    }

}
class Insem extends Student{
    
        int m1, m2, m3;
    public void setMarks(){
        System.out.println("Enter the m1");
        m1 = sc.nextInt();
        System.out.println("Enter the m2");
        m2 = sc.nextInt();
        System.out.println("Enter the m3");
        m3 = sc.nextInt();
    }
    public void getMarks(){
        System.out.println("Marks of the student");
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("m3: " + m3);
    }
}
class Endsem extends Insem{
   
    int m4, m5, m6;
    public void setPracticldMarks(){
        System.out.println("Enter the marks of the student");
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        m6 = sc.nextInt();
    }
}
public class Result{
    public static void main(String[] args) {
        Student student = new Student();
        student.setData();
        student.getData();
        Insem insem = new Insem();
        insem.setMarks();
        Endsem endsem = new Endsem();
        endsem.setPracticldMarks();

    }
}
