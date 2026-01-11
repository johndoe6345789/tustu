package aP;

import bj.UICloseInBjPackage;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowAdapterExtensionInApPackage extends WindowAdapter {
  WindowAdapterExtensionInApPackage(iL paramiL, UICloseInBjPackage parama) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    this.UICloseInBjPackage.close();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */