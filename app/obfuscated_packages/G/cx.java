package G;

import V.ExceptionPrintstacktrace;
import bH.D;

public class cx implements n {
  R a = null;
  
  private int b = 0;
  
  public cx(R paramR) {
    this.a = paramR;
  }
  
  public static void a(R paramR, int paramInt) {
    m m = m.d(paramR.O(), paramInt);
    m.b(new cx(paramR));
    paramR.C().b(m);
  }
  
  public static void a(R paramR, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 255) {
      m m = m.b(paramR.O(), paramInt1, paramInt2, paramInt3);
      cx cx1 = new cx(paramR);
      cx1.b(paramInt2);
      m.b(cx1);
      paramR.C().b(m);
    } 
  }
  
  public void a(int paramInt) {
    m m = m.d(this.a.O(), paramInt);
    m.b(this);
    this.a.C().b(m);
  }
  
  public static void b(R paramR, int paramInt) {
    m m = m.d(paramR.O(), paramInt);
    m.b(new cx(paramR));
    dc dc = new dc();
    o o = dc.a(paramR, m, 500);
    if (o.a() == 3)
      D.a("Page Refresh Failed: " + o.c()); 
  }
  
  public void e() {}
  
  public void a(double paramDouble) {}
  
  public void a(o paramo) {
    R r = T.a().c(paramo.f());
    if (r == null)
      r = this.a; 
    if (paramo.a() == 1)
      try {
        boolean bool = false;
        if (bool) {
          for (byte b = 0; b < (paramo.e()).length; b++) {
            int[] arrayOfInt = new int[1];
            arrayOfInt[0] = paramo.e()[b];
            this.a.h().a(paramo.b().o(), this.b + b, arrayOfInt);
          } 
        } else {
          int[] arrayOfInt = paramo.e();
          this.a.h().a(paramo.b().o(), this.b, arrayOfInt);
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.b("failed to update local data store.");
      }  
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */