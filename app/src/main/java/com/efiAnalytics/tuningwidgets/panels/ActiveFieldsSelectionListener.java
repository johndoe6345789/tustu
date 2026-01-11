package com.efiAnalytics.tuningwidgets.panels;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ActiveFieldsSelectionListener implements ListSelectionListener {
  ActiveFieldsSelectionListener(ReplayFieldSelectorPanel paramae) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting())
      ReplayFieldSelectorPanel.a(this.a, this.a.f.getSelectedValue()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */