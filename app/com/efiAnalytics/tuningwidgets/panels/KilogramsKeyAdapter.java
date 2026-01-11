package com.efiAnalytics.tuningwidgets.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KilogramsKeyAdapter extends KeyAdapter {
  KilogramsKeyAdapter(WeightInputPanel paramaQ) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    try {
      String str = this.a.b.getText() + paramKeyEvent.getKeyChar();
      int i = Integer.parseInt(str);
      this.a.a.setText((i * 22 / 10) + "");
    } catch (NumberFormatException numberFormatException) {
      paramKeyEvent.consume();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */