package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import bH.ab;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;

public class ThreeDimensionalViewPanel extends JPanel implements eU {
  eM a = new ThreeDimensionalViewPanel();

  JSlider b = null;

  JSlider c = null;

  JSlider d = null;

  JCheckBox e = new JCheckBox("Color Shade");

  JCheckBox f = new JCheckBox("Antialiasing");

  JCheckBox g = new JCheckBox("Even Spacing");

  JCheckBox h = new JCheckBox("Follow Mode");

  dc i = new ThreeDimensionalViewPanel();

  private int o = 5;

  private int p = 1;

  private boolean q = false;

  int j = 0;

  int k = 0;

  private boolean r = false;

  private double s = 0.2D;

  private boolean t = false;

  private ab u = null;

  private et v = null;

  public static String l = "Black Color Theme";

  public static String m = "White Color Theme";

  public static String n = "Gray Color Theme";

  public ThreeDimensionalViewPanel(boolean paramBoolean, ab paramab) {
    this.t = paramBoolean;
    ThreeDimensionalViewPanel(paramab);
    ThreeDimensionalViewPanel(new BorderLayout());
    this.a.a(this);
    ThreeDimensionalViewPanel("Center", this.a);
    this.b = new JSlider(0, -180, 179, 0);
    this.b.addChangeListener(new ThreeDimensionalViewPanel(this));
    ThreeDimensionalViewPanel("South", this.b);
    this.c = new JSlider(1, 0, 359, 0);
    this.c.addChangeListener(new ThreeDimensionalViewPanel(this));
    ThreeDimensionalViewPanel("West", this.c);
    JPanel jPanel1 = new JPanel();
    if (paramBoolean) {
      this.d = new JSlider(1, 15, 90, 45);
      this.d.addChangeListener(new ThreeDimensionalViewPanel(this));
      jPanel1.setLayout(new GridLayout(3, 1));
      jPanel1.add(new JLabel());
      jPanel1.add(this.d);
      jPanel1.add(new JLabel());
      ThreeDimensionalViewPanel("East", jPanel1);
    }
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0, 10, 0));
    jPanel2.add(this.e);
    this.e.addActionListener(new ThreeDimensionalViewPanel(this));
    ThreeDimensionalViewPanel(true);
    this.i.c(m);
    this.i.c(n);
    this.i.c(l);
    this.i.addItemListener(new ThreeDimensionalViewPanel(this));
    jPanel2.add(this.i);
    ThreeDimensionalViewPanel(m);
    ThreeDimensionalViewPanel(false);
    jPanel2.add(this.g);
    this.g.setMnemonic(69);
    this.g.addActionListener(new ThreeDimensionalViewPanel(this));
    jPanel2.add(this.h);
    this.h.setMnemonic(70);
    this.h.addActionListener(new ThreeDimensionalViewPanel(this));
    if (paramBoolean) {
      JMenuItem jMenuItem = new JMenuItem(b("3D Table Options"));
      jMenuItem.addActionListener(new ThreeDimensionalViewPanel(this));
      jPanel2.add(jMenuItem);
    }
    ThreeDimensionalViewPanel("North", jPanel2);
    jPanel2.setBorder(BorderFactory.createEtchedBorder());
    this.a.addMouseListener(new ThreeDimensionalViewPanel(this));
    if (getBackground().getRed()
            + ThreeDimensionalViewPanel().getBlue()
            + ThreeDimensionalViewPanel().getGreen()
        < 100) {
      jPanel2.setBackground(Color.BLACK);
      jPanel2.setForeground(Color.WHITE);
      jPanel2.setOpaque(true);
      this.e.setBackground(Color.BLACK);
      this.e.setForeground(Color.WHITE);
      this.e.setOpaque(true);
      this.g.setBackground(Color.BLACK);
      this.g.setForeground(Color.WHITE);
      this.g.setOpaque(true);
      this.h.setBackground(Color.BLACK);
      this.h.setForeground(Color.WHITE);
      this.h.setOpaque(true);
      this.b.setBackground(Color.BLACK);
      this.b.setForeground(Color.WHITE);
      this.b.setOpaque(true);
      this.c.setBackground(Color.BLACK);
      this.c.setForeground(Color.WHITE);
      this.c.setOpaque(true);
      if (this.d != null) {
        this.d.setBackground(Color.BLACK);
        this.d.setForeground(Color.WHITE);
        this.d.setOpaque(true);
      }
      jPanel1.setBackground(Color.BLACK);
      jPanel1.setForeground(Color.WHITE);
      jPanel1.setOpaque(true);
    }
  }

  private String ThreeDimensionalViewPanel(String paramString) {
    if (this.u != null) paramString = this.u.a(paramString);
    return paramString;
  }

  public void ThreeDimensionalViewPanel() {
    if (this.q) {
      this.q = false;
      this.a.c(this.j);
      this.a.d(this.k);
    } else {
      this.j = this.b.getValue();
      this.k = this.c.getValue();
      this.a.c(0);
      this.a.d(270);
      this.q = true;
    }
  }

  public void ThreeDimensionalViewPanel(Point paramPoint) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(b("Smart Select Movement"));
    jCheckBoxMenuItem1.setState(this.a.E());
    jCheckBoxMenuItem1.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(b("Show Active Table Values"));
    jCheckBoxMenuItem2.setState(this.a.v());
    jCheckBoxMenuItem2.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2 = new JCheckBoxMenuItem(b("Show Selected X & Y Values"));
    jCheckBoxMenuItem2.setState(this.a.u());
    jCheckBoxMenuItem2.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2 = new JCheckBoxMenuItem(b("Increment All Active Cells"));
    jCheckBoxMenuItem2.setState(k());
    jCheckBoxMenuItem2.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jCheckBoxMenuItem2);
    String str = X.a(l() * 100.0D);
    JMenuItem jMenuItem = new JMenuItem(b("Active Weight Threshold") + " (" + str + "%)");
    jMenuItem.setEnabled(this.r);
    jMenuItem.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(b("Select Active Color"));
    jMenuItem.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jMenuItem);
    jCheckBoxMenuItem2 = new JCheckBoxMenuItem(b("Antialiasing"));
    jCheckBoxMenuItem2.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2.setState(this.a.w());
    jMenuItem = new JMenuItem("Select Selected Color");
    jMenuItem.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(b("Normal Increment") + " # " + ThreeDimensionalViewPanel());
    jMenuItem.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jMenuItem);
    jMenuItem = new JMenuItem(b("CTRL Increment") + " # " + ThreeDimensionalViewPanel());
    jMenuItem.addActionListener(new ThreeDimensionalViewPanel(this));
    jPopupMenu.add(jMenuItem);
    jPopupMenu.show(this, paramPoint.x, paramPoint.y);
  }

  private void ThreeDimensionalViewPanel() {
    String str =
        bV.a(
            this,
            true,
            ThreeDimensionalViewPanel("Number of increment by with CTRL Pressed"),
            ThreeDimensionalViewPanel() + "");
    if (str != null && !str.equals("")) ThreeDimensionalViewPanel((int) Double.parseDouble(str));
  }

  private void ThreeDimensionalViewPanel() {
    String str =
        bV.a(
            this,
            true,
            ThreeDimensionalViewPanel("Number of increments using arrow keys") + " ",
            ThreeDimensionalViewPanel() + "");
    if (str != null && !str.equals("")) ThreeDimensionalViewPanel((int) Double.parseDouble(str));
  }

  protected void ThreeDimensionalViewPanel() {
    Color color = bV.a(this, ThreeDimensionalViewPanel("Select Active Color"), this.a.t());
    if (color != null) ThreeDimensionalViewPanel(color);
  }

  protected void ThreeDimensionalViewPanel() {
    Color color = bV.a(this, ThreeDimensionalViewPanel("Select Selected Color"), this.a.s());
    if (color != null) ThreeDimensionalViewPanel(color);
  }

  public void ThreeDimensionalViewPanel() {
    if (this.v == null) D.b("3DTable Settings Persistance not intialized");
    String str = this.v.a("tableYawAngle");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Integer.parseInt(str));
    str = this.v.a("tableRollAngle");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Integer.parseInt(str));
    str = this.v.a("tableColorFill");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Boolean.parseBoolean(str));
    str = this.v.a("colorTheme");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(str);
    str = this.v.a("table3DAntiAlias");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Boolean.parseBoolean(str));
    str = this.v.a("spaceByIndex");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Boolean.parseBoolean(str));
    str = this.v.a("dynamicSelectIncrement");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Boolean.parseBoolean(str));
    str = this.v.a("followMode");
    if (str != null && str.length() > 0) this.h.setSelected(Boolean.parseBoolean(str));
    str = this.v.a("activeColor");
    if (str != null && str.length() > 0) {
      Color color = ThreeDimensionalViewPanel(str);
      if (color != null) this.a.b(color);
    }
    str = this.v.a("selectedColor");
    if (str != null && str.length() > 0) {
      Color color = ThreeDimensionalViewPanel(str);
      if (color != null) this.a.a(color);
    }
    str = this.v.a("showZvalue");
    if (str != null && str.length() > 0) {
      boolean bool = (str != null && str.equals("true")) ? true : false;
      this.a.c(bool);
    }
    str = this.v.a("showXYvalues");
    if (str != null && str.length() > 0) {
      boolean bool = (str != null && str.equals("true")) ? true : false;
      this.a.b(bool);
    }
    str = this.v.a("ctrlIncrementSize");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Integer.parseInt(str));
    str = this.v.a("incrementSize");
    if (str != null && str.length() > 0) ThreeDimensionalViewPanel(Integer.parseInt(str));
    str = this.v.a("zHeightScale");
    if (str != null && str.length() > 0 && this.d != null) {
      double d = Double.parseDouble(str);
      if (d > 0.1D && d < 1.01D) {
        this.a.c(d);
        this.d.setValue((int) (d * 100.0D));
      }
    }
    str = this.v.a("incrementAllVertextCells");
    if (str != null && str.length() > 0) this.r = str.equals("true");
    str = this.v.a("incrementAllVertextWeight");
    if (str != null && str.length() > 0) this.s = Double.parseDouble(str);
  }

  private Color ThreeDimensionalViewPanel(String paramString) {
    int i = -1;
    try {
      i = Integer.parseInt(paramString);
    } catch (Exception exception) {
    }
    return (i != -1) ? new Color(i) : null;
  }

  public boolean ThreeDimensionalViewPanel() {
    return this.h.isSelected();
  }

  public void ThreeDimensionalViewPanel() {
    this.a.x();
    double d1 = Math.round(this.a.a().a(this.a.x()));
    double d2 = Math.round(this.a.a().b(this.a.y()));
    this.a.e((int) d1);
    this.a.f((int) d2);
    this.a.repaint();
  }

  public void ThreeDimensionalViewPanel(int paramInt) {
    this.b.setValue(paramInt);
  }

  public void ThreeDimensionalViewPanel(int paramInt) {
    this.c.setValue(paramInt);
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.e.setSelected(paramBoolean);
    this.a.a(paramBoolean);
    ThreeDimensionalViewPanel("tableColorFill", "" + paramBoolean);
    this.a.repaint();
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.f.setSelected(paramBoolean);
    this.a.d(paramBoolean);
    ThreeDimensionalViewPanel("table3DAntiAlias", "" + paramBoolean);
    this.a.repaint();
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.a.f(paramBoolean);
    ThreeDimensionalViewPanel("dynamicSelectIncrement", "" + paramBoolean);
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.g.setSelected(paramBoolean);
    this.a.e(paramBoolean);
    ThreeDimensionalViewPanel("spaceByIndex", "" + paramBoolean);
    this.a.repaint();
  }

  public void ThreeDimensionalViewPanel(et paramet) {
    this.v = paramet;
  }

  public void ThreeDimensionalViewPanel() {
    this.h.setSelected(!this.h.isSelected());
    ThreeDimensionalViewPanel("followMode", "" + this.h.isSelected());
  }

  public void ThreeDimensionalViewPanel(int paramInt) {
    while (paramInt < -180) paramInt += 360;
    paramInt = (paramInt + 180) % 360 - 180;
    this.b.setValue(paramInt);
    ThreeDimensionalViewPanel("tableYawAngle", "" + paramInt);
  }

  public void ThreeDimensionalViewPanel(int paramInt) {
    paramInt = (paramInt + 360) % 360;
    this.c.setValue(paramInt);
    ThreeDimensionalViewPanel("tableRollAngle", "" + paramInt);
  }

  protected void ThreeDimensionalViewPanel(String paramString1, String paramString2) {
    if (this.v != null) this.v.a(paramString1, paramString2);
  }

  protected String ThreeDimensionalViewPanel(String paramString1, String paramString2) {
    if (this.v != null) {
      String str = this.v.a(paramString1);
      if (str != null && !str.isEmpty()) return str;
    }
    return paramString2;
  }

  public void ThreeDimensionalViewPanel(String paramString) {
    if (paramString.equals(l)) {
      this.a.setBackground(Color.BLACK);
      this.a.setForeground(new Color(96, 96, 96));
      String str = ThreeDimensionalViewPanel("activeColor", "");
      if (str == null || str.isEmpty()) this.a.b(Color.CYAN);
    } else if (paramString.equals(m)) {
      this.a.setBackground(Color.WHITE);
      this.a.setForeground(Color.BLACK);
      String str = ThreeDimensionalViewPanel("activeColor", "");
      if (str == null || str.isEmpty()) this.a.b(Color.BLUE);
    } else if (paramString.equals(n)) {
      this.a.setBackground(new Color(220, 220, 220));
      this.a.setForeground(Color.BLACK);
      String str = ThreeDimensionalViewPanel("activeColor", "");
      if (str == null || str.isEmpty()) this.a.b(Color.BLUE);
    } else {
      D.c("No defined Color Theme:" + paramString);
      return;
    }
    this.i.b(paramString);
    ThreeDimensionalViewPanel("colorTheme", paramString);
    this.a.z();
    this.a.repaint();
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.a.c(paramBoolean);
    ThreeDimensionalViewPanel("showZvalue", paramBoolean + "");
    this.a.z();
    this.a.repaint();
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.a.b(paramBoolean);
    ThreeDimensionalViewPanel("showXYvalues", paramBoolean + "");
    this.a.z();
    this.a.repaint();
  }

  public eM ThreeDimensionalViewPanel() {
    return this.a;
  }

  private void ThreeDimensionalViewPanel(Color paramColor) {
    this.a.b(paramColor);
    ThreeDimensionalViewPanel("activeColor", paramColor.getRGB() + "");
    this.a.z();
    this.a.repaint();
  }

  private void ThreeDimensionalViewPanel(Color paramColor) {
    this.a.a(paramColor);
    ThreeDimensionalViewPanel("selectedColor", paramColor.getRGB() + "");
    this.a.z();
    this.a.repaint();
  }

  public int ThreeDimensionalViewPanel() {
    return this.o;
  }

  public void ThreeDimensionalViewPanel(int paramInt) {
    this.o = paramInt;
    ThreeDimensionalViewPanel("ctrlIncrementSize", paramInt + "");
  }

  public int ThreeDimensionalViewPanel() {
    return this.p;
  }

  public void ThreeDimensionalViewPanel(int paramInt) {
    this.p = paramInt;
    ThreeDimensionalViewPanel("incrementSize", paramInt + "");
  }

  public boolean ThreeDimensionalViewPanel() {
    return (this.r && ThreeDimensionalViewPanel());
  }

  public void ThreeDimensionalViewPanel(boolean paramBoolean) {
    this.r = paramBoolean;
    if (!paramBoolean) this.v.a("incrementAllVertextCells", paramBoolean + "");
  }

  public double ThreeDimensionalViewPanel() {
    return this.s;
  }

  public void ThreeDimensionalViewPanel(double paramDouble) {
    this.s = paramDouble;
    ThreeDimensionalViewPanel("incrementAllVertextWeight", paramDouble + "");
  }

  private void ThreeDimensionalViewPanel() {
    String str1 = X.b(this.s * 100.0D, 1);
    String str2 =
        bV.a(this, true, ThreeDimensionalViewPanel("Minimum Active Increment Weight(%)"), str1);
    if (str2 != null && !str2.equals(""))
      ThreeDimensionalViewPanel(Double.parseDouble(str2) / 100.0D);
  }

  public void ThreeDimensionalViewPanel(ab paramab) {
    this.u = paramab;
    l = ThreeDimensionalViewPanel(l);
    m = ThreeDimensionalViewPanel(m);
    n = ThreeDimensionalViewPanel(n);
    this.e.setText(b("Color Shade"));
    this.f.setText(b("Antialiasing"));
    this.g.setText(b("Even Spacing"));
    this.h.setText(b("Follow Mode"));
    this.a.a(paramab);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
