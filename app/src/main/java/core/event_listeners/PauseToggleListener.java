package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gh implements ActionListener {
  gh(fK paramfK) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a.v.isSelected()) {
      this.a.v.setIcon(this.a.w);
      fK.g(this.a).a(true);
    } else {
      fK.g(this.a).a(false);
      this.a.v.setIcon(this.a.x);
    }
    this.a.h();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
