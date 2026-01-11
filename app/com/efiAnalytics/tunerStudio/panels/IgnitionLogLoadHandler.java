package com.efiAnalytics.tunerStudio.panels;

import V.a;
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
  long a = 0L;
  
  eB b = null;
  
  boolean c = true;
  
  final aQ d = this;
  
  C(o paramo) {}
  
  public void a(ArrayList paramArrayList, long paramLong) {
    try {
      this.a = paramLong;
      D d = new D(this);
      SwingUtilities.invokeAndWait(d);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
  }
  
  public boolean a(long paramLong) {
    double d = paramLong / this.a;
    this.b.a(d);
    return this.c;
  }
  
  public void a(ArrayList paramArrayList) {
    this.e.k.a(paramArrayList);
    this.b.setVisible(false);
  }
  
  public void a(a parama) {
    try {
      this.b.setVisible(false);
    } catch (Exception exception) {}
    D.a("Unable to load Ignition Log File.", (Exception)parama, this.e.k);
  }
  
  public void a() {
    this.c = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */