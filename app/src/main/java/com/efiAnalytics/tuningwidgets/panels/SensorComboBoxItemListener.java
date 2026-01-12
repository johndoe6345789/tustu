package com.efiAnalytics.tuningwidgets.panels;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class SensorComboBoxItemListener implements ItemListener {
  SensorComboBoxItemListener(ThermistorCalibrationPanel paramaM) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    this.a.a(paramItemEvent.getItem().toString());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
