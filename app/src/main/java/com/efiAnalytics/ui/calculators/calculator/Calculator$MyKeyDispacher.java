package com.efiAnalytics.ui.calculators.calculator;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class Calculator$MyKeyDispacher implements KeyEventDispatcher {
  Calculator$MyKeyDispacher(Calculator paramCalculator) {}

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    boolean bool = false;
    if (paramKeyEvent.getID() == 401)
      if (paramKeyEvent.getKeyChar() == '0'
          || paramKeyEvent.getKeyChar() == '1'
          || paramKeyEvent.getKeyChar() == '2'
          || paramKeyEvent.getKeyChar() == '3'
          || paramKeyEvent.getKeyChar() == '4'
          || paramKeyEvent.getKeyChar() == '5'
          || paramKeyEvent.getKeyChar() == '6'
          || paramKeyEvent.getKeyChar() == '7'
          || paramKeyEvent.getKeyChar() == '8'
          || paramKeyEvent.getKeyChar() == '9') {
        this.a.a(paramKeyEvent.getKeyChar() + "");
        bool = true;
      } else if (paramKeyEvent.getKeyChar() == '/'
          || paramKeyEvent.getKeyChar() == '+'
          || paramKeyEvent.getKeyChar() == '-'
          || paramKeyEvent.getKeyChar() == 'x'
          || paramKeyEvent.getKeyChar() == '=') {
        this.a.c(paramKeyEvent.getKeyChar() + "");
        bool = true;
      } else if (paramKeyEvent.getKeyChar() == '*' || paramKeyEvent.getKeyChar() == 'X') {
        this.a.c("x");
        bool = true;
      } else if (paramKeyEvent.getKeyChar() == '.') {
        this.a.d(".");
        bool = true;
      } else if (paramKeyEvent.getKeyCode() == 27) {
        this.a.b("");
        bool = true;
      } else if (paramKeyEvent.getKeyCode() == 10) {
        this.a.c("=");
        bool = true;
      }
    return bool;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Calculator$MyKeyDispacher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
