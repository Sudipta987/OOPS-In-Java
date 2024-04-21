//Q5 : W.A.P to Implement of Method Overloading.
package Java.OOPS;
import java.util.Scanner;
public class MethodOverloading_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b&c: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Sum of "+a+" & "+b+" is : "+sum(a,b));
        System.out.println("Sum of "+a+","+b+" & "+c+" is : "+sum(a,b,c));
        sc.close();
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
}
