package G;

import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GComponentCy implements aG {
  private static final Map a = new HashMap<>();

  private final R b;

  private cz c = null;

  private final List d = new ArrayList();

  private GComponentCy(R paramR) {
    this.b = paramR;
  }

  public static cy a(R paramR) {
    if (a.get(paramR.c()) == null) {
      cy cy1 = new cy(paramR);
      a.put(paramR.c(), cy1);
    }
    return (cy) a.get(paramR.c());
  }

  public static boolean b(String paramString) {
    return (a.get(paramString) != null);
  }

  public void a() {
    this.b.C().a(this);
    for (ca ca : this.d) b(ca);
  }

  public static void c(String paramString) {
    a.remove(paramString);
  }

  public void a(ca paramca) {
    if (paramca.i().equals(ca.d) || paramca.i().equals(ca.e)) this.d.add(paramca);
  }

  private void b(ca paramca) {
    if (paramca.i().equals(ca.d) || paramca.i().equals(ca.e)) {
      cA cA = new cA(this, paramca);
      try {
        cu.a().a(this.b.c(), paramca.S(), cA);
      } catch (Exception exception) {
        D.b(
            "Unable to update '"
                + paramca.aL()
                + "' from Channel: "
                + exception.getLocalizedMessage());
      }
    }
  }

  public boolean a(String paramString, bT parambT) {
    return true;
  }

  public void a(String paramString) {
    for (ca ca : this.d) {
      if (ca.i().equals(ca.d)) b(ca);
    }
  }

  public void a(cq paramcq) {
    if (this.c == null || !this.c.isAlive()) {
      this.c = new cz(this);
      this.c.start();
    }
    cz.a(this.c, paramcq);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
