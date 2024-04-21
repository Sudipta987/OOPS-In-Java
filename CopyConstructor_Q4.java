//Q4 : W.A.P to Implement of Copy Constructor.
package Java.OOPS;
import java.util.Scanner;
public class CopyConstructor_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student_X s1=new Student_X();
        s1.name="Sudipta kar";
        s1.roll=1;
        Student_X s2=new Student_X(s1);
        s1.showInfo();
        s2.showInfo();
        sc.close();
    }
}
class Student_X {
    String name;
    int roll;
    //Copy Constructor.
    Student_X(Student_X s2) {
        this.name=s2.name;
        this.roll=s2.roll;
    }
    void showInfo() {
        System.out.println("Sudent Name is : "+this.name+" & Roll is : "+this.roll);
    }
    Student_X() {

    }
}