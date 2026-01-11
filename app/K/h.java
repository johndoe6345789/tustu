package K;

import G.R;
import G.S;
import G.T;
import G.cx;
import G.q;
import S.a;
import S.d;
import S.e;
import bH.D;

public class h implements S, d {
  private cx d;
  
  S.h a;
  
  R b;
  
  int c;
  
  public h(R paramR, int paramInt, String paramString) {
    this.b = paramR;
    this.c = paramInt;
    this.d = new cx(paramR);
    this.a = new S.h();
    this.a.g("TriggeredPage " + (paramInt + 1) + " Refresh: " + paramString);
    this.a.e(paramString);
    this.a.f("!(" + paramString + ")");
    this.a.a(this);
    if (T.a().c(paramR.c()) != null) {
      try {
        e.a().a(paramR.c(), (a)this.a);
      } catch (q q) {
        D.a("EcuConfiguration '" + paramR.c() + "' not loaded, cannot add TriggeredPageRead: " + this.a.a());
      } 
    } else {
      T.a().a(this);
    } 
  }
  
  public void a() {
    this.d.a(this.c);
  }
  
  public void b() {}
  
  public void a(R paramR) {}
  
  public void b(R paramR) {}
  
  public void c(R paramR) {
    if (paramR.c().equals(this.b.c()))
      try {
        e.a().a(this.b.c(), (a)this.a);
      } catch (q q) {
        D.a("EcuConfiguration '" + this.b.c() + "' not loaded, cannot add TriggeredPageRead: " + this.a.a());
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */