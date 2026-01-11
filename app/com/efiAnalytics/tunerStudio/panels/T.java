package com.efiAnalytics.tunerStudio.panels;

import W.ap;
import W.ar;
import W.j;
import W.n;
import bB.a;
import bB.q;
import bB.r;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import r.a;

public class T implements q {
  private n d = null;
  
  private ap e = (ap)new ar((a.a()).an, "HighSpeedLoggerFieldLimits");
  
  static String a = "Min";
  
  static String b = "Max";
  
  List c = new ArrayList();
  
  public void a(r paramr) {
    if (paramr.c()) {
      this.e.a(a + paramr.e(), Double.toString(Double.NaN));
    } else {
      this.e.a(a + paramr.e(), Double.toString(paramr.a()));
    } 
    if (paramr.d()) {
      this.e.a(b + paramr.e(), Double.toString(Double.NaN));
    } else {
      this.e.a(b + paramr.e(), Double.toString(paramr.b()));
    } 
    a(paramr.e(), paramr.a(), paramr.b());
  }
  
  private void a(String paramString, double paramDouble1, double paramDouble2) {
    for (U u : this.c)
      u.a(paramString, paramDouble1, paramDouble2); 
  }
  
  public void a(U paramU) {
    this.c.add(paramU);
  }
  
  public void a(String paramString) {
    this.e.a(a + paramString, Double.toString(Double.NaN));
    this.e.a(b + paramString, Double.toString(Double.NaN));
    a(paramString, Double.NaN, Double.NaN);
  }
  
  public double c(String paramString) {
    double d = Double.NaN;
    try {
      d = Double.parseDouble(this.e.b(a + paramString, Double.toString(Double.NaN)));
    } catch (Exception exception) {
      D.b("Unable to load " + paramString + " Min/Max");
    } 
    return d;
  }
  
  public double d(String paramString) {
    double d = Double.NaN;
    try {
      d = Double.parseDouble(this.e.b(b + paramString, Double.toString(Double.NaN)));
    } catch (Exception exception) {
      D.b("Unable to load " + paramString + " Min/Max");
    } 
    return d;
  }
  
  public List a() {
    ArrayList<a> arrayList = new ArrayList();
    for (j j : c()) {
      double d1 = Double.NaN;
      double d2 = Double.NaN;
      try {
        d1 = c(j.a());
        d2 = d(j.a());
      } catch (Exception exception) {
        D.b("Unable to load Chart Min/Max");
      } 
      a a = new a();
      a.a(j.a());
      a.a(d1);
      a.b(d2);
      arrayList.add(a);
    } 
    return arrayList;
  }
  
  public List b() {
    ArrayList<String> arrayList = new ArrayList();
    for (j j : c()) {
      if (!arrayList.contains(j.a())) {
        D.c("Adding: " + j.a());
        arrayList.add(j.a());
      } 
    } 
    return arrayList;
  }
  
  public n c() {
    return this.d;
  }
  
  public void a(n paramn) {
    this.d = paramn;
  }
  
  public r b(r paramr) {
    return null;
  }
  
  public r b(String paramString) {
    a a = new a();
    a.a(paramString);
    a.a(c(paramString));
    a.b(d(paramString));
    return (r)a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */