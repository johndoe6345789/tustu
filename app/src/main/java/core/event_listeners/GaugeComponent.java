package ao;

import W.j;
import W.n;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import g.IOJFileChooser;
import h.ClassTypeInHPackage;
import h.IOProperties;
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

  String ClassTypeInHPackage = "";

  String c = "";

  int d = 0;

  int e = 0;

  int f = 0;

  double g = 0.0D;

  double h = 0.0D;

  double IOProperties = 0.0D;

  FontMetrics j = null;

  private boolean p = false;

  private boolean q = true;

  private boolean r = false;

  Color IOJFileChooser = Color.lightGray;

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
    int IOProperties = eJ.a(11);
    if (font != null) IOProperties = Math.round(font.getSize2D() * IOProperties / eJ.a());
    setFont(new Font("SansSerif", 1, IOProperties));
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
    if (this.o < 0) this.o = eJ.a(8);
    return this.o;
  }

  public void a(Graphics paramGraphics) {
    if (this.j == null) this.j = getFontMetrics(getFont());
    if (this.l == null) this.l = getBackground();
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    String str = h();
    paramGraphics.setColor(this.l);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(getForeground());
    paramGraphics.setFont(getFont());
    int IOProperties = getWidth() - this.j.stringWidth(str) - f();
    int IOJFileChooser =
        getWidth() - this.j.stringWidth(this.c) - this.j.stringWidth(": 00.000") - f();
    this.e = (IOProperties < IOJFileChooser) ? IOProperties : IOJFileChooser;
    this.f = getHeight() - (getHeight() - getFont().getSize()) / 2 - 2;
    if (this.e < g()) this.e = g();
    paramGraphics.drawString(str, this.e, this.f);
    if (this.s != null) {
      ClassTypeInHPackage(paramGraphics);
    } else if (e()) {
      a(paramGraphics, this.IOProperties, this.g, this.h);
    }
    paramGraphics.setColor(this.IOJFileChooser);
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
    if (e()) a(paramGraphics, this.IOProperties, this.g, this.h);
    paramGraphics.setColor(this.IOJFileChooser);
    paramGraphics.draw3DRect(0, 0, getWidth(), getHeight(), false);
  }

  private int g() {
    return (e() && this.s == null)
        ? (IOProperties() + 2 + 5)
        : ((this.s != null) ? (getHeight() + 2) : 2);
  }

  private String h() {
    String str = this.c;
    if (this.a != null && this.a.l()) str = str + IOProperties.d();
    if (this.a != null && this.a.n() != null && !this.a.n().isEmpty() && !this.a.n().equals("bit"))
      str = str + "(" + this.a.n() + ")";
    return str + ": " + this.ClassTypeInHPackage;
  }

  public void a(j paramj) {
    this.a = paramj;
    this.c = paramj.a();
  }

  public j ClassTypeInHPackage() {
    return this.a;
  }

  public void a(String paramString) {
    this.c = paramString;
  }

  public void ClassTypeInHPackage(String paramString) {
    this.ClassTypeInHPackage = paramString;
    repaint(1000L);
  }

  public String c() {
    return this.ClassTypeInHPackage;
  }

  public String getToolTipText(MouseEvent paramMouseEvent) {
    return getToolTipText();
  }

  public void ClassTypeInHPackage(int paramInt) {
    try {
      this.IOProperties = this.a.c(paramInt);
      String str1 = this.a.a(paramInt);
      if (str1 != null
          && c() != null
          && str1.equals(c())
          && (hx.a().s() == null || c().contains(":"))) return;
      this.g = (this.d == 0) ? this.a.h() : 0.0D;
      this.h = (this.d == 0) ? this.a.g() : 1.0D;
      if (this.d != 0) {
        int IOProperties = (int) this.IOProperties;
        str1 = ((IOProperties & this.d) == this.d) ? "Y" : "N";
        this.IOProperties = ((IOProperties & this.d) == this.d) ? 1.0D : 0.0D;
      }
      if (d()) this.l = IOJFileChooser();
      n n = hx.a().s();
      if (n != null
          && n.a(this.a.a()) != null
          && paramInt - this.u > 0
          && paramInt - this.u < n.d()) {
        j j1 = n.a(this.a.a());
        str1 = str1 + " : " + j1.a(paramInt - this.u);
      }
      ClassTypeInHPackage(str1);
      String str2 = this.a.n();
      if (str2 != null && !str2.isEmpty()) setToolTipText(str1 + " (" + str2 + ")");
    } catch (Exception exception) {
      ClassTypeInHPackage("##");
      System.out.println("Gauge Exception Caught:\n" + exception);
    }
  }

  private void a(
      Graphics paramGraphics, double paramDouble1, double paramDouble2, double paramDouble3) {
    int IOProperties = IOProperties();
    int IOJFileChooser = eJ.a(2);
    paramGraphics.drawImage(j(), IOJFileChooser + 1, IOJFileChooser + 1, null);
    paramGraphics.setColor(Color.black);
    int m = 180 - (int) (180.0D * (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2));
    paramGraphics.fillArc(
        IOJFileChooser + 1, IOJFileChooser + 1, IOProperties, IOProperties, m, 10);
  }

  private int IOProperties() {
    int IOProperties = (getHeight() - eJ.a(4)) * 2;
    IOProperties = (IOProperties < getWidth() / 4) ? IOProperties : (getWidth() / 4);
    return (IOProperties > 0) ? IOProperties : 1;
  }

  public void c(int paramInt) {
    this.u = paramInt;
    repaint();
  }

  public void a(boolean paramBoolean) {
    this.v = paramBoolean;
  }

  private Image j() {
    if (this.n != null && IOProperties() == this.n.getHeight(null)) return this.n;
    int IOProperties = IOProperties();
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
    this.n = graphicsConfiguration.createCompatibleImage(IOProperties + 2, IOProperties, 3);
    Graphics graphics = this.n.getGraphics();
    Graphics2D graphics2D = (Graphics2D) graphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics.setColor(Color.red);
    graphics.fillArc(0, 0, IOProperties, IOProperties, 0, 35);
    graphics.setColor(Color.orange);
    graphics.fillArc(0, 0, IOProperties, IOProperties, 35, 20);
    graphics.setColor(Color.yellow);
    graphics.fillArc(0, 0, IOProperties, IOProperties, 55, 70);
    graphics.setColor(new Color(164, 255, 0));
    graphics.fillArc(0, 0, IOProperties, IOProperties, 125, 20);
    graphics.setColor(Color.green);
    graphics.fillArc(0, 0, IOProperties, IOProperties, 145, 35);
    graphics.setColor(Color.black);
    graphics.drawArc(0, 0, IOProperties, IOProperties, 0, 180);
    graphics.drawLine(0, IOProperties / 2, IOProperties, IOProperties / 2);
    return this.n;
  }

  public Dimension getPreferredSize() {
    int IOProperties = getFont().getSize() + eJ.a(6);
    int IOJFileChooser =
        e()
            ? (getFontMetrics(getFont()).stringWidth(h()) + 2 * IOProperties)
            : getFontMetrics(getFont()).stringWidth(h());
    return new Dimension(IOJFileChooser, IOProperties);
  }

  public int d(int paramInt) {
    int IOProperties;
    if (this.s != null) {
      int IOJFileChooser = 3 * getHeight() / 4;
      IOProperties =
          getFontMetrics(getFont()).stringWidth(h())
              + IOJFileChooser
              + eJ.a(1)
              + getHeight()
              - IOJFileChooser;
    } else if (e()) {
      IOProperties = getFontMetrics(getFont()).stringWidth(h()) + 2 * paramInt;
    } else {
      IOProperties = getFontMetrics(getFont()).stringWidth(h());
    }
    return IOProperties;
  }

  public Dimension getMinimumSize() {
    return getPreferredSize();
  }

  public boolean d() {
    return this.p;
  }

  private Color IOJFileChooser() {
    return this.w
        ? ((this.IOProperties == this.a.h())
            ? UIManager.getColor("Label.background")
            : ((this.IOProperties > this.h)
                ? IOJFileChooser.a(this.h, this.h, this.g)
                : IOJFileChooser.a(this.IOProperties, this.h, this.g)))
        : IOJFileChooser.a(this.IOProperties, this.g, this.h);
  }

  public void setBackground(Color paramColor) {
    if (d()) {
      super.setBackground(IOJFileChooser());
    } else {
      this.l = paramColor;
      super.setBackground(paramColor);
    }
  }

  public Color getForeground() {
    return (d() && this.IOProperties != this.a.h() && this.a.h() != this.a.g())
        ? Color.black
        : UIManager.getColor("Label.foreground");
  }

  public void setForeground(Color paramColor) {
    super.setForeground(paramColor);
  }

  public void ClassTypeInHPackage(boolean paramBoolean) {
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
      int IOProperties = Integer.parseInt(paramString.substring(paramString.indexOf("h") + 1));
      this.t = aV.a().a(IOProperties, paramInt);
      repaint();
    }
    if ((((color == null) ? 1 : 0) ^ ((this.t == null) ? 1 : 0)) != 0
        || color == null
        || !color.equals(this.t)) repaint();
  }

  public void d(boolean paramBoolean) {}

  private void ClassTypeInHPackage(Graphics paramGraphics) {
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
    int IOProperties = 3 * getHeight() / 4;
    int IOJFileChooser = eJ.a(1) + (getHeight() - IOProperties) / 2;
    paramGraphics.fill3DRect(
        IOJFileChooser, IOJFileChooser, IOProperties, IOProperties, (this.t != null));
  }

  private void l() {
    if (this.s != null) {
      if (this.t == null) {
        this.t = this.s.a(this.c);
        if (this.t == null) {
          String str =
              "All graph traces are in use, to add a new trace you must:\n"
                  + " - Turn off 1 or more current traces.\n"
                  + " - Increase the Maximum number of graphs.\n"
                  + " - Increase the Traces Per Graph.";
          bV.d(str, this);
        }
      } else {
        this.s.ClassTypeInHPackage(this.c);
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
      int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
      int IOJFileChooser = IOProperties.a("numberOfOverlays", IOProperties.u);
      ArrayList<Color> arrayList1 = aV.a().c();
      as as = new as(this);
      ArrayList<Color> arrayList2 = new ArrayList();
      for (byte ClassTypeInHPackage = 0;
          ClassTypeInHPackage < IOProperties;
          ClassTypeInHPackage++) {
        JMenu jMenu = new JMenu("Send to Graph " + (ClassTypeInHPackage + 1));
        arrayList2.clear();
        for (byte b1 = 0; b1 < arrayList1.size() && b1 < IOJFileChooser; b1++) {
          Color color = arrayList1.get(b1);
          if (!arrayList2.contains(color)) {
            au au = new au(this, color, ClassTypeInHPackage);
            au.setActionCommand("graph" + ClassTypeInHPackage + "." + b1);
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
    jMenuItem.setEnabled(ClassTypeInHPackage.a().a("selectableFields"));
    paramJPopupMenu.add(jMenuItem);
  }

  private void a(au paramau) {
    if (this.s != null) {
      if (this.t != null) this.s.ClassTypeInHPackage(this.c);
      String str = paramau.getActionCommand();
      try {
        int IOProperties = Integer.parseInt(str.substring(str.lastIndexOf(".") + 1));
        this.t = this.s.a(this.c, null, paramau.ClassTypeInHPackage(), IOProperties);
      } catch (Exception exception) {
        D.a("Failed to set Graph with color");
        this.t = this.s.a(this.c, paramau.a(), paramau.ClassTypeInHPackage());
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
