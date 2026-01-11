package com.efiAnalytics.apps.ts.dashboard;

import java.io.Serializable;
import java.util.ArrayList;

public class DataHistoryBuffer extends ArrayList implements Serializable {
  private int a = 200;
  
  public void a(double paramDouble) {
    add(0, (E)new Double(paramDouble));
    while (size() > 0 && size() >= a())
      remove(size() - 1); 
  }
  
  public double a(int paramInt) {
    if (size() > 0) {
      Double double_ = (Double)get(paramInt);
      return double_.doubleValue();
    } 
    return Double.NaN;
  }
  
  public int a() {
    return this.a;
  }
  
  public void b(int paramInt) {
    this.a = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */