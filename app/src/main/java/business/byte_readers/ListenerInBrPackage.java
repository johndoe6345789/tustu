package business.byte_readers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerInBrPackage implements ActionListener {
  ai(ag paramag) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.k.getItemCount() > this.a.l.getSelectedIndex()) {
      this.a.k.setSelectedIndex(this.a.l.getSelectedIndex());
    } else {
      this.a.k.setSelectedIndex(this.a.k.getItemCount() - 1);
    }
    if (this.a.j.getItemCount() > this.a.l.getSelectedIndex()) {
      this.a.j.setSelectedIndex(this.a.l.getSelectedIndex());
    } else {
      this.a.j.setSelectedIndex(this.a.j.getItemCount() - 1);
    }
    this.a.d.a("egoSensorIndex", this.a.j.getSelectedIndex() + "");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
