package com.efiAnalytics.ui;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javafx.application.Platform;

class JavaFxPanelResizeAdapter extends ComponentAdapter {
  eG(eD parameD) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    Platform.runLater(new eH(this));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */