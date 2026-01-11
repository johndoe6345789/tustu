package ao;

import V.a;
import W.j;
import W.n;
import aw.a;
import aw.c;
import bE.k;
import bE.m;
import bE.q;
import bH.D;
import bH.S;
import bx.l;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.dE;
import com.efiAnalytics.ui.e;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fF;
import g.g;
import g.k;
import h.b;
import h.i;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class fK extends JPanel implements k {
  private m z = new m();
  
  JToolBar a = new JToolBar();
  
  JToolBar b = new JToolBar();
  
  e c = new e();
  
  e d = new e();
  
  e e = new e();
  
  eq f = new eq(this);
  
  JLabel g = new JLabel(" ", 0);
  
  JLabel h = new JLabel(" ", 0);
  
  fF i = new fF();
  
  a j = null;
  
  JPanel k = null;
  
  JToggleButton l = new JToggleButton("Scales");
  
  JButton m = new JButton("Saved Views");
  
  JButton n = new JButton("Pop");
  
  private et A = null;
  
  private int B = 0;
  
  private int C = 0;
  
  private static String D = "xField";
  
  private static String E = "yField";
  
  private static String F = "zField";
  
  private static String G = "Hits";
  
  private String H = "Hits";
  
  private String I = null;
  
  private String J = null;
  
  private static String K = "showFilterPanel";
  
  private static String L = "showRangeScale";
  
  public static String o = "Current View";
  
  private static String M = "Save Current View As";
  
  private static String N = "Delete View";
  
  private static String O = "Minimum Dot Size";
  
  private static String P = "Maximum Dot Size";
  
  private static String Q = "Number of Y Sections";
  
  private static String R = "Number of X Sections";
  
  private static String S = "Maximum Number of Z Gradients";
  
  private static int T = 30;
  
  JPanel p;
  
  c q = null;
  
  private String U = "zColorKey";
  
  ArrayList r = new ArrayList();
  
  private dE V = null;
  
  private boolean W = false;
  
  JButton s = null;
  
  JButton t = null;
  
  JButton u = null;
  
  JToggleButton v = null;
  
  ImageIcon w = null;
  
  ImageIcon x = null;
  
  JButton y = null;
  
  public fK() {
    setLayout(new BorderLayout());
    this.V = new dE((Component)this.z);
    this.V.a(250);
    this.z.a(this);
    setBorder(BorderFactory.createLineBorder(Color.darkGray));
    this.p = new JPanel();
    this.p.setLayout(new BorderLayout());
    try {
      Image image1 = cO.a().a(cO.ar, this, 20);
      this.n.setText("");
      ImageIcon imageIcon1 = new ImageIcon(image1);
      this.n.setIcon(imageIcon1);
    } catch (a a1) {
      this.n.setText("Popout");
      Logger.getLogger(fK.class.getName()).log(Level.WARNING, "Failed to load Scatter plot full screen image.", (Throwable)a1);
    } 
    if (b.a().a("fdsahoirew098rew3284lksafd"))
      this.a.add(this.n); 
    this.a.add(this.m);
    this.a.add(new JLabel(" X Axis:"));
    this.a.add((Component)this.c);
    this.a.add(new JLabel(" Y Axis:"));
    this.a.add((Component)this.d);
    this.a.add(new JLabel(" Z Axis:"));
    this.a.add((Component)this.e);
    this.a.add(this.l);
    Dimension dimension = eJ.a(140, getFont().getSize() + 4);
    this.c.setPreferredSize(dimension);
    this.d.setPreferredSize(dimension);
    this.e.setPreferredSize(dimension);
    this.m.addActionListener(new fL(this));
    this.c.addItemListener(new fW(this));
    this.d.addItemListener(new gc(this));
    this.e.addItemListener(new gd(this));
    this.l.addActionListener(new ge(this));
    this.n.addActionListener(new gf(this));
    this.p.add("North", this.a);
    add("North", this.p);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", (Component)this.z);
    jPanel.add("North", this.g);
    jPanel.add("West", (Component)this.i);
    jPanel.add("South", this.h);
    this.g.setOpaque(true);
    this.i.setOpaque(true);
    this.h.setOpaque(true);
    this.g.setBackground(Color.BLACK);
    this.i.setBackground(Color.BLACK);
    this.h.setBackground(Color.BLACK);
    this.g.setForeground(Color.WHITE);
    this.i.setForeground(Color.WHITE);
    this.h.setForeground(Color.WHITE);
    this.g.setFont(new Font("Times", 1, eJ.a(18)));
    add("Center", jPanel);
    this.z.a(this.f, 0);
    this.z.addMouseListener(new gk(this));
    this.q = new c(null);
    this.q.a(new gl(this));
    this.b.add((Component)this.q);
    this.p.add("Center", this.b);
    a(new gm(this));
    a(true);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/zoomout.gif"));
    image = eJ.a(image);
    ImageIcon imageIcon = new ImageIcon(image);
    this.y = new JButton(null, imageIcon);
    this.z.add(this.y);
    this.y.setVisible((!this.q.a() || !this.q.d()));
    this.y.addActionListener(new gg(this));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/scatter_line.png"));
    image = eJ.a(image, 20);
    this.w = new ImageIcon(image);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/scatter_dots.png"));
    image = eJ.a(image, 20);
    this.x = new ImageIcon(image);
    this.v = new JToggleButton(null, this.x);
    this.z.add(this.v);
    this.v.addActionListener(new gh(this));
  }
  
  private void s() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.add(M).addActionListener(new gi(this));
    JMenu jMenu = new JMenu("Delete Saved View");
    fM fM = new fM(this);
    List list = fI.a();
    for (String str : list) {
      if (!str.equals(o))
        jMenu.add(str).addActionListener(fM); 
    } 
    jPopupMenu.add(jMenu);
    jPopupMenu.addSeparator();
    fN fN = new fN(this);
    for (String str : list) {
      if (!str.equals(o))
        jPopupMenu.add(str).addActionListener(fN); 
    } 
    this.m.add(jPopupMenu);
    jPopupMenu.show(this.m, 0, this.m.getHeight());
  }
  
  private void d(String paramString) {
    fI.b(paramString);
  }
  
  private void t() {
    String str = "Scatter Plot View Name";
    i.c("userParameter_" + str, this.g.getText());
    g g = new g(k.a(this), "{" + str + "}", false, "       Save current Histogram View As", true);
    if (g.a) {
      String str1 = g.a();
      fH fH = a();
      fH.a(str1);
      fI.a(fH);
    } 
  }
  
  private void e(String paramString) {
    fH fH = null;
    try {
      fH = fI.a(paramString);
    } catch (a a1) {
      Logger.getLogger(fK.class.getName()).log(Level.WARNING, "Scatter Plot View " + paramString + " cannot be loaded.", (Throwable)a1);
    } 
    if (fH == null) {
      bV.d("Scatter Plot View " + paramString + " cannot be loaded.", this);
      return;
    } 
    a(fH);
  }
  
  private void a(fH paramfH) {
    this.c.b(paramfH.b());
    this.q.b(paramfH.e(), paramfH.f());
    this.q.b(paramfH.g());
    this.d.b(paramfH.c());
    this.q.a(paramfH.h(), paramfH.i());
    this.q.a(paramfH.j());
    this.e.b(paramfH.d());
    this.q.c(paramfH.k(), paramfH.l());
    this.q.c(paramfH.m());
  }
  
  private void u() {
    fF fF1 = bq.a().a(this);
    fF1.a(this.f);
    fF1.a(this.z.n(), this.z.o());
    if (!fF1.isVisible())
      fF1.setVisible(true); 
    fF1.b(this.z.getWidth(), this.z.getHeight());
  }
  
  public fH a() {
    fH fH = new fH(this.g.getText());
    String str = (this.c.getSelectedItem() == null) ? " " : this.c.getSelectedItem().toString();
    fH.b(str);
    fH.a(this.q.b());
    fH.b(this.q.c());
    fH.a(this.q.a());
    str = (this.d.getSelectedItem() == null) ? " " : this.d.getSelectedItem().toString();
    fH.c(str);
    fH.c(this.q.e());
    fH.d(this.q.f());
    fH.b(this.q.d());
    str = (this.e.getSelectedItem() == null) ? " " : this.e.getSelectedItem().toString();
    fH.d(str);
    fH.e(this.q.h());
    fH.f(this.q.i());
    fH.c(this.q.g());
    return fH;
  }
  
  public void a(boolean paramBoolean) {
    if (this.j == null) {
      this.k = new JPanel();
      this.k.setBackground(Color.BLACK);
      this.k.setLayout(new BorderLayout());
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new BorderLayout());
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/icon_close_11x11.gif"));
      image = eJ.a(image, jPanel1);
      ImageIcon imageIcon = new ImageIcon(image);
      this.s = new JButton(null, imageIcon);
      this.s.setFocusable(false);
      this.s.setToolTipText("Close");
      this.s.addActionListener(new fO(this));
      this.s.setPreferredSize(new Dimension(eJ.a(14), eJ.a(14)));
      JPanel jPanel2 = new JPanel();
      jPanel2.setLayout(new BorderLayout());
      jPanel2.add("North", this.s);
      jPanel1.add("East", jPanel2);
      this.k.add("North", jPanel1);
      image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/filter-16.png"));
      image = eJ.a(image, jPanel2);
      imageIcon = new ImageIcon(image);
      this.t = new JButton(null, imageIcon);
      this.t.setFocusable(false);
      this.t.setToolTipText("Show Filters");
      this.t.addActionListener(new fP(this));
      this.t.setPreferredSize(new Dimension(eJ.a(18), eJ.a(18)));
      this.z.add(this.t);
      this.z.setLayout(new gj(this));
      image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/edit-icon.png"));
      image = eJ.a(image, jPanel2);
      imageIcon = new ImageIcon(image);
      this.u = new JButton(null, imageIcon);
      this.u.setFocusable(false);
      this.u.setToolTipText("Show Filters");
      this.u.addActionListener(new fQ(this));
      this.u.setPreferredSize(new Dimension(eJ.a(18), eJ.a(18)));
      jPanel1.add("West", this.u);
      this.j = new a(null);
      this.j.a(new fR(this));
      M.a().a((l)this.j);
      this.k.add("Center", (Component)this.j);
      add("East", this.k);
    } 
    if (paramBoolean);
    this.k.setVisible(paramBoolean);
    this.t.setVisible(!paramBoolean);
    a(K, "" + paramBoolean);
  }
  
  private void v() {
    if (this.j.a().isEmpty()) {
      this.t.setBackground(getBackground());
    } else {
      this.t.setBackground(Color.RED);
    } 
  }
  
  public void b() {
    boolean bool = this.l.isSelected();
    b(bool);
  }
  
  public void b(boolean paramBoolean) {
    this.l.setSelected(paramBoolean);
    this.q.setVisible(paramBoolean);
    a(L, "" + paramBoolean);
  }
  
  public void a(h paramh) {
    this.r.add(paramh);
  }
  
  private void w() {
    String str = (this.c.getSelectedItem() == null) ? "" : this.c.getSelectedItem().toString();
    Iterator<h> iterator = this.r.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).a(str); 
  }
  
  private void x() {
    String str = (this.d.getSelectedItem() == null) ? "" : this.d.getSelectedItem().toString();
    Iterator<h> iterator = this.r.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).b(str); 
  }
  
  private void y() {
    String str = (this.e.getSelectedItem() == null) ? "" : this.e.getSelectedItem().toString();
    Iterator<h> iterator = this.r.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).c(str); 
  }
  
  public void a(n paramn) {
    this.f.a(paramn);
    if (paramn != null && paramn.size() > 0) {
      b(paramn);
      this.y.setVisible((!this.q.a() || !this.q.d()));
      D.c("Dataset size: " + paramn.d());
      String str = (String)this.c.getSelectedItem();
      this.f.a(str);
      str = (String)this.d.getSelectedItem();
      this.f.b(str);
      str = (String)this.e.getSelectedItem();
      this.f.c(str);
    } 
  }
  
  public void c() {
    if (this.q.a()) {
      double d1 = this.f.a();
      double d2 = this.f.b();
      this.q.b(d1, d2);
    } 
    if (this.q.d()) {
      double d1 = this.f.c();
      double d2 = this.f.d();
      this.q.a(d1, d2);
    } 
    if (this.q.g()) {
      double d1 = this.f.h();
      double d2 = this.f.i();
      this.q.c(d1, d2);
    } 
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dimension dimension;
    int i = (this.c.getPreferredSize()).width;
    int j = (paramInt3 - eJ.a(260)) / 3;
    if (i < j) {
      dimension = new Dimension(i, 20);
    } else {
      dimension = new Dimension(j, 20);
    } 
    this.c.setMinimumSize(dimension);
    this.d.setMinimumSize(dimension);
    this.e.setMinimumSize(dimension);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void repaint() {
    super.repaint();
    if (this.z != null)
      this.z.a(); 
  }
  
  private void b(n paramn) {
    this.W = true;
    a(this.c, paramn, " ");
    a(this.d, paramn, " ");
    a(this.e, paramn, G);
    e();
    this.W = false;
  }
  
  private void a(e parame, n paramn, String paramString) {
    if (paramn == null)
      return; 
    String str = (String)parame.getSelectedItem();
    boolean bool1 = false;
    String[] arrayOfString1 = parame.b();
    String[] arrayOfString2 = new String[paramn.size()];
    boolean bool2 = (arrayOfString1.length == arrayOfString2.length + 1) ? true : false;
    byte b;
    for (b = 0; b < paramn.size(); b++) {
      j j = (j)paramn.get(b);
      arrayOfString2[b] = j.a();
      if (bool2 && !arrayOfString2[b].equals(arrayOfString1[b + 1]))
        bool2 = false; 
    } 
    if (!bool2) {
      parame.removeAllItems();
      if (parame.getItemCount() == 0)
        parame.a(paramString); 
      if (i.a(i.E, i.F))
        arrayOfString2 = S.a(arrayOfString2); 
      b = 1;
      for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
        if (!bool1 && arrayOfString2[b1].equals(str))
          bool1 = true; 
        int i = b1 + b;
        parame.a(arrayOfString2[b1]);
      } 
    } 
    try {
      if (!bool1)
        parame.b(str); 
    } catch (Exception exception) {
      parame.b(paramString);
    } 
  }
  
  protected void d() {
    if (this.c.getSelectedItem() != null && this.d.getSelectedItem() != null && ((String)this.c.getSelectedItem()).length() > 0 && ((String)this.d.getSelectedItem()).length() > 0) {
      String str;
      if (this.e.getSelectedItem() != null && !this.e.getSelectedItem().toString().equals(" ")) {
        str = this.d.getSelectedItem() + " vs " + this.c.getSelectedItem() + " vs " + this.e.getSelectedItem().toString();
      } else {
        str = this.d.getSelectedItem() + " vs " + this.c.getSelectedItem();
      } 
      this.g.setText(str);
      this.h.setText(this.c.getSelectedItem().toString());
      this.i.setText(this.d.getSelectedItem().toString());
      this.z.a(this.c.getSelectedItem().toString());
      this.z.b(this.d.getSelectedItem().toString());
      if (this.e.getSelectedItem() != null) {
        this.z.c(this.e.getSelectedItem().toString());
      } else {
        this.z.c("");
      } 
    } 
  }
  
  public void a(int paramInt) {
    if (paramInt > this.C && this.f.a != null && paramInt < this.B && this.f.b != null && paramInt < this.f.b.i()) {
      q q = this.f.b(paramInt);
      this.z.a(q.getX(), q.getY());
      this.z.repaint();
    } else {
      this.z.l();
    } 
  }
  
  public void a(et paramet) {
    this.A = paramet;
  }
  
  private boolean a(e parame, String paramString) {
    for (byte b = 0; b < parame.getItemCount(); b++) {
      if (parame.a(b).equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void e() {
    if (this.A != null) {
      String str1 = this.A.a(D);
      String str2 = this.A.a(E);
      if (str1 != null && a(this.c, str1)) {
        this.c.b(str1);
      } else {
        str1 = null;
      } 
      if (str2 != null && a(this.d, str2)) {
        this.d.b(str2);
      } else {
        str2 = null;
      } 
      if ((str1 == null || str2 == null) && this.I != null && this.J != null) {
        this.c.b(this.I);
        this.d.b(this.J);
      } 
      String str3 = this.A.a(F);
      if (str3 == null && this.H != null)
        str3 = this.H; 
      if (str3 != null)
        this.e.b(str3); 
      String str4 = this.A.a(this.U);
      if (str4 != null)
        try {
          d(Integer.parseInt(str4));
        } catch (NumberFormatException numberFormatException) {
          d(1);
        }  
      String str5 = this.A.a(K);
      boolean bool1 = (str5 != null && Boolean.parseBoolean(str5)) ? true : false;
      a(bool1);
      str5 = this.A.a(L);
      boolean bool2 = (str5 != null && Boolean.parseBoolean(str5)) ? true : false;
      b(bool2);
      double d = 0.0D;
      int i = 0;
      try {
        str5 = this.A.a(O);
        if (str5 != null) {
          d = Double.parseDouble(str5);
          i = (int)Math.round(d);
          this.z.d(i);
        } 
      } catch (NumberFormatException numberFormatException) {}
      try {
        str5 = this.A.a(P);
        if (str5 != null) {
          d = Double.parseDouble(str5);
          i = (int)Math.round(d);
          this.z.e(i);
        } 
      } catch (NumberFormatException numberFormatException) {}
      try {
        str5 = this.A.a(R);
        if (str5 != null) {
          i = Integer.parseInt(str5);
          this.z.f(i);
        } 
      } catch (Exception exception) {}
      try {
        str5 = this.A.a(Q);
        if (str5 != null) {
          i = Integer.parseInt(str5);
          this.z.g(i);
        } 
      } catch (Exception exception) {}
      try {
        str5 = this.A.a(S);
        if (str5 != null) {
          i = Integer.parseInt(str5);
          this.z.k(i);
        } 
      } catch (Exception exception) {}
    } 
  }
  
  private void a(String paramString1, String paramString2) {
    if (this.A != null)
      this.A.a(paramString1, paramString2); 
  }
  
  public int f() {
    return this.B;
  }
  
  public void b(int paramInt) {
    this.B = paramInt;
    this.z.d();
    this.V.a();
  }
  
  public int g() {
    return this.C;
  }
  
  public void c(int paramInt) {
    this.C = paramInt;
    this.z.d();
    this.V.a();
  }
  
  public void a(String paramString) {
    this.I = paramString;
  }
  
  public void b(String paramString) {
    this.J = paramString;
  }
  
  public void c(String paramString) {
    this.H = paramString;
  }
  
  public void a(Component paramComponent, int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenu jMenu = new JMenu("Z Axis Color Mode");
    String str = this.A.a(this.U);
    if (str == null || str.equals(""))
      str = "" + this.z.k(); 
    i i = new i();
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Color to Max Value for Point", str.equals("" + m.a));
    i.a(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1.addItemListener(new fS(this));
    jMenu.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Color to Average Value for Point", str.equals("" + m.b));
    i.a(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2.addItemListener(new fT(this));
    jMenu.add(jCheckBoxMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Color to Min Value for Point", str.equals("" + m.c));
    i.a(jCheckBoxMenuItem3);
    jCheckBoxMenuItem3.addItemListener(new fU(this));
    jMenu.add(jCheckBoxMenuItem3);
    jPopupMenu.add(jMenu);
    if (!this.q.a() || !this.q.d()) {
      JMenuItem jMenuItem1 = new JMenuItem("Default X & Y Scale");
      jMenuItem1.addActionListener(new fV(this));
      jPopupMenu.add(jMenuItem1);
    } 
    JMenuItem jMenuItem = new JMenuItem(O);
    jMenuItem.addActionListener(new fX(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(P);
    jMenuItem.addActionListener(new fY(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(Q);
    jMenuItem.addActionListener(new fZ(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(R);
    jMenuItem.addActionListener(new ga(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(S);
    jMenuItem.addActionListener(new gb(this));
    jPopupMenu.add(jMenuItem);
    jPopupMenu.show(paramComponent, paramInt1, paramInt2);
  }
  
  public void d(int paramInt) {
    this.z.c(paramInt);
    this.z.d();
    this.z.repaint();
    a(this.U, paramInt + "");
  }
  
  public void h() {
    this.z.d();
    this.z.repaint();
    if (bq.a().j() != null && bq.a().j().d().equals(this)) {
      bq.a().j().c().d();
      bq.a().j().c().repaint();
    } 
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    this.q.b(paramDouble1, paramDouble2);
    this.q.a(paramDouble3, paramDouble4);
    this.q.b(false);
    this.q.a(false);
    this.y.setVisible(true);
    repaint();
    if (bq.a().j() != null && bq.a().j().d().equals(this))
      bq.a().j().c().a(); 
  }
  
  public m i() {
    return this.z;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */