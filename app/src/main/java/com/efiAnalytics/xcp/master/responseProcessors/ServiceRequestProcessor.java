package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
import bN.BnInterfaceTango;
import bQ.BqInterfaceIndia;
import bS.ExceptionInBsPackage;

public class ServiceRequestProcessor implements BqInterfaceIndia {
  j a = new j();

  e b = new e();

  f c = new f();

  g d = new g();

  public void a(F paramF, BnInterfaceKilo paramk, BnInterfaceTango paramt) {
    if (paramt.a() != 252)
      throw new ExceptionInBsPackage("Invalid Service Request Packet: " + paramt.toString());
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte.length < 1)
      throw new ExceptionInBsPackage("Invalid Service Request Code: " + paramt.toString());
    int n = c.a(arrayOfByte[0]);
    if (n == 224) {
      this.a.a(paramF, paramk, paramt);
    } else if (n == 227) {
      this.d.a(paramF, paramk, paramt);
    } else if (n == 226) {
      this.c.a(paramF);
    } else if (n == 225) {
      if (arrayOfByte.length > 1) {
        if (arrayOfByte[1] == 0) {
          this.b.b();
        } else {
          this.b.a();
        }
      } else {
        D.b("Invalid SERV Online message, should have a state byte: " + c.d(arrayOfByte));
      }
    } else {
      D.b("No Response Processor for Packet: " + paramt.toString());
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
