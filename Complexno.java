public class Complexno
{
 double real,img;
 Complexno(double r, double i)
  {
   this.real=r;
   this.img=i;
  }
 public static Complexno sum(Complexno c1,Complexno c2)
  {
   Complexno temp=new Complexno(0,0);
   temp.real=c1.real+c2.real;
   temp.img=c1.img+c2.img;
   return temp;
  }
 public static void main(String [] args)
  {
   Complexno c1=new Complexno(5.5,4);
   Complexno c2=new Complexno(1.2,3.5);
   Complexno temp=sum(c1,c2);
   System.out.println("Sum is :"+temp.real+" + "+temp.img+"i");
  }
}
