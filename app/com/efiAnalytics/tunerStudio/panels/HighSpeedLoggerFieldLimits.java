package com.efiAnalytics.tunerStudio.panels;

import W.ap;
import W.ar;
import W.j;
import W.n;
import bB.BbInterfaceAlpha;
import bB.BbInterfaceQuebec;
import bB.BbInterfaceRomeo;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import BbInterfaceRomeo.BbInterfaceAlpha;

public class HighSpeedLoggerFieldLimits implements BbInterfaceQuebec {
  private n d = null;
  
  private ap e = (ap)new ar((BbInterfaceAlpha.BbInterfaceAlpha()).an, "HighSpeedLoggerFieldLimits");
  
  static String BbInterfaceAlpha = "Min";
  
  static String b = "Max";
  
  List c = new ArrayList();
  
  public void BbInterfaceAlpha(BbInterfaceRomeo paramr) {
    if (paramr.c()) {
      this.e.BbInterfaceAlpha(BbInterfaceAlpha + paramr.e(), Double.toString(Double.NaN));
    } else {
      this.e.BbInterfaceAlpha(BbInterfaceAlpha + paramr.e(), Double.toString(paramr.BbInterfaceAlpha()));
    } 
    if (paramr.d()) {
      this.e.BbInterfaceAlpha(b + paramr.e(), Double.toString(Double.NaN));
    } else {
      this.e.BbInterfaceAlpha(b + paramr.e(), Double.toString(paramr.b()));
    } 
    BbInterfaceAlpha(paramr.e(), paramr.BbInterfaceAlpha(), paramr.b());
  }
  
  private void BbInterfaceAlpha(String paramString, double paramDouble1, double paramDouble2) {
    for (U u : this.c)
      u.BbInterfaceAlpha(paramString, paramDouble1, paramDouble2); 
  }
  
  public void BbInterfaceAlpha(U paramU) {
    this.c.add(paramU);
  }
  
  public void BbInterfaceAlpha(String paramString) {
    this.e.BbInterfaceAlpha(BbInterfaceAlpha + paramString, Double.toString(Double.NaN));
    this.e.BbInterfaceAlpha(b + paramString, Double.toString(Double.NaN));
    BbInterfaceAlpha(paramString, Double.NaN, Double.NaN);
  }
  
  public double c(String paramString) {
    double d = Double.NaN;
    try {
      d = Double.parseDouble(this.e.b(BbInterfaceAlpha + paramString, Double.toString(Double.NaN)));
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
  
  public List BbInterfaceAlpha() {
    ArrayList<BbInterfaceAlpha> arrayList = new ArrayList();
    for (j j : c()) {
      double d1 = Double.NaN;
      double d2 = Double.NaN;
      try {
        d1 = c(j.BbInterfaceAlpha());
        d2 = d(j.BbInterfaceAlpha());
      } catch (Exception exception) {
        D.b("Unable to load Chart Min/Max");
      } 
      BbInterfaceAlpha BbInterfaceAlpha = new BbInterfaceAlpha();
      BbInterfaceAlpha.BbInterfaceAlpha(j.BbInterfaceAlpha());
      BbInterfaceAlpha.BbInterfaceAlpha(d1);
      BbInterfaceAlpha.b(d2);
      arrayList.add(BbInterfaceAlpha);
    } 
    return arrayList;
  }
  
  public List b() {
    ArrayList<String> arrayList = new ArrayList();
    for (j j : c()) {
      if (!arrayList.contains(j.BbInterfaceAlpha())) {
        D.c("Adding: " + j.BbInterfaceAlpha());
        arrayList.add(j.BbInterfaceAlpha());
      } 
    } 
    return arrayList;
  }
  
  public n c() {
    return this.d;
  }
  
  public void BbInterfaceAlpha(n paramn) {
    this.d = paramn;
  }
  
  public BbInterfaceRomeo b(BbInterfaceRomeo paramr) {
    return null;
  }
  
  public BbInterfaceRomeo b(String paramString) {
    BbInterfaceAlpha BbInterfaceAlpha = new BbInterfaceAlpha();
    BbInterfaceAlpha.BbInterfaceAlpha(paramString);
    BbInterfaceAlpha.BbInterfaceAlpha(c(paramString));
    BbInterfaceAlpha.b(d(paramString));
    return (BbInterfaceRomeo)BbInterfaceAlpha;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */