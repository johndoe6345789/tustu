package ao;

import W.n;
import com.efiAnalytics.ui.cK;
import com.efiAnalytics.ui.cg;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fc;
import h.g;
import h.i;
import i.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;

public class er extends JPanel implements b {
  Map a = new HashMap<>();
  
  JPanel b = new JPanel();
  
  aw c = new aw(hx.a());
  
  cg d = new cg();
  
  n e = null;
  
  JSplitPane f = null;
  
  ArrayList g = new ArrayList();
  
  JPanel h = new JPanel();
  
  JButton i = null;
  
  public er() {
    g();
    int i = i.b("scatterPlotRows", 1);
    int j = i.b("scatterPlotCols", 2);
    a(i, j);
    setLayout(new BorderLayout());
    boolean bool = false;
    if (bool) {
      this.f = new JSplitPane();
      this.f.setOneTouchExpandable(true);
      this.f.setOrientation(0);
      add("Center", this.f);
      this.f.setTopComponent(this.b);
    } else {
      add("Center", this.b);
    } 
    this.h.setLayout(new BorderLayout());
    this.h.add("Center", this.c);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table16.png"));
    image = eJ.a(image, jPanel);
    ImageIcon imageIcon = new ImageIcon(image);
    this.i = new JButton(null, imageIcon);
    this.i.setFocusable(false);
    this.i.setToolTipText("Close");
    this.i.addActionListener(new es(this));
    this.i.setPreferredSize(new Dimension(eJ.a(24), eJ.a(24)));
    jPanel.add("East", this.i);
    jPanel.add("Center", (Component)this.d);
    this.h.add("South", jPanel);
    if (bool) {
      this.f.setBottomComponent(this.h);
    } else {
      add("South", this.h);
    } 
    cK cK = new cK();
    cK.a(new et(this));
    this.h.add("North", (Component)cK);
    Dimension dimension = new Dimension(eJ.a(150), eJ.a(150));
    this.c.setMinimumSize(dimension);
    this.c.setPreferredSize(dimension);
    this.c.setMaximumSize(dimension);
    this.c.a(Color.BLACK);
    this.c.b(Color.lightGray);
    this.c.e(false);
    hx.a().a(this.c);
    bZ bZ = new bZ(hx.a());
    this.c.addMouseListener(bZ);
    this.c.addMouseMotionListener(bZ);
    this.c.h(false);
    this.d.a(new eB(this));
    hx.a().a(new ez(this));
  }
  
  private void f() {
    fc fc = new fc();
    fc.pack();
    int i = (this.i.getLocationOnScreen()).x + this.i.getWidth() - fc.getWidth();
    int j = (this.i.getLocationOnScreen()).y - fc.getHeight();
    fc.setLocation(i, j);
    fc.a(new eu(this));
    fc.setVisible(true);
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.b.removeAll();
    this.c.p();
    this.a.clear();
    this.b.setLayout(new GridLayout(paramInt1, paramInt2));
    for (byte b1 = 0; b1 < paramInt1; b1++) {
      for (byte b2 = 0; b2 < paramInt2; b2++) {
        fK fK = new fK();
        this.b.add(fK);
        String str = b(b1, b2);
        this.a.put(str, fK);
        fK.a(new eA(this, b2 * (b1 + 1)));
        dQ dQ = new dQ(i.e, "curve_" + b1 + "_" + b2);
        fK.a((et)dQ);
      } 
    } 
    if (this.e != null) {
      a(1.0D);
      a(this.e);
    } 
  }
  
  public void c() {
    g();
    Iterator<fK> iterator = this.a.values().iterator();
    for (byte b1 = 0; iterator.hasNext(); b1++) {
      ey ey = c(b1);
      fK fK = iterator.next();
      if (this.e != null)
        fK.a(this.e); 
      if (ey != null) {
        fK.a(ey.a());
        fK.b(ey.b());
        if (ey.c() != null)
          fK.c(ey.c()); 
      } 
      fK.e();
    } 
  }
  
  private ey c(int paramInt) {
    return (this.g.size() == 0) ? null : this.g.get(paramInt % this.g.size());
  }
  
  public Component d() {
    return this.b;
  }
  
  private String b(int paramInt1, int paramInt2) {
    return "scatterPlot_" + paramInt1 + "_" + paramInt2;
  }
  
  public void a() {}
  
  public void a(double paramDouble) {
    if (paramDouble == 1.0D) {
      ev ev = new ev(this);
      SwingUtilities.invokeLater(ev);
    } else {
      ew ew = new ew(this, paramDouble);
      SwingUtilities.invokeLater(ew);
    } 
  }
  
  public void a(n paramn) {
    this.e = paramn;
    if (paramn != null) {
      ex ex = new ex(this, paramn);
      ex.start();
    } 
  }
  
  public void b(n paramn) {}
  
  public void b() {
    Iterator iterator = this.a.keySet().iterator();
    while (iterator.hasNext()) {
      fK fK = (fK)this.a.get(iterator.next());
      fK.repaint();
    } 
    this.c.b();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    e();
  }
  
  public double e() {
    double d = 1.0D;
    if (this.e != null && this.e.d() > 0)
      d = this.c.getWidth() / this.e.d(); 
    this.c.b(d);
    return d;
  }
  
  public void a(int paramInt) {
    Iterator<fK> iterator = this.a.values().iterator();
    while (iterator.hasNext())
      ((fK)iterator.next()).c(paramInt); 
    this.c.h(paramInt);
    this.c.repaint();
  }
  
  public void b(int paramInt) {
    Iterator<fK> iterator = this.a.values().iterator();
    while (iterator.hasNext())
      ((fK)iterator.next()).b(paramInt); 
    this.c.i(paramInt);
    this.c.repaint();
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    dimension.width = 300;
    dimension.height = 200;
    return dimension;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    dimension.width = 300;
    return dimension;
  }
  
  private void g() {
    this.g.clear();
    ey ey = new ey(this);
    ey.a(g.a().a(g.d));
    ey.b(g.a().a(g.j));
    ey.c(g.a().a(g.h));
    this.g.add(ey);
    ey = new ey(this);
    ey.a(g.a().a(g.g));
    ey.b(g.a().a(g.j));
    ey.c(g.a().a(g.h));
    this.g.add(ey);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/er.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */