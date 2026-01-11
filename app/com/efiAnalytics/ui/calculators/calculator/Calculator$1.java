package com.efiAnalytics.ui.calculators.calculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calculator$1 extends WindowAdapter {
  Calculator$1(Calculator paramCalculator) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    if (this.a.getParent() == null) {
      System.exit(0);
    } else {
      this.a.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Calculator$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */