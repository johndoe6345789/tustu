package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import G.GComponentCx;
import G.R;
import G.T;
import bH.c;
import bN.BnInterfaceKilo;
import bN.BnInterfaceTango;
import bS.ExceptionInBsPackage;
import java.util.ArrayList;
import java.util.List;

public class PageRefreshHandler {
  BnInterfaceKilo a = null;

  final List b = new ArrayList();

  boolean c = true;

  public void a(F paramF, BnInterfaceKilo paramk, BnInterfaceTango paramt) {
    R r = T.a().c(paramF.u());
    if (r == null) throw new ExceptionInBsPackage("Invalid EcuConfiguration: " + paramF.u());
    if (paramt.a() != 252)
      throw new ExceptionInBsPackage("Invalid Service Request Packet: " + paramt.toString());
    byte[] arrayOfByte = paramt.c();
    if (c.a(arrayOfByte[0]) != 224)
      throw new ExceptionInBsPackage("Invalid packet for Refresh Command: " + paramt.toString());
    if (arrayOfByte.length < 2)
      throw new ExceptionInBsPackage("Device Required: " + paramt.toString());
    if (arrayOfByte.length < 3)
      throw new ExceptionInBsPackage("Page Required: " + paramt.toString());
    int i = c.a(arrayOfByte[2]);
    int m = -1;
    int n = -1;
    int i1 = c.a(arrayOfByte[2]);
    if (arrayOfByte.length >= 5) m = c.a(arrayOfByte, 3, 2, paramk.g(), false);
    if (arrayOfByte.length >= 7) n = c.a(arrayOfByte, 5, 2, paramk.g(), false);
    if (this.c) {
      if (m >= 0 && n > 0) {
        a(r, i, m, n);
      } else {
        a(r, i);
      }
    } else if (m >= 0 && n > 0) {
      GComponentCx.a(r, i, m, n);
    } else {
      GComponentCx.a(r, i);
    }
  }

  private void a(R paramR, int paramInt) {
    for (l l1 : this.b) {
      if (l1.a(paramR, paramInt, 0, 0)) {
        a().a();
        return;
      }
    }
    synchronized (this.b) {
      for (byte b = 0; b < this.b.size(); b++) {
        l l1 = this.b.get(b);
        if (l1.a().equals(paramR) && paramInt == l1.b()) {
          this.b.remove(b);
          b--;
        }
      }
    }
    l l = new l(this, paramR, paramInt);
    a().a(l);
  }

  private void a(R paramR, int paramInt1, int paramInt2, int paramInt3) {
    for (l l1 : this.b) {
      if (l1.a(paramR, paramInt1, paramInt2, paramInt3)) {
        a().a();
        return;
      }
    }
    l l = new l(this, paramR, paramInt1, paramInt2, paramInt3);
    synchronized (this.b) {
      for (byte b = 0; b < this.b.size(); b++) {
        l l1 = this.b.get(b);
        if (l1.a().equals(paramR) && l.a(paramR, l1.b(), l1.c(), l1.d())) {
          this.b.remove(b);
          b--;
        }
      }
    }
    a().a(l);
  }

  private BnInterfaceKilo a() {
    if (this.a == null) {
      this.a = new BnInterfaceKilo(this);
      this.a.start();
    }
    return this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
