package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MoveTabRightListener implements ActionListener {
  MoveTabRightListener(n paramn, int paramInt) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = this.b.getTitleAt(this.a);
    n.a(this.b, str, this.a + 1);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */