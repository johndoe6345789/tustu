package q;

import bt.bK;
import java.awt.Color;
import java.awt.Component;
import javax.swing.UIManager;

public class e implements i {
  public void a(Component paramComponent) {
    bK bK = (bK)paramComponent;
    bK.setColumns(20);
    bK.setText("");
    bK.setEnabled(true);
    bK.setEditable(true);
    bK.setBackground(Color.white);
  }
  
  public void b(Component paramComponent) {
    bK bK = (bK)paramComponent;
    bK.setColumns(20);
    bK.setText("");
    bK.setEnabled(true);
    bK.setEditable(true);
    Color color1 = UIManager.getColor("TextField.background");
    if (color1 != null) {
      bK.setBackground(color1);
    } else {
      bK.setBackground(Color.white);
    } 
    Color color2 = UIManager.getColor("TextField.foreground");
    if (color2 != null) {
      bK.setForeground(color2);
    } else {
      bK.setForeground(Color.BLACK);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */