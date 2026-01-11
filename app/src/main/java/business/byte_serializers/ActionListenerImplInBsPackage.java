package business.byte_serializers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class ActionListenerImplInBsPackage implements ActionListener {
  ActionListenerImplInBsPackage(k paramk) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JToggleButton jToggleButton = (JToggleButton)paramActionEvent.getSource();
    k.a(this.a, jToggleButton.isSelected());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */