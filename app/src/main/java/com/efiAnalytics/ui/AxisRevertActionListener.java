package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AxisRevertActionListener implements ActionListener {
  AxisRevertActionListener(AxisTableContextMenuListener paramT, int[] paramArrayOfint) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    for (byte b = 0; b < this.a.length; b++)
      this.b.c.getModel().setValueAt(this.b.c.b[this.a[b]], this.b.b ? this.a[b] : 0, this.b.b ? 0 : this.a[b]); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */