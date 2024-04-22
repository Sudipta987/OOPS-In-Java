//Q8 : W.A.P to Implement of Multilevel Inheritance.
package Java.OOPS;
import java.util.Scanner;
public class MultiLevelInheritance_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            EquilateralTriangle e1=new EquilateralTriangle();
            e1.area();
            e1.area(3,4);
            e1.area(2);
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
class EquilateralTriangle extends Triangle {
    public void area(int side) {
        System.out.println("The Area of EquilateralTriangle is : "+(Math.sqrt(3)/4)*side*side);
    }
}