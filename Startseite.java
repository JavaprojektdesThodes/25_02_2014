import java.awt.*;
import java.awt.event.*;

public class Startseite extends Frame
{
  
  //----------------------------------------------------------------------------
  // Schriftarten definieren
  //----------------------------------------------------------------------------
  Font Ueberschrift = new Font("Arial", Font.BOLD, 16);
  Font Normal = new Font("Arial", Font.PLAIN, 12);
  //---------------------------------------------------------------------------- 
    
    public void Text(Graphics g)
    {
      g.setColor(Color.black);
      
      g.setFont(Ueberschrift);
      
      g.drawString("Elektro-Rechner",230,120);
      
      g.setFont(Normal);
      
      g.drawString("Dies ist ein schwules Homo-Javaprojekt des Thodes",60,150);
      
      
      
      
      Button m1 = new Button();
    
      m1.setBounds(150,100,200,150);
      add(m1);  
      
      
    }
  }
