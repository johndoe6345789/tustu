package q;

import bH.D;
import bt.JLabelExtensionSettext;
import java.awt.Color;
import java.awt.Component;

public class QInterfaceDelta implements i {
  public void a(Component paramComponent) {
    JLabelExtensionSettext JLabelExtensionSettext = (JLabelExtensionSettext) paramComponent;
    JLabelExtensionSettext.setText("");
    JLabelExtensionSettext.setEnabled(true);
    JLabelExtensionSettext.setForeground(Color.BLACK);
    JLabelExtensionSettext.setOpaque(false);
  }

  public void b(Component paramComponent) {
    JLabelExtensionSettext JLabelExtensionSettext = (JLabelExtensionSettext) paramComponent;
    JLabelExtensionSettext.setEnabled(true);
    if (JLabelExtensionSettext.getText() != null && JLabelExtensionSettext.getText().length() > 0)
      D.c("Check out: " + JLabelExtensionSettext.getText());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
