package com.efiAnalytics.apps.ts.tuningViews;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class TuningViewLoaderAsync extends Thread {
  TuningViewLoaderAsync(n paramn, List paramList) {}
  
  public void run() {
    ArrayList<k> arrayList = new ArrayList();
    arrayList.addAll(this.a);
    for (byte b = 0; b < arrayList.size(); b++) {
      k k = arrayList.get(b);
      v v = new v(this.b, this.a, k);
      try {
        SwingUtilities.invokeAndWait(v);
        sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } catch (InvocationTargetException invocationTargetException) {
        Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */