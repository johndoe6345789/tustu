package bk;

import aI.ExceptionExtensionInAiPackage;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class BkInterfacePapa implements ActionListener {
  p(o paramo) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JToggleButton jToggleButton = (JToggleButton)paramActionEvent.getSource();
    try {
      if (jToggleButton.isSelected()) {
        o.a(this.a);
      } else {
        o.b(this.a);
      } 
    } catch (ExceptionExtensionInAiPackage ExceptionExtensionInAiPackage) {
      bV.d(ExceptionExtensionInAiPackage.getMessage(), jToggleButton);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */