package as;

import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class m implements ActionListener {
  m(j paramj, JComboBox paramJComboBox) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    i.c(i.at, "" + this.a.getSelectedIndex());
    this.b.a.setEnabled((this.a.getSelectedIndex() == i.av));
    this.b.b.setEnabled((this.a.getSelectedIndex() == i.av));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */