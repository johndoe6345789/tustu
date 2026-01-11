package com.efiAnalytics.ui;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class bF implements ChangeListener {
  bF(bt parambt) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider)paramChangeEvent.getSource();
    this.a.a.d(jSlider.getValue());
    this.a.a.repaint();
    bt.a(this.a, false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */