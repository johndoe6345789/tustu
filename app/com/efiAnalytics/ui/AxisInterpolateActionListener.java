package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AxisInterpolateActionListener implements ActionListener {
  AxisInterpolateActionListener(AxisTableContextMenuListener paramT, int[] paramArrayOfint) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int i = this.a.length - 1;
    double d1 = Double.parseDouble(this.b.c.getModel().getValueAt(this.b.b ? this.a[0] : 0, this.b.b ? 0 : this.a[0]).toString());
    double d2 = (Double.parseDouble(this.b.c.getModel().getValueAt(this.b.b ? this.a[i] : 0, this.b.b ? 0 : this.a[i]).toString()) - d1) / i;
    for (byte b = 1; b < i; b++)
      this.b.c.getModel().setValueAt(Double.valueOf(d1 += d2), this.b.b ? this.a[b] : 0, this.b.b ? 0 : this.a[b]); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */