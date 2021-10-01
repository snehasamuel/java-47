

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Maximum.java"width=300 height=400>
</applet>
*/
public class Maximum extends Applet implements ActionListener
 {
  Label l1;
  Label l2;
  Label l3;
  TextField t1;
  TextField t2;
  TextField t3;
  TextField t4;
  Button b1;
  String a,b;
  public void init()
  {
     l1=new Label("Enter 1st no:");
    t1=new TextField();
    l2=new Label("Enter 2nd no:");
    t2=new TextField();
    l3=new Label("Enter 3nd no:");
    t3=new TextField();
    t4=new TextField();
    b1=new Button("max");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(t4);
    add(b1);
    setLayout(null);
    l1.setBounds(20,40,80,20);
    t1.setBounds(100,40,40,20);
    l2.setBounds(20,80,80,30);
    t2.setBounds(100,80,40,40);
    l3.setBounds(20,120,80,20);
    t3.setBounds(100,120,40,20);
    t4.setBounds(100,150,40,20);
    b1.setBounds(20,150,40,20);
    b1.addActionListener(this);
  }
 public void actionPerformed(ActionEvent e)
  {
    int i,j,k;
    i=Integer.parseInt(t1.getText());
    j=Integer.parseInt(t2.getText());
    k=Integer.parseInt(t3.getText());
    if(i<j)
    {
      if(j<k)
       t4.setText(" "+k);
      else
       t4.setText(" "+j);
    }
    else
     t4.setText(" "+i);
   }
 }
