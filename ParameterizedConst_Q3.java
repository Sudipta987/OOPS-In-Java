//Q3 : W.A.P to Implement of Parameterized Constructor.
package Java.OOPS;
import java.util.Scanner;
public class ParameterizedConst_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student1 s1=new Student1("Sudipta kar",1);
        s1.showInfo();
        Student1 s2=new Student1("Raja kar",2);
        s2.showInfo();
        sc.close();
    }
}
class Student1 {        // Student1 (Because Java.OOPS-> Package has already a Student class)
    String name;
    int  roll;
   
    Student1(String name,int roll) {
        this.name=name;
        this.roll=roll;
    }
    void showInfo() {
        System.out.println("Student Name is : "+this.name+" Roll is : "+this.roll);
    }
}
