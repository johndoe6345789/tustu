package aP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class iU extends Thread {
  List a = Collections.synchronizedList(new ArrayList());
  
  iU(iS paramiS) {
    super("StartScreenUpdate");
    setDaemon(false);
  }
  
  public void run() {
    while (this.a.size() > 0) {
      try {
        Thread.sleep(3000L);
        iT iT = this.a.get(0);
        this.a.remove(0);
        this.b.a(iT.a, iT.b, iT.c);
      } catch (Exception exception) {
        Logger.getLogger(iS.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
  }
  
  public void a(iT paramiT) {
    this.a.add(paramiT);
    if (!isAlive())
      start(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */