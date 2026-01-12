package com.efiAnalytics.tunerStudio.search;

import B.i;
import B.k;

class IpSearchEventListener implements k {
  IpSearchEventListener(ContinuousIpSearchPanel paramContinuousIpSearchPanel) {}

  public void a(i parami) {
    String str = ContinuousIpSearchPanel.access$200(this.a, parami);
    f f = (f) this.a.j.get(str);
    if (f == null) {
      f = new f();
      this.a.j.put(str, f);
      ContinuousIpSearchPanel.access$300(this.a);
    }
    boolean bool = (f.f() == null || !f.f().equals(parami)) ? true : false;
    f.a(parami);
    f.a(System.currentTimeMillis());
    this.a.c.b(f);
    if (bool) this.a.c.a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
