package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gq implements ActionListener {
  gq(go paramgo) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    Integer integer = (Integer) this.a.g.getSelectedItem();
    this.a.l.b(integer.intValue());
    this.a.l.k();
    go.g(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
