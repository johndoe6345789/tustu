package com.efiAnalytics.ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.JTextComponent;

public class TextSelectFocusListener implements FocusListener {
  public void focusGained(FocusEvent paramFocusEvent) {
    if (paramFocusEvent.getSource() instanceof JTextComponent)
      ((JTextComponent)paramFocusEvent.getSource()).selectAll(); 
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */