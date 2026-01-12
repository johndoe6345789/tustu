package com.efiAnalytics.apps.ts.dashboard;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class FontSizeSliderChangeListener implements ChangeListener {
  FontSizeSliderChangeListener(ad paramad) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider) paramChangeEvent.getSource()).getValue();
    this.a.a().setFontSizeAdjustment(i);
    this.a.a().repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
