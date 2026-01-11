package bh;

import G.R;
import G.aG;
import G.bT;
import W.j;
import aE.a;
import ac.c;
import ac.f;
import ac.r;
import ao.aX;
import ao.bq;
import ao.hx;
import ao.u;
import bH.D;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fC;
import h.i;
import java.awt.BorderLayout;
import java.io.File;
import java.util.Properties;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class b extends aX implements aG, f, bc {
  n n = null;
  
  private R q = null;
  
  File o = null;
  
  private int r = 0;
  
  private boolean s = false;
  
  k p = new k(this);
  
  public b() {
    c.a().a(this);
    boolean bool = i.a("hideSelector", i.q);
    e(bool);
  }
  
  protected JPanel e() {
    return this.n;
  }
  
  public void close() {
    h();
    if (this.n != null) {
      this.n.close();
      this.n.getParent().remove(this.n);
      this.n = null;
    } 
    if (bq.a().k() != null)
      bq.a().k().d(); 
    hx.a().B();
  }
  
  public boolean b(boolean paramBoolean) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    if (this.n == null && a.A() != null) {
      dQ dQ = new dQ((Properties)a.A(), "logTuningPanel");
      this.n = new n(w(), (et)dQ);
      if (n().r() != null);
      fC fC = new fC();
      fC.a(new c(this));
      jPanel.add("Center", this.n);
      this.n.setVisible(paramBoolean);
      String str = i.a(i.N, i.R);
      boolean bool = (str.equals(i.P) || str.equals(i.O)) ? true : false;
      if (bool) {
        this.n.a(this.b.d());
        q().setBottomComponent(jPanel);
      } else {
        q().setBottomComponent(jPanel);
      } 
      e(str);
      this.l = true;
    } 
    try {
      this.n.setVisible(paramBoolean);
    } catch (Exception exception) {}
    if (paramBoolean) {
      u();
    } else {
      q().setDividerLocation(1.0D);
    } 
    i.c("showTuningConsole", "" + paramBoolean);
    n().a(new d(this));
    return paramBoolean;
  }
  
  public void u() {
    if (this.n != null && i.a("showTuningConsole", i.p)) {
      double d = i.a(i.X, -1.0D);
      if (d < 0.05D || d > 0.97D) {
        int i = (getWidth() / 2 < (this.n.getPreferredSize()).width) ? (getWidth() / 2) : (this.n.getPreferredSize()).width;
        q().setDividerLocation(getWidth() - i - q().getDividerSize());
      } else {
        q().setDividerLocation(d);
      } 
    } else {
      q().setDividerLocation(1.0D);
    } 
  }
  
  public R w() {
    return this.q;
  }
  
  public void a(R paramR) {
    this.q = paramR;
    if (this.n != null) {
      remove(this.n);
      this.n = null;
    } 
    b(i.a("showTuningConsole", i.p));
    if (r.a()) {
      this.s = true;
      c.a().a(this);
    } 
  }
  
  public void e(boolean paramBoolean) {
    n().a(paramBoolean);
    i.c("hideSelector", paramBoolean + "");
  }
  
  public boolean a(String paramString, bT parambT) {
    return true;
  }
  
  public void a(String paramString) {}
  
  public void a(double paramDouble) {
    if (this.s && n().r() != null && n().r().d() > 0 && n().r().d() < 500) {
      e e = new e(this);
      SwingUtilities.invokeLater(e);
      this.s = false;
    } 
    super.a(paramDouble);
  }
  
  public void a(File paramFile) {
    this.o = paramFile;
    f(true);
  }
  
  private int x() {
    return c.a().r() + 7;
  }
  
  private void y() {
    double d = U.b.a(this.q);
    if (d > 0.0D) {
      int i = hx.a().r().d() - 1;
      j j = hx.a().r().a("Time");
      int m = x();
      if (j != null && i > m + 1) {
        float f1 = j.d(i) - j.d(m);
        float f2 = j.d(m) - j.d(0);
        double d1 = ((i - m) / f1);
        int i1 = (int)((d - f2) * d1) + m;
        a(i1);
        D.c("Predictive Scaling Graph for " + i1 + " in time period of " + d);
      } else if (j != null && i > 0) {
        float f1 = j.d(i) - j.d(0);
        double d1 = (i / f1);
        int i1 = (int)(d * d1);
        a(i1);
        D.c("Predictive Scaling Graph for " + i1 + " in time period of " + d);
      } else {
        D.b("Could not get time column or stabilizationRecords not reached. currentRecord=" + i + ", stabilizationRecords=" + m);
      } 
    } 
  }
  
  public void c() {
    if (this.r++ == 12 + c.a().r()) {
      f f1 = new f(this);
      g g = new g(this, f1);
      g.start();
    } else if (this.r > 0 && this.r < 500 && this.r % 100 == 0) {
      if (i.a(i.U, i.V))
        SwingUtilities.invokeLater(this.p); 
    } else if (this.s && r.a() && this.r > 20 && this.r < 500 && !hx.a().D() && hx.a().r() != null && hx.a().r().a("Time") != null) {
      hx.a().c(hx.a().r().d() - 1);
      hx.a().e();
      D.d("Playback found stopped during data log capture, restarting.");
    } else {
      bq.a().c().i();
      bq.a().c().repaint();
    } 
    if (hx.a().r() != null && this.r < 50 && this.r == x() + 16)
      SwingUtilities.invokeLater(this.p); 
  }
  
  public void d() {
    this.r = 0;
    if (s() != null)
      s().c(); 
    if (hx.a().r() != null && hx.a().r().d() > 10 && i.a(i.U, i.V)) {
      int i = hx.a().r().d();
      a(i);
      D.c("Scaling Graph for " + i);
      hx.a().j();
      hx.a().c(i / 2);
    } 
  }
  
  public void b(String paramString) {}
  
  public void f(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public void e(String paramString) {
    if (paramString.equals(i.O)) {
      this.n.a(this.b.d());
      this.n.a(0);
      this.b.doLayout();
      h h = new h(this);
      SwingUtilities.invokeLater(h);
      hx.a().c(true);
      q().setDividerLocation(getWidth() - eJ.a(320));
      r().setDividerLocation(1.0D);
    } else if (paramString.equals(i.P)) {
      this.n.a(this.b.d());
      this.n.a(1);
      this.b.doLayout();
      i i = new i(this);
      SwingUtilities.invokeLater(i);
      hx.a().c(true);
      r().setDividerLocation(1.0D);
    } else {
      this.b.a(this.b.d());
      this.n.a(2);
      j j = new j(this);
      int i = ((this.b.getPreferredSize()).height > getHeight() / 5) ? (getHeight() * 4 / 5) : (getHeight() - (this.b.getPreferredSize()).height - r().getDividerSize());
      r().setDividerLocation(i);
      SwingUtilities.invokeLater(j);
    } 
    validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */