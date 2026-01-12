package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import bN.BnInterfaceKilo;
import bN.BnInterfaceTango;
import bQ.BqInterfaceIndia;
import bS.ExceptionInBsPackage;
import java.util.ArrayList;
import java.util.List;

public class EventPacketProcessor implements BqInterfaceIndia {
  List a = new ArrayList();

  public int a() {
    return 253;
  }

  public void a(F paramF, BnInterfaceKilo paramk, BnInterfaceTango paramt) {
    if (paramt.a() != a())
      throw new ExceptionInBsPackage(
          "PID:EVENT_PACKET Wrong handler! this handler is for 0x"
              + Integer.toHexString(a()).toUpperCase());
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new ExceptionInBsPackage("PID:EVENT_PACKET valid packet data not found.");
    if (arrayOfByte1.length < 1)
      throw new ExceptionInBsPackage(
          "PID:EVENT_PACKET invalid packet data length, expected at least 2 byte, found: "
              + (arrayOfByte1.length + 1));
    int j = bH.c.a(arrayOfByte1[0]);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 1];
    a(j, arrayOfByte2);
  }

  private void a(int paramInt, byte[] paramArrayOfbyte) {
    for (d d : this.a) d.a(paramInt, paramArrayOfbyte);
  }

  public void a(d paramd) {
    this.a.add(paramd);
  }

  public void b(d paramd) {
    this.a.remove(paramd);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
