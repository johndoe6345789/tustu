package bG;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import P.PInterfaceAlpha;
import V.PInterfaceAlpha;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

public BgInterfaceCharlielass BgInterfaceCharlie implements GInterfaceAn, E, G, p {
  R PInterfaceAlpha;
  
  m b;
  
  PInterfaceAlpha c;
  
  private b ExceptionPrintstacktrace;
  
  Manager d = null;
  
  Manager e = null;
  
  Manager f = null;
  
  public BgInterfaceCharlie(R paramR, PInterfaceAlpha parama, m paramm) {
    this.PInterfaceAlpha = paramR;
    this.b = paramm;
    this.c = parama;
    this.d = paramR.c(parama.b());
    if (this.d == null)
      throw new ExceptionPrintstacktrace("BitArrayParameter not found."); 
    try {
      ManagerUsingConcurrentHashMap.PInterfaceAlpha().PInterfaceAlpha(paramR.c(), this.d.aL(), this);
    } catch (PInterfaceAlpha a1) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    if (parama.d() != null) {
      this.e = paramR.c(parama.d());
      if (this.e != null)
        try {
          ManagerUsingConcurrentHashMap.PInterfaceAlpha().PInterfaceAlpha(paramR.c(), this.e.aL(), this);
        } catch (PInterfaceAlpha a1) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        }  
    } 
    if (parama.c() != null) {
      this.f = paramR.c(parama.c());
      if (this.f != null)
        try {
          ManagerUsingConcurrentHashMap.PInterfaceAlpha().PInterfaceAlpha(paramR.c(), this.f.aL(), this);
        } catch (PInterfaceAlpha a1) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        }  
    } 
    if (paramm.e() instanceof b) {
      this.ExceptionPrintstacktrace = (b)paramm.e();
    } else {
      this.ExceptionPrintstacktrace = new b();
    } 
    e();
    paramm.PInterfaceAlpha(this.ExceptionPrintstacktrace);
    paramm.PInterfaceAlpha(this);
    this.ExceptionPrintstacktrace.PInterfaceAlpha(this);
  }
  
  private void e() {
    try {
      double[] arrayOfDouble = this.d.h(this.PInterfaceAlpha.h());
      byte[] arrayOfByte = new byte[arrayOfDouble.length];
      for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
        arrayOfByte[b1] = (byte)(int)arrayOfDouble[b1]; 
      this.ExceptionPrintstacktrace.PInterfaceAlpha(arrayOfByte);
    } catch (Exception exception) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    if (this.e != null)
      try {
        double d = this.e.ExceptionExtensionGetmessage(this.PInterfaceAlpha.h());
        this.b.PInterfaceAlpha(d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      }  
    if (this.f != null)
      try {
        double d = this.f.ExceptionExtensionGetmessage(this.PInterfaceAlpha.h());
        this.b.PInterfaceAlpha((int)d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      }  
  }
  
  public void PInterfaceAlpha() {
    byte[] arrayOfByte = this.ExceptionPrintstacktrace.c();
    double[] arrayOfDouble = new double[arrayOfByte.length];
    for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
      arrayOfDouble[b1] = arrayOfByte[b1]; 
    try {
      this.d.PInterfaceAlpha(this.PInterfaceAlpha.h(), arrayOfDouble);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      ExceptionExtensionGetmessage.printStackTrace();
    } 
  }
  
  public void b() {
    e();
    this.b.repaint();
  }
  
  public void c() {
    ManagerUsingConcurrentHashMap.PInterfaceAlpha().PInterfaceAlpha(this);
    this.b.b(this);
  }
  
  public void PInterfaceAlpha(String paramString1, String paramString2) {
    if (paramString2.equals(this.d.aL()))
      b(); 
  }
  
  public void PInterfaceAlpha(double paramDouble) {
    if (this.e != null)
      try {
        this.e.PInterfaceAlpha(this.PInterfaceAlpha.h(), paramDouble);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        if (ExceptionExtensionGetmessage.PInterfaceAlpha() == 2) {
          this.b.PInterfaceAlpha(this.e.r());
          D.d("Trigger Offset Below Min, setting to Min");
        } else if (ExceptionExtensionGetmessage.PInterfaceAlpha() == 1) {
          this.b.PInterfaceAlpha(this.e.s());
          D.d("Trigger Offset Exceeds Max, setting to Max");
        } 
      }  
  }
  
  public void d() {
    PInterfaceAlpha();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */