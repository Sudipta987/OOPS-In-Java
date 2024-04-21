//Q2 : W.A.P to Implement of Non-Parameterized Constructor.
package Java.OOPS;
import java.util.Scanner;
public class NonParameterizedConst_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Student s1=new Student();
        s1.name="Sudipta kar";
        s1.roll=1;
        s1.age=20;
        s1.printInfo();
        sc.close();
    }
}
class Student {
    String name;
    int roll;
    int age;
    // Non-Parameterized Constructor
    Student() {
        System.out.println("Student constructor is called!");
    }
    void printInfo() {
        System.out.println("Student Name is : "+this.name+" Roll: "+this.roll+" Age: "+this.age);
    }
}