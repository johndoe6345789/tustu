package y;

import C.a;
import G.R;
import G.aT;
import G.cq;
import G.cu;
import G.v;
import V.a;
import bH.A;
import bH.D;

public class b extends f implements cq {
  R a = null;
  
  aT b = null;
  
  boolean c = false;
  
  v d = null;
  
  long e = 0L;
  
  int f = 0;
  
  int g = 50;
  
  int h = 4;
  
  int i = 0;
  
  private static boolean v = false;
  
  boolean j = false;
  
  public static void a(boolean paramBoolean) {
    v = paramBoolean;
  }
  
  public b(R paramR, aT paramaT) {
    super(paramR.c(), paramaT);
    this.b = paramaT;
    this.a = paramR;
    try {
      cu.a().a(paramR.c(), "rpm", this);
    } catch (a a) {
      D.a("OutputChannel 'rpm' not found!", (Exception)a, null);
    } 
  }
  
  public int a(v paramv) {
    this.d = paramv;
    return 1966;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!v && !this.c && this.f >= this.g && System.currentTimeMillis() - this.e > 5000L && paramDouble == 0.0D && this.d != null) {
      if (!this.a.C().a(Thread.currentThread())) {
        cu.a().a(false);
        this.j = true;
        return;
      } 
      boolean bool = false;
      try {
        if (super.a(this.d) != A.i().c()) {
          this.i++;
          if (this.i >= this.h) {
            D.a(a.d);
            this.b.a(this.a.c(), a.d);
            this.i = 0;
            this.a.C().c();
          } 
        } else {
          this.i = 0;
        } 
      } catch (Exception exception) {
        D.c("Handled Exception 111199");
      } finally {
        if (this.j) {
          cu.a().a(true);
          this.j = false;
          return;
        } 
      } 
    } 
    if (paramDouble == 0.0D) {
      this.f++;
    } else {
      this.f = 0;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/y/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */