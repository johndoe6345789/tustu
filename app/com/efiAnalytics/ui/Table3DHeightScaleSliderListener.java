package com.efiAnalytics.ui;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Table3DHeightScaleSliderListener implements ChangeListener {
  bG(bt parambt) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider)paramChangeEvent.getSource();
    double d = jSlider.getValue() / 100.0D;
    this.a.a.c(d);
    this.a.a("zHeightScale", d + "");
    this.a.a.z();
    this.a.a.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */