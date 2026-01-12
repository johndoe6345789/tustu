package com.efiAnalytics.apps.ts.dashboard;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class FaceAngleChangeListener implements ChangeListener {
  FaceAngleChangeListener(ad paramad) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider) paramChangeEvent.getSource()).getValue();
    this.a.a().setFaceAngle(i);
    this.a.a().repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
