import org.calc.*;
import java.util.*;
public class Calculator
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int a=sc.nextInt();
    System.out.println("Enter the second number : ");
    int b=sc.nextInt();
    Add add=new Add(a,b);
    System.out.println("Addition = "+add.add());
    Sub s=new Sub(a,b);
    System.out.println("Substraction = "+s.sub());
    Multiply m=new Multiply(a,b);
    System.out.println("Multiply = "+m.mul());
    Divide d=new Divide(a,b);
    System.out.println("Division = "+d.div());
   }
 }
