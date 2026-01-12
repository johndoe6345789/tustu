package com.efiAnalytics.ui.calculators.calculator;

import com.efiAnalytics.ui.eJ;
import java.awt.Font;
import java.util.function.BiConsumer;
import javax.swing.JButton;

class Keypad$KeyButton extends JButton implements Command {
  private BiConsumer b;

  Keypad$KeyButton(Keypad paramKeypad, Key paramKey) {
    super(paramKey.toString());
    addActionListener(Keypad.a(paramKeypad));
    this.b = paramKey.a();
    setFont(new Font("Consolas", 1, eJ.a(30)));
    setFocusable(false);
  }

  public void a() {
    this.b.accept(Keypad.a(this.a), getText());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Keypad$KeyButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
