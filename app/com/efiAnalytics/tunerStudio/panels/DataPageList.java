package com.efiAnalytics.tunerStudio.panels;

import V.a;
import W.n;
import java.util.ArrayList;

class DataPageList extends ArrayList {
  int a = 0;
  
  DataPageList(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public boolean a(n paramn) {
    if (paramn == null)
      return false; 
    super.add(paramn);
    while (size() > d())
      remove(0); 
    return true;
  }
  
  public n a(int paramInt) {
    if (paramInt >= 0 && paramInt < size()) {
      this.a = paramInt;
      return (n)get(paramInt);
    } 
    throw new a("Not a valid data page for the currently loaded log. " + paramInt);
  }
  
  public n a() {
    if (this.a < size() - 1) {
      this.a++;
      return (n)get(this.a);
    } 
    return null;
  }
  
  public n b() {
    if (this.a > 0) {
      this.a--;
      return (n)get(this.a);
    } 
    return null;
  }
  
  public void clear() {
    this.a = -1;
    super.clear();
    this.b.af.clear();
    this.b.ag = 0;
  }
  
  public int c() {
    return this.a;
  }
  
  public int d() {
    return TriggerLoggerPanel.S;
  }
  
  public n e() {
    this.a = size() - 1;
    return (n)get(this.a);
  }
  
  public n f() {
    this.a = 0;
    return (n)get(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */