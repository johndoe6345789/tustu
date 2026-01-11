package business.byte_readers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class BrInterfaceSierra implements ActionListener {
  BrInterfaceSierra(P paramP) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox)paramActionEvent.getSource();
    if (jCheckBox.isSelected()) {
      this.a.q = "15";
      this.a.a(this.a.q);
    } else {
      this.a.q = "Manually";
      this.a.a(this.a.q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */