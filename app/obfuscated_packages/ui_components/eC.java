package ao;

import W.n;
import com.efiAnalytics.ui.cK;
import com.efiAnalytics.ui.cg;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import h.g;
import h.i;
import i.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;

public class eC extends JPanel implements b {
  JPanel a = new JPanel();
  
  aw b = new aw(hx.a());
  
  cg c = new cg();
  
  n d = null;
  
  JSplitPane e = null;
  
  ArrayList f = new ArrayList();
  
  go g;
  
  eI h = new eI(this);
  
  public eC() {
    f();
    this.g = new go();
    dQ dQ = new dQ(i.e, "TableGenSetting");
    this.g.a((et)dQ);
    hx.a().a(this.g);
    hx.a().a(this);
    this.b.i(true);
    this.a.setLayout(new BorderLayout());
    this.a.add("Center", this.g);
    setLayout(new BorderLayout());
    this.e = new JSplitPane();
    this.e.setOneTouchExpandable(true);
    this.e.setOrientation(0);
    add("Center", this.a);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", this.b);
    jPanel.add("South", (Component)this.c);
    add("South", jPanel);
    cK cK = new cK();
    cK.a(new eD(this));
    jPanel.add("North", (Component)cK);
    Dimension dimension = new Dimension(eJ.a(150), eJ.a(150));
    this.b.setMinimumSize(dimension);
    this.b.setPreferredSize(dimension);
    this.b.setMaximumSize(dimension);
    this.b.a(Color.BLACK);
    this.b.b(Color.lightGray);
    this.b.e(false);
    hx.a().a(this.b);
    bZ bZ = new bZ(hx.a());
    this.b.addMouseListener(bZ);
    this.b.addMouseMotionListener(bZ);
    this.b.h(false);
    this.c.a(new eH(this));
    this.g.a(new eG(this));
  }
  
  public void c() {
    f();
    for (byte b1 = 0; b1; b1++) {
      eF eF = c(b1);
      if (eF != null);
    } 
  }
  
  private eF c(int paramInt) {
    return (this.f.size() == 0) ? null : this.f.get(paramInt % this.f.size());
  }
  
  public void a() {}
  
  public void a(double paramDouble) {
    this.h.a(paramDouble);
    if (this.h.b()) {
      this.h.a(false);
      SwingUtilities.invokeLater(this.h);
    } 
  }
  
  public void a(n paramn) {
    this.d = paramn;
    if (this.d != null) {
      eE eE = new eE(this, paramn);
      SwingUtilities.invokeLater(eE);
    } 
  }
  
  public void b(n paramn) {}
  
  public void b() {
    this.b.b();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    d();
  }
  
  public double d() {
    double d = 1.0D;
    if (this.d != null && this.d.d() > 0)
      d = this.b.getWidth() / this.d.d(); 
    this.b.b(d);
    return d;
  }
  
  public void a(int paramInt) {
    this.g.e(paramInt);
    this.b.h(paramInt);
    this.b.repaint();
  }
  
  public void b(int paramInt) {
    this.g.d(paramInt);
    this.b.i(paramInt);
    this.b.repaint();
  }
  
  private void f() {
    this.f.clear();
    eF eF = new eF(this);
    eF.a(g.a().a(g.d));
    eF.b(g.a().a(g.j));
    eF.c(g.a().a(g.h));
    this.f.add(eF);
    eF = new eF(this);
    eF.a(g.a().a(g.g));
    eF.b(g.a().a(g.j));
    eF.c(g.a().a(g.h));
    this.f.add(eF);
  }
  
  public Component e() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */