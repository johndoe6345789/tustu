package ao;

import W.j;
import W.n;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import g.k;
import h.b;
import h.i;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;

public class ar extends JComponent implements bl {
  j a = null;
  
  String b = "";
  
  String c = "";
  
  int d = 0;
  
  int e = 0;
  
  int f = 0;
  
  double g = 0.0D;
  
  double h = 0.0D;
  
  double i = 0.0D;
  
  FontMetrics j = null;
  
  private boolean p = false;
  
  private boolean q = true;
  
  private boolean r = false;
  
  Color k = Color.lightGray;
  
  Color l = null;
  
  Image m = null;
  
  Image n = null;
  
  private A s = null;
  
  private Color t = null;
  
  private int u = 0;
  
  private boolean v = false;
  
  int o = -1;
  
  private boolean w = false;
  
  public ar() {
    addMouseListener(new av(this));
    a();
  }
  
  public void a() {
    Font font = UIManager.getFont("Label.font");
    int i = eJ.a(11);
    if (font != null)
      i = Math.round(font.getSize2D() * i / eJ.a()); 
    setFont(new Font("SansSerif", 1, i));
  }
  
  public ar(j paramj) {
    this();
    a(paramj);
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
  
  public void paint(Graphics paramGraphics) {
    a(paramGraphics);
  }
  
  private int f() {
    if (this.o < 0)
      this.o = eJ.a(8); 
    return this.o;
  }
  
  public void a(Graphics paramGraphics) {
    if (this.j == null)
      this.j = getFontMetrics(getFont()); 
    if (this.l == null)
      this.l = getBackground(); 
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    String str = h();
    paramGraphics.setColor(this.l);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(getForeground());
    paramGraphics.setFont(getFont());
    int i = getWidth() - this.j.stringWidth(str) - f();
    int k = getWidth() - this.j.stringWidth(this.c) - this.j.stringWidth(": 00.000") - f();
    this.e = (i < k) ? i : k;
    this.f = getHeight() - (getHeight() - getFont().getSize()) / 2 - 2;
    if (this.e < g())
      this.e = g(); 
    paramGraphics.drawString(str, this.e, this.f);
    if (this.s != null) {
      b(paramGraphics);
    } else if (e()) {
      a(paramGraphics, this.i, this.g, this.h);
    } 
    paramGraphics.setColor(this.k);
    paramGraphics.draw3DRect(0, 0, getWidth(), getHeight(), false);
  }
  
  public void update(Graphics paramGraphics) {
    if (!isValid()) {
      paint(paramGraphics);
      validate();
      return;
    } 
    paramGraphics.setColor(this.l);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(getForeground());
    paramGraphics.setFont(getFont());
    paramGraphics.drawString(h(), this.e, this.f);
    if (e())
      a(paramGraphics, this.i, this.g, this.h); 
    paramGraphics.setColor(this.k);
    paramGraphics.draw3DRect(0, 0, getWidth(), getHeight(), false);
  }
  
  private int g() {
    return (e() && this.s == null) ? (i() + 2 + 5) : ((this.s != null) ? (getHeight() + 2) : 2);
  }
  
  private String h() {
    String str = this.c;
    if (this.a != null && this.a.l())
      str = str + i.d(); 
    if (this.a != null && this.a.n() != null && !this.a.n().isEmpty() && !this.a.n().equals("bit"))
      str = str + "(" + this.a.n() + ")"; 
    return str + ": " + this.b;
  }
  
  public void a(j paramj) {
    this.a = paramj;
    this.c = paramj.a();
  }
  
  public j b() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.c = paramString;
  }
  
  public void b(String paramString) {
    this.b = paramString;
    repaint(1000L);
  }
  
  public String c() {
    return this.b;
  }
  
  public String getToolTipText(MouseEvent paramMouseEvent) {
    return getToolTipText();
  }
  
  public void b(int paramInt) {
    try {
      this.i = this.a.c(paramInt);
      String str1 = this.a.a(paramInt);
      if (str1 != null && c() != null && str1.equals(c()) && (hx.a().s() == null || c().contains(":")))
        return; 
      this.g = (this.d == 0) ? this.a.h() : 0.0D;
      this.h = (this.d == 0) ? this.a.g() : 1.0D;
      if (this.d != 0) {
        int i = (int)this.i;
        str1 = ((i & this.d) == this.d) ? "Y" : "N";
        this.i = ((i & this.d) == this.d) ? 1.0D : 0.0D;
      } 
      if (d())
        this.l = k(); 
      n n = hx.a().s();
      if (n != null && n.a(this.a.a()) != null && paramInt - this.u > 0 && paramInt - this.u < n.d()) {
        j j1 = n.a(this.a.a());
        str1 = str1 + " : " + j1.a(paramInt - this.u);
      } 
      b(str1);
      String str2 = this.a.n();
      if (str2 != null && !str2.isEmpty())
        setToolTipText(str1 + " (" + str2 + ")"); 
    } catch (Exception exception) {
      b("##");
      System.out.println("Gauge Exception Caught:\n" + exception);
    } 
  }
  
  private void a(Graphics paramGraphics, double paramDouble1, double paramDouble2, double paramDouble3) {
    int i = i();
    int k = eJ.a(2);
    paramGraphics.drawImage(j(), k + 1, k + 1, null);
    paramGraphics.setColor(Color.black);
    int m = 180 - (int)(180.0D * (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2));
    paramGraphics.fillArc(k + 1, k + 1, i, i, m, 10);
  }
  
  private int i() {
    int i = (getHeight() - eJ.a(4)) * 2;
    i = (i < getWidth() / 4) ? i : (getWidth() / 4);
    return (i > 0) ? i : 1;
  }
  
  public void c(int paramInt) {
    this.u = paramInt;
    repaint();
  }
  
  public void a(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  private Image j() {
    if (this.n != null && i() == this.n.getHeight(null))
      return this.n; 
    int i = i();
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
    this.n = graphicsConfiguration.createCompatibleImage(i + 2, i, 3);
    Graphics graphics = this.n.getGraphics();
    Graphics2D graphics2D = (Graphics2D)graphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics.setColor(Color.red);
    graphics.fillArc(0, 0, i, i, 0, 35);
    graphics.setColor(Color.orange);
    graphics.fillArc(0, 0, i, i, 35, 20);
    graphics.setColor(Color.yellow);
    graphics.fillArc(0, 0, i, i, 55, 70);
    graphics.setColor(new Color(164, 255, 0));
    graphics.fillArc(0, 0, i, i, 125, 20);
    graphics.setColor(Color.green);
    graphics.fillArc(0, 0, i, i, 145, 35);
    graphics.setColor(Color.black);
    graphics.drawArc(0, 0, i, i, 0, 180);
    graphics.drawLine(0, i / 2, i, i / 2);
    return this.n;
  }
  
  public Dimension getPreferredSize() {
    int i = getFont().getSize() + eJ.a(6);
    int k = e() ? (getFontMetrics(getFont()).stringWidth(h()) + 2 * i) : getFontMetrics(getFont()).stringWidth(h());
    return new Dimension(k, i);
  }
  
  public int d(int paramInt) {
    int i;
    if (this.s != null) {
      int k = 3 * getHeight() / 4;
      i = getFontMetrics(getFont()).stringWidth(h()) + k + eJ.a(1) + getHeight() - k;
    } else if (e()) {
      i = getFontMetrics(getFont()).stringWidth(h()) + 2 * paramInt;
    } else {
      i = getFontMetrics(getFont()).stringWidth(h());
    } 
    return i;
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public boolean d() {
    return this.p;
  }
  
  private Color k() {
    return this.w ? ((this.i == this.a.h()) ? UIManager.getColor("Label.background") : ((this.i > this.h) ? k.a(this.h, this.h, this.g) : k.a(this.i, this.h, this.g))) : k.a(this.i, this.g, this.h);
  }
  
  public void setBackground(Color paramColor) {
    if (d()) {
      super.setBackground(k());
    } else {
      this.l = paramColor;
      super.setBackground(paramColor);
    } 
  }
  
  public Color getForeground() {
    return (d() && this.i != this.a.h() && this.a.h() != this.a.g()) ? Color.black : UIManager.getColor("Label.foreground");
  }
  
  public void setForeground(Color paramColor) {
    super.setForeground(paramColor);
  }
  
  public void b(boolean paramBoolean) {
    this.p = paramBoolean;
    setBackground(getBackground());
    repaint();
  }
  
  public boolean e() {
    return this.q;
  }
  
  public void c(boolean paramBoolean) {
    this.q = paramBoolean;
    invalidate();
    repaint();
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    super.setSize(paramInt1, paramInt2);
    this.n = null;
  }
  
  public void a(A paramA) {
    this.s = paramA;
  }
  
  public void a(String paramString1, String paramString2, int paramInt) {
    if (paramString2.equals(this.c)) {
      this.t = null;
      repaint();
    } 
  }
  
  public void a(String paramString, j paramj, int paramInt) {
    Color color = this.t;
    if (paramj == null) {
      this.t = null;
      repaint();
    } else if (paramj != null && paramj.a().equals(this.c)) {
      int i = Integer.parseInt(paramString.substring(paramString.indexOf("h") + 1));
      this.t = aV.a().a(i, paramInt);
      repaint();
    } 
    if ((((color == null) ? 1 : 0) ^ ((this.t == null) ? 1 : 0)) != 0 || color == null || !color.equals(this.t))
      repaint(); 
  }
  
  public void d(boolean paramBoolean) {}
  
  private void b(Graphics paramGraphics) {
    if (this.t == null) {
      Color color = getBackground();
      if (color.getRed() + color.getBlue() + color.getGreen() < 38) {
        paramGraphics.setColor(Color.DARK_GRAY.darker());
      } else {
        paramGraphics.setColor(Color.GRAY);
      } 
    } else {
      paramGraphics.setColor(this.t);
    } 
    int i = 3 * getHeight() / 4;
    int k = eJ.a(1) + (getHeight() - i) / 2;
    paramGraphics.fill3DRect(k, k, i, i, (this.t != null));
  }
  
  private void l() {
    if (this.s != null) {
      if (this.t == null) {
        this.t = this.s.a(this.c);
        if (this.t == null) {
          String str = "All graph traces are in use, to add a new trace you must:\n - Turn off 1 or more current traces.\n - Increase the Maximum number of graphs.\n - Increase the Traces Per Graph.";
          bV.d(str, this);
        } 
      } else {
        this.s.b(this.c);
        this.t = null;
      } 
      repaint();
    } 
  }
  
  private void a(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    a(jPopupMenu);
    add(jPopupMenu);
    jPopupMenu.show(this, paramInt1, paramInt2);
  }
  
  private void a(JPopupMenu paramJPopupMenu) {
    if (this.s != null) {
      int i = i.a("numberOfGraphs", i.t);
      int k = i.a("numberOfOverlays", i.u);
      ArrayList<Color> arrayList1 = aV.a().c();
      as as = new as(this);
      ArrayList<Color> arrayList2 = new ArrayList();
      for (byte b = 0; b < i; b++) {
        JMenu jMenu = new JMenu("Send to Graph " + (b + 1));
        arrayList2.clear();
        for (byte b1 = 0; b1 < arrayList1.size() && b1 < k; b1++) {
          Color color = arrayList1.get(b1);
          if (!arrayList2.contains(color)) {
            au au = new au(this, color, b);
            au.setActionCommand("graph" + b + "." + b1);
            au.addActionListener(as);
            jMenu.add(au);
            arrayList2.add(color);
          } 
        } 
        paramJPopupMenu.add(jMenu);
      } 
      paramJPopupMenu.addSeparator();
    } 
    JMenuItem jMenuItem = new JMenuItem("Select Displayed Fields");
    jMenuItem.addActionListener(new at(this));
    jMenuItem.setEnabled(b.a().a("selectableFields"));
    paramJPopupMenu.add(jMenuItem);
  }
  
  private void a(au paramau) {
    if (this.s != null) {
      if (this.t != null)
        this.s.b(this.c); 
      String str = paramau.getActionCommand();
      try {
        int i = Integer.parseInt(str.substring(str.lastIndexOf(".") + 1));
        this.t = this.s.a(this.c, null, paramau.b(), i);
      } catch (Exception exception) {
        D.a("Failed to set Graph with color");
        this.t = this.s.a(this.c, paramau.a(), paramau.b());
      } 
    } 
  }
  
  public void e(boolean paramBoolean) {
    this.w = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */