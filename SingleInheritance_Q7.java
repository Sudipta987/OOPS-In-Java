//Q7 : W.A.P to Implement of Single Inheritance.
package Java.OOPS;
import java.util.Scanner;
public class SingleInheritance_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Triangle t1=new Triangle();
        t1.area();
        t1.area(3,4);
        sc.close();
    }
}
class Shape {
    public void area() {
        System.out.println("Display the Area of the Shape");
    }
}
class Triangle extends Shape {
    public void area (int h,int b) {
        System.out.println("The Area of the Triangle is : "+(1.0/2.0)*h*b);
    }
}
