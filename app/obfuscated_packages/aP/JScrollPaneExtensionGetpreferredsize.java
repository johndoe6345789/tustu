package aP;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;

class JScrollPaneExtensionGetpreferredsize extends JScrollPane {
  public JScrollPaneExtensionGetpreferredsize(ig paramig, Component paramComponent) {
    super(paramComponent);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(100, 100);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */