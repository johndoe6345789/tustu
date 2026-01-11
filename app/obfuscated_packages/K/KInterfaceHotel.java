package K;

import G.R;
import G.S;
import G.T;
import G.cx;
import G.q;
import S.SInterfaceAlpha;
import S.SInterfaceDelta;
import S.SInterfaceEcho;
import bH.D;

public class KInterfaceHotel implements S, SInterfaceDelta {
  private cx SInterfaceDelta;
  
  S.h SInterfaceAlpha;
  
  R b;
  
  int c;
  
  public KInterfaceHotel(R paramR, int paramInt, String paramString) {
    this.b = paramR;
    this.c = paramInt;
    this.SInterfaceDelta = new cx(paramR);
    this.SInterfaceAlpha = new S.h();
    this.SInterfaceAlpha.g("TriggeredPage " + (paramInt + 1) + " Refresh: " + paramString);
    this.SInterfaceAlpha.SInterfaceEcho(paramString);
    this.SInterfaceAlpha.f("!(" + paramString + ")");
    this.SInterfaceAlpha.SInterfaceAlpha(this);
    if (T.SInterfaceAlpha().c(paramR.c()) != null) {
      try {
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(paramR.c(), (SInterfaceAlpha)this.SInterfaceAlpha);
      } catch (q q) {
        D.SInterfaceAlpha("EcuConfiguration '" + paramR.c() + "' not loaded, cannot add TriggeredPageRead: " + this.SInterfaceAlpha.SInterfaceAlpha());
      } 
    } else {
      T.SInterfaceAlpha().SInterfaceAlpha(this);
    } 
  }
  
  public void SInterfaceAlpha() {
    this.SInterfaceDelta.SInterfaceAlpha(this.c);
  }
  
  public void b() {}
  
  public void SInterfaceAlpha(R paramR) {}
  
  public void b(R paramR) {}
  
  public void c(R paramR) {
    if (paramR.c().equals(this.b.c()))
      try {
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(this.b.c(), (SInterfaceAlpha)this.SInterfaceAlpha);
      } catch (q q) {
        D.SInterfaceAlpha("EcuConfiguration '" + this.b.c() + "' not loaded, cannot add TriggeredPageRead: " + this.SInterfaceAlpha.SInterfaceAlpha());
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */