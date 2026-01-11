package com.efiAnalytics.tuningwidgets.portEditor;

import com.efiAnalytics.ui.bc;
import java.awt.Component;
import javax.swing.JPanel;

class ClosablePortPanel extends JPanel implements bc {
  ClosablePortPanel(OutputPortEditor paramOutputPortEditor) {}
  
  public void close() {
    for (byte b = 0; b < getComponentCount(); b++) {
      Component component = getComponent(b);
      if (component instanceof bc)
        ((bc)component).close(); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */