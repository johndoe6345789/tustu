package be;

import G.R;
import G.T;
import G.aH;
import G.ac;
import G.ah;
import V.ExceptionPrintstacktrace;
import aP.dd;
import aP.NetworkHashMap;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fL;
import com.efiAnalytics.ui.fS;
import java.awt.Component;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import s.ExceptionPrintstacktrace;

public class BeComponentAlpha implements fS {
  private fL d = new fL(null, ExceptionPrintstacktrace.d());
  
  c a = new c(this.c);
  
  T b;
  
  R c = T.a().c();
  
  public BeComponentAlpha() {
    this.a.a(this.c);
    this.d.e(this.a);
    this.b = new T(this.c);
    this.d.e(this.b);
    this.d.a(this);
  }
  
  public boolean b() {
    aH aH = null;
    ac ac = null;
    ah ah = null;
    try {
      aH = this.a.b();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      bV.d(ExceptionPrintstacktrace.b("Problem with OutputChannel, Message:") + "\n" + ExceptionPrintstacktrace.getLocalizedMessage(), (Component)this.d);
      return false;
    } 
    try {
      ac = this.b.b();
    } catch (V.a a1) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      bV.d(ExceptionPrintstacktrace.b("Problem with Data log Field, Message:") + "\n" + a1.getLocalizedMessage(), (Component)this.d);
      return false;
    } 
    try {
      ah = this.b.c();
    } catch (V.a a1) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      bV.d(ExceptionPrintstacktrace.b("Problem with Gauge Template, Message:") + "\n" + a1.getLocalizedMessage(), (Component)this.d);
      return false;
    } 
    if (ah != null) {
      ah.s(true);
      this.c.a(ah);
    } 
    if (ac != null) {
      ac.s(true);
      this.c.a(ac);
    } 
    if (aH != null) {
      aH.s(true);
      this.c.a(aH);
    } 
    return NetworkHashMap.a().b(this.c);
  }
  
  public void c() {}
  
  public boolean a(Container paramContainer) {
    return paramContainer.equals(this.a) ? this.a.a() : (paramContainer.equals(this.b) ? this.b.a() : true);
  }
  
  public boolean b(Container paramContainer) {
    if (paramContainer.equals(this.b))
      try {
        this.b.a(this.a.b().aL());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      }  
    return true;
  }
  
  public void a() {
    JDialog jDialog = this.d.a(dd.a().c(), ExceptionPrintstacktrace.b("Add a new Channel"), false);
    jDialog.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */