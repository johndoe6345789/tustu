package bL;

import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInBlPackage extends Thread {
  private boolean b = true;
  
  private boolean c = false;
  
  o(n paramn) {
    super("VE Analyze Processor");
    setDaemon(true);
  }
  
  public void run() {
    this.c = true;
    while (a()) {
      if (this.a.b.isEmpty()) {
        try {
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
        continue;
      } 
      while (this.a.b.size() > 0) {
        p p = this.a.b.get(0);
        this.a.b.remove(p);
        try {
          this.a.a.a(p);
          this.a.e++;
          if (p.e())
            this.a.f++; 
          if (this.a.b.isEmpty())
            n.a(this.a); 
        } catch (Exception exception) {
          D.a("VE Analyze Error:\n" + exception.getMessage() + "\nCheck log for more detail.");
          exception.printStackTrace();
        } 
      } 
    } 
    this.c = false;
  }
  
  public boolean a() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public boolean b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */