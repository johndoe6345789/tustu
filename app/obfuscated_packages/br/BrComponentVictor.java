package br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class BrComponentVictor implements ActionListener {
  v(s params) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox)paramActionEvent.getSource();
    if (jCheckBox.isSelected()) {
      this.a.o = "15";
      this.a.a(this.a.o);
    } else {
      this.a.o = "Manually";
      this.a.a(this.a.o);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */