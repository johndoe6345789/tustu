package bk;

import G.R;
import G.cq;
import G.cu;
import aI.d;
import aI.l;
import aI.p;
import aI.q;
import aI.w;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import s.g;

public class h extends JPanel implements cq, q, bc {
  static final String a = g.b("SD Logging Active");
  
  static final String b = g.b("SD Logging Idle");
  
  static final String c = g.b("SD Card Ready");
  
  static final String d = g.b("SD Card not Ready");
  
  static final String e = g.b("SD Error!");
  
  static final String f = g.b("No SD Errors");
  
  static final String g = g.b("SD Card In");
  
  static final String h = g.b("No SD Card");
  
  R i = null;
  
  p j = null;
  
  o k = null;
  
  a l = null;
  
  JButton m = null;
  
  JButton n = null;
  
  JButton o = null;
  
  JButton p = null;
  
  q q = null;
  
  q r = null;
  
  q s = null;
  
  q t = null;
  
  JPanel u = null;
  
  private l z = null;
  
  n v = new n(this);
  
  dO w = new dO();
  
  boolean x = false;
  
  boolean y = false;
  
  public h(R paramR, boolean paramBoolean) {
    this.i = paramR;
    this.j = new p(paramR);
    setBorder(BorderFactory.createTitledBorder(g.b("SD Logging Controls")));
    setLayout(new BorderLayout(5, 5));
    this.k = new o(paramR);
    add("North", this.k);
    this.u = new JPanel();
    this.u.setLayout(new GridLayout(0, 1, 5, 5));
    this.m = new JButton(g.b("Re-initalize Card"));
    this.m.addActionListener(new i(this));
    this.u.add(this.m);
    this.n = new JButton(g.b("Reset"));
    this.n.addActionListener(new j(this));
    this.u.add(this.n);
    this.o = new JButton(g.b("Reset and wait"));
    this.o.addActionListener(new k(this));
    this.u.add(this.o);
    this.p = new JButton(g.b("Format SD Card"));
    this.p.addActionListener(new l(this));
    this.u.add(this.p);
    this.p.setEnabled(false);
    add("Center", this.u);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1, 5, 5));
    this.q = new q();
    this.q.a(a);
    this.q.b(b);
    this.q.setText(b);
    jPanel1.add(this.q);
    this.t = new q();
    this.t.a(g);
    this.t.b(h);
    this.t.setText(h);
    this.t.b(false);
    jPanel1.add(this.t);
    this.r = new q();
    this.r.a(c);
    this.r.b(d);
    this.r.setText(d);
    this.r.b(false);
    jPanel1.add(this.r);
    this.s = new q();
    this.s.setBackground(Color.red);
    this.s.a(e);
    this.s.b(f);
    this.s.setText(f);
    this.s.b(false);
    jPanel1.add(this.s);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("Center", jPanel1);
    this.l = new a(paramR, true);
    jPanel2.add("South", (Component)this.l);
    if (paramBoolean)
      add("South", jPanel2); 
    this.j.a(this);
    cu.a().a(paramR.c(), d.a, this);
  }
  
  private void d() {
    try {
      this.j.e();
    } catch (w w) {
      bV.d(w.getMessage(), this);
    } 
  }
  
  private void e() {
    try {
      this.j.d();
    } catch (w w) {
      bV.d(w.getMessage(), this);
    } 
  }
  
  private void f() {
    try {
      this.j.f();
    } catch (w w) {
      bV.d(w.getMessage(), this);
    } 
  }
  
  public void a() {
    boolean bool = bV.a(g.b("Are you sure you want to format the SD card?") + "\n" + g.b("All files will be deleted."), this, true);
    if (bool) {
      m m = new m(this);
      m.start();
    } 
  }
  
  public void b() {
    JRootPane jRootPane = getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      this.w.b(true);
      jRootPane.setGlassPane((Component)this.w);
      Component component = jRootPane.getGlassPane();
      component.setVisible(true);
    } else {
      this.w = (dO)jRootPane.getGlassPane();
    } 
    this.w.a(g.b("Formatting SD Card, Please wait"));
    this.w.setVisible(true);
  }
  
  public void c() {
    this.w.setVisible(false);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    boolean bool1 = (((int)paramDouble & d.d) == d.d) ? true : false;
    boolean bool2 = (((int)paramDouble & d.c) == d.c) ? true : false;
    this.r.a(bool2);
    this.k.setEnabled((bool2 || bool1));
    boolean bool3 = (((int)paramDouble & d.e) == d.e) ? true : false;
    this.s.a(bool3);
    boolean bool = (((int)paramDouble & d.b) == d.b);
    this.t.a(bool);
    if (bool != this.m.isEnabled()) {
      this.m.setEnabled(bool);
      this.n.setEnabled(bool);
      this.o.setEnabled(bool);
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
  }
  
  public void close() {
    this.k.close();
    this.q.close();
    this.l.close();
    this.j.b(this);
    cu.a().a(this);
  }
  
  public void a(boolean paramBoolean) {
    this.y = paramBoolean;
    g();
  }
  
  public void b(boolean paramBoolean) {
    this.x = paramBoolean;
    this.q.a(paramBoolean);
    g();
  }
  
  public void a(l paraml) {
    this.z = paraml;
    g();
  }
  
  private void g() {
    this.p.setEnabled((this.z != null && !this.x && this.y));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */