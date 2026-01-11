package as;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class ActionListenerImplInAsPackage implements ActionListener {
  ActionListenerImplInAsPackage(j paramj, JComboBox paramJComboBox) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    IOProperties.c(IOProperties.ao, "" + this.a.getSelectedIndex());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */