package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class b extends MouseAdapter {
  b(BurnButtonTv paramBurnButtonTv) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.a.i = true;
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.a.i = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */