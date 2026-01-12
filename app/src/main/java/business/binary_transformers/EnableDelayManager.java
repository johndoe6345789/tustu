package business.binary_transformers;

import G.GInterfaceAb;
import G.R;
import G.S;
import G.T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EnableDelayManager implements S, GInterfaceAb {
  private static e d = null;

  HashMap a = new HashMap<>();

  List b = Collections.synchronizedList(new ArrayList());

  f c = null;

  public static e a() {
    if (d == null) {
      d = new e();
      String[] arrayOfString = T.a().d();
      for (String str : arrayOfString) {
        R r = T.a().c(str);
        r.h().a(d);
      }
      T.a().a(d);
    }
    return d;
  }

  public void a(String paramString, bh parambh) {
    List<bh> list = c(paramString);
    list.add(parambh);
    b(paramString);
  }

  public boolean b(String paramString, bh parambh) {
    List list = c(paramString);
    return list.remove(parambh);
  }

  public void a(String paramString) {
    this.a.remove(paramString);
  }

  private List c(String paramString) {
    List list = (List) this.a.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramString, list);
    }
    return list;
  }

  public synchronized void b(String paramString) {
    this.b.add(paramString);
    if (this.c != null) {
      this.c.a();
    } else {
      this.c = new f(this);
      this.c.a();
      this.c.start();
    }
  }

  public void b() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.b);
    this.b.clear();
    for (String str : arrayList) {
      List list = c(str);
      try {
        for (bh bh : list) {
          bh.a();
          bh.b();
        }
      } catch (Exception exception) {
      }
    }
  }

  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    b(paramString);
  }

  public void a(R paramR) {}

  public void b(R paramR) {
    paramR.h().b(d);
  }

  public void c(R paramR) {
    paramR.h().a(d);
    a(paramR.c());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
