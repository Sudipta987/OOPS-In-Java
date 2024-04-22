//Q26 : W.A.P to Implements Nested Try Statement in Exception Handling .
package Java.OOPS;
import java.util.Scanner;
public class NestedTryStatement_3_Q26 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            try {
                int a=2,b=4,c=2,x=7,z;
                int p[]={2};
                p[3]=33;
                try{
                    z=x/(b*b)-(4*a*c);
                    System.out.println("The vlaue of Z is : "+z);
                }catch(ArithmeticException e) {
                    System.out.println("Division by Zero");
                }
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array  Index is out of Bound");
            }
            sc.close();
        }
    
}
