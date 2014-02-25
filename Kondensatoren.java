import java.awt.*;
import java.awt.event.*;

public class Kondensatoren extends Frame
{
  
  //----------------------------------------------------------------------------
  // Schriftarten definieren
  //----------------------------------------------------------------------------
  Font Ueberschrift = new Font("Arial", Font.BOLD, 16);
  Font Normal = new Font("Arial", Font.PLAIN, 12);
  //----------------------------------------------------------------------------
  
  public Kondensatoren()
  {
    TextField Spannung = new TextField();
    Spannung.setBounds(400,300,100,400);
    Spannung.setBackground(Color.yellow);
    add(Spannung);
    
    System.out.println("HS");
  }    
  
  public void Text(Graphics g)
  {
    g.setColor(Color.black);
    
    g.setFont(Ueberschrift);
    
    g.drawString("Kondensatoren",230,120);
    
    g.setFont(Normal);
    
    
    
    
    
  }
}
