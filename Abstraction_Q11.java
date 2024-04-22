//Q11 : W.A.P to Implement of Abstraction in java.
package Java.OOPS;
import java.util.Scanner;
public class Abstraction_Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Horse h1=new Horse();
        h1.breath();
        h1.walk();
        sc.close();
    }
}
abstract class Animal {
    abstract void walk();
    void breath() {
        System.out.println("This animal breaths air");
    }
    Animal () {
        System.out.println("Wow, You are about to create an animal!");
    }
}
class Horse extends Animal {
        Horse() {
            System.out.println("Wow, You have created an Horse");
        }
        void walk() {
            System.out.println("Horse walks on 4 legs");
        }
}