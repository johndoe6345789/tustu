package bb;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInBbPackage extends Thread {
  B(A paramA) {}
  
  public void run() {
    try {
      Thread.sleep(250L);
      boolean bool = this.a.a.b.O().H();
      this.a.a.b.O().e(false);
      x.d(this.a.a);
      if (this.a.a.b != null)
        this.a.a.b.C().b(this.a.a.g); 
      Thread.sleep(200L);
      this.a.a.b.O().e(bool);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */