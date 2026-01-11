package com.efiAnalytics.tuningwidgets.portEditor;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class PortEnableItemListener implements ItemListener {
  PortEnableItemListener(OutputPortEditor paramOutputPortEditor) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    OutputPortEditor.a(this.a, this.a.b.isSelected());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */