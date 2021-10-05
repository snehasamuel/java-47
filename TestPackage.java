
import java.util.*;
import shape.Square;
import shape.Circle;
import shape.Triangle;
 class TestPackage
 {
   public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the side of the square : ");
      int s=sc.nextInt();
      Square sq=new Square(s);
      System.out.println("Area of the Square is "+sq.area());
    
      System.out.println("Enter the radius of the circle : ");
      int r=sc.nextInt();
      Circle ci=new Circle(r);
      System.out.println("Area of the Circle is "+ci.area());
 
      System.out.println("Enter the side1 of the triangle : ");
      int s1=sc.nextInt();
      System.out.println("Enter the side2 of the triangle : ");
      int s2=sc.nextInt();
      System.out.println("Enter the side3 of the triangle : ");
      int s3=sc.nextInt();
      Triangle t=new Triangle(s1,s2,s3);
      System.out.println("Area of the Triangle is "+t.area());
    }
 }
