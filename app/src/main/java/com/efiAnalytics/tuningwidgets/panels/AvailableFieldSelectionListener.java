package com.efiAnalytics.tuningwidgets.panels;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class AvailableFieldSelectionListener implements ListSelectionListener {
  AvailableFieldSelectionListener(DatalogFieldSelectorPanel paramn) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting())
      n.a(this.a, this.a.e.getSelectedValue(), false); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */