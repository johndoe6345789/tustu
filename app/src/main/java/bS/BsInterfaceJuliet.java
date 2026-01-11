package bS;

import bN.BnInterfaceFoxtrot;
import bN.BnInterfaceGolf;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bR.BrInterfaceCharlie;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BsInterfaceJuliet implements BnInterfaceFoxtrot, BnInterfaceGolf {
  BnInterfaceOscar a;
  
  BnInterfaceKilo b;
  
  j(BnInterfaceOscar paramo) {
    this.a = paramo;
    this.b = paramo.d();
  }
  
  public void a(BnInterfaceTango paramt) {
    a a = this.a.i().a(paramt.a());
    if (a != null) {
      try {
        a.a(this.a, paramt);
      } catch (h h) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Unhandled error processing Command", h);
        b(49, h.getLocalizedMessage());
      } catch (Exception exception) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Unhandled error processing Command", exception);
        b(49, exception.getLocalizedMessage());
      } 
    } else {
      b(32, "Unsupported Command");
    } 
    this.a.e().b();
  }
  
  private void b(int paramInt, String paramString) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(254);
    if (paramString == null)
      paramString = ""; 
    if (paramString.length() > this.b.i() - 2)
      paramString = paramString.substring(0, this.b.i() - 2); 
    byte[] arrayOfByte = new byte[paramString.length() + 1];
    arrayOfByte[0] = (byte)paramInt;
    System.arraycopy(paramString.getBytes(), 0, arrayOfByte, 1, arrayOfByte.length - 1);
    try {
      this.a.a((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public void a(int paramInt, String paramString) {
    b(paramInt, paramString);
    this.a.e().b();
  }
  
  public void a(IOException paramIOException) {}
  
  public void b(IOException paramIOException) {}
  
  public void a(BnInterfaceOscar paramo, BrInterfaceCharlie paramc) {}
  
  public void a(BrInterfaceCharlie paramc) {}
  
  public void a() {}
  
  public void b() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */