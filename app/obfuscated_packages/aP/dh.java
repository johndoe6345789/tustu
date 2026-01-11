package aP;

import G.R;
import V.a;
import aE.a;
import aE.e;
import ac.r;
import ao.hx;
import ap.b;
import ap.c;
import bH.D;
import com.efiAnalytics.apps.ts.tuningViews.J;
import com.efiAnalytics.ui.cO;
import i.f;
import i.g;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import n.a;

public class dh extends JPanel implements e, a {
  R a = null;
  
  cc b = null;
  
  a c = null;
  
  private Image f = null;
  
  dk d = null;
  
  public static String e = "Log File Review";
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.d != null && this.d.a) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = c();
      if (image != null) {
        int i = image.getWidth(null) / 2;
        int j = image.getHeight(null) / 2;
        int k = (getWidth() - i) / 2;
        int m = (getHeight() - j) / 2;
        paramGraphics.drawImage(image, k, m, i, j, null);
      } 
    } 
  }
  
  protected Image c() {
    if (this.f == null)
      try {
        this.f = cO.a().a(cO.w);
      } catch (a a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
    return this.f;
  }
  
  public void d() {
    e();
    this.d = new dk(this);
    this.d.start();
  }
  
  public void e() {
    if (this.d != null) {
      this.d.a();
      this.d = null;
    } 
  }
  
  public void a(a parama, R paramR) {
    this.a = paramR;
    this.c = parama;
    if (this.b != null)
      this.b.a(parama, paramR); 
  }
  
  public void e_() {
    this.a = null;
    this.c = null;
    if (this.b != null)
      this.b.e_(); 
  }
  
  public boolean a() {
    boolean bool = (this.b == null) ? true : false;
    try {
      if (bool) {
        d();
        g.a().a((f)new c());
        g.a().a((f)new b());
        g.a().b();
        di di = new di(this);
        dj dj = new dj(this, di);
        dj.start();
      } 
      D.c("Activate Logging Tabs");
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
    if (bool && r.a() && hx.a().r() != null) {
      hx.a().e();
      hx.a().c(hx.a().r().d() - 1);
    } 
    return true;
  }
  
  public void a(a parama) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */