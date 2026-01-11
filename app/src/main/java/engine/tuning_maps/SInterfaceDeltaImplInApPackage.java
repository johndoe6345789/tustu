package aP;

import S.SInterfaceDelta;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class SInterfaceDeltaImplInApPackage implements SInterfaceDelta {
  SInterfaceDeltaImplInApPackage(bB parambB) {}
  
  public void a() {
    bE bE = new bE(this);
    if (SwingUtilities.isEventDispatchThread()) {
      bE.run();
    } else {
      try {
        SwingUtilities.invokeAndWait(bE);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } catch (InvocationTargetException invocationTargetException) {
        Logger.getLogger(bB.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
      } 
    } 
  }
  
  public void b() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */