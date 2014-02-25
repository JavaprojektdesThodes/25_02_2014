import java.awt.*;
import java.awt.event.*;

public class Hauptfenster extends Frame
{
  //----------------------------------------------------------------------------
  // Variablen deklarieren
  //----------------------------------------------------------------------------
  int i=1;        // Variable zur Buttonfunktion 
                  // Standard ist i=1 - somit wird die Startseite als Standard
                  // festgelegt     
  //----------------------------------------------------------------------------
  
  
  //--------------------------------------------------------------------------
  // Farben definieren
  //--------------------------------------------------------------------------
  Color dunkelgruen = new Color(0x22,0xDD,0x88);
  //--------------------------------------------------------------------------
  
  public static void main(String[ ] args)
  {
    
    Hauptfenster Fenster = new Hauptfenster();
  }
  
  public Hauptfenster()
  {
    
    setTitle("Elektro-Rechner");
    pack();
    setBackground(dunkelgruen);
    setForeground(Color.black);
    setSize(600,600);
    // Einstellen, dass das Fenster nicht kleiner als 600x600 Pixel sein kann
    setMinimumSize(new Dimension (600,600)); 
    setVisible(true);
    
    
    
    setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
    
    
    
    //--------------------------------------------------------------------------
    // Buttons erstellen
    //--------------------------------------------------------------------------    
    Button  b1 = new Button("Hauptmenü");
    add(b1);
    
    Button  b2 = new Button("Berechnen");
    add(b2);  
    
    Button  b3 = new Button("Zurücksetzen");
    add(b3);
    
    Button b4 = new Button("Beenden");
    add(b4);
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    // Button Farbe definieren
    //--------------------------------------------------------------------------
    b1.setBackground(dunkelgruen);
    b2.setBackground(dunkelgruen);
    b3.setBackground(dunkelgruen);
    b4.setBackground(dunkelgruen);
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    // Größeneinstellungen der Buttons
    //--------------------------------------------------------------------------
    b1.setPreferredSize(new Dimension(146,50));
    b2.setPreferredSize(new Dimension(146,50));
    b3.setPreferredSize(new Dimension(146,50));
    b4.setPreferredSize(new Dimension(146,50));
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    // Aktionen für Buttons und zum Schließen des Fensters
    //--------------------------------------------------------------------------
    addWindowListener(new WindowLauscher());
    b1.addActionListener(new ActionLauscher());
    b2.addActionListener(new ActionLauscher());
    b3.addActionListener(new ActionLauscher());
    b4.addActionListener(new ActionLauscher());
    //--------------------------------------------------------------------------
  }
  
  public void paint(Graphics g)
  {
    g.setColor(Color.black);
    g.fillRoundRect(49,99,502,482,30,30);
    g.setColor(Color.white);
    g.fillRoundRect(50,100,500,480,30,30);
        
   
    switch(i)
    {
      case 1 : // Inhalt der Datei Startseite.java abrufen
               Startseite start = new Startseite();
               start.Text(g);
        
               //g.drawString("c 2014 by M. Kolzau, S. Oetken, B. Laurinat",170, 540);
        
               break;

      
      case 2 : // Inhalt der Datei Kondensatoren.java abrufen
               Kondensatoren kond = new Kondensatoren();
               kond.Text(g);       
      
        
               break;

      
      case 3 : Zuruecksetzen zurueck = new Zuruecksetzen();     
               break;
      
      case 4 : System.exit(0);
               break;   
    }
        
  }
  class WindowLauscher extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
  
  class ActionLauscher implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String Label;
      Label=e.getActionCommand();
      if(Label.equals("Hauptmenü"))
      i=1;
      if(Label.equals("Berechnen"))
      i=2;
      if(Label.equals("Zurücksetzen"))
      i=3;
      if(Label.equals("Beenden")) 
      i=4;
      //System.exit(0);
      repaint();
    }
  }
}







