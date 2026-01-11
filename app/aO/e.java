package aO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class e implements ActionListener {
  e(a parama) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox)paramActionEvent.getSource();
    this.a.a(jCheckBox.isSelected());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */