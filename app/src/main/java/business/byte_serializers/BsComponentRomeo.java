package business.byte_serializers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class BsComponentRomeo implements ActionListener {
  BsComponentRomeo(k paramk) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBox jCheckBox = (JCheckBox) paramActionEvent.getSource();
    if (jCheckBox.isSelected()) {
      this.a.b.b(true);
      this.a.n.a("extendBeyondData", Boolean.toString(true));
    } else {
      this.a.b.b(false);
      this.a.n.a("extendBeyondData", Boolean.toString(false));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
