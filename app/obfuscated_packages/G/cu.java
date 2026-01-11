package G;

import V.a;
import V.g;
import bH.A;
import bH.D;
import bH.c;
import bQ.l;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class cu implements aF {
  private static cu e = null;
  
  private final ConcurrentHashMap f = new ConcurrentHashMap<>();
  
  private final ConcurrentHashMap g = new ConcurrentHashMap<>();
  
  private final ArrayList h = new ArrayList();
  
  private final ConcurrentHashMap i = new ConcurrentHashMap<>();
  
  private final ConcurrentHashMap j = new ConcurrentHashMap<>();
  
  private final ConcurrentHashMap k = new ConcurrentHashMap<>();
  
  private final List l = new ArrayList();
  
  private cw m = null;
  
  private boolean n = true;
  
  public static String a = "Application Events";
  
  public static String b = "AppEvent.";
  
  private boolean o = false;
  
  List c = new ArrayList();
  
  int d = 0;
  
  public static cu a() {
    if (e == null && A.i().b())
      e = new cu(); 
    return e;
  }
  
  public ConcurrentHashMap a(String paramString) {
    return (ConcurrentHashMap)this.f.get(paramString);
  }
  
  public int b(String paramString) {
    return a(paramString).keySet().size();
  }
  
  public ArrayList a(String paramString1, String paramString2) {
    ConcurrentHashMap concurrentHashMap = a(paramString1);
    return (ArrayList)concurrentHashMap.get(paramString2);
  }
  
  protected ArrayList c(String paramString) {
    ArrayList arrayList = (ArrayList)this.g.get(paramString);
    if (arrayList == null) {
      arrayList = new ArrayList();
      this.g.put(paramString, arrayList);
    } 
    return arrayList;
  }
  
  public void d(String paramString) {
    if (!this.h.contains(paramString))
      this.h.add(paramString); 
  }
  
  public boolean e(String paramString) {
    return this.h.contains(paramString);
  }
  
  public void f(String paramString) {
    this.h.remove(paramString);
  }
  
  public String[] b() {
    return (String[])this.h.toArray((Object[])new String[this.h.size()]);
  }
  
  public void a(String paramString, dj paramdj) {
    this.j.put(paramString, paramdj);
  }
  
  public boolean a(String paramString, cq paramcq) {
    ArrayList<cq> arrayList = c(paramString);
    boolean bool = arrayList.isEmpty();
    if (!arrayList.contains(paramcq))
      arrayList.add(paramcq); 
    Double double_ = (Double)this.i.get(paramString);
    if (double_ != null)
      a(paramString, double_.doubleValue()); 
    return bool;
  }
  
  public double g(String paramString) {
    dj dj = (dj)this.j.get(paramString);
    if (dj != null)
      return dj.a(); 
    Double double_ = (Double)this.i.get(paramString);
    return (double_ != null) ? double_.doubleValue() : Double.NaN;
  }
  
  public List h(String paramString) {
    cp cp = (cp)this.k.get(paramString);
    if (cp != null) {
      ConcurrentHashMap concurrentHashMap = a(paramString);
      return (concurrentHashMap != null) ? cp.a(concurrentHashMap.keySet()) : null;
    } 
    return null;
  }
  
  private cp b(R paramR) {
    cp cp = (cp)this.k.get(paramR.c());
    if (cp == null) {
      cp = new cp(paramR);
      cp.a(paramR.O());
      if (paramR.C() instanceof l) {
        l l = (l)paramR.C();
        cp.b((co)l.a(paramR.c()));
      } else if (paramR.O().Z() != null) {
        cp.b(new cT(paramR));
      } 
      this.k.put(paramR.c(), cp);
    } 
    return cp;
  }
  
  public void a(String paramString, List paramList, cq paramcq) {
    boolean bool = false;
    for (String str : paramList) {
      if (b(paramString, str, paramcq) && !bool)
        bool = true; 
    } 
    if (!this.o) {
      R r = c().c(paramString);
      if (bool && r != null) {
        cp cp = b(r);
        cp.b();
      } 
    } else if (!this.c.contains(paramString)) {
      this.c.add(paramString);
    } 
  }
  
  public void a(String paramString1, String paramString2, cq paramcq) {
    boolean bool = b(paramString1, paramString2, paramcq);
    if (!this.o) {
      R r = c().c(paramString1);
      if (bool && r != null) {
        cp cp = b(r);
        cp.b();
      } 
    } else if (!this.c.contains(paramString1)) {
      this.c.add(paramString1);
    } 
  }
  
  private boolean b(String paramString1, String paramString2, cq paramcq) {
    boolean bool;
    if (paramString1.equals(a) || paramString1.startsWith("AppEvent")) {
      try {
        bool = a(paramString2, paramcq);
      } catch (Exception exception) {
        throw new a("Invalid OutputChannel Name: " + paramString2);
      } 
    } else {
      ConcurrentHashMap<Object, Object> concurrentHashMap = a(paramString1);
      R r = c().c(paramString1);
      if (concurrentHashMap == null) {
        if (r == null)
          throw new a("Can not subscribe to ECU Configuration " + paramString1 + "\n It does not appear to be loaded."); 
        concurrentHashMap = new ConcurrentHashMap<>();
        synchronized (this.f) {
          this.f.put(paramString1, concurrentHashMap);
        } 
      } 
      aH aH = r.g(paramString2);
      if (aH == null)
        throw new a("Can not subscribe to OutputChannel " + paramString2 + "\n It is not defined in ECU Configuration " + paramString1 + "."); 
      ArrayList<cq> arrayList = (ArrayList)concurrentHashMap.get(paramString2);
      if (arrayList == null) {
        arrayList = new ArrayList();
        synchronized (concurrentHashMap) {
          concurrentHashMap.put(paramString2, arrayList);
        } 
      } 
      bool = arrayList.isEmpty();
      synchronized (arrayList) {
        arrayList.add(paramcq);
      } 
    } 
    return bool;
  }
  
  public void a(R paramR) {
    cp cp = b(paramR);
    cp.b();
  }
  
  public void a(cq paramcq) {
    boolean bool = false;
    synchronized (this.f) {
      for (ConcurrentHashMap concurrentHashMap : this.f.values()) {
        Iterator<ArrayList> iterator = concurrentHashMap.values().iterator();
        while (iterator.hasNext()) {
          ArrayList arrayList = iterator.next();
          synchronized (arrayList) {
            while (arrayList.remove(paramcq)) {
              if (!bool)
                bool = true; 
            } 
            if (arrayList.isEmpty())
              iterator.remove(); 
          } 
        } 
      } 
    } 
    synchronized (this.g) {
      for (ArrayList arrayList : this.g.values()) {
        while (arrayList.contains(paramcq)) {
          if (arrayList.remove(paramcq) && !bool)
            bool = true; 
        } 
      } 
    } 
    if (bool)
      for (cp cp : this.k.values())
        cp.b();  
  }
  
  public void i(String paramString) {
    synchronized (this.f) {
      this.f.remove(paramString);
    } 
    R r = T.a().c(paramString);
    cp cp = b(r);
    cp.a();
    this.k.remove(paramString);
  }
  
  public void a(String paramString, double paramDouble) {
    if (this.n) {
      if (this.m == null || !this.m.isAlive()) {
        this.m = new cw(this, null);
        this.m.start();
      } 
      this.m.a(paramString, paramDouble);
    } else {
      b(paramString, paramDouble);
    } 
  }
  
  private void b(String paramString, double paramDouble) {
    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(c(paramString));
    cq cq = null;
    for (cq cq1 : copyOnWriteArrayList) {
      try {
        cq1.setCurrentOutputChannelValue(paramString, paramDouble);
      } catch (Exception exception) {
        cq = cq1;
        this.d++;
        D.b("Caught Exception in Auxiliary OutputChannelListener: " + paramString + ", value:" + paramDouble + ", error:" + exception.getLocalizedMessage() + ", listener: " + cq1);
      } 
    } 
    if (this.d > 20 && cq != null) {
      D.b("20 failures publishing to listener, unsubscribing: " + cq);
      copyOnWriteArrayList.remove(cq);
      this.d = 0;
    } 
    this.i.put(paramString, Double.valueOf(paramDouble));
  }
  
  public void a(ct paramct) {
    this.l.add(paramct);
  }
  
  public boolean a(R paramR, aH paramaH) {
    for (ct ct : this.l) {
      if (!ct.a(paramR, paramaH))
        return false; 
    } 
    return true;
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (this.n) {
      if (this.m == null || !this.m.isAlive()) {
        this.m = new cw(this, null);
        this.m.start();
      } 
      this.m.a(paramString, paramArrayOfbyte);
    } else {
      b(paramString, paramArrayOfbyte);
    } 
  }
  
  private void b(String paramString, byte[] paramArrayOfbyte) {
    ConcurrentHashMap concurrentHashMap = a(paramString);
    if (concurrentHashMap == null)
      return; 
    R r = c().c(paramString);
    synchronized (concurrentHashMap) {
      try {
        for (String str : concurrentHashMap.keySet()) {
          aH aH = r.g(str);
          if (a(r, aH)) {
            ArrayList arrayList = (ArrayList)concurrentHashMap.get(str);
            if (arrayList != null && !arrayList.isEmpty()) {
              double d = 0.0D;
              try {
                d = aH.b(paramArrayOfbyte);
              } catch (g g) {
                D.c("Could not get value for OutputChannel:" + str);
              } catch (Exception exception) {
                if (r.R()) {
                  D.b("Failed to get value for OutputChannel: " + aH.aL() + " using och:\n" + c.d(paramArrayOfbyte));
                } else {
                  D.b("Failed to get value for OutputChannel: " + aH.aL());
                } 
              } 
              synchronized (arrayList) {
                Iterator<cq> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                  try {
                    cq cq = iterator.next();
                    cq.setCurrentOutputChannelValue(str, d);
                  } catch (Exception exception) {
                    D.c("OutputChannelListener caused Error, continuing.");
                    exception.printStackTrace();
                  } 
                } 
              } 
            } 
          } 
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {}
    } 
    h(paramString);
  }
  
  public W c() {
    return T.a();
  }
  
  public void a(String paramString1, String paramString2, double paramDouble) {
    ArrayList arrayList = a().a(paramString1, paramString2);
    if (arrayList == null)
      throw new a("EcuConfiguration and/or OutputChannel not found."); 
    for (cq cq : arrayList)
      cq.setCurrentOutputChannelValue(paramString2, paramDouble); 
  }
  
  public void a(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public void d() {
    this.o = true;
  }
  
  public void e() {
    this.o = true;
    for (String str : this.c) {
      R r = c().c(str);
      if (r != null) {
        cp cp = b(r);
        cp.b();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */