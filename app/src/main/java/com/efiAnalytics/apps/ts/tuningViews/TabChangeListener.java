package com.efiAnalytics.apps.ts.tuningViews;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class TabChangeListener implements ChangeListener {
  TabChangeListener(n paramn) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    if (this.a.getSelectedIndex() == this.a.getTabCount() - 1) {
      if (this.a.a < this.a.getTabCount() - 1) {
        this.a.setSelectedIndex(this.a.a);
        if (!this.a.f)
          n.a(this.a); 
      } else {
        this.a.setSelectedIndex(0);
      } 
    } else {
      this.a.a = this.a.getSelectedIndex();
      n.a(this.a, this.a.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */