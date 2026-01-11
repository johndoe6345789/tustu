package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.be;
import G.bi;
import G.i;
import V.a;
import V.g;
import V.j;
import aE.a;
import ai.b;
import ai.d;
import ai.e;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.T;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.bt;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.eM;
import com.efiAnalytics.ui.eR;
import com.efiAnalytics.ui.eS;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import n.n;
import r.a;
import r.i;
import s.g;

public class Table2DEditorPanel extends JPanel implements aN, e, bc, eS {
  private R q;
  
  JSplitPane a = new JSplitPane();
  
  eM b = null;
  
  be c = null;
  
  bt d = null;
  
  aM e = null;
  
  aM f = null;
  
  aM g = null;
  
  bO h = null;
  
  String i = "";
  
  et j = null;
  
  String k = null;
  
  String l = null;
  
  private int r = eJ.a(300);
  
  private int s = eJ.a(800);
  
  private int t = eJ.a(440);
  
  n m = null;
  
  x n = null;
  
  x o = null;
  
  static String p = "_histogram";
  
  private bP u = null;
  
  public W(R paramR, bi parambi, boolean paramBoolean) {
    this(paramR, parambi, paramBoolean, (et)null);
  }
  
  public W(R paramR, bi parambi, boolean paramBoolean, et paramet) {
    if (paramet == null)
      paramet = new Z(this); 
    this.j = paramet;
    boolean bool = i.a().a("oijfdsaoij98oi43");
    this.d = new bt(bool, new X(this));
    this.q = paramR;
    try {
      this.c = (be)paramR.e().c(parambi.a());
      this.b = this.d.h();
    } catch (Exception exception) {
      D.b("Unable to get 3D table layout by name: " + parambi.a());
    } 
    a(paramR, parambi);
    this.i = parambi.aL();
    setLayout(new BorderLayout());
    this.a.setOrientation(1);
    this.d.b(parambi.c());
    this.d.a(parambi.b());
    if (a.a().a(a.bV, a.bW) && (this.j.a("colorTheme") == null || this.j.a("colorTheme").isEmpty()))
      this.j.a("colorTheme", bt.l); 
    this.d.a(this.j);
    this.d.d();
    if (paramBoolean) {
      this.n = new x(paramR);
      this.n.setName(this.i + "_Cluster");
      T t = this.n.X();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)t);
      if (i.a().a("64865e43s5hjhcurd")) {
        this.m = new n();
        this.m.setTabPlacement(3);
        this.a.setTopComponent((Component)this.m);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.n);
        this.m.addTab(g.b("Standard"), jPanel);
        this.n.setMinimumSize(new Dimension(1, 150));
        this.o = new x(paramR);
        this.o.setName(this.i + "_HistogramCluster");
        t = this.o.X();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)t);
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.o);
        this.m.addTab(g.b("Histogram"), jPanel);
        this.o.setMinimumSize(new Dimension(1, 150));
      } else {
        this.a.setTopComponent((Component)this.n);
      } 
      try {
        Z z1 = (new aa()).a(paramR, a.A(), parambi.aL(), 2);
        this.n.a(z1);
        Z z2 = (new aa()).a(paramR, parambi.aL(), 2);
        this.n.b(z2);
        this.n.n(a.A().m());
        Component[] arrayOfComponent = this.n.getComponents();
        byte b;
        for (b = 0; b < arrayOfComponent.length; b++) {
          if (arrayOfComponent[b] instanceof Gauge) {
            Gauge gauge = (Gauge)arrayOfComponent[b];
            if (gauge.getOutputChannel().equals("veTuneValue")) {
              this.b.a(new ab(this, gauge));
              gauge.setCurrentOutputChannelValue("veTuneValue", this.b.o());
            } 
          } 
        } 
        if (this.o != null) {
          z1 = (new aa()).a(paramR, a.A(), parambi.aL() + p, 4);
          this.o.a(z1);
          z2 = (new aa()).a(paramR, parambi.aL() + p, 4);
          this.o.b(z2);
          this.o.n(a.A().m());
          arrayOfComponent = this.o.getComponents();
          for (b = 0; b < arrayOfComponent.length; b++) {
            if (arrayOfComponent[b] instanceof Gauge) {
              Gauge gauge = (Gauge)arrayOfComponent[b];
              if (gauge.getOutputChannel().equals("veTuneValue")) {
                this.b.a(new ab(this, gauge));
                gauge.setCurrentOutputChannelValue("veTuneValue", this.b.o());
              } 
            } 
          } 
          this.m.g(this.j.b("selectedDash", g.b("Standard")));
        } 
      } catch (Exception exception) {
        bV.d("Error setting gauges, check log for detail.\nMessage:\n" + exception.getMessage(), this);
        exception.printStackTrace();
      } 
      this.a.setBottomComponent((Component)this.d);
      this.a.setDividerSize(eJ.a(5));
      this.a.addPropertyChangeListener("dividerLocation", new Y(this));
      int i = Integer.parseInt(this.j.b("tableTuningSplitPanePosition", "" + this.r));
      this.a.setDividerLocation(i);
      add("Center", this.a);
    } else {
      add("Center", (Component)this.d);
    } 
    this.h = new bO(this, this.d);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.h);
    if (!i.a().a("oijfdsaoij98oi43"));
  }
  
  protected bt b() {
    return this.d;
  }
  
  public void c() {
    if (this.u == null) {
      this.u = new aa(this);
    } else {
      this.u.b();
    } 
    this.u.a();
  }
  
  public void d() {
    if (this.u != null)
      this.u.b(); 
  }
  
  public void close() {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.h);
    d();
    aR.a().a(this);
    if (this.n != null && this.n.getComponentCount() > 0) {
      this.n.f();
      (new aa()).a(this.n, a.A(), this.i);
      this.n.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.n.X());
    } 
    if (this.o != null && this.o.getComponentCount() > 0) {
      this.n.f();
      (new aa()).a(this.o, a.A(), this.i + p);
      this.o.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.o.X());
    } 
    if (this.m != null)
      this.j.a("selectedDash", this.m.getTitleAt(this.m.getSelectedIndex())); 
  }
  
  public void a(R paramR, bi parambi) {
    try {
      aR aR = aR.a();
      aR.a(this);
      d();
      eR eR = new eR();
      be be1 = (be)paramR.e().c(parambi.a());
      if (be1.p() != null) {
        try {
          eR.b(be1.p().a());
        } catch (g g) {
          Logger.getLogger(W.class.getName()).log(Level.WARNING, "Unable to resolve X Axis Label", (Throwable)g);
          eR.b(be1.d());
        } 
      } else {
        eR.b(be1.d());
      } 
      if (be1.q() != null) {
        try {
          eR.a(be1.q().a());
        } catch (g g) {
          Logger.getLogger(W.class.getName()).log(Level.WARNING, "Unable to resolve X Axis Label", (Throwable)g);
          eR.a(be1.d());
        } 
      } else {
        eR.a(be1.f());
      } 
      this.e = paramR.c(be1.c());
      this.f = paramR.c(be1.b());
      this.g = paramR.c(be1.a());
      i.a(this.q.c(), this.g, this);
      i.a(this.q.c(), this.f, this);
      i.a(this.q.c(), this.e, this);
      eR.c(this.e.p());
      eR.d(this.e.r());
      eR.c(this.e.s());
      eR.e(this.e.B());
      eR.a(this.f.b(), this.g.b());
      try {
        eR.a(this.e.i(paramR.p()));
        double[] arrayOfDouble1 = a(this.g.i(paramR.p()));
        for (byte b1 = 0; b1 < arrayOfDouble1.length; b1++)
          eR.a(b1, arrayOfDouble1[b1]); 
        double[] arrayOfDouble2 = a(this.f.i(paramR.p()));
        for (byte b2 = 0; b2 < arrayOfDouble2.length; b2++)
          eR.b(b2, arrayOfDouble2[b2]); 
        if (i.a().a("oijfdsaoij98oi43"))
          eR.c(); 
      } catch (g g) {
        D.a("Error mapping 3D view to Parameter. ", (Exception)g, this);
      } 
      try {
        aR.a(paramR.c(), this.g.aL(), this);
        aR.a(paramR.c(), this.f.aL(), this);
        aR.a(paramR.c(), this.e.aL(), this);
      } catch (a a) {
        bV.d("Error subscribing for parameter changes.", this);
        a.printStackTrace();
      } 
      c();
      this.b.a(eR);
      this.b.g(this.f.v());
      this.b.h(this.g.v());
      this.b.i(this.e.v());
      eR.a(this);
    } catch (a a) {
      Logger.getLogger(W.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.equals(this.e.aL())) {
      e();
      this.b.z();
      this.b.repaint();
    } else if (paramString2.equals(this.g.aL())) {
      f();
      this.b.z();
      this.b.repaint();
    } else if (paramString2.equals(this.f.aL())) {
      g();
      this.b.z();
      this.b.repaint();
    } else {
      this.b.a().c(this.e.p());
      this.b.a().d(this.e.r());
      this.b.a().c(this.e.s());
      this.b.a().e(this.e.B());
      this.b.g(this.f.v());
      this.b.h(this.g.v());
      this.b.i(this.e.v());
      e();
      f();
      g();
      this.b.z();
      this.b.repaint();
    } 
  }
  
  public void a(double paramDouble) {
    this.b.b(paramDouble);
    if (this.d.e())
      this.d.f(); 
    this.b.repaint();
  }
  
  public void b(double paramDouble) {
    if (this.c == null)
      return; 
    this.b.a(paramDouble);
    if (this.d.e())
      this.d.f(); 
    this.b.repaint();
  }
  
  private double[] a(double[][] paramArrayOfdouble) {
    double[] arrayOfDouble = new double[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfDouble[b] = paramArrayOfdouble[b][0]; 
    return arrayOfDouble;
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    try {
      this.e.a(this.q.p(), paramDouble, paramInt1, paramInt2);
    } catch (j j) {
      j.printStackTrace();
    } catch (g g) {
      g.printStackTrace();
    } 
  }
  
  public void a(int paramInt, double paramDouble) {
    this.b.a().a(paramInt, paramDouble);
  }
  
  public void b(int paramInt, double paramDouble) {
    this.b.a().b(paramInt, paramDouble);
  }
  
  private void e() {
    try {
      double[][] arrayOfDouble = this.e.i(this.q.p());
      eR eR = this.b.a();
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          double d = eR.d(b, b1);
          if (arrayOfDouble[b][b1] != d)
            eR.a(b, b1, arrayOfDouble[b][b1]); 
        } 
      } 
    } catch (g g) {
      g.printStackTrace();
    } 
  }
  
  private void f() {
    try {
      eR eR = this.b.a();
      double[] arrayOfDouble = a(this.g.i(this.q.p()));
      for (byte b = 0; b < arrayOfDouble.length; b++)
        eR.a(b, arrayOfDouble[b]); 
    } catch (g g) {
      g.printStackTrace();
      D.a("X Axis failed on update, it may now be out of sync.", (Exception)g, null);
    } 
  }
  
  private void g() {
    try {
      eR eR = this.b.a();
      double[] arrayOfDouble = a(this.f.i(this.q.p()));
      for (byte b = 0; b < arrayOfDouble.length; b++)
        eR.b(b, arrayOfDouble[b]); 
    } catch (g g) {
      g.printStackTrace();
      D.a("X Axis failed on update, it may now be out of sync.", (Exception)g, null);
    } 
  }
  
  public Dimension getMinimumSize() {
    return (this.n != null) ? new Dimension(eJ.a(this.s), eJ.a(this.t)) : new Dimension(eJ.a(this.s - this.r), eJ.a(this.t - 125));
  }
  
  public Dimension getPreferredSize() {
    return getMinimumSize();
  }
  
  public void validate() {
    super.validate();
    this.d.h().z();
  }
  
  public b a() {
    String str = d.a("/help/3D_Table_Editor.htm");
    return new b(g.b("3D Table Usage"), str);
  }
  
  public void setEnabled(boolean paramBoolean) {
    fp.a(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void a(bP parambP) {
    if (i.a().a(" a09kmfds098432lkg89vlk")) {
      d();
      this.u = parambP;
    } 
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    b(paramDouble2);
    a(paramDouble1);
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */