//Q12 : W.A.P to Implement of Interface in java.
package Java.OOPS;
import java.util.Scanner;
public class Interface_Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Horse1 h1=new Horse1();
        h1.walk();
        sc.close();
    }
}
interface Animal1 {
    void walk();
}
class Horse1 implements Animal1 {
    Horse1() {
        System.out.println("Wow, Yor have create an Horse");
    }
    public void walk() {
        System.out.println("Horse walks on Four legs");
    }
}
