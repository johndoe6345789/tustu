package com.efiAnalytics.ui;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JDialog;

class fQ extends JDialog implements WindowListener {
  fQ(fL paramfL, Window paramWindow, String paramString) {
    super(paramWindow, paramString);
    addWindowListener(this);
  }
  
  public void windowOpened(WindowEvent paramWindowEvent) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    this.a.d();
  }
  
  public void windowClosed(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowActivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */