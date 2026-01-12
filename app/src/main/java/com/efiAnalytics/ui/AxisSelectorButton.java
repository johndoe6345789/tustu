package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.UIManager;

public class AxisSelectorButton extends JComponent {
  private int c = -1;

  private String d = "";

  private Color e = null;

  Color a = Color.lightGray;

  private boolean f = false;

  private String g = "";

  List b = new ArrayList();

  public AxisSelectorButton(String paramString, Color paramColor) {
    this();
    this.d = paramString;
    this.e = paramColor;
  }

  public AxisSelectorButton() {
    addMouseListener(new fo(this));
    setForeground(UIManager.getColor("Label.foreground"));
    setBackground(UIManager.getColor("Label.background"));
    a();
  }

  public void paint(Graphics paramGraphics) {
    a(paramGraphics);
  }

  public void a(ActionListener paramActionListener) {
    this.b.add(paramActionListener);
  }

  private void f() {
    ActionEvent actionEvent =
        new ActionEvent(this, 1001, e(), EventQueue.getMostRecentEventTime(), 0);
    for (ActionListener actionListener : this.b) actionListener.actionPerformed(actionEvent);
  }

  private int g() {
    if (this.c < 0) this.c = eJ.a(8);
    return this.c;
  }

  public void a() {
    Font font = UIManager.getFont("Label.font");
    int i = eJ.a(11);
    if (font != null) i = Math.round(font.getSize2D() * i / eJ.a());
    setFont(new Font("SansSerif", 1, i));
  }

  public void a(Graphics paramGraphics) {
    FontMetrics fontMetrics = getFontMetrics(getFont());
    Color color = getBackground();
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    String str = b();
    paramGraphics.setColor(color);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(getForeground());
    paramGraphics.setFont(getFont());
    int i = getWidth() - fontMetrics.stringWidth(str) - g();
    int j = getHeight() - (getHeight() - getFont().getSize()) / 2 - 2;
    paramGraphics.drawString(str, i, j);
    b(paramGraphics);
    paramGraphics.setColor(this.a);
    paramGraphics.draw3DRect(0, 0, getWidth() - 1, getHeight() - 1, false);
  }

  private void b(Graphics paramGraphics) {
    if (!this.f) {
      Color color = getBackground();
      if (color.getRed() + color.getBlue() + color.getGreen() < 38) {
        paramGraphics.setColor(Color.DARK_GRAY.darker());
      } else {
        paramGraphics.setColor(Color.GRAY);
      }
    } else {
      paramGraphics.setColor(c());
    }
    int i = 3 * (getHeight() - 2) / 4;
    int j = eJ.a(1) + (getHeight() - i) / 2;
    paramGraphics.fill3DRect(j, j, i, i, d());
  }

  public Dimension getPreferredSize() {
    int i = getFont().getSize() + eJ.a(8);
    int j = h() + getFontMetrics(getFont()).stringWidth(b()) + g();
    return new Dimension(j, i);
  }

  public Dimension getMinimumSize() {
    int i = getFont().getSize() + eJ.a(8);
    int j = h() + getFontMetrics(getFont()).stringWidth(b()) + g();
    return new Dimension(j, i);
  }

  private int h() {
    int i = 3 * (getHeight() - 2) / 4;
    int j = eJ.a(1) + (getHeight() - 2 - i) / 2;
    return i + j;
  }

  public String b() {
    return this.d;
  }

  public Color c() {
    return this.e;
  }

  public boolean d() {
    return this.f;
  }

  public void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }

  public String e() {
    return this.g;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
