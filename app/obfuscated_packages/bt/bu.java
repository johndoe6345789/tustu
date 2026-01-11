package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.be;
import G.i;
import V.a;
import V.g;
import bH.D;
import bH.J;
import bH.X;
import bH.p;
import c.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fF;
import com.efiAnalytics.ui.fa;
import com.efiAnalytics.ui.p;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.w;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import r.a;
import r.i;
import s.g;

public class bu extends JPanel implements aN, L, h, d, bc, p, TableModelListener {
  R a = null;
  
  aM b = null;
  
  aM c = null;
  
  aM d = null;
  
  fF e = null;
  
  w f = null;
  
  JLabel g = null;
  
  be h = null;
  
  private String l = null;
  
  bP i = null;
  
  List j = new ArrayList();
  
  private static double m = 100.0D;
  
  fa k = new bv(this);
  
  public bu(R paramR, be parambe) {
    this(paramR, parambe, true);
  }
  
  public bu(R paramR, be parambe, boolean paramBoolean) {
    this.a = paramR;
    this.h = parambe;
    this.l = parambe.aJ();
    setLayout(new BorderLayout());
    this.f = new w();
    this.f.setName(parambe.aL());
    this.f.h().e(x.a());
    setName(parambe.aL());
    this.f.a(new bw(this));
    this.b = paramR.c(parambe.c());
    this.c = paramR.c(parambe.b());
    this.d = paramR.c(parambe.a());
    try {
      i.a(paramR.c(), this.c, this);
      i.a(paramR.c(), this.b, this);
      i.a(paramR.c(), this.c.q(), this);
      i.a(paramR.c(), this.d.F(), this);
      if (parambe.p() != null)
        i.a(paramR.c(), parambe.p(), this); 
      if (parambe.q() != null)
        i.a(paramR.c(), parambe.q(), this); 
    } catch (a a) {
      Logger.getLogger(bu.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    s s = null;
    try {
      if (paramBoolean) {
        s = bQ.a().a(paramR, parambe.aL(), parambe.l(), parambe.aL());
      } else {
        s = bQ.a().b(paramR, parambe.aL());
      } 
      s.addTableModelListener(this);
      s.a(this.k);
      this.f.h().a(this.b.v());
      this.f.b(this.c.v());
      this.f.a(this.d.v());
      int i = a(this.c);
      this.f.h().c((i <= 3 && this.d.v() < 1 && a(this.b) <= 3 && J.a()));
      this.f.a(s);
      this.f.h().f(this.b.B());
      if (parambe.i() > 0) {
        this.f.c(parambe.i());
        this.f.a(false);
      } else {
        int j = this.f.getFont().getSize() + a.a().p();
        int k = a.a().a(a.aH, j);
        this.f.c(k);
      } 
      this.f.a(this);
    } catch (g g) {
      D.a("Unable to load table. See log for details.", (Exception)g, this);
    } 
    String[] arrayOfString = this.b.Q();
    if (arrayOfString.length == 1 || arrayOfString.length == 2) {
      bY bY = new bY(paramR, parambe, s);
      this.f.a(bY);
    } 
    this.f.h().addFocusListener(new bx(this));
    add("Center", (Component)this.f);
    this.g = new JLabel();
    this.g.setHorizontalAlignment(0);
    add("South", this.g);
    this.e = new fF();
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    if (parambe.c() != null) {
      jPanel2.setLayout(new GridLayout(2, 1));
      a a = new a(paramR, parambe.c());
      jPanel2.add(a);
      l l = new l(paramR, parambe.c());
      jPanel2.add(l);
      jPanel1.add("North", jPanel2);
    } 
    jPanel1.add("Center", (Component)this.e);
    add("West", jPanel1);
    if (s.w() != null) {
      String str;
      if (parambe.p() == null) {
        str = g.b(s.w());
      } else {
        try {
          str = g.b(parambe.p().a());
        } catch (g g) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Failed to resolve X Axis Label", (Throwable)g);
          str = g.b(s.w());
        } 
      } 
      this.g.setText(str);
    } 
    if (s.v() != null) {
      String str;
      if (parambe.q() == null) {
        str = g.b(s.v());
      } else {
        try {
          str = g.b(parambe.q().a());
        } catch (g g) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Unable to resolve Y Axis Label", (Throwable)g);
          str = g.b(s.v());
        } 
      } 
      if (this.c.p() != null && !this.c.p().equals("")) {
        String str1;
        if (i.a().a("645fds645fds  fdsd098532#@") && a.a().c(a.cc, a.cd) && this.c.p().toLowerCase().equals("kpa")) {
          str1 = "PSI";
        } else {
          str1 = this.c.p();
        } 
        str = str + " " + g.b(str1);
      } 
      this.e.setText(g.b(str));
    } 
    if (i.a().a("reoirew rew oiurew")) {
      this.f.c(true);
    } else {
      this.f.c(true);
    } 
    if (i.a().a("jheoibnw747d mds 982"))
      this.f.c(); 
    this.f.a(new bA(this));
    this.f.a(new bz(this));
    if (parambe.m() || parambe.o())
      this.f.b(false); 
    c();
    a(paramR, this.c);
  }
  
  private void a(R paramR, aM paramaM) {
    if (paramaM.p() != null && paramaM.p().equalsIgnoreCase("kpa")) {
      try {
        double[] arrayOfDouble = paramaM.h(paramR.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          double d1 = arrayOfDouble[arrayOfDouble.length - 1 - b];
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("<html>");
          stringBuilder.append(X.b(d1, paramaM.v())).append(" kPa:<br>");
          stringBuilder.append(X.b(d1 * 0.145038D, 2)).append(" ").append(g.b("PSI Absolute")).append("<br>");
          stringBuilder.append(X.b((d1 - m) * 0.145038D, 2)).append(" ").append(g.b("PSI Relative to " + m + " kPa")).append("<br>");
          stringBuilder.append(X.b((d1 - m) * 0.29538D, 2)).append(" ").append(g.b("inHg Relative to " + m + " kPa")).append("<br>");
          this.f.a(stringBuilder.toString(), b);
        } 
      } catch (g g) {
        Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Failed to set Y Axis tooltips", (Throwable)g);
      } 
      by by = new by(this);
      SwingUtilities.invokeLater(by);
    } else {
      this.f.o();
      this.f.d(false);
    } 
  }
  
  private int a(aM paramaM) {
    return (int)Math.log10(paramaM.s()) + paramaM.v();
  }
  
  public void c() {
    if (this.i == null) {
      this.i = new H(this.a, this.h, this.f);
    } else {
      this.i.b();
    } 
    this.i.a();
  }
  
  public void e() {
    if (this.i != null)
      this.i.b(); 
  }
  
  public void a(bP parambP) {
    e();
    this.i = parambP;
  }
  
  public boolean requestFocusInWindow() {
    return this.f.requestFocusInWindow();
  }
  
  public void a(int paramInt, String paramString1, String paramString2) {}
  
  public void b(int paramInt, String paramString1, String paramString2) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    s s = (s)paramTableModelEvent.getSource();
    if (paramTableModelEvent.getFirstRow() != -1 && paramTableModelEvent.getColumn() != -1)
      try {
        this.f.repaint();
      } catch (Exception exception) {
        exception.printStackTrace();
        bV.d("Error updating table:\n" + exception.getMessage() + "\nSee log for more detail.", this);
      }  
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    this.f.h().a(Double.toString(paramDouble1), Double.toString(paramDouble2));
  }
  
  public void a(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    this.f.h().a(paramArrayOffloat1, paramArrayOffloat2);
  }
  
  public int f() {
    return this.f.h().J();
  }
  
  public void close() {
    e();
    this.f.g().removeTableModelListener(this);
    aR.a().a(this);
    this.f.g().b(this.k);
  }
  
  public void a(Double[][] paramArrayOfDouble) {
    this.f.g().a(paramArrayOfDouble);
  }
  
  public Double[][] g() {
    return this.f.g().s();
  }
  
  public void a(String paramString1, String paramString2) {
    this.f.b(this.c.v());
    this.f.h().a(this.b.v());
    this.f.h().b(this.d.v());
    if (this.f.g().v() != null) {
      String str;
      if (this.h.q() == null) {
        str = g.b(this.f.g().v());
      } else {
        try {
          str = g.b(this.h.q().a());
        } catch (g g) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Unable to resolve Y Axis Label", (Throwable)g);
          str = g.b(this.f.g().v());
        } 
      } 
      if (this.c.p() != null && !this.c.p().equals(""))
        str = str + " " + g.b(this.c.p()); 
      this.e.setText(g.b(str));
      this.e.repaint();
    } 
    if (this.f.g().w() != null) {
      String str;
      if (this.h.p() == null) {
        str = g.b(this.f.g().w());
      } else {
        try {
          str = g.b(this.h.p().a());
        } catch (g g) {
          Logger.getLogger(bu.class.getName()).log(Level.WARNING, "Failed to resolve X Axis Label", (Throwable)g);
          str = g.b(this.f.g().w());
        } 
      } 
      this.g.setText(str);
    } 
    if (this.c.aL().equals(paramString2))
      a(this.a, this.c); 
  }
  
  public void a() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.a(a_(), this.a);
        setEnabled(bool);
      } catch (Exception exception) {
        D.a(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  public String a_() {
    return this.l;
  }
  
  public void c_(String paramString) {
    this.l = paramString;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.g.setEnabled(paramBoolean);
    this.e.setEnabled(paramBoolean);
    this.f.setEnabled(paramBoolean);
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
  
  public R b_() {
    return this.a;
  }
  
  public void a(K paramK) {
    this.j.add(paramK);
  }
  
  public void b(K paramK) {
    this.j.remove(paramK);
  }
  
  public String d() {
    return this.b.aL();
  }
  
  private void b(String paramString) {
    for (K k : this.j)
      k.b(paramString); 
  }
  
  private void c(String paramString) {
    for (K k : this.j)
      k.a(paramString); 
  }
  
  public static void a(double paramDouble) {
    m = paramDouble;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */