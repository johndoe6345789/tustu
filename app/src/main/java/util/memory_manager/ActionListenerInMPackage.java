package m;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class ActionListenerInMPackage implements ActionListener {
  ActionListenerInMPackage(d paramd, JButton paramJButton) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    d.a(this.b, this.a, 0, this.a.getHeight());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
