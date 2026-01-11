package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class eN implements ActionListener {
  eN(eK parameK) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JComboBox jComboBox = (JComboBox)paramActionEvent.getSource();
    this.a.k = jComboBox.getSelectedItem().toString();
    IOProperties.c(IOProperties.ad, this.a.k);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */