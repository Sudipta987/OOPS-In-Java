//Q15 : W.A.P to Implement of Multiple Inheritance in java.
package Java.OOPS;
import java.util.Scanner;
public class MultipleInheritance_Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog d1=new Dog();
        d1.breath();
        d1.walk();
        d1.fly();
        sc.close();
    }
}
interface Animal_X {
    void walk();
    void  breath();
}
interface Bird {
    void fly();
}
class Dog implements Animal_X,Bird {
    Dog () {
        System.out.println("Wow, you have create an Dog");
    }
   public void walk() {
        System.out.println("Dog walks on Four legs");
    }
    public void breath() {
        System.out.println("Dog breaths Air");
    }
    public void fly() {
        System.out.println("Dog's can't fly ");
    }
}