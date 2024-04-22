//Q10 : W.A.P to Implement of Packages with different types of Access modifier.
package Java.OOPS;
import java.util.Scanner;
public class PackageAccessModifiers_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account a1=new Account();
        
        System.out.println("Enter Account Holder Name: ");
        a1.name=sc.nextLine();
        System.out.println("Enter A/C Number: ");
        a1.acNo=sc.nextInt();
        sc.nextLine(); //// Consume the leftover newline character
        System.out.println("Enter Account Holder Email Id: ");
        a1.email=sc.nextLine();
        System.out.println("Enter Your A/C Password: ");
        String pass=sc.nextLine();
        a1.setPassword(pass);
        a1.getPassword();


        sc.close();
    }
    
}
class Account {
    String name;
    public int acNo;
    protected String email;
    private String password;
    void setPassword(String password) {
        this.password=password;
    }
    void getPassword() {
        System.out.println("Password is : "+this.password);
    }
}
