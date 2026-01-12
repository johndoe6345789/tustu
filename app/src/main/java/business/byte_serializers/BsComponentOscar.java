package business.byte_serializers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class BsComponentOscar implements ActionListener {
  BsComponentOscar(k paramk) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox) paramActionEvent.getSource();
    if (jCheckBox.isSelected()) {
      this.a.p = "15";
      this.a.a(this.a.p);
    } else {
      this.a.p = "Manually";
      this.a.a(this.a.p);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
