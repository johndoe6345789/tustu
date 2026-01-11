package aO;

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

class ThreadedInAoPackage implements Y, aQ {
  long ExceptionInVPackage = 0L;
  
  eB b = null;
  
  boolean c = true;
  
  final aQ d = this;
  
  g(ExceptionInVPackage parama) {}
  
  public void ExceptionInVPackage(ArrayList paramArrayList, long paramLong) {
    try {
      this.ExceptionInVPackage = paramLong;
      h h = new h(this);
      if (SwingUtilities.isEventDispatchThread()) {
        h.run();
      } else {
        SwingUtilities.invokeAndWait(h);
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(ExceptionInVPackage.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(ExceptionInVPackage.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
  }
  
  public boolean ExceptionInVPackage(long paramLong) {
    double d = paramLong / this.ExceptionInVPackage;
    this.b.ExceptionInVPackage(d);
    return this.c;
  }
  
  public void ExceptionInVPackage(ArrayList paramArrayList) {
    this.e.k.b(paramArrayList);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */