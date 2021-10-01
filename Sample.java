import java.io.*;
import java.applet.*;
import java.awt.*;
/*
 <applet code="Sample.java"width="300",height="400">
</applet>
*/
public class Sample extends Applet
 {
   public void paint(Graphics g)
    {
      g.drawOval(40,10,100,200);
      g.drawLine(55,75,80,75);
      g.drawRect(65,150,75,120);
    }
  }