import java.util.Objects;
class Product
{
String pname , pcode;
int price;
public String getPname()
{
return pname;
}
public Product()
{
}
public Product(String pname,String pcode, int price)
{
this.pname=pname;
this.pcode=pcode;
this.price=price;  
}
public void setPname(String pname)
{
this.pname=pname;
}
public String getPcode()
{
return pcode;
}
public void setPcode(String pcode)
{
this.pcode=pcode;
}
public int getPrice()
{
return price;
}
public void setPrice(int price)
{
this.price=price;
}
public void display()
{
System.out.println("Pcode : "+this.pcode);
System.out.println("Pname : "+this.pname);
System.out.println("Price : "+this.price);
}
}
public class Exp1
{
public static void main(String[] args)
{
Product p1=new Product();
p1.pcode="car 123";
p1.pname="Benz";
p1.price=10000;
System.out.println("***** Displaying P1 *****");
p1.display();
Product p2=new Product("Jaguar","car 426",25000);
System.out.println("***** Displaying P2 *****");
p2.display();
Product p3=new Product("Maruthi","Car 800",500000);
System.out.println("***** Displaying P3 *****");
p3.display();
Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
System.out.println("\n*****Displaying product with lowest price*****");
p.display();
}
}