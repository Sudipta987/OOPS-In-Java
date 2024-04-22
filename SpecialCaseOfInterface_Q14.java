//Q14 : W.A.P to Implement of Special Case in Interface (Where Super class Ref. var. Reffer sub-class Objects).
package Java.OOPS;
import java.util.Scanner;
public class SpecialCaseOfInterface_Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle r1=new Rectangle();
        Circle1 c1=new Circle1();
        Area area;
        area=r1;
        System.out.println("Area of the Rectangle is : "+area.compute(2.0f,3.0f));
        area=c1;
        System.out.println("Area of the Circle is : "+area.compute(4.0f,0.0f));
        sc.close();
    }
}
interface Area {
    final static float pi=3.14f;
    float compute(float x,float y);
}
class Rectangle implements Area{
    public float compute (float x,float y) {
        return (x*y);
    }
}
class Circle1 implements Area {
    public float compute (float x,float y) {
        return (pi*x*x);
    }
}