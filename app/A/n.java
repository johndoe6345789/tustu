package A;

import bH.D;
import java.util.List;

class n extends Thread {
  boolean a = true;
  
  List b = null;
  
  f c = null;
  
  boolean d = false;
  
  n(m paramm) {
    super("check");
    setDaemon(true);
    D.c("Created CheckThread");
  }
  
  public void run() {
    while (this.a) {
      if (this.c != null && this.b != null) {
        m.a(this.e, this.c, this.b);
        this.d = false;
        continue;
      } 
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {}
    } 
    D.c("CheckThread exiting");
  }
  
  private void a(f paramf, List paramList) {
    this.c = paramf;
    this.b = paramList;
    this.d = true;
  }
  
  private void a() {
    this.c = null;
    this.b = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */