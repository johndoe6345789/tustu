package com.efiAnalytics.apps.ts.dashboard;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class SweepBeginChangeListener implements ChangeListener {
  SweepBeginChangeListener(ad paramad) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider)paramChangeEvent.getSource()).getValue();
    this.a.a().setSweepBeginDegree(i);
    this.a.a().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */