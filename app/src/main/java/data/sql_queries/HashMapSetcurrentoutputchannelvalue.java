package aI;

import G.GComponentCq;
import G.ManagerUsingArrayList;
import G.R;
import G.S;
import G.T;
import V.ExceptionInVPackage;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashMapSetcurrentoutputchannelvalue implements S, GComponentCq {
  private static HashMap c = new HashMap<>();

  private R d = null;

  int ExceptionInVPackage = 1;

  int b = 0;

  private HashMapSetcurrentoutputchannelvalue(R paramR) {
    this.d = paramR;
    b();
  }

  private void b() {
    try {
      if (this.d.g("rpm") != null)
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), "rpm", this);
      if (this.d.g("engine") != null)
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), "engine", this);
      T.ExceptionInVPackage().ExceptionInVPackage(this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(b.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
    }
  }

  public static b d(R paramR) {
    b b1 = (b) c.get(paramR.c());
    if (b1 == null) {
      b1 = new b(paramR);
      c.put(paramR.c(), b1);
    }
    return b1;
  }

  private void c() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
    c.remove(this.d.c());
  }

  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramString.equals("rpm")) this.b = (int) paramDouble;
    if (paramString.equals("engine")) this.ExceptionInVPackage = (int) paramDouble;
  }

  public void ExceptionInVPackage(R paramR) {}

  public void b(R paramR) {
    if (paramR.equals(this.d)) c();
  }

  public void c(R paramR) {}

  public boolean ExceptionInVPackage() {
    return (this.b > 0);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
