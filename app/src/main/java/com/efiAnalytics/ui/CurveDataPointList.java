package com.efiAnalytics.ui;

import java.util.ArrayList;

class CurveDataPointList extends ArrayList {
  private String b = null;
  
  private String c = null;
  
  bQ(bN parambN) {}
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public String b() {
    return this.c;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public bQ c() {
    bQ bQ1 = new bQ(this.a);
    bQ1.b = this.b;
    bQ1.c = this.c;
    for (bP bP1 : this) {
      bP bP2 = new bP(this.a, bP1.a(), bP1.b());
      bP2.a = bP1.a;
      bP2.b = bP1.b;
      bQ1.add((E)bP2);
    } 
    return bQ1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */