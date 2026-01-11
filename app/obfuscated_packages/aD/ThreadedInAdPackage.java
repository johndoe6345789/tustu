package aD;

import A.AInterfaceDelta;
import G.T;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadedInAdPackage extends Thread {
  String[] a = null;
  
  List b = new ArrayList();
  
  public ThreadedInAdPackage(a parama) {
    super("PortChangeMonitor");
  }
  
  public void a(a parama) {
    this.b.add(parama);
  }
  
  public void a() {
    for (a a1 : this.b)
      a.a(a1, a1.l()); 
  }
  
  public void run() {
    while (true) {
      try {
        Thread.sleep(2500L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      if (AInterfaceDelta.a().b() && (T.a().c() == null || !T.a().c().R())) {
        String[] arrayOfString = this.c.t.b();
        if (this.a != null)
          if (this.a.length != arrayOfString.length) {
            a();
          } else {
            for (byte b = 0; b < arrayOfString.length; b++) {
              if (!arrayOfString[b].equals(this.a[b])) {
                a();
                break;
              } 
            } 
          }  
        this.a = arrayOfString;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aD/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */