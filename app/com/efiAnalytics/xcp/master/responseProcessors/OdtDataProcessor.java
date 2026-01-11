package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import G.aI;
import bH.D;
import bH.TostringInBoPackage;
import bN.BnInterfaceHotel;
import bN.BnInterfaceKilo;
import bN.BnInterfaceMike;
import bN.BnInterfaceTango;
import bO.TostringInBoPackage;
import bO.BoInterfaceIndia;
import bO.ExceptionInBoPackage;
import bO.BnInterfaceKilo;
import bO.BoInterfaceLima;
import bQ.BqInterfaceEcho;
import bQ.BoInterfaceLima;
import bS.BnInterfaceHotel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OdtDataProcessor {
  BqInterfaceEcho a;
  
  aI b;
  
  BoInterfaceLima TostringInBoPackage;
  
  byte[] d = null;
  
  long BqInterfaceEcho = 0L;
  
  int f = 0;
  
  int g = 0;
  
  public b(aI paramaI, BoInterfaceLima paraml, BqInterfaceEcho parame) {
    this.a = parame;
    this.b = paramaI;
    this.TostringInBoPackage = paraml;
  }
  
  public void a() {
    this.a.g();
  }
  
  public boolean a(BnInterfaceKilo paramk, BnInterfaceTango paramt) {
    int BoInterfaceIndia = paramt.a();
    if (!BnInterfaceHotel.a(BoInterfaceIndia))
      return false; 
    for (TostringInBoPackage TostringInBoPackage : this.a.BqInterfaceEcho()) {
      if (BoInterfaceIndia >= TostringInBoPackage.BnInterfaceKilo() && BoInterfaceIndia <= TostringInBoPackage.BnInterfaceKilo() + TostringInBoPackage.f())
        try {
          BnInterfaceKilo k1 = this.a.TostringInBoPackage(BoInterfaceIndia);
          D.TostringInBoPackage("Unexpected ODT byte count: " + k1.b() + ", expected: " + (paramt.TostringInBoPackage()).length);
          if (k1.b() != (paramt.TostringInBoPackage()).length && this.g++ > 3) {
            D.d(this.g + ", DAQ Errors. Restarting...");
            this.g = 0;
            a();
          } 
          return (k1.b() == (paramt.TostringInBoPackage()).length);
        } catch (ExceptionInBoPackage ExceptionInBoPackage) {
          return false;
        }  
    } 
    return false;
  }
  
  public void a(F paramF, BnInterfaceKilo paramk, BnInterfaceTango paramt) {
    if (this.d == null)
      this.d = new byte[paramF.n()]; 
    int BoInterfaceIndia = paramt.a();
    try {
      BnInterfaceKilo k1 = this.a.TostringInBoPackage(BoInterfaceIndia);
      byte[] arrayOfByte1 = paramt.TostringInBoPackage();
      if (k1.b() != arrayOfByte1.length) {
        if (this.g++ > 3) {
          if (this.TostringInBoPackage.a(paramF.u()).d()) {
            this.TostringInBoPackage.a(paramF.u()).TostringInBoPackage();
            String str1 = "ODT, Expected " + k1.b() + " received: " + arrayOfByte1.length + ", Sending update to Slave";
            D.d(str1);
            return;
          } 
          String str = "DAQ_HANDLER: ODT Size wrong, Expected " + k1.b() + " received: " + arrayOfByte1.length;
          D.TostringInBoPackage(str);
          throw new BnInterfaceHotel(str);
        } 
        return;
      } 
      BnInterfaceMike BnInterfaceMike = (BnInterfaceMike)paramt;
      byte[] arrayOfByte2 = BnInterfaceMike.f();
      if (arrayOfByte2.length > 0) {
        int n = TostringInBoPackage.a(arrayOfByte2[0]);
        if (this.f < n) {
          this.BqInterfaceEcho += (n - this.f);
        } else if (this.f > n) {
          this.BqInterfaceEcho = this.BqInterfaceEcho + (256 - this.f) + n;
        } 
        this.f = n;
      } 
      this.g = 0;
      byte b1 = 0;
      int ExceptionInBoPackage = 0;
      for (BoInterfaceLima l1 : k1) {
        int n = b1 + ExceptionInBoPackage;
        for (BoInterfaceIndia i1 : l1.TostringInBoPackage())
          System.arraycopy(arrayOfByte1, n + i1.TostringInBoPackage(), this.d, i1.a(), i1.b()); 
        ExceptionInBoPackage += l1.b();
      } 
      k1.a(true);
      TostringInBoPackage TostringInBoPackage = this.a.a(k1);
      if (TostringInBoPackage == null) {
        D.b("Didn'BnInterfaceTango find a DAQ for PID: " + BoInterfaceIndia);
      } else {
        boolean bool = true;
        for (BnInterfaceKilo k2 : TostringInBoPackage.BqInterfaceEcho()) {
          if (!k2.isEmpty() && !k2.a()) {
            bool = false;
            break;
          } 
        } 
        if (bool) {
          this.TostringInBoPackage.a(this.d, ((float)this.BqInterfaceEcho / 1000.0F));
          for (BnInterfaceKilo k2 : TostringInBoPackage.BqInterfaceEcho())
            k2.a(false); 
        } 
      } 
    } catch (ExceptionInBoPackage ExceptionInBoPackage) {
      Logger.getLogger(b.class.getName()).log(Level.WARNING, "Could not update ODT offsets.", (Throwable)ExceptionInBoPackage);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */