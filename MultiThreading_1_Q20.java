//Q20 : W.A.P to Illustrates the use of  sleep() methods in Multi-Threading.
package Java.OOPS;
import java.util.Scanner;
public class MultiThreading_1_Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A threadA=new A();
        B threadB=new B();

        System.out.println("Starts Thread A: ");
        //way 1
        threadA.start();
        //way2
       // new A().run();  //new A().start(); also a way
        System.out.println("Starts Thread B: ");
        //way  1
        threadB.start();
        //way 2
        // new B().run();
       
        System.out.println("End of the main Thread");
        sc.close();
    }
}
class A extends Thread {
        public void run() {
            for(int i=1;i<=10;i++) {
                if(i==5) {
                    try{
                      sleep(10000);
                    }catch(Exception e) {
                      System.out.println(e);
                    }
                  }
              System.out.println("From Thread A : i= "+i);
            }
            System.out.println("Exit From A");
        }
}

class B extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
          System.out.println("From Thread B : i= "+i);
        }
        System.out.println("Exit From B");
    }
}
