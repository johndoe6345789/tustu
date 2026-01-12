package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class Table3DPanelCheckboxMenuListener implements ActionListener {
  Table3DPanelCheckboxMenuListener(bt parambt) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = ((JCheckBoxMenuItem) paramActionEvent.getSource()).isSelected();
    this.a.b(bool);
    this.a.a.z();
    this.a.a.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
