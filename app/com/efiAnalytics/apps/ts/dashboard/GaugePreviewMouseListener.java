package com.efiAnalytics.apps.ts.dashboard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class GaugePreviewMouseListener extends MouseAdapter {
  GaugePreviewMouseListener(g paramg) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    n n = (n)paramMouseEvent.getSource();
    this.a.c.a(n.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */