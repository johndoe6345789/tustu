package aP;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.text.JTextComponent;

class FocusAdapterExtension extends FocusAdapter {
  FocusAdapterExtension(au paramau) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    if (paramFocusEvent.getSource() instanceof JTextComponent) {
      JTextComponent jTextComponent = (JTextComponent)paramFocusEvent.getSource();
      jTextComponent.selectAll();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */