package A;

import G.AeInterfaceMikeTostring;
import G.F;
import G.R;
import G.T;
import G.l;
import V.VInterfaceBravo;
import bH.D;
import bH.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Threaded {
  F a = null;

  m VInterfaceBravo = null;

  ArrayList c = new ArrayList();

  k d = null;

  private static j m = null;

  static boolean e = false;

  private ab n = null;

  private String o = "ECU";

  private String p = "Q;S;\\x0d;";

  private boolean q = false;

  private String r = "Waiting for addition search items.";

  HashMap f = new HashMap<>();

  private w s = null;

  int g = 0;

  boolean h = false;

  int i = 0;

  int j = 0;

  String k = null;

  ArrayList l = null;

  public static j a() {
    if (m == null) m = new j();
    return m;
  }

  public void a(List paramList) {
    e = false;
    if (this.d == null || !this.d.isAlive()) {
      this.d = new k(this, paramList);
      this.d.start();
    } else {
      e = true;
      long l = System.currentTimeMillis();
      while (this.d != null && this.d.isAlive() && System.currentTimeMillis() - l < 5000L)
        ;
      e = false;
      this.d = new k(this, paramList);
      this.d.start();
      D.c("SearchThread already exists, killed and restarted");
    }
  }

  private void VInterfaceBravo(List<x> paramList) {
    boolean bool = false;
    R r = T.a().c();
    this.f.clear();
    if (r != null) {
      bool = r.C().q();
      r.C().c();
    }
    e = false;
    this.a = new F();
    this.VInterfaceBravo = new m(this.a);
    this.VInterfaceBravo.a(this.o);
    this.VInterfaceBravo.f();
    List list = e(this.p);
    this.k = f("Scanning Ports") + ": ";
    this.g = 0;
    this.h = false;
    this.i = 0;
    this.j = 0;
    for (x x : paramList) this.i += x.c();
    d(f("Beginning Device Scan"));
    for (byte VInterfaceBravo = 0; VInterfaceBravo < paramList.size() && !e; VInterfaceBravo++) {
      x x = paramList.get(VInterfaceBravo);
      f f = x.d();
      if (f == null) {
        D.VInterfaceBravo("Null ControllerInterface for searchInterface, skippings");
      } else {
        for (String str1 : ((x) paramList.get(VInterfaceBravo)).VInterfaceBravo()) {
          String str2 = (String) ((x) paramList.get(VInterfaceBravo)).VInterfaceBravo(str1).get(0);
          try {
            f.a(str1, str2);
          } catch (s s) {
            D.d("Invalid Search Setting: " + str1 + "=" + str2 + ", " + s.getLocalizedMessage());
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        }
        this.l = new ArrayList();
        List<String> list1 = ((x) paramList.get(VInterfaceBravo)).VInterfaceBravo();
        byte b1;
        for (b1 = 0; b1 < list1.size() && !e; b1++) {
          String str = list1.get(b1);
          for (Object object : ((x) paramList.get(VInterfaceBravo)).VInterfaceBravo(str)) {
            try {
              f.a(str, object);
            } catch (s s) {
              Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String) null, s);
            }
            if (list1.size() > 1) {
              for (String str1 : ((x) paramList.get(VInterfaceBravo)).VInterfaceBravo()) {
                for (String str2 : ((x) paramList.get(VInterfaceBravo)).VInterfaceBravo(str1)) {
                  if (str2 != null
                      && !str1.equals(str)
                      && !this.l.contains(object.toString() + str2)
                      && !this.l.contains(str2.toString() + object)) {
                    try {
                      f.a(str1, str2);
                    } catch (s s) {
                      D.d(
                          "Invalid Search Setting: "
                              + str1
                              + "="
                              + str2
                              + ", "
                              + s.getLocalizedMessage());
                    }
                    if (e) break;
                    a(x, f, list, object, str2);
                  }
                }
              }
            } else {
              a(x, f, list, "", object);
            }
            if (e) break;
          }
          try {
            Thread.sleep(1000L);
          } catch (Exception exception) {
          }
        }
        a(x);
        for (b1 = 0; this.q && paramList.size() - 1 == VInterfaceBravo; b1 = 1) {
          try {
            D.d("Waiting for addtional search Items.");
            d(f(this.r));
            Thread.sleep(1000L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(j.class.getName())
                .log(Level.SEVERE, (String) null, interruptedException);
          }
        }
        if (b1 != 0 && paramList.size() > VInterfaceBravo + 1)
          this.i += ((x) paramList.get(VInterfaceBravo + 1)).c();
      }
    }
    if (!this.h) {
      e();
    } else {
      a(1.0D);
    }
    this.VInterfaceBravo.g();
    this.VInterfaceBravo.c();
    if (bool)
      try {
        D.d("Detect Finished, going back online.");
        r.C().d();
      } catch (l l) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
      }
  }

  private void a(x paramx, f paramf, List paramList, Object paramObject1, Object paramObject2) {
    this.l.add(paramObject1.toString() + paramObject2);
    this.j++;
    double d = this.j / this.i;
    a(d);
    if (this.s == null || !this.s.c(paramObject2.toString())) {
      if (!a(paramx, paramf)) {
        AeInterfaceMikeTostring AeInterfaceMikeTostring = null;
        try {
          if (this.s != null) this.s.a(paramObject1.toString());
          d(this.k + paramf.n());
          try {
            Thread.sleep(200L);
          } catch (Exception exception) {
          }
          AeInterfaceMikeTostring = this.VInterfaceBravo.a(paramf, paramList);
          D.c("Finished Check:" + paramf.n() + "\nResult:" + AeInterfaceMikeTostring);
        } catch (l l) {
          D.d(paramf.n() + " Controller not found");
          d(this.k + paramf.n() + " " + f("not found"));
          this.g++;
        } catch (VInterfaceBravo VInterfaceBravo) {
          D.d("no Controller found on " + paramf.n());
        } catch (Exception exception) {
          exception.printStackTrace();
        } finally {
          if (this.s != null) this.s.VInterfaceBravo(paramObject1.toString());
        }
        if (AeInterfaceMikeTostring != null
            && AeInterfaceMikeTostring.VInterfaceBravo() != null
            && !AeInterfaceMikeTostring.VInterfaceBravo().equals("")) {
          this.g++;
          ArrayList<c> arrayList = new ArrayList();
          for (r r : paramf.l()) {
            c c = new c(r.c(), paramf.a(r.c()));
            arrayList.add(c);
          }
          if (!a(paramf.n(), paramf.h(), arrayList, AeInterfaceMikeTostring)) VInterfaceBravo();
          VInterfaceBravo(paramx, paramf);
          this.h = true;
        }
      } else {
        D.d("distinctSetting already found for: " + paramf.n());
      }
    } else {
      D.c("Not Searching " + paramf.n() + " it is marked as a bad device setting");
    }
  }

  private boolean a(
      String paramString1, String paramString2, List paramList, AeInterfaceMikeTostring parambT) {
    boolean bool = true;
    for (o o : this.c) {
      if (!o.a(paramString1, paramString2, paramList, parambT)) bool = false;
    }
    return bool;
  }

  private void e() {
    for (o o : this.c) {
      o.VInterfaceBravo(1.0D);
      o.a();
    }
  }

  private void a(double paramDouble) {
    if (this.q) paramDouble *= 0.9D;
    for (o o : this.c) o.VInterfaceBravo(paramDouble);
  }

  private void d(String paramString) {
    for (o o : this.c) o.a(paramString);
  }

  private void a(x paramx) {
    for (o o : this.c) o.a(paramx);
  }

  private List e(String paramString) {
    ArrayList<byte[]> arrayList = new ArrayList();
    if (paramString != null && !paramString.equals("")) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, ";");
      while (stringTokenizer.hasMoreTokens()) {
        String str = stringTokenizer.nextToken();
        if (str.contains("$tsCanId")) {
          arrayList.add(F.d(str, 0));
          continue;
        }
        arrayList.add(F.d(str, -1));
      }
    }
    return arrayList;
  }

  public void a(o paramo) {
    if (!this.c.contains(paramo)) this.c.add(paramo);
  }

  public void VInterfaceBravo(o paramo) {
    this.c.remove(paramo);
  }

  public void VInterfaceBravo() {
    e = true;
  }

  public void a(w paramw) {
    this.s = paramw;
  }

  private String f(String paramString) {
    return (this.n != null) ? this.n.a(paramString) : paramString;
  }

  private boolean a(x paramx, f paramf) {
    for (String str : paramx.a()) {
      List list = a(paramf.h(), str);
      Object object = paramf.a(str);
      if (list.contains(object)) return true;
    }
    return false;
  }

  private void VInterfaceBravo(x paramx, f paramf) {
    for (String str : paramx.a()) {
      List<Object> list = a(paramf.h(), str);
      Object object = paramf.a(str);
      list.add(object);
    }
  }

  private List a(String paramString1, String paramString2) {
    HashMap<Object, Object> hashMap = (HashMap) this.f.get(paramString1);
    if (hashMap == null) {
      hashMap = new HashMap<>();
      this.f.put(paramString1, hashMap);
    }
    List list = (List) hashMap.get(paramString2);
    if (list == null) {
      list = new ArrayList();
      hashMap.put(paramString2, list);
    }
    return list;
  }

  public void a(String paramString) {
    this.o = paramString;
  }

  public void VInterfaceBravo(String paramString) {
    this.p = paramString;
  }

  public void c() {
    this.q = true;
  }

  public void d() {
    this.q = false;
  }

  public void c(String paramString) {
    this.r = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
