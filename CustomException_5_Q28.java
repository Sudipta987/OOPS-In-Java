//Q28 : W.A.P to Implements 'throw'&'throws' keyword in Exception Handling by  extending Exception class.
package Java.OOPS;
import java.util.Scanner;
public class CustomException_5_Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b&r: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        try{
            try{
                System.out.println("Area of the  Circle is : "+area(r));
            }catch(Exception e) {
               // System.out.println(e.toString());
               System.out.println(e.getMessage());
            }
            System.out.println("The result of division a/b is : "+divide(a,b));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
       
        sc.close();
    }
    public static double area(int r) throws NegativeRadiusException {       //throws keyword
        if(r<0) {
            throw new NegativeRadiusException();       //throw keyword
        }
            double result=Math.PI*r*r;
            return result;
    }
    public static int divide(int a,int b) throws ArithmeticException {      //throws keyword
                int result=a/b; 
                return result;
    }
}
class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius can't be Negative!";
    }
    public String getMessage() {
        return "Msg- Radius can't be Negative";
    }
}
