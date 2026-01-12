package com.efiAnalytics.ui;

import bH.X;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JComponent;

public class DataHistoryRenderer {
  ArrayList a = new ArrayList();

  JComponent b = null;

  Image c = null;

  int d = 2;

  Font e = null;

  Font f = null;

  Font g = null;

  Insets h = null;

  Stroke i = new BasicStroke(2.0F, 1, 2);

  public DataHistoryRenderer(JComponent paramJComponent) {
    this.b = paramJComponent;
  }

  public void a(Graphics paramGraphics) {
    d(paramGraphics);
    c(paramGraphics);
  }

  private void c(Graphics paramGraphics) {
    Insets insets = c();
    for (byte b1 = 0; b1 < this.a.size(); b1++) {
      cy cy = this.a.get(b1);
      double[] arrayOfDouble = b(cy);
      int[] arrayOfInt1 = new int[arrayOfDouble.length + 2];
      int[] arrayOfInt2 = new int[arrayOfDouble.length + 2];
      int j = this.b.getWidth();
      int k = this.b.getHeight() - insets.top - insets.bottom;
      for (byte b = 1; b < arrayOfInt2.length - 1; b++) {
        arrayOfInt1[b] = j - insets.right - (b - 1) * this.d;
        double d = (arrayOfDouble[b - 1] - cy.c()) / (cy.d() - cy.c());
        if (d > 1.0D) {
          arrayOfInt2[b] = insets.top;
        } else if (d < 0.0D) {
          arrayOfInt2[b] = this.b.getHeight() - insets.bottom;
        } else {
          arrayOfInt2[b] = this.b.getHeight() - (int) (k * d) - insets.bottom;
        }
      }
      arrayOfInt1[0] = arrayOfInt1[1];
      arrayOfInt1[arrayOfInt1.length - 1] = arrayOfInt1[arrayOfInt1.length - 2];
      arrayOfInt2[0] = k + insets.top;
      arrayOfInt2[arrayOfInt2.length - 1] = k + insets.top;
      paramGraphics.setColor(cy.e());
      ((Graphics2D) paramGraphics).setStroke(this.i);
      paramGraphics.drawPolyline(arrayOfInt1, arrayOfInt2, arrayOfInt1.length);
    }
    Font font = d();
    Color color = new Color(0, 0, 0, 128);
    int i = this.b.getHeight() - insets.bottom - font.getSize();
    for (byte b2 = 0; b2 < this.a.size(); b2++) {
      cy cy = this.a.get(b2);
      String str = X.a(cy.a(0));
      int j =
          this.b.getWidth()
              - paramGraphics.getFontMetrics(font).stringWidth(str)
              - insets.right
              - 6;
      if (str != null) {
        paramGraphics.setColor(color);
        paramGraphics.fillRect(
            j,
            i - font.getSize(),
            paramGraphics.getFontMetrics(font).stringWidth(str),
            font.getSize());
        paramGraphics.setColor(cy.e());
        paramGraphics.drawString(str, j, i);
      }
      i -= font.getSize();
    }
  }

  private double[] b(cy paramcy) {
    Insets insets = c();
    int i = 1 + (this.b.getWidth() - insets.left - insets.right) / this.d;
    double[] arrayOfDouble = null;
    int j = 0;
    synchronized (paramcy) {
      j = (paramcy.size() > i && i > 0) ? i : paramcy.size();
      arrayOfDouble = new double[j];
      for (byte b = 0; b < j; b++) arrayOfDouble[b] = paramcy.a(b);
    }
    if (arrayOfDouble.length == 0) {
      arrayOfDouble = new double[1];
      arrayOfDouble[0] = 0.0D;
    }
    return arrayOfDouble;
  }

  private void d(Graphics paramGraphics) {
    if (this.c == null
        || this.b.getWidth() != this.c.getWidth(null)
        || this.b.getHeight() != this.c.getHeight(null)) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      BufferedImage bufferedImage = null;
      Graphics graphics = null;
      bufferedImage =
          graphicsConfiguration.createCompatibleImage(this.b.getWidth(), this.b.getHeight(), 2);
      graphics = bufferedImage.getGraphics();
      this.c = bufferedImage;
      a(this.d + this.b.getWidth() / this.d);
    }
    b(paramGraphics);
  }

  protected void b(Graphics paramGraphics) {
    paramGraphics.setColor(this.b.getBackground());
    paramGraphics.fillRect(0, 0, this.b.getWidth(), this.b.getHeight());
    Insets insets = c();
    byte b1 = 40;
    double d1 = 1.0D;
    boolean bool1 = false;
    if (this.b.getHeight() < 160) {
      b1 = 20;
      bool1 = true;
    }
    int i;
    for (i = 2; this.b.getHeight() / i > b1; i *= 2)
      d1 = this.b.getHeight() / i / this.b.getHeight();
    double d2 = d1;
    boolean bool2 = true;
    while (d2 <= 1.0D) {
      bool2 = bool1 ? (!bool2 ? true : false) : true;
      a(paramGraphics, d2, bool2);
      d2 += d1;
    }
    Font font = e();
    int j = 3 + insets.left;
    int k;
    for (k = 0; k < this.a.size(); k++) {
      cy cy = this.a.get(k);
      String str = X.b(cy.d(), cy.b());
      paramGraphics.setColor(cy.e());
      paramGraphics.drawString(str, j, font.getSize() + insets.top);
      j = j + this.b.getFontMetrics(font).stringWidth(str) + 4;
    }
    font = d();
    k = insets.top + font.getSize();
    for (byte b2 = 0; b2 < this.a.size(); b2++) {
      cy cy = this.a.get(b2);
      String str = cy.f();
      if (cy.g() != null && !cy.g().equals("")) str = str + "(" + cy.g() + ")";
      j =
          this.b.getWidth()
              - paramGraphics.getFontMetrics(font).stringWidth(str)
              - insets.right
              - 4;
      paramGraphics.setColor(cy.e());
      if (str != null) paramGraphics.drawString(str, j, k);
      k += font.getSize();
    }
    paramGraphics.setColor(Color.LIGHT_GRAY);
    paramGraphics.drawRect(
        insets.left,
        insets.top,
        this.b.getWidth() - insets.left - insets.right - 1,
        this.b.getHeight() - insets.top - insets.bottom - 1);
  }

  private void a(Graphics paramGraphics, double paramDouble, boolean paramBoolean) {
    Insets insets = c();
    int i = insets.left;
    int j = this.b.getWidth() - insets.left - insets.right;
    int k =
        (int) Math.round((this.b.getHeight() - insets.top - insets.bottom) * paramDouble)
            + insets.top;
    paramGraphics.setColor(Color.LIGHT_GRAY);
    paramGraphics.drawLine(i, k, j + i, k);
    int m = 3 + i;
    Font font = e();
    paramGraphics.setFont(font);
    for (byte b = 0; b < this.a.size(); b++) {
      if (paramBoolean) {
        cy cy = this.a.get(b);
        String str = X.b(cy.d() - paramDouble * (cy.d() - cy.c()), cy.b());
        paramGraphics.setColor(cy.e());
        paramGraphics.drawString(str, m, k - 2);
        m = m + this.b.getFontMetrics(font).stringWidth(str) + 4;
      }
    }
  }

  private void a(int paramInt) {
    for (cy cy : this.a) cy.c(paramInt);
  }

  public void a() {
    this.c = null;
    this.e = null;
    this.f = null;
    this.h = null;
  }

  public void a(cy paramcy) {
    this.a.add(paramcy);
  }

  public int b() {
    return this.a.size();
  }

  private Font d() {
    if (this.e == null)
      this.e = new Font(this.b.getFont().getName(), 1, this.b.getFont().getSize());
    return this.e;
  }

  private Font e() {
    if (this.f == null) this.f = new Font(d().getName(), 0, d().getSize());
    return this.f;
  }

  public Insets c() {
    if (this.h == null) this.h = this.b.getInsets();
    return this.h;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
