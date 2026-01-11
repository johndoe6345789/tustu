package u;

import com.efiAnalytics.ui.bc;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

class JPanelExtensionGetmaximumsize extends JPanel implements bc {
  e(d paramd) {}
  
  public void close() {
    for (Component component : getComponents()) {
      if (component instanceof bc)
        ((bc)component).close(); 
    } 
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension1 = super.getPreferredSize();
    Dimension dimension2 = Toolkit.getDefaultToolkit().getScreenSize();
    if (dimension1.width > dimension2.width * 17 / 20)
      dimension1.width = dimension2.width * 17 / 20; 
    return dimension1;
  }
  
  public Dimension getMaximumSize() {
    return super.getMaximumSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */