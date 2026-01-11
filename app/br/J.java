package br;

import G.R;
import G.de;
import G.dm;
import W.ab;
import aE.a;
import aE.e;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.dQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import r.a;
import r.j;

public class J implements e {
  private static J b = null;
  
  HashMap a = new HashMap<>();
  
  public static J a() {
    if (b == null)
      b = new J(); 
    return b;
  }
  
  public ArrayList a(R paramR) {
    Iterator<String> iterator = paramR.L();
    if (!iterator.hasNext()) {
      c(paramR);
      iterator = paramR.L();
    } 
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  public ArrayList b(R paramR) {
    Iterator<String> iterator = paramR.M();
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  public dm a(R paramR, String paramString) {
    dm dm = paramR.r(paramString);
    if (dm != null)
      return dm; 
    c(paramR);
    return paramR.r(paramString);
  }
  
  public de b(R paramR, String paramString) {
    de de = paramR.s(paramString);
    return (de != null) ? de : paramR.s(paramString);
  }
  
  private void c(R paramR) {
    String str = paramR.i();
    if (str.startsWith("MS3")) {
      String str1 = j.o;
      d(paramR, str1);
    } else if (str.startsWith("MS2Extra")) {
      String str1 = j.p;
      d(paramR, str1);
    } else if (str.startsWith("MS/Extra") || str.startsWith("MS1/Extra") || str.startsWith("MSnS-extra")) {
      String str1 = j.n;
      d(paramR, str1);
    } else if (str.startsWith("MSII Rev")) {
      String str1 = j.q;
      d(paramR, str1);
    } else if (str.startsWith("20")) {
      String str1 = j.m;
      d(paramR, str1);
    } else if (str.startsWith("Monsterfirmware")) {
      String str1 = j.r;
      d(paramR, str1);
    } else if (str.startsWith("BigStuff Gen4")) {
      String str1 = j.s;
      d(paramR, str1);
    } 
  }
  
  private void d(R paramR, String paramString) {
    boolean bool = (a.a().c(a.bq, a.br) && a.a().c(a.bs, a.bt)) ? true : false;
    if (!bool) {
      ab ab = new ab();
      ab.a(paramR, paramString, false);
    } 
  }
  
  public c c(R paramR, String paramString) {
    String str = paramR.c() + "." + paramString;
    if (!this.a.containsKey(str)) {
      dQ dQ = new dQ((Properties)a.A(), str);
      c c = new c();
      c.e(a(dQ, "maxPercentChange", c.e()));
      c.f(a(dQ, "baseWeight", c.h()));
      c.d(a(dQ, "maxValueChange", c.d()));
      c.c(a(dQ, "minChangeThreshold", c.c()));
      c.a(a(dQ, "weightThreshold", c.a()));
      this.a.put(str, c);
    } 
    return (c)this.a.get(str);
  }
  
  private double a(dQ paramdQ, String paramString, double paramDouble) {
    String str = paramdQ.a(paramString);
    return (str == null || str.trim().equals("")) ? paramDouble : Double.parseDouble(str);
  }
  
  public void a(a parama, R paramR) {}
  
  public void e_() {
    this.a.clear();
  }
  
  public void a(a parama) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */