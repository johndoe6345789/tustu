package T;

import G.GComponentCj;
import G.Manager;
import G.R;
import G.Y;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class TInterfaceEcho {
  String a;

  Y b;

  R c;

  private String ExceptionPrintstacktrace = null;

  private boolean h = false;

  List d = null;

  private List i = null;

  boolean e = false;

  Map f = new HashMap<>();

  TInterfaceEcho(String paramString, R paramR) {
    this.a = paramString;
    this.b = paramR.h();
    this.c = paramR;
  }

  public boolean a(Y paramY) {
    if (this.d == null) this.d = b();
    if (this.i != null && this.e) {
      for (Manager Manager : this.i) {
        try {
          if (Manager.i().equals("array") || Manager.i().equals("string")) {
            double[][] arrayOfDouble1 = Manager.i(paramY);
            double[][] arrayOfDouble2 = Manager.i(this.b);
            if (!c.a(arrayOfDouble1, arrayOfDouble2, Manager.v(), Manager.B())) return false;
            continue;
          }
          if (Manager.j(paramY) != Manager.j(this.b)) return false;
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.a(ExceptionPrintstacktrace.getLocalizedMessage());
        }
      }
    } else {
      for (GComponentCj GComponentCj : this.d) {
        for (int i = GComponentCj.b(); i < GComponentCj.b() + GComponentCj.c(); i++) {
          if (paramY.b(GComponentCj.a(), i) != this.b.b(GComponentCj.a(), i))
            if (GComponentCj.d()) {
              boolean bool = false;
              for (Manager Manager : a(GComponentCj)) {
                if (i >= Manager.ExceptionPrintstacktrace()
                    && i < Manager.ExceptionPrintstacktrace() + Manager.z()) {
                  bool = true;
                  try {
                    if (!Manager.f(paramY).equals(Manager.f(this.b))) return false;
                  } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
                  }
                }
              }
              if (!bool) return false;
            } else {
              return false;
            }
        }
      }
    }
    return true;
  }

  private List a(GComponentCj paramcj) {
    List<Manager> list = (List) this.f.get(paramcj);
    if (list == null) {
      list = new ArrayList();
      this.f.put(paramcj, list);
      Iterator<Manager> iterator = this.c.a(paramcj.a());
      while (iterator.hasNext()) {
        Manager Manager = iterator.next();
        if (Manager.i().equals("bits")
            && Manager.ExceptionPrintstacktrace() <= paramcj.b() + paramcj.c()
            && Manager.ExceptionPrintstacktrace() + Manager.z() > paramcj.b()) list.add(Manager);
      }
    }
    return list;
  }

  private List b() {
    ArrayList<GComponentCj> arrayList = new ArrayList();
    for (byte b = 0; b < this.b.e(); b++) {
      int[] arrayOfInt = this.b.b(b);
      GComponentCj GComponentCj = null;
      for (byte b1 = 0; b1 < arrayOfInt.length; b1++) {
        if (GComponentCj == null && arrayOfInt[b1] != Y.j) {
          GComponentCj = new GComponentCj(b);
          GComponentCj.a(b1);
        } else if (GComponentCj != null && (arrayOfInt[b1] == Y.j || b1 == arrayOfInt.length - 1)) {
          GComponentCj.b(b1 - GComponentCj.b());
          arrayList.add(GComponentCj);
          GComponentCj = null;
        }
      }
    }
    this.e = false;
    for (GComponentCj GComponentCj : arrayList) {
      Iterator<Manager> iterator = this.c.a(GComponentCj.a());
      while (iterator.hasNext()) {
        Manager Manager = iterator.next();
        if (Manager.a(GComponentCj.a(), GComponentCj.b(), GComponentCj.c())
            && Manager.i().equals("bits")) {
          this.e = true;
          GComponentCj.a(true);
        }
      }
    }
    return arrayList;
  }

  public String a() {
    return this.ExceptionPrintstacktrace;
  }

  public void a(String paramString) {
    this.ExceptionPrintstacktrace = paramString;
  }

  public void a(List paramList) {
    this.i = paramList;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/T/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
