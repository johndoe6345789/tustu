package bQ;

import G.R;
import G.T;
import G.aB;
import G.aG;
import G.aH;
import G.bT;
import G.co;
import G.cu;
import G.m;
import G.w;
import bH.D;
import bN.k;
import bO.a;
import bO.c;
import bO.i;
import bO.k;
import bO.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class u implements aG, co {
  R a = null;
  
  private k g = null;
  
  private a h = null;
  
  private c i = null;
  
  int b = 0;
  
  private c j = null;
  
  private final String k;
  
  Map c = new HashMap<>();
  
  final List d = new ArrayList();
  
  x e = null;
  
  boolean f = false;
  
  public u(String paramString, k paramk, a parama) {
    this.k = paramString;
    this.g = paramk;
    this.h = parama;
  }
  
  public boolean a(String paramString, bT parambT) {
    if (this.a == null && paramString.equals(this.k))
      this.a = T.a().c(paramString); 
    if (this.d != null);
    e();
    return true;
  }
  
  private void e() {
    if (this.e == null) {
      this.e = new x(this);
      this.e.start();
    } 
    if (this.a != null && this.a.R())
      x.a(this.e); 
  }
  
  public void a(String paramString) {}
  
  public void a(List paramList) {
    this.d.clear();
    if (paramList != null)
      this.d.addAll(paramList); 
    if (paramList != null && this.a != null && this.a.R()) {
      e();
    } else if (!this.f) {
      this.f = true;
      try {
        cu.a().h(this.k);
      } finally {
        this.f = false;
      } 
    } 
  }
  
  private List b(List paramList) {
    ArrayList<k> arrayList = new ArrayList();
    if (paramList != null) {
      int i = this.h.c().a();
      int j = this.i.a();
      int m = this.i.c();
      k k1 = new k();
      arrayList.add(k1);
      l l = null;
      int n = 0;
      byte b1 = 1;
      ArrayList<aH> arrayList1 = new ArrayList();
      for (w w : paramList) {
        aH aH = a(w.a());
        arrayList1.add(aH);
      } 
      Collections.sort(arrayList1, new v(this));
      boolean bool = false;
      byte b2 = 0;
      for (aH aH : arrayList1) {
        if (aH != null) {
          if (l != null && aH.x() + aH.l() - l.a() <= i) {
            long l1 = Math.max(l.a() + l.b(), aH.x() + aH.l());
            l.a(Math.min(l.a(), aH.x()));
            n -= l.b();
            l.a((int)(l1 - l.a()));
            n += l.b();
            i i1 = new i();
            i1.a(aH.a());
            i1.b(aH.l());
            i1.c((int)(aH.x() - l.a()));
            l.a(i1);
            continue;
          } 
          l = new l();
          l.a(aH.x());
          l.a(aH.l());
          n += l.b();
          byte b = (arrayList.size() == 1) ? (this.g.a() + b1) : b1;
          if (n >= this.g.j() - b || k1.size() >= m)
            if (arrayList.size() == j) {
              if (!bool)
                D.b("ODT Full! Cannot capture all channels!"); 
              bool = true;
            } else {
              k1 = new k();
              arrayList.add(k1);
              n = 0;
            }  
          if (!bool) {
            i i1 = new i();
            i1.a(aH.a());
            i1.b(aH.l());
            i1.c((int)(aH.x() - l.a()));
            l.a(i1);
            k1.add(l);
            continue;
          } 
          D.b("ODT Full, skipping channel: " + aH.aL());
          b2++;
        } 
      } 
      c.a().a(this.h, this.d, arrayList1, arrayList, i, j, m);
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Max ODTs: ").append(j).append(", Max ODT Entries: ").append(m).append(", Max Entry Size: ").append(i).append("\n");
        stringBuilder.append(c.b(arrayList1)).append("\n");
        stringBuilder.append(c.c(arrayList)).append("\n");
        D.c(stringBuilder.toString());
        aB.a().b(this.k, "Exceeding MAX ODT's \n" + b2 + " channels will not be updated.\nSee Log for channels overflow channels");
      } 
    } 
    return arrayList;
  }
  
  private aH a(int paramInt) {
    aH aH = (aH)this.c.get(Integer.valueOf(paramInt));
    if (aH == null) {
      Iterator<aH> iterator = this.a.K().q();
      while (iterator.hasNext()) {
        aH aH1 = iterator.next();
        if (!aH1.b().equals("formula") && aH1.a() == paramInt) {
          aH = aH1;
          this.c.put(Integer.valueOf(paramInt), aH1);
          break;
        } 
      } 
    } 
    if (aH == null)
      D.b("No Channel found for offset: " + paramInt + ", cannot create ODT Entry"); 
    return aH;
  }
  
  public void a(c paramc) {
    this.i = paramc;
  }
  
  public void b(c paramc) {
    this.j = paramc;
  }
  
  public String a() {
    return this.k;
  }
  
  private void f() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.d);
    List list = b(arrayList);
    m m1 = m.c(this.a.O(), this.b);
    w w = new w(this);
    m1.b(w);
    this.a.C().b(m1);
    this.i.a(list);
    m m2 = m.b(this.a.O(), this.b);
    D.c("XcpOdtEntryManager:: updated DAQ List: " + this.i.toString());
    this.a.C().b(m2);
  }
  
  public void b() {
    x.a(this.e);
  }
  
  public void c() {
    try {
      f();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    this.e.a = -1L;
  }
  
  public boolean d() {
    return (this.e.a > 0L);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */