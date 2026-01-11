package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bb implements ActionListener {
  bc a = null;
  
  public bb(bc parambc) {
    this.a = parambc;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a.close();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */