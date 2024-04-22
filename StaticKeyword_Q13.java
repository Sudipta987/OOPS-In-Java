//Q13 : W.A.P to Specifies the Access level of Static and Non-static fields in Same class and Other class.
package Java.OOPS;
import java.util.Scanner;
public class StaticKeyword_Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //m1();
        StaticKeyword_Q13 s1=new StaticKeyword_Q13();
        s1.m2();
        //s1.m3();
        ExStaticKeyword.m4();
        ExStaticKeyword e1=new ExStaticKeyword();
        e1.m5();
        sc.close();
    }
    public static void m1() {
        System.out.println("Class StaticKeyword_Q13 & Static Method ---> m1 is called");
    }
    public void m2() {
        System.out.println("Class StaticKeyword_Q13 & Non-Static Method ---> m2 is called");
        m1();
        m3();
    }
    public void m3() {
        System.out.println("Class StaticKeyword_Q13 & Non-Static Method ---> m3 is called");
    }
}

class ExStaticKeyword {
    public static void m4() {
        System.out.println("Class ExStaticKeyword & Static Method ---> m4 is called");
    }
    public void m5() {
        System.out.println("Class ExStaticKeyword & Non-Static Method ---> m5 is called");
    }
}
