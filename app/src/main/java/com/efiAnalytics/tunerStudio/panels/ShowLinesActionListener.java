package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ShowLinesActionListener implements ActionListener {
  ShowLinesActionListener(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    boolean bool = this.a.o.isSelected();
    TriggerLoggerPanel.a(this.a, "Show Lines", Boolean.toString(bool));
    this.a.f.b(bool);
    this.a.f.d();
    this.a.f.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */