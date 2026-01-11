package bP;

import G.R;
import G.T;
import G.cI;
import bH.D;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BnInterfaceOscar;
import bU.BuInterfaceGolf;

public class BpInterfaceBravo implements cI {
  BnInterfaceOscar a;
  
  public BpInterfaceBravo(BnInterfaceOscar paramo) {
    this.a = paramo;
  }
  
  public void a(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    try {
      a(r, paramString2);
    } catch (BnInterfaceOscar o1) {
      D.c("Failed to send Slave SERV Refresh Pc var packet: " + o1.getLocalizedMessage());
    } 
  }
  
  private void a(R paramR, String paramString) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(252);
    byte[] arrayOfByte1 = paramString.getBytes();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 2];
    arrayOfByte2[0] = -29;
    arrayOfByte2[1] = (byte)BuInterfaceGolf.b;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, arrayOfByte1.length);
    TostringInBnPackage.b(arrayOfByte2);
    this.a.a((BnInterfaceTango)TostringInBnPackage);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bP/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */