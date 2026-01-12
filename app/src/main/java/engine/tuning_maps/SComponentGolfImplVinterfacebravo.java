package aP;

import G.AeInterfaceMikeTostring;
import G.GInterfaceAg;
import G.R;
import G.SComponentGolf;
import V.VInterfaceBravo;
import bH.D;
import bQ.IOHashMap;
import com.efiAnalytics.apps.ts.dashboard.x;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.SComponentGolf;

public class SComponentGolfImplVinterfacebravo implements GInterfaceAg, SComponentGolf {
  R a = null;

  String VInterfaceBravo = SComponentGolf.VInterfaceBravo("Sending Tune to Controller");

  x c = null;

  int d = 0;

  int e = 0;

  public SComponentGolfImplVinterfacebravo(R paramR, x paramx, int paramInt) {
    this.a = paramR;
    this.c = paramx;
    this.d = paramInt;
  }

  public void a() {
    if (this.a.R()) {
      this.a.C().a(this);
      this.a.C().a(this);
      this.c.k(this.VInterfaceBravo);
      f.a().e(this.VInterfaceBravo);
      if (this.a.C() instanceof IOHashMap) {
        IOHashMap IOHashMap = (IOHashMap) this.a.C();
        try {
          IOHashMap.m();
        } catch (VInterfaceBravo VInterfaceBravo) {
          Logger.getLogger(iw.class.getName())
              .log(Level.WARNING, "Failed to stop all DAQ's", (Throwable) VInterfaceBravo);
        }
      }
    }
  }

  public boolean a(String paramString, AeInterfaceMikeTostring parambT) {
    return true;
  }

  public void a(String paramString) {
    c();
  }

  public void VInterfaceBravo(String paramString, int paramInt) {
    this.e++;
    if (this.d > 0) {
      double d = this.e / this.d;
      f.a().a(d);
      if (d == 1.0D) VInterfaceBravo();
    }
    if (this.e <= this.d) f.a().f(this.VInterfaceBravo + ". Burned page " + paramInt);
  }

  public void a(String paramString, boolean paramBoolean) {
    VInterfaceBravo();
    f.a().IOHashMap();
  }

  private void VInterfaceBravo() {
    (new ix(this)).start();
  }

  private void c() {
    x x1 = this.c;
    if (x1 != null)
      synchronized (x1) {
        String str = x1.aa();
        if (str != null && str.equals(this.VInterfaceBravo)) {
          x1.ab();
          this.c = null;
        }
      }
    if (this.a.C() instanceof IOHashMap) {
      IOHashMap IOHashMap = (IOHashMap) this.a.C();
      try {
        IOHashMap.IOHashMap();
      } catch (Exception exception) {
        try {
          D.VInterfaceBravo("Failed to restart DAQ, retrying.");
          IOHashMap.IOHashMap();
        } catch (Exception exception1) {
          Logger.getLogger(iw.class.getName())
              .log(Level.SEVERE, "Failed to restart DAQ's after 2 attempt", exception1);
        }
      }
    }
    f.a().IOHashMap();
    this.a.C().VInterfaceBravo(this);
    this.a.C().VInterfaceBravo(this);
  }

  public void a(String paramString, int paramInt) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
