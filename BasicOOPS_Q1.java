//Q1 : W.A.P to Implement Multiple Classes in java using OOPS Concept.
package Java.OOPS;
import java.util.Scanner;
public class BasicOOPS_Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pen p1=new Pen();
        p1.color="Red";
        p1.printColor();
        sc.close();
        Pen p2=new Pen();
        p2.color="Blue";
        p2.printColor();
    }
}
class Pen {
    String color;
    public void printColor() {
        System.out.println("The color of this pen is : "+this.color);
    }
}