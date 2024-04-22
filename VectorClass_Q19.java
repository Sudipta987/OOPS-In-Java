//Q19 : W.A.P to Illustrates the use of Vector class  in java.
package Java.OOPS;
import java.util.Scanner;
import java.util.Vector;
public class VectorClass_Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector list=new Vector();                         // Declaration Syntax 1
        //  Vector<String> list = new Vector<String>();   // Declaration Syntax 2
        System.out.println("Enter Input size: ");
        int n=sc.nextInt();
        System.out.println("Enter Elements which you want to add into the list: ");
        for(int i=1;i<=n;i++) {
          list.addElement(sc.next()); //Method 1
        }
        list.insertElementAt("Sudipta kar",0); // Method 2
        list.removeElement("kar");   //Method 3
        list.removeElementAt(1);    //Method 4
        int size=list.size();       //Method 5
        String listArr[]=new String[size];
        list.copyInto(listArr);     //Method 6
        System.out.println("list's 1 Element is : "+list.elementAt(1));  //Method 7

        System.out.println("All Elements of the List's are : "+list);
        System.out.println("All Elements of the listArray are : ");
        for(int i=0;i<size;i++) {
          System.out.print(listArr[i]+"\t");
        }
      
        sc.close();
        
    }
}
