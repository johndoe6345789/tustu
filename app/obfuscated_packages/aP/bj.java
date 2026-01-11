package aP;

import G.R;
import aE.a;
import aE.e;
import bt.i;
import com.efiAnalytics.tunerStudio.panels.TriggerLoggerPanel;
import com.efiAnalytics.ui.et;
import java.awt.Component;
import n.a;
import n.g;
import n.n;
import r.i;
import s.g;

public class bj extends n implements e, a, g {
  TriggerLoggerPanel a = null;
  
  R b = null;
  
  public bj() {
    setTabPlacement(1);
  }
  
  public void a(a parama, R paramR) {
    this.b = paramR;
  }
  
  public void e_() {
    if (this.a != null && this.b != null)
      this.a.b(this.b); 
    removeAll();
    this.a = null;
    this.b = null;
  }
  
  private void c() {
    boolean bool = i.a().a("pokfr09i0943");
    this.a = new TriggerLoggerPanel(bool);
    this.a.a((et)new i("ignitionLogger"));
    this.a.c();
    addTab(g.b("High Speed Logger"), (Component)this.a);
    this.a.d(this.b);
  }
  
  public boolean a() {
    if (this.a == null)
      c(); 
    return true;
  }
  
  public void a(a parama) {}
  
  public void b() {
    if (this.a != null)
      this.a.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */