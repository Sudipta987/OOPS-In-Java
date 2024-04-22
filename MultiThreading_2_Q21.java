//Q21 : W.A.P to Illustrates the use of Priority in Multi-Threading.
package Java.OOPS;
import java.util.Scanner;
public class MultiThreading_2_Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        X threadX1=new X();
        X threadX2=new X();
        Y threadY3=new Y();
        Y threadY4=new Y();
        threadX1.setPriority(Thread.MIN_PRIORITY);
        threadX2.setPriority(threadX1.getPriority()+1);
        threadY3.setPriority(5);
        threadY4.setPriority(10);
        threadX1.start();
        threadX2.start();
        threadY3.start();
        threadY4.start();
        System.out.println("Current Thread: "+Thread.currentThread().getId());
        sc.close();
    }
}
class X extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("From Thread X: i= "+i);
        }
    }
}
class Y extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("From Thread Y: i= "+i);
        }
    }
}