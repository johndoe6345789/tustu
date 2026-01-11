package aP;

import G.R;
import G.T;
import bA.f;
import bH.p;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class gT extends Thread {
  long a = Long.MAX_VALUE;
  
  int b = 100;
  
  int c = 100;
  
  boolean d = false;
  
  gT(dB paramdB) {
    super("TopEnableDelay");
    setDaemon(true);
  }
  
  public void run() {
    while (!this.d) {
      try {
        sleep(this.c);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dB.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      try {
        if (!this.d && System.currentTimeMillis() > this.a) {
          this.a = Long.MAX_VALUE;
          for (String str : T.a().d()) {
            for (byte b = 0; b < this.e.l().getMenuCount(); b++) {
              f f = (f)this.e.l().getMenu(b);
              if (f != null && f.d() != null)
                try {
                  R r = T.a().c(str);
                  boolean bool = p.a(f.d(), r);
                  gK gK = dB.a(this.e, f, bool);
                  SwingUtilities.invokeLater(gK);
                } catch (Exception exception) {} 
              if (f != null)
                try {
                  boolean bool = (f.i() == null || f.i().a()) ? true : false;
                  gL gL = dB.b(this.e, f, bool);
                  SwingUtilities.invokeLater(gL);
                } catch (Exception exception) {} 
            } 
          } 
          for (String str : T.a().d()) {
            for (byte b = 0; !this.d && b < this.e.e.a(str); b++) {
              f f = this.e.e.a(str, b);
              if (f != null && f.d() != null)
                try {
                  R r = T.a().c(str);
                  boolean bool = p.a(f.d(), r);
                  gK gK = dB.a(this.e, f, bool);
                  SwingUtilities.invokeLater(gK);
                } catch (Exception exception) {} 
              if (f != null && f.i() != null)
                try {
                  boolean bool = (f.i() == null || f.i().a()) ? true : false;
                  gL gL = dB.b(this.e, f, bool);
                  SwingUtilities.invokeLater(gL);
                } catch (Exception exception) {} 
            } 
          } 
        } 
      } catch (Exception exception) {}
    } 
  }
  
  public void a() {
    this.a = System.currentTimeMillis() + this.b;
  }
  
  private void b() {
    this.d = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */