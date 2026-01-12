package com.efiAnalytics.ui;

import G.AeInterfaceMikeTostring;
import G.GInterfaceAg;
import G.GInterfaceAv;
import G.R;
import G.T;
import G.l;
import bH.ab;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class CommunicationIndicator extends JLabel implements GInterfaceAg, GInterfaceAv {
  int a = 0;

  Insets b = eJ.a(new Insets(1, 1, 1, 1));

  Color c = Color.red;

  Color d = new Color(96, 0, 0);

  Color e = Color.green;

  Color f = new Color(0, 96, 0);

  private String m = null;

  Stroke g = new BasicStroke(eJ.a(2.0F));

  Dimension h = new Dimension(eJ.a(20), eJ.a(18));

  dD i = null;

  long j = System.currentTimeMillis();

  int k = 100;

  long l = System.currentTimeMillis();

  public CommunicationIndicator() {
    this("");
  }

  public CommunicationIndicator(String paramString) {
    this.m = paramString;
    setMinimumSize(this.h);
    setPreferredSize(this.h);
    setToolTipText("<html>" + paramString + "<br>Red: sending<br>Green: receiving</html>");
    setDoubleBuffered(true);
    this.i = new dD(this);
    this.i.b(1);
    setOpaque(true);
    addMouseListener(new es(this));
  }

  public void a() {
    if (this.i != null) this.i.a(false);
  }

  public void paint(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    int i = getHeight() / 2;
    int j = (getHeight() - i) / 2;
    int k = getWidth() - this.b.left - this.b.right;
    int m = (int) (i * 0.8D);
    paramGraphics.setColor(Color.GRAY);
    paramGraphics.fillRect(this.b.left, j, k, i);
    if ((this.a & 0x4) > 0) {
      paramGraphics.setColor(this.c);
    } else {
      paramGraphics.setColor(this.d);
    }
    int n = getWidth() / 2 - m - 1;
    int i1 = j + (i - m) / 2;
    paramGraphics.fillOval(n, i1, m, m);
    if ((this.a & 0x2) > 0 || this.j > System.currentTimeMillis()) {
      paramGraphics.setColor(this.e);
    } else {
      paramGraphics.setColor(this.f);
    }
    n = getWidth() / 2 + 1;
    paramGraphics.fillOval(n, i1, m, m);
    if ((this.a & 0x1) != 1) {
      int i2 = getHeight() - 1;
      paramGraphics.setColor(Color.red);
      graphics2D.setStroke(this.g);
      paramGraphics.drawOval((getWidth() - i2) / 2, 0, i2, i2);
      int i3 = (int) ((i2 / 2) * 1.414213D / 2.0D);
      int i4 = getWidth() / 2;
      int i5 = getHeight() / 2;
      paramGraphics.drawLine(i4 - i3, i5 - i3, i4 + i3, i5 + i3);
    }
  }

  public boolean a(String paramString, AeInterfaceMikeTostring parambT) {
    this.a |= 0x1;
    setToolTipText(getToolTipText());
    this.i.a();
    return true;
  }

  public void a(String paramString) {
    if (paramString.equals(this.m)) {
      this.a = 0;
      setToolTipText(getToolTipText());
      this.i.a();
    }
  }

  public void b(String paramString) {
    if (paramString.equals(this.m)) {
      this.a |= 0x4;
      this.i.a();
    }
  }

  public void c(String paramString) {
    if (paramString.equals(this.m)) {
      this.a &= 0xFFFFFFFB;
      this.i.a(200);
    }
  }

  public void d(String paramString) {
    if (paramString.equals(this.m)) {
      this.a |= 0x2;
      this.i.a();
    }
  }

  public void e(String paramString) {
    if (paramString.equals(this.m)) {
      this.a &= 0xFFFFFFFD;
      this.j = System.currentTimeMillis() + 5L;
      this.i.a();
    }
  }

  public Insets getInsets() {
    return this.b;
  }

  public String b() {
    return this.m;
  }

  public void c() {
    R r = T.a().c(this.m);
    if (r != null) {
      JPopupMenu jPopupMenu = new JPopupMenu();
      if (r.R()) {
        JMenuItem jMenuItem = jPopupMenu.add(f("Work Offline"));
        jMenuItem.addActionListener(new eq(this));
      } else {
        JMenuItem jMenuItem = jPopupMenu.add(f("Go Online"));
        jMenuItem.addActionListener(new er(this));
      }
      add(jPopupMenu);
      jPopupMenu.show(this, 0, 0);
    }
  }

  private void d() {
    R r = T.a().c(this.m);
    if (r != null) r.C().c();
  }

  private void e() {
    R r = T.a().c(this.m);
    if (r != null)
      try {
        r.C().d();
      } catch (l l) {
        Logger.getLogger(ep.class.getName()).log(Level.INFO, "Cannot go online", (Throwable) l);
      }
  }

  private String f(String paramString) {
    ab ab = bV.a();
    return (ab != null) ? ab.a(paramString) : paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
