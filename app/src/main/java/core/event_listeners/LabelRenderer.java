package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bJ implements ActionListener {
  boolean a = false;

  bJ(bI parambI, bE parambE) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (!this.a) {
      this.a = true;
      this.c.a.setSelected(!this.c.a.isSelected());
      this.c.b.setSelected(this.c.b.isSelected());
      this.a = false;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
