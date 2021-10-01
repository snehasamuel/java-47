import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="calc.java"width="300",height="400">
</applet>
*/
public class calc extends Applet implements ActionListener
 {
   Label l;
   Label l1;
   Label l2;
   Label l3;
   TextField t1;
   TextField t2;
   TextField re;
   Button b1;
   Button b2;
   Button b3;
   Button b4;
   String a,b;
   public void init()
    {
      l=new Label("SIMPLE CALCULATOR");
      l1=new Label("Enter first number");
      t1=new TextField();
      l2=new Label("Enter second number");
      t2=new TextField();
      re=new TextField();
      b1=new Button("+");
      b2=new Button("-");
      b3=new Button("*");
      b4=new Button("/");
      l3=new Label("Result : ");
      add(l);
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(l3);
      add(re);
      setLayout(null);
      l.setBounds(120,0,300,20);
      l1.setBounds(100,40,100,20);
      t1.setBounds(250,40,50,20);
      l2.setBounds(100,65,150,20);
      t2.setBounds(250,65,50,20);
      b1.setBounds(100,100,30,30);
      b2.setBounds(155,100,30,30);
      b3.setBounds(210,100,30,30);
      b4.setBounds(265,100,30,30);
      l3.setBounds(100,140,100,20);
      re.setBounds(250,140,50,20);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
    }
   public void actionPerformed(ActionEvent ae)
    {
      String s=ae.getActionCommand();
      if(s.equals("+"))
       {
         a=t1.getText();
         b=t2.getText();
         int n1=Integer.parseInt(a);
         int n2=Integer.parseInt(b);
         re.setText("  "+(n1+n2));
       }
      else if(s.equals("-"))
       {
         a=t1.getText();
         b=t2.getText();
         int n1=Integer.parseInt(a);
         int n2=Integer.parseInt(b);
         re.setText("  "+(n1-n2));
       }
      else if(s.equals("*"))
       {
         a=t1.getText();
         b=t2.getText();
         int n1=Integer.parseInt(a);
         int n2=Integer.parseInt(b);
         re.setText("  "+(n1*n2));
       }
      else if(s.equals("/"))
       {
         a=t1.getText();
         b=t2.getText();
         int n1=Integer.parseInt(a);
         int n2=Integer.parseInt(b);
         re.setText("  "+(n1/n2));
       }
    } 
 }
