package com.efiAnalytics.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.application.Platform;

class eE implements ActionListener {
  eE(eD parameD) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    Platform.runLater(new eF(this));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
