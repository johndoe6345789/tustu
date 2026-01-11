package aP;

import G.R;
import G.aG;
import G.bT;
import G.g;
import V.b;
import bH.D;
import bQ.l;
import com.efiAnalytics.apps.ts.dashboard.x;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.g;

public class iw implements aG, g {
  R a = null;
  
  String b = g.b("Sending Tune to Controller");
  
  x c = null;
  
  int d = 0;
  
  int e = 0;
  
  public iw(R paramR, x paramx, int paramInt) {
    this.a = paramR;
    this.c = paramx;
    this.d = paramInt;
  }
  
  public void a() {
    if (this.a.R()) {
      this.a.C().a(this);
      this.a.C().a(this);
      this.c.k(this.b);
      f.a().e(this.b);
      if (this.a.C() instanceof l) {
        l l = (l)this.a.C();
        try {
          l.m();
        } catch (b b) {
          Logger.getLogger(iw.class.getName()).log(Level.WARNING, "Failed to stop all DAQ's", (Throwable)b);
        } 
      } 
    } 
  }
  
  public boolean a(String paramString, bT parambT) {
    return true;
  }
  
  public void a(String paramString) {
    c();
  }
  
  public void b(String paramString, int paramInt) {
    this.e++;
    if (this.d > 0) {
      double d = this.e / this.d;
      f.a().a(d);
      if (d == 1.0D)
        b(); 
    } 
    if (this.e <= this.d)
      f.a().f(this.b + ". Burned page " + paramInt); 
  }
  
  public void a(String paramString, boolean paramBoolean) {
    b();
    f.a().l();
  }
  
  private void b() {
    (new ix(this)).start();
  }
  
  private void c() {
    x x1 = this.c;
    if (x1 != null)
      synchronized (x1) {
        String str = x1.aa();
        if (str != null && str.equals(this.b)) {
          x1.ab();
          this.c = null;
        } 
      }  
    if (this.a.C() instanceof l) {
      l l = (l)this.a.C();
      try {
        l.l();
      } catch (Exception exception) {
        try {
          D.b("Failed to restart DAQ, retrying.");
          l.l();
        } catch (Exception exception1) {
          Logger.getLogger(iw.class.getName()).log(Level.SEVERE, "Failed to restart DAQ's after 2 attempt", exception1);
        } 
      } 
    } 
    f.a().l();
    this.a.C().b(this);
    this.a.C().b(this);
  }
  
  public void a(String paramString, int paramInt) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */