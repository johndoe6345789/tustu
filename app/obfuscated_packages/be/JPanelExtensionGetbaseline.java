package be;

import java.awt.Component;
import javax.swing.JPanel;

class JPanelExtensionGetbaseline extends JPanel {
  W(T paramT) {}
  
  public Component.BaselineResizeBehavior getBaselineResizeBehavior() {
    return Component.BaselineResizeBehavior.CONSTANT_ASCENT;
  }
  
  public int getBaseline(int paramInt1, int paramInt2) {
    return 0;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */