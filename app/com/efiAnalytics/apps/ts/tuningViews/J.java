package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.T;
import V.a;
import bH.A;
import bH.D;
import bH.K;
import bH.aa;
import com.efiAnalytics.apps.ts.dashboard.aR;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.BurnButtonTv;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.SelectableTable;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TableCellCrossHair;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneSettingsPanel;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneViewGaugeCluster;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.ct;
import com.efiAnalytics.ui.cz;
import com.efiAnalytics.ui.dn;
import com.efiAnalytics.ui.eJ;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import n.a;
import n.g;
import r.a;
import r.i;
import r.j;
import s.g;
import v.g;

public class J extends JPanel implements bc, a, g {
  T a = new T(this);
  
  Q b = new Q(this);
  
  private int C = eJ.a(8);
  
  private Window D = null;
  
  private Container E = null;
  
  boolean c = false;
  
  private Dimension F = null;
  
  private boolean G = false;
  
  private R H = null;
  
  List d = new ArrayList();
  
  private String I = null;
  
  private boolean J = false;
  
  private ArrayList K = new ArrayList();
  
  private boolean L = true;
  
  public static final String e = g.b("Edit Enabled Condition");
  
  public static final String f = g.b("Edit Tuning View Name");
  
  public static final String g = g.b("Bring Forward");
  
  public static final String h = g.b("Send Backward");
  
  public static final String i = g.b("Bring to Front");
  
  public static final String j = g.b("Send to Back");
  
  public static final String k = g.b("Gauge Properties");
  
  public static final String l = g.b("Add Settings Panel");
  
  public static final String m = g.b("Add Tuning Table");
  
  public static final String n = g.b("Add Gauge Cluster");
  
  public static final String o = g.b("Add Table Cell Cross Hair");
  
  public static final String p = g.b("Add Burn Button");
  
  public static final String q = g.b("Remove From Tuning View");
  
  public static final String r = g.b("Export / Save As");
  
  public static final String s = g.b("Save Tuning View");
  
  public static final String t = g.b("Load Tuning View");
  
  public static final String u = g.b("Designer Mode");
  
  public static final String v = g.b("Copy");
  
  public static final String w = g.b("Paste");
  
  public static final String x = g.b("Show Grid");
  
  public static final String y = u;
  
  private static String M = j.A() + ".tempView";
  
  private boolean N = true;
  
  private boolean O = true;
  
  private String P = null;
  
  private F Q = null;
  
  private Image R = null;
  
  X z = null;
  
  private String S = "";
  
  int A = eJ.a(2);
  
  Stroke B = new BasicStroke(this.A);
  
  public J() {
    setFocusable(true);
    if (A.i().b()) {
      setLayout(new l());
      addMouseListener(this.b);
      addMouseMotionListener(this.b);
      setDoubleBuffered(true);
      setFocusable(true);
    } 
  }
  
  public void c() {
    TuneSettingsPanel tuneSettingsPanel = new TuneSettingsPanel();
    try {
      a((TuneViewComponent)tuneSettingsPanel);
    } catch (a a1) {}
    validate();
  }
  
  public void a(TuneViewComponent paramTuneViewComponent) {
    add(paramTuneViewComponent);
    if (T.a().c() != null)
      paramTuneViewComponent.initializeComponents(); 
    paramTuneViewComponent.addMouseListener(this.a);
    paramTuneViewComponent.addMouseMotionListener(this.a);
    paramTuneViewComponent.enableEditMode(B());
    if (B()) {
      this.K.clear();
      this.K.add(paramTuneViewComponent);
      repaint();
    } 
    if (paramTuneViewComponent instanceof TuneViewGaugeCluster) {
      TuneViewGaugeCluster tuneViewGaugeCluster = (TuneViewGaugeCluster)paramTuneViewComponent;
      tuneViewGaugeCluster.addFullScreenRequestListener(new K(this));
    } 
    if (B())
      d(paramTuneViewComponent); 
  }
  
  public void d() {
    Iterator<TuneViewComponent> iterator = r().iterator();
    while (iterator.hasNext()) {
      TuneViewComponent tuneViewComponent = iterator.next();
      iterator.remove();
      b(tuneViewComponent);
    } 
    repaint();
  }
  
  public void b(TuneViewComponent paramTuneViewComponent) {
    paramTuneViewComponent.removeMouseListener(this.a);
    paramTuneViewComponent.removeMouseMotionListener(this.a);
    remove(paramTuneViewComponent);
    paramTuneViewComponent.close();
    this.K.remove(paramTuneViewComponent);
    repaint();
  }
  
  public void removeAll() {
    Component[] arrayOfComponent = getComponents();
    int i = getComponentCount();
    for (byte b = 0; b < i; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent)
        b((TuneViewComponent)arrayOfComponent[b]); 
    } 
    super.removeAll();
  }
  
  public void paint(Graphics paramGraphics) {
    if (B()) {
      paramGraphics.setColor(getBackground());
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      if (this.O) {
        byte b = 10;
        Color color = UIManager.getColor("Button.disabledText");
        if (color == null)
          color = Color.GRAY; 
        paramGraphics.setColor(color);
        int i;
        for (i = 0; i < getWidth(); i += b)
          paramGraphics.drawLine(i, 0, i, getHeight()); 
        for (i = 0; i < getHeight(); i += b)
          paramGraphics.drawLine(0, i, getWidth(), i); 
      } 
      paintChildren(paramGraphics);
      for (TuneViewComponent tuneViewComponent : this.K)
        a(paramGraphics, tuneViewComponent); 
      a(paramGraphics);
    } else {
      super.paint(paramGraphics);
    } 
    if (this.z != null && this.z.a) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = x();
      if (image != null) {
        int i = image.getWidth(null) / 2;
        int j = image.getHeight(null) / 2;
        int k = (getWidth() - i) / 2;
        int m = (getHeight() - j) / 2;
        paramGraphics.drawImage(image, k, m, i, j, null);
      } 
    } 
    if (this.I != null) {
      paramGraphics.setFont(UIManager.getFont("TabbedPane.font"));
      paramGraphics.setColor(UIManager.getColor("Label.foreground"));
      int i = (getWidth() - paramGraphics.getFontMetrics().stringWidth(this.I)) / 2;
      paramGraphics.drawString(this.I, i, getHeight() / 2);
    } 
  }
  
  private void a(Graphics paramGraphics) {
    if (this.b.a() != null) {
      Rectangle rectangle = this.b.a();
      paramGraphics.setColor(Color.YELLOW);
      paramGraphics.setXORMode(getBackground());
      int i = Math.abs(rectangle.width);
      int j = Math.abs(rectangle.height);
      int k = (rectangle.width < 0) ? (rectangle.x + rectangle.width) : rectangle.x;
      int m = (rectangle.height < 0) ? (rectangle.y + rectangle.height) : rectangle.y;
      BasicStroke basicStroke = new BasicStroke(1.0F, 0, 2, 0.0F, new float[] { 2.0F, 1.0F }, 0.0F);
      ((Graphics2D)paramGraphics).setStroke(basicStroke);
      paramGraphics.drawRect(k, m, i, j);
    } 
  }
  
  private void a(Graphics paramGraphics, TuneViewComponent paramTuneViewComponent) {
    if (!B())
      return; 
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int i = paramTuneViewComponent.getX();
    int j = paramTuneViewComponent.getY();
    int k = paramTuneViewComponent.getWidth();
    int m = paramTuneViewComponent.getHeight();
    int n = this.C - this.A / 2;
    if (k > 0 && m > 0) {
      graphics2D.setStroke(this.B);
      Color color = Color.yellow;
      paramGraphics.setColor(color);
      paramGraphics.drawLine(i + n, j + n, i + k - n, j + m - n);
      paramGraphics.drawLine(i + n, j + m - n, i + k - n, j + n);
      paramGraphics.fillRect(i, j, this.C, this.C);
      paramGraphics.fillRect(i, j + m - this.C, this.C, this.C);
      paramGraphics.fillRect(i + k - this.C, j, this.C, this.C);
      if (this.K.size() == 1)
        paramGraphics.setColor(Color.red); 
      paramGraphics.fillRect(i + k - this.C, j + m - this.C, this.C, this.C);
      String str = "X: " + i + ", Y:" + j + ", Width: " + k + ", Height: " + m;
      paramGraphics.setColor(Color.DARK_GRAY);
      paramGraphics.fillRect(i + 10, j, paramGraphics.getFontMetrics().stringWidth(str) + 10, paramGraphics.getFont().getSize() + 2);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawString(str, i + 15, j + paramGraphics.getFont().getSize() - 1);
    } 
  }
  
  public void a(Component paramComponent, int paramInt1, int paramInt2) {
    boolean bool = a.a().a(a.da, a.db);
    if (bool)
      return; 
    JPopupMenu jPopupMenu = e();
    add(jPopupMenu);
    if (paramComponent != null) {
      jPopupMenu.show(paramComponent, paramInt1, paramInt2);
    } else {
      jPopupMenu.show(this, paramInt1, paramInt2);
    } 
  }
  
  public JPopupMenu e() {
    br br = new br();
    a((bq)br);
    return (JPopupMenu)br;
  }
  
  public bq a(bq parambq) {
    S s = new S(this);
    JMenu jMenu = null;
    if (i.a().a("43wunjt58j7tjtht")) {
      JMenu jMenu1 = new JMenu(g.b("Load / Save"));
      parambq.add(jMenu1);
      jMenu1.add(t).addActionListener(s);
      jMenu1.add(s).addActionListener(s);
      jMenu1.add(r).addActionListener(s);
    } 
    if (B()) {
      JMenu jMenu1 = new JMenu(g.b("Designer Menu"));
      jMenu1.add(f).addActionListener(s);
      jMenu1.add(e).addActionListener(s);
      jMenu = new JMenu(g.b("New"));
      jMenu.add(l).addActionListener(s);
      jMenu.add(m).addActionListener(s);
      jMenu.add(n).addActionListener(s);
      jMenu.add(o).addActionListener(s);
      if (!i.a().a("OIJFDSFDSAPOFS"))
        jMenu.add(p).addActionListener(s); 
      jMenu1.add(jMenu);
      if (this.K.size() > 0)
        jMenu1.add(q).addActionListener(s); 
      if (r().size() > 0) {
        jMenu = new JMenu(g.b("Order"));
        jMenu.add(g).addActionListener(s);
        jMenu.add(h).addActionListener(s);
        jMenu.add(i).addActionListener(s);
        jMenu.add(j).addActionListener(s);
        jMenu1.add(jMenu);
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(x);
      jCheckBoxMenuItem.setState(this.O);
      jCheckBoxMenuItem.addActionListener(new L(this));
      jMenu1.add(jCheckBoxMenuItem);
      parambq.add(jMenu1);
    } 
    if (P()) {
      JMenuItem jMenuItem = new JMenuItem(g.b("Full Screen"));
      jMenuItem.setSelected(s());
      jMenuItem.addActionListener(new M(this));
      parambq.add(jMenuItem);
    } 
    if (i.a().a(";LFDS;LFDS0943;L")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(u);
      jCheckBoxMenuItem.setState(B());
      jCheckBoxMenuItem.addActionListener(new N(this));
      parambq.add(jCheckBoxMenuItem);
      if (!i.a().a("sesrhsfghyuf754"))
        jCheckBoxMenuItem.setEnabled(false); 
    } 
    return parambq;
  }
  
  public Component f() {
    return (this.K.size() > 0) ? this.K.get(0) : null;
  }
  
  public F g() {
    if (!this.J && this.Q != null)
      return this.Q; 
    F f = new F();
    f.b(getName());
    f.d(this.S);
    if (T.a().c() != null)
      f.a(T.a().c().i()); 
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof TuneViewComponent)
        f.add((E)getComponent(b)); 
    } 
    try {
      File file = (new cz()).a(this, 800, 450);
      f.a(file);
    } catch (IOException iOException) {
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (a a1) {
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    return f;
  }
  
  public void a(String paramString) {
    if (paramString.equals(l)) {
      c();
    } else if (paramString.equals(m)) {
      n();
    } else if (paramString.equals(n)) {
      o();
    } else if (paramString.equals(o)) {
      p();
    } else if (paramString.equals(p)) {
      q();
    } else if (paramString.equals(r)) {
      Q();
    } else if (paramString.equals(s)) {
      h();
    } else if (paramString.equals(t)) {
      l();
    } else if (paramString.equals(f)) {
      j();
    } else if (paramString.equals(e)) {
      k();
    } 
    Component component = f();
    if (component == null) {
      repaint();
      return;
    } 
    if (paramString.equals(g)) {
      a(component);
    } else if (paramString.equals(h)) {
      b(component);
    } else if (paramString.equals(i)) {
      d(component);
    } else if (paramString.equals(j)) {
      c(component);
    } else if (component instanceof TuneViewComponent && paramString.equals(q)) {
      d();
    } 
    repaint();
  }
  
  private void Q() {
    String[] arrayOfString = { a.cp };
    String str = (w() == null) ? ("*." + a.cp) : w();
    str = bV.a(this, g.b("Save Tuning View"), arrayOfString, "*." + a.cp, j.k().getAbsolutePath(), false);
    if (str == null)
      return; 
    if (!str.toLowerCase().endsWith("." + a.cp.toLowerCase()))
      str = str + "." + a.cp; 
    b(str);
    j.e(new File(str));
  }
  
  public void h() {
    if (w() != null) {
      a(w(), (String)null);
      this.L = true;
    } else {
      Q();
    } 
  }
  
  public void b(String paramString) {
    a(paramString, (String)null);
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.trim().equals(""))
      return; 
    g g1 = new g();
    try {
      F f = g();
      File file = new File(paramString1);
      synchronized (this) {
        g1.a(f, file);
      } 
    } catch (a a1) {
      bV.d("Error saving Tuning View.\n" + a1.getMessage() + "\nCheck Log for more details", this);
    } 
  }
  
  public TuneViewComponent[] i() {
    ArrayList<Component> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < getComponentCount(); b1++) {
      if (getComponent(b1) instanceof TuneViewComponent)
        arrayList.add(getComponent(b1)); 
    } 
    TuneViewComponent[] arrayOfTuneViewComponent = new TuneViewComponent[arrayList.size()];
    for (byte b2 = 0; b2 < arrayList.size(); b2++)
      arrayOfTuneViewComponent[b2] = (TuneViewComponent)arrayList.get(b2); 
    return arrayOfTuneViewComponent;
  }
  
  public void j() {
    String str = JOptionPane.showInputDialog(this, "Change Tuning View Name", getName());
    if (str != null)
      setName(str); 
  }
  
  public void k() {
    String str1 = (A() != null) ? A() : "";
    String str2 = JOptionPane.showInputDialog(this, "Tuning View Enable Condition", str1);
    if (str2 != null)
      d(str2); 
  }
  
  protected void l() {
    m();
  }
  
  public void m() {
    b b = new b();
    String[] arrayOfString1 = T.a().d();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    ArrayList<R> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r = T.a().c(arrayOfString1[b1]);
      arrayList.add(r);
      arrayOfString2[b1] = r.i();
    } 
    V v = new V(this, b, arrayOfString2);
    J j = this;
    O o = new O(this, arrayList, b, j);
    o.start();
    Window window1 = bV.b(this);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null; 
    ct ct = new ct(window2, b, "Select Tuning View", v, 7);
    if (v != null)
      ct.a(v); 
    ct.setSize(640, 480);
    bV.a(window1, (Component)ct);
    ct.setVisible(true);
  }
  
  public void a(F paramF) {
    this.Q = paramF;
    if (this.J)
      R(); 
  }
  
  private void R() {
    close();
    aa aa = new aa();
    aa.a();
    for (TuneViewComponent tuneViewComponent : this.Q) {
      try {
        a(tuneViewComponent);
      } catch (a a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      } 
    } 
    d(this.Q.e());
    validate();
    repaint();
    D.d("Loaded TuningView Components for " + getName() + " in " + aa.d() + "ms.");
  }
  
  public void n() {
    SelectableTable selectableTable = new SelectableTable();
    try {
      a((TuneViewComponent)selectableTable);
    } catch (a a1) {}
    validate();
  }
  
  public void o() {
    TuneViewGaugeCluster tuneViewGaugeCluster = new TuneViewGaugeCluster();
    try {
      a((TuneViewComponent)tuneViewGaugeCluster);
    } catch (a a1) {}
    validate();
  }
  
  public void p() {
    TableCellCrossHair tableCellCrossHair = new TableCellCrossHair();
    try {
      a((TuneViewComponent)tableCellCrossHair);
    } catch (a a1) {}
    validate();
  }
  
  public void q() {
    BurnButtonTv burnButtonTv = new BurnButtonTv();
    try {
      a((TuneViewComponent)burnButtonTv);
    } catch (a a1) {}
    validate();
  }
  
  public void a(Component paramComponent) {
    int i = getComponentZOrder(paramComponent);
    if (i > 0 && i < getComponentCount() - 1)
      add(paramComponent, i - 1); 
  }
  
  public void b(Component paramComponent) {
    int i = getComponentZOrder(paramComponent);
    if (i >= 0 && i < getComponentCount() - 1)
      add(paramComponent, i + 1); 
  }
  
  public void c(Component paramComponent) {
    add(paramComponent, getComponentCount() - 1);
  }
  
  public void d(Component paramComponent) {
    add(paramComponent, 0);
  }
  
  public ArrayList r() {
    return this.K;
  }
  
  public boolean s() {
    return (this.D != null);
  }
  
  public void t() {
    if (this.D == null) {
      D.c("FullScreen");
      v();
    } else {
      D.c("End FullScreen");
      u();
    } 
  }
  
  public void u() {
    if (this.E != null && this.D != null) {
      this.E.add(this);
      doLayout();
      this.E.validate();
      if (bH.J.c());
      this.D.dispose();
      this.D = null;
      this.c = false;
    } 
  }
  
  public void a(Rectangle paramRectangle) {
    Component[] arrayOfComponent = getComponents();
    TuneViewComponent tuneViewComponent = null;
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent) {
        TuneViewComponent tuneViewComponent1 = (TuneViewComponent)arrayOfComponent[b];
        Rectangle rectangle = tuneViewComponent1.getBounds();
        if (rectangle.x > paramRectangle.x && rectangle.y > paramRectangle.y && rectangle.x + rectangle.width < paramRectangle.x + paramRectangle.width && rectangle.y + rectangle.height < paramRectangle.y + paramRectangle.height) {
          a(tuneViewComponent1, false);
          if (tuneViewComponent == null)
            tuneViewComponent = tuneViewComponent1; 
        } 
      } 
    } 
    if (tuneViewComponent != null)
      tuneViewComponent.requestFocus(); 
  }
  
  public boolean c(TuneViewComponent paramTuneViewComponent) {
    return this.K.contains(paramTuneViewComponent);
  }
  
  public void v() {
    if (this.N && !s()) {
      this.E = getParent();
      this.D = new U(this, bV.a(this));
      this.D.setLayout(new BorderLayout());
      GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      Point point = MouseInfo.getPointerInfo().getLocation();
      Rectangle rectangle = dn.a(point.x, point.y);
      this.D.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
      JPanel jPanel = new JPanel();
      jPanel.setDoubleBuffered(true);
      jPanel.setLayout(new GridLayout(1, 1));
      jPanel.add(this);
      this.D.add("Center", jPanel);
      if (bH.J.c()) {
        K.a(this.D);
        K.b(this.D);
      } else if (!bH.J.a() && graphicsDevice.isFullScreenSupported()) {
        graphicsDevice.setFullScreenWindow(this.D);
      } 
      this.D.setVisible(true);
      this.D.validate();
    } 
  }
  
  public TuneViewComponent a(int paramInt1, int paramInt2) {
    for (TuneViewComponent tuneViewComponent : this.K) {
      int j = tuneViewComponent.getX() + tuneViewComponent.getWidth() - this.C;
      int k = tuneViewComponent.getY() + tuneViewComponent.getHeight() - this.C;
      int m = tuneViewComponent.getX() + tuneViewComponent.getWidth();
      int n = tuneViewComponent.getY() + tuneViewComponent.getHeight();
      if (paramInt1 >= j && paramInt1 <= m && paramInt2 >= k && paramInt2 <= n)
        return tuneViewComponent; 
    } 
    Component[] arrayOfComponent = getComponents();
    for (int i = getComponentCount() - 1; i >= 0; i--) {
      if (arrayOfComponent[i] instanceof TuneViewComponent) {
        TuneViewComponent tuneViewComponent = (TuneViewComponent)arrayOfComponent[i];
        int j = tuneViewComponent.getX();
        int k = tuneViewComponent.getY();
        int m = tuneViewComponent.getX() + tuneViewComponent.getWidth();
        int n = tuneViewComponent.getY() + tuneViewComponent.getHeight();
        if (tuneViewComponent instanceof aR) {
          aR aR = (aR)tuneViewComponent;
          if (paramInt1 >= j && paramInt1 <= m && paramInt2 >= k && paramInt2 <= n && aR.isComponentPaintedAt(paramInt1 - j, paramInt2 - k))
            return tuneViewComponent; 
        } else if (paramInt1 >= j && paramInt1 <= m && paramInt2 >= k && paramInt2 <= n) {
          return tuneViewComponent;
        } 
      } 
    } 
    return null;
  }
  
  public Dimension getPreferredSize() {
    return (this.F != null) ? this.F : super.getPreferredSize();
  }
  
  public Dimension getMinimumSize() {
    return (this.F != null) ? this.F : super.getMinimumSize();
  }
  
  public void close() {
    D.c("Closing TuneViewPanel " + getName());
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof bc)
        ((bc)getComponent(b)).close(); 
    } 
    removeAll();
  }
  
  public String getName() {
    String str = super.getName();
    if (str == null || str.isEmpty())
      str = "TuningPanel" + (int)(Math.random() * 200.0D); 
    return str;
  }
  
  public String w() {
    return this.P;
  }
  
  public void c(String paramString) {
    this.P = paramString;
  }
  
  public boolean a() {
    this.J = true;
    if (this.Q != null && getComponentCount() == 0) {
      P p = new P(this);
      SwingUtilities.invokeLater(p);
    } 
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(M());
    return true;
  }
  
  public void b() {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(M());
  }
  
  protected Image x() {
    if (this.R == null)
      try {
        this.R = cO.a().a(cO.w);
        this.R = eJ.a(this.R, this);
      } catch (a a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
    return this.R;
  }
  
  public void y() {
    z();
    this.z = new X(this);
    this.z.start();
    this.I = null;
  }
  
  public void z() {
    if (this.z != null) {
      this.z.a();
      this.z = null;
    } 
    repaint();
  }
  
  public String A() {
    return this.S;
  }
  
  public void d(String paramString) {
    this.S = paramString;
  }
  
  public void e(String paramString) {
    this.I = paramString;
  }
  
  public void setMinimumSize(Dimension paramDimension) {
    this.F = paramDimension;
  }
  
  public boolean B() {
    return this.G;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean)
      this.L = false; 
    this.G = paramBoolean;
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof TuneViewComponent)
        ((TuneViewComponent)getComponent(b)).enableEditMode(paramBoolean); 
    } 
    validate();
    repaint();
  }
  
  public void C() {
    this.K.clear();
  }
  
  public void a(TuneViewComponent paramTuneViewComponent, boolean paramBoolean) {
    if (paramBoolean)
      this.K.clear(); 
    if (this.K.contains(paramTuneViewComponent) && !paramBoolean) {
      this.K.remove(paramTuneViewComponent);
    } else {
      this.K.add(paramTuneViewComponent);
      paramTuneViewComponent.requestFocus();
    } 
  }
  
  public void D() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth() + 1, tuneViewComponent.getHeight());
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void E() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth() - 1, tuneViewComponent.getHeight());
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void F() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth(), tuneViewComponent.getHeight() + 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void G() {
    for (TuneViewComponent tuneViewComponent : this.K) {
      tuneViewComponent.setSize(tuneViewComponent.getWidth(), tuneViewComponent.getHeight() - 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
      tuneViewComponent.validate();
    } 
  }
  
  public void H() {
    for (TuneViewComponent tuneViewComponent : this.K)
      tuneViewComponent.validate(); 
  }
  
  public void I() {
    for (TuneViewComponent tuneViewComponent : r()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x + 1, (tuneViewComponent.getLocation()).y);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public void J() {
    for (TuneViewComponent tuneViewComponent : r()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x - 1, (tuneViewComponent.getLocation()).y);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public void K() {
    for (TuneViewComponent tuneViewComponent : r()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x, (tuneViewComponent.getLocation()).y - 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public void L() {
    for (TuneViewComponent tuneViewComponent : r()) {
      tuneViewComponent.setLocation((tuneViewComponent.getLocation()).x, (tuneViewComponent.getLocation()).y + 1);
      tuneViewComponent.updateRelativeBoundsToCurrent();
    } 
  }
  
  public R M() {
    if (this.H == null)
      this.H = new R(this, this); 
    return this.H;
  }
  
  public void N() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent) {
        if (f() == null) {
          a((TuneViewComponent)arrayOfComponent[b], true);
          repaint();
          return;
        } 
        if (r().contains(arrayOfComponent[b])) {
          if (arrayOfComponent.length > b + 1 && arrayOfComponent[b + 1] instanceof TuneViewComponent) {
            a((TuneViewComponent)arrayOfComponent[b + 1], true);
            repaint();
            return;
          } 
          if (arrayOfComponent[0] instanceof TuneViewComponent) {
            a((TuneViewComponent)arrayOfComponent[0], true);
            repaint();
            return;
          } 
        } 
      } 
    } 
  }
  
  public boolean O() {
    TuneViewComponent[] arrayOfTuneViewComponent = i();
    for (TuneViewComponent tuneViewComponent : arrayOfTuneViewComponent) {
      if (tuneViewComponent.isDirty())
        return false; 
    } 
    return this.L;
  }
  
  public void b(boolean paramBoolean) {
    TuneViewComponent[] arrayOfTuneViewComponent = i();
    for (TuneViewComponent tuneViewComponent : arrayOfTuneViewComponent)
      tuneViewComponent.setClean(paramBoolean); 
    this.L = paramBoolean;
    this.I = null;
  }
  
  public boolean P() {
    return (this.N && i.a().a("d67nhtrbd4es8j"));
  }
  
  public void a(m paramm) {
    if (!this.d.contains(paramm))
      this.d.add(paramm); 
  }
  
  private boolean b(String paramString1, String paramString2) {
    for (m m : this.d) {
      if (!m.a(paramString1, paramString2))
        return false; 
    } 
    return true;
  }
  
  public void setName(String paramString) {
    String str = getName();
    if (b(str, paramString))
      super.setName(paramString); 
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */