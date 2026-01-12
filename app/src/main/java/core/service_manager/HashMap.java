package S;

import G.R;
import G.S;
import G.T;
import U.UInterfaceAlpha;
import W.WInterfaceAp;
import bH.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class HashMap implements S {
  private final UInterfaceAlpha b = new UInterfaceAlpha();

  private WInterfaceAp c = null;

  private final List d = new ArrayList();

  private final HashMap e = new HashMap<>();

  List UInterfaceAlpha = new ArrayList();

  private static b f = null;

  public static b UInterfaceAlpha() {
    if (f == null) f = new b();
    return f;
  }

  public j UInterfaceAlpha(String paramString1, String paramString2) {
    UInterfaceAlpha a1 = b(paramString1, paramString2);
    if (a1 == null || !(a1 instanceof j)) {
      j j = new j();
      j.g(paramString2);
      if (this.c != null) j.h(paramString1);
      this.e.put(c(paramString1, paramString2), j);
      a1 = j;
    }
    return (j) a1;
  }

  public UInterfaceAlpha b(String paramString1, String paramString2) {
    UInterfaceAlpha a1 = (UInterfaceAlpha) this.e.get(c(paramString1, paramString2));
    if (a1 == null) {
      for (g g : this.d) {
        a1 = g.UInterfaceAlpha(paramString1, paramString2);
        if (a1 != null) break;
      }
      if (a1 == null) a1 = this.b.UInterfaceAlpha(paramString1, paramString2);
      if (a1 != null) this.e.put(c(paramString1, paramString2), a1);
      if (a1 instanceof k) ((k) a1).d_();
    }
    return a1;
  }

  private String[] c() {
    ArrayList arrayList = new ArrayList();
    for (g g : this.d) {
      if (g instanceof l) {
        l l = (l) g;
        arrayList.addAll(l.c());
      }
    }
    return (String[]) arrayList.toArray((Object[]) new String[arrayList.size()]);
  }

  private String c(String paramString1, String paramString2) {
    if (T.UInterfaceAlpha().c() != null && T.UInterfaceAlpha().c().c().equals(paramString1)) {
      paramString1 = "";
    } else {
      paramString1 = paramString1 + ".";
    }
    return paramString1 + paramString2;
  }

  public void UInterfaceAlpha(g paramg) {
    this.d.add(paramg);
  }

  public WInterfaceAp b() {
    return this.c;
  }

  public void UInterfaceAlpha(WInterfaceAp paramap) {
    this.c = paramap;
    this.b.UInterfaceAlpha(paramap);
  }

  public void UInterfaceAlpha(String paramString) {
    b(paramString);
    this.e.clear();
  }

  public void b(String paramString) {
    if (this.c != null) {
      StringBuilder stringBuilder = new StringBuilder();
      Collection collection = e.UInterfaceAlpha().UInterfaceAlpha(paramString);
      for (UInterfaceAlpha a1 : collection) stringBuilder.append(a1.UInterfaceAlpha()).append("|");
      String str = c(paramString, "ActiveTriggers");
      this.c.UInterfaceAlpha(str, stringBuilder.toString());
    } else {
      D.d("No Persistor set, not saving active triggers.");
    }
  }

  protected void c(String paramString) {
    if (this.c != null) {
      String str1 = c(paramString, "ActiveTriggers");
      String str2 = "";
      String[] arrayOfString1 = c();
      if (arrayOfString1 != null) for (String str : arrayOfString1) str2 = str2 + str + "|";
      String str3 = this.c.b(str1, str2);
      String[] arrayOfString2 = str3.split("\\|");
      for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
        if (!arrayOfString2[b1].equals("")) {
          UInterfaceAlpha a1 = b(paramString, arrayOfString2[b1]);
          if (a1 != null && a1.c()) {
            e.UInterfaceAlpha().UInterfaceAlpha(paramString, a1);
            D.d(
                "EventTrigger: "
                    + paramString
                    + "."
                    + arrayOfString2[b1]
                    + " loaded and activated.");
          } else {
            D.d("EventTrigger: " + paramString + "." + arrayOfString2[b1] + " not active.");
          }
        }
      }
      d(paramString);
    } else {
      D.d("No Persistor set, not activating persisted triggers.");
    }
  }

  private void d(String paramString) {
    for (m m : this.UInterfaceAlpha) m.UInterfaceAlpha(paramString);
  }

  public void UInterfaceAlpha(m paramm) {
    if (!this.UInterfaceAlpha.contains(paramm)) this.UInterfaceAlpha.add(paramm);
  }

  public void UInterfaceAlpha(R paramR) {
    c c = new c(this, paramR);
    c.start();
  }

  public void b(R paramR) {}

  public void c(R paramR) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
