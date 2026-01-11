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
import bN.BnInterfaceKilo;
import bO.BoInterfaceAlpha;
import bO.TostringInBoPackage;
import bO.BoInterfaceIndia;
import bO.BnInterfaceKilo;
import bO.BoInterfaceLima;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BqInterfaceUniform implements aG, co {
  R BoInterfaceAlpha = null;
  
  private BnInterfaceKilo g = null;
  
  private BoInterfaceAlpha h = null;
  
  private TostringInBoPackage BoInterfaceIndia = null;
  
  int b = 0;
  
  private TostringInBoPackage j = null;
  
  private final String BnInterfaceKilo;
  
  Map TostringInBoPackage = new HashMap<>();
  
  final List d = new ArrayList();
  
  x e = null;
  
  boolean f = false;
  
  public BqInterfaceUniform(String paramString, BnInterfaceKilo paramk, BoInterfaceAlpha parama) {
    this.BnInterfaceKilo = paramString;
    this.g = paramk;
    this.h = parama;
  }
  
  public boolean BoInterfaceAlpha(String paramString, bT parambT) {
    if (this.BoInterfaceAlpha == null && paramString.equals(this.BnInterfaceKilo))
      this.BoInterfaceAlpha = T.BoInterfaceAlpha().TostringInBoPackage(paramString); 
    if (this.d != null);
    e();
    return true;
  }
  
  private void e() {
    if (this.e == null) {
      this.e = new x(this);
      this.e.start();
    } 
    if (this.BoInterfaceAlpha != null && this.BoInterfaceAlpha.R())
      x.BoInterfaceAlpha(this.e); 
  }
  
  public void BoInterfaceAlpha(String paramString) {}
  
  public void BoInterfaceAlpha(List paramList) {
    this.d.clear();
    if (paramList != null)
      this.d.addAll(paramList); 
    if (paramList != null && this.BoInterfaceAlpha != null && this.BoInterfaceAlpha.R()) {
      e();
    } else if (!this.f) {
      this.f = true;
      try {
        cu.BoInterfaceAlpha().h(this.BnInterfaceKilo);
      } finally {
        this.f = false;
      } 
    } 
  }
  
  private List b(List paramList) {
    ArrayList<BnInterfaceKilo> arrayList = new ArrayList();
    if (paramList != null) {
      int BoInterfaceIndia = this.h.TostringInBoPackage().BoInterfaceAlpha();
      int j = this.BoInterfaceIndia.BoInterfaceAlpha();
      int m = this.BoInterfaceIndia.TostringInBoPackage();
      BnInterfaceKilo k1 = new BnInterfaceKilo();
      arrayList.add(k1);
      BoInterfaceLima BoInterfaceLima = null;
      int n = 0;
      byte b1 = 1;
      ArrayList<aH> arrayList1 = new ArrayList();
      for (w w : paramList) {
        aH aH = BoInterfaceAlpha(w.BoInterfaceAlpha());
        arrayList1.add(aH);
      } 
      Collections.sort(arrayList1, new v(this));
      boolean bool = false;
      byte b2 = 0;
      for (aH aH : arrayList1) {
        if (aH != null) {
          if (BoInterfaceLima != null && aH.x() + aH.BoInterfaceLima() - BoInterfaceLima.BoInterfaceAlpha() <= BoInterfaceIndia) {
            long l1 = Math.max(BoInterfaceLima.BoInterfaceAlpha() + BoInterfaceLima.b(), aH.x() + aH.BoInterfaceLima());
            BoInterfaceLima.BoInterfaceAlpha(Math.min(BoInterfaceLima.BoInterfaceAlpha(), aH.x()));
            n -= BoInterfaceLima.b();
            BoInterfaceLima.BoInterfaceAlpha((int)(l1 - BoInterfaceLima.BoInterfaceAlpha()));
            n += BoInterfaceLima.b();
            BoInterfaceIndia i1 = new BoInterfaceIndia();
            i1.BoInterfaceAlpha(aH.BoInterfaceAlpha());
            i1.b(aH.BoInterfaceLima());
            i1.TostringInBoPackage((int)(aH.x() - BoInterfaceLima.BoInterfaceAlpha()));
            BoInterfaceLima.BoInterfaceAlpha(i1);
            continue;
          } 
          BoInterfaceLima = new BoInterfaceLima();
          BoInterfaceLima.BoInterfaceAlpha(aH.x());
          BoInterfaceLima.BoInterfaceAlpha(aH.BoInterfaceLima());
          n += BoInterfaceLima.b();
          byte b = (arrayList.size() == 1) ? (this.g.BoInterfaceAlpha() + b1) : b1;
          if (n >= this.g.j() - b || k1.size() >= m)
            if (arrayList.size() == j) {
              if (!bool)
                D.b("ODT Full! Cannot capture all channels!"); 
              bool = true;
            } else {
              k1 = new BnInterfaceKilo();
              arrayList.add(k1);
              n = 0;
            }  
          if (!bool) {
            BoInterfaceIndia i1 = new BoInterfaceIndia();
            i1.BoInterfaceAlpha(aH.BoInterfaceAlpha());
            i1.b(aH.BoInterfaceLima());
            i1.TostringInBoPackage((int)(aH.x() - BoInterfaceLima.BoInterfaceAlpha()));
            BoInterfaceLima.BoInterfaceAlpha(i1);
            k1.add(BoInterfaceLima);
            continue;
          } 
          D.b("ODT Full, skipping channel: " + aH.aL());
          b2++;
        } 
      } 
      TostringInBoPackage.BoInterfaceAlpha().BoInterfaceAlpha(this.h, this.d, arrayList1, arrayList, BoInterfaceIndia, j, m);
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Max ODTs: ").append(j).append(", Max ODT Entries: ").append(m).append(", Max Entry Size: ").append(BoInterfaceIndia).append("\n");
        stringBuilder.append(TostringInBoPackage.b(arrayList1)).append("\n");
        stringBuilder.append(TostringInBoPackage.TostringInBoPackage(arrayList)).append("\n");
        D.TostringInBoPackage(stringBuilder.toString());
        aB.BoInterfaceAlpha().b(this.BnInterfaceKilo, "Exceeding MAX ODT's \n" + b2 + " channels will not be updated.\nSee Log for channels overflow channels");
      } 
    } 
    return arrayList;
  }
  
  private aH BoInterfaceAlpha(int paramInt) {
    aH aH = (aH)this.TostringInBoPackage.get(Integer.valueOf(paramInt));
    if (aH == null) {
      Iterator<aH> iterator = this.BoInterfaceAlpha.K().q();
      while (iterator.hasNext()) {
        aH aH1 = iterator.next();
        if (!aH1.b().equals("formula") && aH1.BoInterfaceAlpha() == paramInt) {
          aH = aH1;
          this.TostringInBoPackage.put(Integer.valueOf(paramInt), aH1);
          break;
        } 
      } 
    } 
    if (aH == null)
      D.b("No Channel found for offset: " + paramInt + ", cannot create ODT Entry"); 
    return aH;
  }
  
  public void BoInterfaceAlpha(TostringInBoPackage paramc) {
    this.BoInterfaceIndia = paramc;
  }
  
  public void b(TostringInBoPackage paramc) {
    this.j = paramc;
  }
  
  public String BoInterfaceAlpha() {
    return this.BnInterfaceKilo;
  }
  
  private void f() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.d);
    List list = b(arrayList);
    m m1 = m.TostringInBoPackage(this.BoInterfaceAlpha.O(), this.b);
    w w = new w(this);
    m1.b(w);
    this.BoInterfaceAlpha.C().b(m1);
    this.BoInterfaceIndia.BoInterfaceAlpha(list);
    m m2 = m.b(this.BoInterfaceAlpha.O(), this.b);
    D.TostringInBoPackage("XcpOdtEntryManager:: updated DAQ List: " + this.BoInterfaceIndia.toString());
    this.BoInterfaceAlpha.C().b(m2);
  }
  
  public void b() {
    x.BoInterfaceAlpha(this.e);
  }
  
  public void TostringInBoPackage() {
    try {
      f();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    this.e.BoInterfaceAlpha = -1L;
  }
  
  public boolean d() {
    return (this.e.BoInterfaceAlpha > 0L);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */