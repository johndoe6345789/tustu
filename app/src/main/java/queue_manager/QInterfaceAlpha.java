package q;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class QInterfaceAlpha implements i {
  public void a(Component paramComponent) {
    JLabel jLabel = (JLabel)paramComponent;
    jLabel.setText("");
    jLabel.setHorizontalAlignment(2);
    jLabel.setEnabled(true);
    Color color = UIManager.getColor("Label.foreground");
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
  }
  
  public void b(Component paramComponent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */