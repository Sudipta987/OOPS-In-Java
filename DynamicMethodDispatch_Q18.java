//Q18 : W.A.P to Illustrates Dynamic Method Dispatch in java.
package Java.OOPS;
import java.util.Scanner;
public class DynamicMethodDispatch_Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Super s1;
        s1=new Sub();
        s1.m1();
        s1.m2();
       // s1.m3();     // Not a valid statement 
      /*  Sub n1;
       n1=new Super();  // Incompatible type : Super can't be converted to Sub .
       n1.m1();  */
        sc.close();
    }
}
class Super {
    public void m1() {
        System.out.println("Class Super ---> Method m1() is called!");
    }
    public void m2() {
        System.out.println("Class Super ---> Method m2() is called!");
    }
}
class Sub extends Super {
    public void m1() {
        System.out.println("Class Sub ---> Method m1() is called!");
    }
    public void m3() {
        System.out.println("Class Sub ---> Method m3() is called!");
    }
}