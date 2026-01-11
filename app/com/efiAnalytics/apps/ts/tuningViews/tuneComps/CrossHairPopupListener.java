package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CrossHairPopupListener implements ActionListener {
  g(TableCellCrossHair paramTableCellCrossHair) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    TableCellCrossHair.access$000(this.a, this.a.d.getX(), this.a.d.getY() + this.a.d.getHeight());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */