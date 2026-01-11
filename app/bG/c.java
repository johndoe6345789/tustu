package bG;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import P.a;
import V.a;
import V.g;
import V.j;
import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c implements aN, E, G, p {
  R a;
  
  m b;
  
  a c;
  
  private b g;
  
  aM d = null;
  
  aM e = null;
  
  aM f = null;
  
  public c(R paramR, a parama, m paramm) {
    this.a = paramR;
    this.b = paramm;
    this.c = parama;
    this.d = paramR.c(parama.b());
    if (this.d == null)
      throw new g("BitArrayParameter not found."); 
    try {
      aR.a().a(paramR.c(), this.d.aL(), this);
    } catch (a a1) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    if (parama.d() != null) {
      this.e = paramR.c(parama.d());
      if (this.e != null)
        try {
          aR.a().a(paramR.c(), this.e.aL(), this);
        } catch (a a1) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        }  
    } 
    if (parama.c() != null) {
      this.f = paramR.c(parama.c());
      if (this.f != null)
        try {
          aR.a().a(paramR.c(), this.f.aL(), this);
        } catch (a a1) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        }  
    } 
    if (paramm.e() instanceof b) {
      this.g = (b)paramm.e();
    } else {
      this.g = new b();
    } 
    e();
    paramm.a(this.g);
    paramm.a(this);
    this.g.a(this);
  }
  
  private void e() {
    try {
      double[] arrayOfDouble = this.d.h(this.a.h());
      byte[] arrayOfByte = new byte[arrayOfDouble.length];
      for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
        arrayOfByte[b1] = (byte)(int)arrayOfDouble[b1]; 
      this.g.a(arrayOfByte);
    } catch (Exception exception) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    if (this.e != null)
      try {
        double d = this.e.j(this.a.h());
        this.b.a(d);
      } catch (g g) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      }  
    if (this.f != null)
      try {
        double d = this.f.j(this.a.h());
        this.b.a((int)d);
      } catch (g g) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      }  
  }
  
  public void a() {
    byte[] arrayOfByte = this.g.c();
    double[] arrayOfDouble = new double[arrayOfByte.length];
    for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
      arrayOfDouble[b1] = arrayOfByte[b1]; 
    try {
      this.d.a(this.a.h(), arrayOfDouble);
    } catch (g g) {
      g.printStackTrace();
    } catch (j j) {
      j.printStackTrace();
    } 
  }
  
  public void b() {
    e();
    this.b.repaint();
  }
  
  public void c() {
    aR.a().a(this);
    this.b.b(this);
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.equals(this.d.aL()))
      b(); 
  }
  
  public void a(double paramDouble) {
    if (this.e != null)
      try {
        this.e.a(this.a.h(), paramDouble);
      } catch (g g) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } catch (j j) {
        if (j.a() == 2) {
          this.b.a(this.e.r());
          D.d("Trigger Offset Below Min, setting to Min");
        } else if (j.a() == 1) {
          this.b.a(this.e.s());
          D.d("Trigger Offset Exceeds Max, setting to Max");
        } 
      }  
  }
  
  public void d() {
    a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */