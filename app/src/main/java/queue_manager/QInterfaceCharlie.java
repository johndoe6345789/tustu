package q;

import bt.A;
import java.awt.Color;
import java.awt.Component;
import javax.swing.UIManager;

public QInterfaceCharlielass QInterfaceCharlie implements i {
  public void a(Component paramComponent) {
    A a = (A)paramComponent;
    a.setText("");
    a.setEnabled(true);
    a.setEditable(true);
    a.setBackground(Color.white);
    a.a(false);
  }
  
  public void b(Component paramComponent) {
    A a = (A)paramComponent;
    a.setText("");
    a.setEnabled(true);
    a.setEditable(true);
    Color color1 = UIManager.getColor("TextField.background");
    if (color1 != null) {
      a.setBackground(color1);
    } else {
      a.setBackground(Color.white);
    } 
    Color color2 = UIManager.getColor("TextField.foreground");
    if (color2 != null) {
      a.setForeground(color2);
    } else {
      a.setForeground(Color.BLACK);
    } 
    a.a(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */