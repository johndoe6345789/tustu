package com.efiAnalytics.tuningwidgets.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class PoundsKeyAdapter extends KeyAdapter {
  PoundsKeyAdapter(WeightInputPanel paramaQ) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    try {
      String str = this.a.a.getText() + paramKeyEvent.getKeyChar();
      int i = Integer.parseInt(str);
      this.a.b.setText((i * 10 / 22) + "");
    } catch (NumberFormatException numberFormatException) {
      paramKeyEvent.consume();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */