package com.efiAnalytics.ui.calculators.calculator;

import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JPanel;

class Keypad extends JPanel {
  private final Calculator a;

  private final Key[][] b =
      new Key[][] {
        {Key.p, Key.q, Key.r, Key.t},
        {Key.h, Key.i, Key.j, Key.k},
        {Key.e, Key.f, Key.g, Key.l},
        {Key.b, Key.c, Key.d, Key.m},
        {Key.a, Key.s, Key.n, Key.o}
      };

  Keypad(Calculator paramCalculator) {
    this.a = paramCalculator;
    a();
  }

  private void a() {
    setLayout(new GridLayout(this.b.length, this.b.length));
    Arrays.<Key[]>stream(this.b)
        .flatMap(Arrays::stream)
        .map(paramKey -> new Keypad$KeyButton(this, paramKey))
        .forEach(this::add);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Keypad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
