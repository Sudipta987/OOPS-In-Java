//Q27 : W.A.P to Implements 'throw'&'finally'-keyword &toString(),printStackTrace()&getMessage() in Exception Handling by  extending RuntimeException .
package Java.OOPS;
import java.util.Scanner;
public class CustomException_4_Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age=sc.nextInt();
        try{
            if(age<18) {
                throw new YoungerAgeException("You are not eligible for Voting");       //throw keyword
            }else{
                System.out.println("You can vote successfully");
            }
        }catch(YoungerAgeException e) {
          //  System.out.println(e.toString());     //Method toString();
       //   System.out.println(e.getMessage());     //Method getMessage();
       e.printStackTrace();                         //Method printStackTrace(); 
        }finally{
            System.out.println("I am always executable");       //finally keyword
        }
        sc.close();
    }
}
class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}
