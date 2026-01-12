package com.efiAnalytics.tunerStudio.panels;

import V.ExceptionInVPackage;
import W.n;
import java.util.ArrayList;

class DataPageList extends ArrayList {
  int ExceptionInVPackage = 0;

  DataPageList(TriggerLoggerPanel paramTriggerLoggerPanel) {}

  public boolean ExceptionInVPackage(n paramn) {
    if (paramn == null) return false;
    super.add(paramn);
    while (size() > d()) remove(0);
    return true;
  }

  public n ExceptionInVPackage(int paramInt) {
    if (paramInt >= 0 && paramInt < size()) {
      this.ExceptionInVPackage = paramInt;
      return (n) get(paramInt);
    }
    throw new ExceptionInVPackage(
        "Not ExceptionInVPackage valid data page for the currently loaded log. " + paramInt);
  }

  public n ExceptionInVPackage() {
    if (this.ExceptionInVPackage < size() - 1) {
      this.ExceptionInVPackage++;
      return (n) get(this.ExceptionInVPackage);
    }
    return null;
  }

  public n b() {
    if (this.ExceptionInVPackage > 0) {
      this.ExceptionInVPackage--;
      return (n) get(this.ExceptionInVPackage);
    }
    return null;
  }

  public void clear() {
    this.ExceptionInVPackage = -1;
    super.clear();
    this.b.af.clear();
    this.b.ag = 0;
  }

  public int c() {
    return this.ExceptionInVPackage;
  }

  public int d() {
    return TriggerLoggerPanel.S;
  }

  public n e() {
    this.ExceptionInVPackage = size() - 1;
    return (n) get(this.ExceptionInVPackage);
  }

  public n f() {
    this.ExceptionInVPackage = 0;
    return (n) get(this.ExceptionInVPackage);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
