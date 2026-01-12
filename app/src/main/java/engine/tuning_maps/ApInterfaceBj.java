package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ApInterfaceBj implements ActionListener {
  ApInterfaceBj(bG parambG) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.c.isSelected()) {
      this.a.d.setEnabled(true);
      this.a.e.setEnabled(true);
    } else {
      this.a.d.setEnabled(false);
      this.a.d.setText("");
      this.a.e.setEnabled(false);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
