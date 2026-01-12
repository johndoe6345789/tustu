package com.efiAnalytics.ui;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class BinTableHeaderSelectionListener implements ListSelectionListener {
  BinTableHeaderSelectionListener(
      BinTableHeaderCellRenderer paramaG, BinTableView paramBinTableView) {}

  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    this.b.e.getTableHeader().repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
