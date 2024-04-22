//Q25 : W.A.P to catching Invalid Argument From command line Argument in Exception Handling .
package Java.OOPS;
import java.util.Scanner;
public class Exception_2_Q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int invalid=0;      //Number of Invalid Arguments
        int no,count=0;
        for(int i=0;i<args.length;i++) {
            try{
                no=Integer.parseInt(args[i]);
            }catch(NumberFormatException e) {
                invalid++;
                System.out.println("Invalid number: "+args[i]);
                continue;
            }
            count++;
        }
        System.out.println("Valid Numbers: "+count);
        System.out.println("Invalid Numbers: "+invalid);
        sc.close();
    }
}
