package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BinTableToggleListener implements ActionListener {
  BinTableToggleListener(BinTableView paramBinTableView) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    BinTableView.a(this.a, !BinTableView.a(this.a));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
