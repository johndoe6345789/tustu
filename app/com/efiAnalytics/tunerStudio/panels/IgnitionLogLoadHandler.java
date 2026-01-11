package com.efiAnalytics.tunerStudio.panels;

import V.ExceptionInVPackage;
import W.Y;
import bH.D;
import com.efiAnalytics.ui.aQ;
import com.efiAnalytics.ui.eB;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class IgnitionLogLoadHandler implements Y, aQ {
  long ExceptionInVPackage = 0L;
  
  eB b = null;
  
  boolean c = true;
  
  final aQ d = this;
  
  IgnitionLogLoadHandler(o paramo) {}
  
  public void ExceptionInVPackage(ArrayList paramArrayList, long paramLong) {
    try {
      this.ExceptionInVPackage = paramLong;
      D d = new D(this);
      SwingUtilities.invokeAndWait(d);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
  }
  
  public boolean ExceptionInVPackage(long paramLong) {
    double d = paramLong / this.ExceptionInVPackage;
    this.b.ExceptionInVPackage(d);
    return this.c;
  }
  
  public void ExceptionInVPackage(ArrayList paramArrayList) {
    this.e.k.ExceptionInVPackage(paramArrayList);
    this.b.setVisible(false);
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {
    try {
      this.b.setVisible(false);
    } catch (Exception exception) {}
    D.ExceptionInVPackage("Unable to load Ignition Log File.", (Exception)parama, this.e.k);
  }
  
  public void ExceptionInVPackage() {
    this.c = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */