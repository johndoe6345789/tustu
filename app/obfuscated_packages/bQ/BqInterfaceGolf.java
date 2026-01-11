package bQ;

import G.J;
import bH.D;
import bH.c;
import bN.BnInterfaceFoxtrot;
import bN.TostringInBnPackage;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.ExceptionInBsPackage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class BqInterfaceGolf implements BnInterfaceFoxtrot {
  long a = 0L;
  
  g(BnInterfaceFoxtrot paramf) {}
  
  public void a(BnInterfaceTango paramt) {
    if (paramt instanceof TostringInBnPackage) {
      i i = (i)this.b.j.get(Integer.valueOf(paramt.a()));
      if (i != null) {
        try {
          i.a(BnInterfaceFoxtrot.a(this.b), this.b.c, paramt);
        } catch (ExceptionInBsPackage ExceptionInBsPackage) {
          Logger.getLogger(BnInterfaceFoxtrot.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInBsPackage);
        } 
      } else {
        synchronized (BnInterfaceFoxtrot.b(this.b)) {
          BnInterfaceFoxtrot.b(this.b).add(paramt);
        } 
        synchronized (this.b.i) {
          this.b.i.notifyAll();
        } 
      } 
      if (BnInterfaceFoxtrot.c(this.b) != null)
        BnInterfaceFoxtrot.c(this.b).BnInterfaceFoxtrot(); 
    } else {
      if (BnInterfaceFoxtrot.d(this.b) != null && BnInterfaceFoxtrot.d(this.b).a(this.b.c, paramt)) {
        try {
          BnInterfaceFoxtrot.d(this.b).a(BnInterfaceFoxtrot.a(this.b), this.b.c, paramt);
        } catch (ExceptionInBsPackage ExceptionInBsPackage) {
          Logger.getLogger(BnInterfaceFoxtrot.class.getName()).log(Level.WARNING, "Unable to process DAQ Message", (Throwable)ExceptionInBsPackage);
        } 
      } else {
        if (J.I())
          D.b("Received DTO Type Packet that is unknown? DAQ Running before started?\n" + c.d(paramt.d())); 
        if (System.currentTimeMillis() - this.a > 3000L)
          this.a = System.currentTimeMillis(); 
      } 
      if (BnInterfaceFoxtrot.c(this.b) != null)
        BnInterfaceFoxtrot.c(this.b).k(); 
    } 
    if (this.b.a != null)
      this.b.a.b(); 
  }
  
  public void a(int paramInt, String paramString) {
    D.a("Message validation error: 0x" + Integer.toHexString(paramInt).toUpperCase() + ", message:" + paramString);
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    this.b.b.b();
    TostringInBnPackage.a(254);
    byte[] arrayOfByte = new byte[(paramString.getBytes()).length + 1];
    arrayOfByte[0] = (byte)paramInt;
    System.arraycopy(paramString.getBytes(), 0, arrayOfByte, 1, arrayOfByte.length - 1);
    synchronized (BnInterfaceFoxtrot.b(this.b)) {
      BnInterfaceFoxtrot.b(this.b).add(TostringInBnPackage);
    } 
    synchronized (this.b.i) {
      this.b.i.notifyAll();
    } 
  }
  
  public void a(IOException paramIOException) {}
  
  public void a() {
    BnInterfaceFoxtrot.a(this.b, (BnInterfaceFoxtrot.a(this.b) != null) ? BnInterfaceFoxtrot.a(this.b).BnInterfaceUniform() : null);
  }
  
  public void b() {
    BnInterfaceFoxtrot.b(this.b, (BnInterfaceFoxtrot.a(this.b) != null) ? BnInterfaceFoxtrot.a(this.b).BnInterfaceUniform() : null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */