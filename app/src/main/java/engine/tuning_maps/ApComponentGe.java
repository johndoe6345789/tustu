package aP;

import bA.JCheckBoxMenuItemExtension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.IOPropertiesUsingFile;

class ApComponentGe implements ActionListener {
  ge(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension =
        (JCheckBoxMenuItemExtension) paramActionEvent.getSource();
    if (JCheckBoxMenuItemExtension.getState()) {
      IOPropertiesUsingFile.IOPropertiesUsingFile()
          .b(IOPropertiesUsingFile.aH, JCheckBoxMenuItemExtension.getActionCommand());
      dd.IOPropertiesUsingFile().i().JCheckBoxMenuItemExtension();
      f.IOPropertiesUsingFile().x();
      this.IOPropertiesUsingFile.d();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
