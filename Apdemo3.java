import java.applet.*;
import java.awt.*;
public class Apdemo3 extends Applet
{
  public void paint(Graphics g)
  {  
    
   //g.drawLine(100,250,350,250);
   g.drawRect(100,300,250,350);
   g.drawLine(100,300,230,100);
   g.drawLine(350,300,230,100);
   g.drawRect(180,460,80,190);
   
   g.fillArc(200,220,60,60,0,360);
   g.drawLine(230,100,230,20);
  
   g.drawLine(230,20,280,70);
  g.drawLine(280,70,230,70);
}
}
/* <applet code="Apdemo3",width="500",height="400">
   </applet>*/
