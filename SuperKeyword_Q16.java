//Q16 : W.A.P to Implement of Super Keyword in various aspects in java.
package Java.OOPS;
import java.util.Scanner;
public class SuperKeyword_Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child c1=new Child(2,4);
        c1.display();

        sc.close();
    }
}
class Parent {
    int x;
    Parent (int x) {
        this.x=x;
    }
    void display() {
        System.out.println("Parent x: "+this.x);
    }
}
class Child extends Parent {
        int y;
        Child(int x,int y) {
            super(x);
            this.y=y;
        }
        void display() {
            System.out.println("Child y: "+this.y);
            super.display();
        }
}

