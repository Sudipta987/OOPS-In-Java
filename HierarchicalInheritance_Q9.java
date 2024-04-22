//Q9 : W.A.P to Implement of Hierarchical Inheritance.
package Java.OOPS;
import java.util.Scanner;
public class HierarchicalInheritance_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Triangle t1=new  Triangle();
        t1.area(3,4);
        Circle c1=new Circle();
        c1.area(3);
        sc.close();
    }
}
class Shape {
    public void area() {
        System.out.println("Display the Area of the Shape");
    }
}
class Triangle extends Shape {
    public void area(int h,int b) {
        System.out.println("The Triangle's Area is : "+(1.0/2.0)*h*b);
    }
}
class Circle extends Shape {
    public void area (int r) {
        System.out.println("The Area of the Circle is : "+(Math.PI*r*r));
    }
}