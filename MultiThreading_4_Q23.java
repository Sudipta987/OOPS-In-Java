//Q23 : W.A.P to Set Name of a Thread and use of the join() Method in Multi-Threading .
package Java.OOPS;
import java.util.Scanner;
public class MultiThreading_4_Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Example_Z t1=new Example_Z("Sudipta");
        Example_Z t2=new Example_Z("Raja");
        Example_Z t3=new Example_Z("Hunter");
        t1.start();
        try{
            t1.join();                   //join() method 
        }catch(Exception e) {          
            System.out.println(e);
        }
        t2.start();
        t3.start();
        System.out.println("Current Thread Name: "+Thread.currentThread().getName()+" Id: "+Thread.currentThread().getId());
        System.out.println("The name of t1: "+t1.getName()+" & id: "+t1.getId());
        System.out.println("The name of t2: "+t2.getName()+" & id: "+t2.getId());
        System.out.println("The name of t3: "+t3.getName()+" & id: "+t3.getId());
        sc.close();
    }
}
class Example_Z extends Thread {
    Example_Z(String name) {
        super(name);
    }
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("From Thread "+Thread.currentThread().getName()+" i= "+i);
        }
    }
}