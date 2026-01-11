package q;

import bt.JTextFieldExtension;
import java.awt.Color;
import java.awt.Component;
import javax.swing.UIManager;

public class QInterfaceEcho implements i {
  public void a(Component paramComponent) {
    JTextFieldExtension JTextFieldExtension = (JTextFieldExtension)paramComponent;
    JTextFieldExtension.setColumns(20);
    JTextFieldExtension.setText("");
    JTextFieldExtension.setEnabled(true);
    JTextFieldExtension.setEditable(true);
    JTextFieldExtension.setBackground(Color.white);
  }
  
  public void b(Component paramComponent) {
    JTextFieldExtension JTextFieldExtension = (JTextFieldExtension)paramComponent;
    JTextFieldExtension.setColumns(20);
    JTextFieldExtension.setText("");
    JTextFieldExtension.setEnabled(true);
    JTextFieldExtension.setEditable(true);
    Color color1 = UIManager.getColor("TextField.background");
    if (color1 != null) {
      JTextFieldExtension.setBackground(color1);
    } else {
      JTextFieldExtension.setBackground(Color.white);
    } 
    Color color2 = UIManager.getColor("TextField.foreground");
    if (color2 != null) {
      JTextFieldExtension.setForeground(color2);
    } else {
      JTextFieldExtension.setForeground(Color.BLACK);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */