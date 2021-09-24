class JavaExample
 {
   void calculateArea(float x)
   {
     System.out.println("Area of the square: "+x*x+" sq.units");
   }
   void calculateArea(float x, float y)
    {
     System.out.println("Area of the rectangle: "+x*y+" sq.units");  
    }
   void calculateArea(double r)
    {
     double area=3.4*r*r;
     System.out.println("Area of the circle: "+area+" sq.units");  
    }
   void calculateArea(double l,double b,double h)
    {
     double tarea=1.5*l*b*h;
     System.out.println("Area of the rectangle: "+tarea+" sq.units");  
    }
  public static void main(String[] args)
   {
    JavaExample obj=new JavaExample();
    obj.calculateArea(6.1f);
    obj.calculateArea(10,12);
    obj.calculateArea(5.1);
    obj.calculateArea(2,5,8);
   }
 }