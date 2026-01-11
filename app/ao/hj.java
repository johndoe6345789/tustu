package ao;

import W.j;
import W.n;
import ar.c;
import ar.f;
import bH.S;
import com.efiAnalytics.ui.eJ;
import g.g;
import g.k;
import h.b;
import h.g;
import h.i;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class hj extends JPanel implements bn, hf, k, MouseMotionListener {
  int a = i.a("numberOfGraphs", i.t);
  
  int b = i.a("numberOfOverlays", i.u);
  
  int c = 0;
  
  int d = 0;
  
  public static final int e = eJ.a(14);
  
  Dimension f = null;
  
  Font g = new Font("Arial Unicode MS", 1, eJ.a(11));
  
  hx h = null;
  
  boolean i = false;
  
  long j = 0L;
  
  private hw r = null;
  
  ap k = null;
  
  ArrayList l = new ArrayList();
  
  JPanel m = new JPanel();
  
  hv n;
  
  ht o = new ht(this);
  
  public static String p;
  
  final String q = "Save Current As";
  
  public hj(hx paramhx) {
    this.h = paramhx;
    setLayout(new BorderLayout());
    p = i.d();
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add(this.m, "North");
    JPanel jPanel2 = new JPanel();
    jPanel2.setPreferredSize(eJ.a(1, 1));
    jPanel1.add(jPanel2, "Center");
    this.n = new hv(this, jPanel1);
    add(this.n, "Center");
    hk hk = new hk(this);
    addMouseMotionListener(this);
    addMouseListener(hk);
    this.n.addMouseMotionListener(this);
    this.n.addMouseListener(hk);
    jPanel1.addMouseMotionListener(this);
    jPanel1.addMouseListener(hk);
    this.k = new ap("Quick Views");
    this.k.a(new hl(this));
    this.k.setFont(this.g);
    this.k.a(new Dimension(eJ.a(90), eJ.a(25)));
  }
  
  private hw f() {
    if (this.r == null || !this.r.isAlive()) {
      this.r = new hw(this);
      this.r.start();
    } 
    return this.r;
  }
  
  public void c() {
    JPopupMenu jPopupMenu = new JPopupMenu("menuFieldGroups");
    hm hm = new hm(this);
    this.k.add(jPopupMenu);
    jPopupMenu.setFont(this.g);
    jPopupMenu.add("Save Current As").addActionListener(hm);
    List list = f.a().b();
    JMenu jMenu = new JMenu("Delete Group");
    hn hn = new hn(this);
    for (c c : list) {
      if (!c.b().equals("Default")) {
        JMenuItem jMenuItem1 = new JMenuItem(c.b());
        jMenu.add(jMenuItem1);
        jMenuItem1.addActionListener(hn);
      } 
    } 
    jPopupMenu.add(jMenu);
    JMenuItem jMenuItem = jPopupMenu.add("Clear current Selections (CTRL+Delete)");
    jMenuItem.addActionListener(new ho(this));
    jPopupMenu.addSeparator();
    for (c c : list) {
      String str1 = c.b();
      JMenuItem jMenuItem1 = new JMenuItem(str1);
      jMenuItem1.addActionListener(hm);
      String str2 = c.a();
      jMenuItem1.setToolTipText(str2);
      jPopupMenu.add(jMenuItem1);
    } 
    jPopupMenu.show(this.k, 0, this.k.getHeight());
  }
  
  public void a(String paramString) {
    if (paramString.equals("Save Current As")) {
      g g = new g(k.a(this), "{Field Group Name}", false, "       Save current Field Selection As", true);
      if (g.a)
        b(g.a()); 
    } else {
      d(paramString);
    } 
  }
  
  public void b(String paramString) {
    String[] arrayOfString = i.e("graph");
    i.c("FIELD_GROUP_NAME_" + paramString, paramString);
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].indexOf(".") > 0 && arrayOfString[b].length() < 10)
        i.c("FIELD_SELECTED_GROUP_" + paramString + "_" + arrayOfString[b], i.a(arrayOfString[b], " ")); 
    } 
  }
  
  public void c(String paramString) {
    eJ eJ = new eJ(k.a(this), "Are you sure you want to delete the field group " + paramString, true);
    if (!eJ.a)
      return; 
    f.a().b(paramString);
  }
  
  public void d(String paramString) {
    f.a().a(paramString);
  }
  
  public void a() {
    a(true);
    try {
      this.m.removeAll();
    } catch (Exception exception) {}
    for (hu hu : this.l)
      aV.a().b(hu); 
    this.l.clear();
    this.a = i.a("numberOfGraphs", i.t);
    this.b = i.a("numberOfOverlays", i.u);
    this.m.setLayout(new BoxLayout(this.m, 1));
    this.m.add(this.k);
    hp hp = new hp(this);
    n n = this.h.r();
    if (n == null || n.isEmpty())
      return; 
    String[] arrayOfString = new String[n.size()];
    byte b;
    for (b = 0; b < n.size(); b++) {
      j j = (j)n.get(b);
      if (j.l()) {
        arrayOfString[b] = j.a() + p;
      } else {
        arrayOfString[b] = j.a();
      } 
    } 
    if (i.a(i.E, i.F))
      arrayOfString = S.a(arrayOfString); 
    for (b = 0; b < this.a; b++) {
      bo bo = new bo("Graph " + (b + 1));
      this.h.a(bo);
      this.m.add(bo);
      for (byte b1 = 0; b1 < this.b; b1++) {
        hu hu = new hu(this, b, b1);
        hu.addKeyListener(hp);
        hu.setFont(this.g);
        this.l.add(hu);
        hu.a(aV.a().a(b, b1));
        aV.a().a(hu);
        hu.a(false);
        hu.addKeyListener(this.o);
        hu.setName("graph" + b + "." + b1);
        hu.a(" ");
        hu.addItemListener(new hq(this));
        for (String str1 : arrayOfString)
          hu.a(str1); 
        if (b.a().a("fieldSmoothing")) {
          JPanel jPanel = new JPanel();
          jPanel.setLayout(new BorderLayout(eJ.a(3), eJ.a(3)));
          jPanel.add("Center", (Component)hu);
          ag ag = new ag();
          hu.addItemListener(new hr(this, ag));
          ag.setFocusable(false);
          jPanel.add("East", ag);
          bo.add(jPanel);
        } else {
          bo.add((Component)hu);
        } 
        String str = f.a().g();
        if (str != null) {
          c c = f.a().c(str);
          if (c != null) {
            String str1 = c.c(e(hu.getName()));
            if (!str1.equals(" ")) {
              if (str1.contains("Field."))
                str1 = g.a().a(str1); 
              j j = this.h.r().a(str1);
              if (j != null) {
                if (j.l()) {
                  hu.b(str1 + p);
                } else {
                  hu.b(str1);
                } 
                a(str1, hu);
              } else {
                hu.b(" ");
                a(" ", hu);
              } 
            } else {
              a(str1, hu);
            } 
          } 
        } 
      } 
    } 
    a(false);
    hs hs = new hs(this);
    SwingUtilities.invokeLater(hs);
    invalidate();
    setBackground(getBackground());
    if (this.j == 0L) {
      d();
      this.r = f();
      this.r.b();
      this.j = System.currentTimeMillis();
    } 
  }
  
  private String e(String paramString) {
    return paramString.endsWith(p) ? paramString.substring(0, paramString.length() - 1) : paramString;
  }
  
  protected void a(String paramString, hu paramhu) {
    paramString = e(paramString);
    String str1 = g.a().e(paramString);
    if (str1 == null || str1.equals("")) {
      i.c(paramhu.getName(), paramString);
    } else {
      i.c(paramhu.getName(), "Field." + str1);
    } 
    if (paramString == null || paramString.equals(" ")) {
      a(paramhu.getName(), (j)null);
    } else {
      a(paramhu.getName(), this.h.r().a(paramString));
    } 
    j j = this.h.r().a(paramString);
    String str2 = null;
    if (hx.a().r() != null && hx.a().r().a(paramString) != null && hx.a().r().a(paramString).y() != null)
      str2 = hx.a().r().a(paramString).y(); 
    if (j != null && j.u() != null && !j.a().equals(j.u())) {
      String str = "Standardized Name: " + j.a() + ", Name in File: " + j.u();
      if (str2 != null)
        str = str + "\nField Description: " + str2; 
      paramhu.setToolTipText(str);
    } else if (str2 == null) {
      paramhu.setToolTipText(null);
    } else {
      paramhu.setToolTipText("Field Description: " + str2);
    } 
  }
  
  protected void a(String paramString, j paramj) {
    bm.a().a(paramString, paramj);
  }
  
  protected void a(boolean paramBoolean) {
    bm.a().a(paramBoolean);
  }
  
  public Insets getInsets() {
    return new Insets(eJ.a(3), eJ.a(3), eJ.a(3), e);
  }
  
  public void setForeground(Color paramColor) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setForeground(paramColor.darker());
      arrayOfComponent[b].repaint();
    } 
    super.setForeground(paramColor);
    repaint();
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).setBackground(paramColor); 
    repaint();
  }
  
  public void a(Color paramColor) {}
  
  public void a(Color paramColor, int paramInt) {
    int i = 0;
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof Container) {
        Container container = (Container)arrayOfComponent[b];
        Component[] arrayOfComponent1 = container.getComponents();
        for (byte b1 = 0; b1 < arrayOfComponent1.length; b1++) {
          if (arrayOfComponent1[b1] instanceof hu) {
            if (i == paramInt) {
              hu hu = (hu)arrayOfComponent1[b1];
              hu.a(paramColor);
              hu.repaint();
              return;
            } 
            i++;
          } 
        } 
      } 
    } 
  }
  
  public Dimension getPreferredSize() {
    return getMinimumSize();
  }
  
  public void c(boolean paramBoolean) {
    this.i = paramBoolean;
    k.b(this);
    Frame frame = k.a(this);
    if (frame != null)
      frame.validate(); 
  }
  
  public Dimension getMinimumSize() {
    if (this.i) {
      this.f = super.getMinimumSize();
      Dimension dimension = super.getMinimumSize();
      Insets insets = getInsets();
      dimension.width = this.d + insets.left + insets.right;
      return dimension;
    } 
    return super.getMinimumSize();
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    int i = getX();
    int j = getY();
    setBounds(i, j, paramInt1, paramInt2);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.i) {
      paramInt1 = e - (super.getMinimumSize()).width;
      paramInt3 = (super.getMinimumSize()).width;
    } 
    if (this.i && getWidth() >= (super.getMinimumSize()).width)
      paramInt1 = getX(); 
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    a(false);
  }
  
  public void d() {
    while ((getLocation()).x < 0) {
      Point point = getLocation();
      point.x += 4;
      super.setBounds(point.x, point.y, (getSize()).width, (getSize()).height);
      try {
        Thread.sleep(2L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(hj.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public void e() {
    if (!this.i)
      return; 
    boolean bool = false;
    while ((getLocation()).x > e - (getSize()).width + 2) {
      bool = true;
      Point point = getLocation();
      point.x -= 4;
      try {
        Thread.sleep(2L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(hj.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      super.setBounds(point.x, point.y, (getSize()).width, (getSize()).height);
    } 
    if (bool)
      bq.a().c().requestFocus(); 
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setColor(Color.lightGray);
    paramGraphics.draw3DRect((getSize()).width - 8, 5, 3, (getSize()).height - 10, true);
  }
  
  public void b(boolean paramBoolean) {
    c(paramBoolean);
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.r != null)
      this.r.a(); 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (this.r != null)
      this.r.a(); 
  }
  
  public void repaint() {
    super.repaint();
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).repaint(); 
  }
  
  public void b() {
    for (hu hu : this.l)
      hu.setSelectedItem(" "); 
  }
  
  public boolean isVisible() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */