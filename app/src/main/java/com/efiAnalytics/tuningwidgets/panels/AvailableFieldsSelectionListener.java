package com.efiAnalytics.tuningwidgets.panels;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class AvailableFieldsSelectionListener implements ListSelectionListener {
  AvailableFieldsSelectionListener(ReplayFieldSelectorPanel paramae) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting())
      ReplayFieldSelectorPanel.a(this.a, this.a.d.getSelectedValue()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */