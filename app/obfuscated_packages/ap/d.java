package ap;

import i.g;
import i.i;
import java.util.logging.Level;
import java.util.logging.Logger;

class d extends Thread {
  private int b = -1;
  
  private String c = null;
  
  d(c paramc) {
    super("PIPE_ACTION_INDEX_CHANGED PubThread");
  }
  
  public void run() {
    while (true) {
      try {
        Thread.sleep((g.a * 2));
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      if (this.b >= 0 && this.c != null) {
        i.a().a("indexChanged", this.c + "|" + this.b);
        this.b = -1;
        this.c = null;
      } 
    } 
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
  
  public void a(String paramString) {
    this.c = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ap/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */