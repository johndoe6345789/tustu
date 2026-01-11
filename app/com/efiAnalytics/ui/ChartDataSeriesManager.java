package com.efiAnalytics.ui;

import java.util.ArrayList;

class ChartDataSeriesManager {
  ArrayList a = new ArrayList();
  
  aV(aU paramaU) {}
  
  public ArrayList a(int paramInt) {
    if (this.a.size() <= paramInt)
      for (int i = this.a.size(); i <= paramInt; i++)
        this.a.add(new ArrayList());  
    return this.a.get(paramInt);
  }
  
  public void a(int paramInt, aZ paramaZ) {
    a(paramInt).add(paramaZ);
  }
  
  public void a(int paramInt1, int paramInt2, aZ paramaZ) {
    a(paramInt2).add(paramInt1, paramaZ);
  }
  
  public int a() {
    return this.a.size();
  }
  
  public void b() {
    this.a.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */