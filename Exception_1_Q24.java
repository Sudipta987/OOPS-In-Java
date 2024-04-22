//Q24 : W.A.P to use Multiple Catch Blocks in Exception Handling .
package Java.OOPS;
import java.util.Scanner;
public class Exception_1_Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={5,10};
        int b=5;
        try{
            int x=a[2]/(b-a[0]);
        }catch(ArithmeticException e) {
            System.out.println("Division by Zero");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index  error");
        }catch(ArrayStoreException e) {
            System.out.println("Wrong data type");
        }
        int y=a[1]/a[0];
        System.out.println("The value of Y is : "+y);
        sc.close();
    }
}
