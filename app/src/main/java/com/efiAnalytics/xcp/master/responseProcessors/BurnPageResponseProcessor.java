package com.efiAnalytics.xcp.master.responseProcessors;

import bH.D;
import bH.c;

public class BurnPageResponseProcessor implements EventPacketListener {
  private boolean a = false;
  
  public synchronized void a(int paramInt, byte[] paramArrayOfbyte) {
    if (paramInt == 3 && paramArrayOfbyte.length > 0) {
      if (paramArrayOfbyte[0] == 0) {
        D.d("Burn Page successful");
        this.a = true;
      } else if (paramArrayOfbyte[0] == 1) {
        D.a("Burn Page failed during erase! " + c.d(paramArrayOfbyte));
      } else if (paramArrayOfbyte[0] == 0) {
        D.a("Burn Page failed during programming: " + c.d(paramArrayOfbyte));
      } else {
        D.b("Unknown status code: " + paramArrayOfbyte[0] + ", " + c.d(paramArrayOfbyte));
      } 
      notify();
    } 
  }
  
  public boolean a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */