package aP;

import bH.D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class ApInterfaceFa implements ActionListener {
  ApInterfaceFa(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      String str = ((JComponent) paramActionEvent.getSource()).getName();
      this.a.c.a(paramActionEvent.getActionCommand(), str, this.a.h);
    } catch (Exception exception) {
      D.a("Error showing dialog:\n" + exception.getMessage(), exception, this.a.h);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
