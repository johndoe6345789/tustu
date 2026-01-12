package aP;

import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class ApComponentBv implements ActionListener {
  bv(bl parambl) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    Frame frame = bV.a((Component) paramActionEvent.getSource());
    try {
      String str = ((JComponent) paramActionEvent.getSource()).getName();
      f.a().a(paramActionEvent.getActionCommand(), str, frame);
    } catch (Exception exception) {
      D.a("Error showing dialog:\n" + exception.getMessage(), exception, frame);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
