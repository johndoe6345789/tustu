package as;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class ActionperformedInAsPackage implements ActionListener {
  m(j paramj, JComboBox paramJComboBox) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    IOProperties.c(IOProperties.at, "" + this.a.getSelectedIndex());
    this.b.a.setEnabled((this.a.getSelectedIndex() == IOProperties.av));
    this.b.b.setEnabled((this.a.getSelectedIndex() == IOProperties.av));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */