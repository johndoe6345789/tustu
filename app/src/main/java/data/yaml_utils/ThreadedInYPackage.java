package y;

import C.ExceptionInVPackage;
import G.R;
import G.GInterfaceAt;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import G.v;
import V.ExceptionInVPackage;
import bH.A;
import bH.D;

public class ThreadedInYPackage extends f implements GComponentCq {
  R ExceptionInVPackage = null;
  
  GInterfaceAt b = null;
  
  boolean c = false;
  
  v d = null;
  
  long e = 0L;
  
  int f = 0;
  
  int g = 50;
  
  int h = 4;
  
  int i = 0;
  
  private static boolean v = false;
  
  boolean j = false;
  
  public static void ExceptionInVPackage(boolean paramBoolean) {
    v = paramBoolean;
  }
  
  public ThreadedInYPackage(R paramR, GInterfaceAt paramaT) {
    super(paramR.c(), paramaT);
    this.b = paramaT;
    this.ExceptionInVPackage = paramR;
    try {
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), "rpm", this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("OutputChannel 'rpm' not found!", (Exception)ExceptionInVPackage, null);
    } 
  }
  
  public int ExceptionInVPackage(v paramv) {
    this.d = paramv;
    return 1966;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!v && !this.c && this.f >= this.g && System.currentTimeMillis() - this.e > 5000L && paramDouble == 0.0D && this.d != null) {
      if (!this.ExceptionInVPackage.C().ExceptionInVPackage(Thread.currentThread())) {
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(false);
        this.j = true;
        return;
      } 
      boolean bool = false;
      try {
        if (super.ExceptionInVPackage(this.d) != A.i().c()) {
          this.i++;
          if (this.i >= this.h) {
            D.ExceptionInVPackage(ExceptionInVPackage.d);
            this.b.ExceptionInVPackage(this.ExceptionInVPackage.c(), ExceptionInVPackage.d);
            this.i = 0;
            this.ExceptionInVPackage.C().c();
          } 
        } else {
          this.i = 0;
        } 
      } catch (Exception exception) {
        D.c("Handled Exception 111199");
      } finally {
        if (this.j) {
          ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(true);
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