package aP;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class dj extends Thread {
  dj(dh paramdh, Runnable paramRunnable) {}
  
  public void run() {
    setName("LogTabBuilderThread");
    try {
      boolean bool = !SwingUtilities.isEventDispatchThread() ? true : false;
      if (bool) {
        SwingUtilities.invokeAndWait(this.a);
      } else {
        this.a.run();
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(dh.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(dh.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
    this.b.e();
    this.b.b.a();
    dd.a().a(this.b.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */