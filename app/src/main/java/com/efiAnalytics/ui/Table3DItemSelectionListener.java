package com.efiAnalytics.ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Table3DItemSelectionListener implements ItemListener {
  Table3DItemSelectionListener(bt parambt) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) this.a.a((String) paramItemEvent.getItem());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
