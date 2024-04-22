//Q17 : W.A.P to Illustrates the use of VARARGS to print the String value passed as an argument to a method.
package Java.OOPS;
import java.util.Scanner;
public class VARARGSMethod_Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VARARGSMethod_Q17 v1=new VARARGSMethod_Q17("Raja","Hunter","Sudipta");
        sc.close();
    }
    VARARGSMethod_Q17(String...person) {
        for(String  name:person) {
            System.out.println("Hello: "+name);
        }
    }
}
