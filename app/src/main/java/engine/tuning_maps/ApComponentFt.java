package aP;

import bA.JCheckBoxMenuItemExtension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.IOPropertiesUsingFile;

class ApComponentFt implements ActionListener {
  ft(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension =
        (JCheckBoxMenuItemExtension) paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile()
        .b(IOPropertiesUsingFile.ae, Boolean.toString(JCheckBoxMenuItemExtension.isSelected()));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
