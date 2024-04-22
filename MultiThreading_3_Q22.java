//Q22 : W.A.P to Implement Multi-Threading using Runnable Interface.
package Java.OOPS;
import java.util.Scanner;
public class MultiThreading_3_Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        X1 bullet1=new X1();
        Y1 bullet2=new Y1();
        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        System.out.println("Strats Thread X: ");
        gun1.start();
        System.out.println("Strats Thread Y: ");
        gun2.start();
        sc.close();
    }
}
class X1 implements Runnable {
    public void run() {
        for(int i=1;i<=5;i++)  {
            System.out.println("From Thread X1: i= "+i);
        }
    }
}
class Y1 implements Runnable {
    public void run() {
        for(int j=6;j<=10;j++)  {
            System.out.println("From Thread Y1: i= "+j);
        }
    }
}