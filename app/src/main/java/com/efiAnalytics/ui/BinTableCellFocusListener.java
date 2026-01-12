package com.efiAnalytics.ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class BinTableCellFocusListener implements FocusListener {
  BinTableCellFocusListener(
      BinTableCellRenderer paramBinTableCellRenderer, BinTableView paramBinTableView) {}

  public void focusGained(FocusEvent paramFocusEvent) {}

  public void focusLost(FocusEvent paramFocusEvent) {
    this.b.i.O();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
