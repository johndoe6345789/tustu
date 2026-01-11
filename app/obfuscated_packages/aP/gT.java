package aP;

import G.R;
import G.T;
import bA.BaInterfaceFoxtrot;
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
              BaInterfaceFoxtrot BaInterfaceFoxtrot = (BaInterfaceFoxtrot)this.e.l().getMenu(b);
              if (BaInterfaceFoxtrot != null && BaInterfaceFoxtrot.d() != null)
                try {
                  R r = T.a().c(str);
                  boolean bool = p.a(BaInterfaceFoxtrot.d(), r);
                  gK gK = dB.a(this.e, BaInterfaceFoxtrot, bool);
                  SwingUtilities.invokeLater(gK);
                } catch (Exception exception) {} 
              if (BaInterfaceFoxtrot != null)
                try {
                  boolean bool = (BaInterfaceFoxtrot.i() == null || BaInterfaceFoxtrot.i().a()) ? true : false;
                  gL gL = dB.b(this.e, BaInterfaceFoxtrot, bool);
                  SwingUtilities.invokeLater(gL);
                } catch (Exception exception) {} 
            } 
          } 
          for (String str : T.a().d()) {
            for (byte b = 0; !this.d && b < this.e.e.a(str); b++) {
              BaInterfaceFoxtrot BaInterfaceFoxtrot = this.e.e.a(str, b);
              if (BaInterfaceFoxtrot != null && BaInterfaceFoxtrot.d() != null)
                try {
                  R r = T.a().c(str);
                  boolean bool = p.a(BaInterfaceFoxtrot.d(), r);
                  gK gK = dB.a(this.e, BaInterfaceFoxtrot, bool);
                  SwingUtilities.invokeLater(gK);
                } catch (Exception exception) {} 
              if (BaInterfaceFoxtrot != null && BaInterfaceFoxtrot.i() != null)
                try {
                  boolean bool = (BaInterfaceFoxtrot.i() == null || BaInterfaceFoxtrot.i().a()) ? true : false;
                  gL gL = dB.b(this.e, BaInterfaceFoxtrot, bool);
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