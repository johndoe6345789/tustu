package aS;

import G.GInterfaceCj;
import G.GInterfaceCq;
import G.ManagerUsingArrayList;
import G.R;
import G.S;
import G.SerializableImpl;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AsInterfaceAlpha implements S, GInterfaceCj {
  HashMap a = new HashMap<>();

  long b = 0L;

  private static int e = 0;

  private static int f = 1;

  private int g = e;

  R c;

  private boolean h = true;

  boolean d = false;

  private SerializableImpl d(R paramR) {
    this.c = paramR;
    return (paramR.g("Config Error!OC") != null)
        ? paramR.g("Config Error!OC")
        : ((paramR.g("Config ErrorOC") != null) ? paramR.g("Config ErrorOC") : null);
  }

  public void a(R paramR) {}

  public void b(R paramR) {
    b b = (b) this.a.get(paramR.c());
    ThreadedJFrameIsoptimizeddrawingenabled.a().b().ac();
    if (b != null) ManagerUsingArrayList.a().a(b);
  }

  public void c(R paramR) {
    SerializableImpl SerializableImpl = d(paramR);
    b b = new b(this, paramR.c());
    this.a.put(paramR.c(), b);
    GInterfaceCq.a().a(paramR.c(), b);
    paramR.C().a(b);
    this.d = paramR.O().au();
    if (SerializableImpl != null)
      try {
        ManagerUsingArrayList.a().a(paramR.c(), SerializableImpl.aL(), b);
      } catch (V.a a1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
      }
    if (paramR.g("seconds") != null)
      try {
        ManagerUsingArrayList.a().a(paramR.c(), "seconds", new e(this, b));
      } catch (V.a a1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
      }
  }

  public void a(String paramString) {
    this.b = System.currentTimeMillis();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
