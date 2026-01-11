package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JComponent;

public class CustomButton extends JComponent {
  String a = "";
  
  String b = null;
  
  String c = null;
  
  Point d = null;
  
  Color e;
  
  Color f = Color.yellow;
  
  Color g;
  
  Color h = null;
  
  boolean i = false;
  
  boolean j = false;
  
  boolean k = false;
  
  boolean l = true;
  
  boolean m = false;
  
  boolean n = false;
  
  Vector o = null;
  
  Image p;
  
  Image q;
  
  Dimension r = null;
  
  Dimension s = null;
  
  Dimension t = null;
  
  int u = 4;
  
  int v = 0;
  
  int w = 6;
  
  int x = 1;
  
  boolean y = true;
  
  public CustomButton(String paramString) {
    this.a = paramString;
    enableEvents(16L);
    this.o = new Vector();
    repaint();
  }
  
  public CustomButton(String paramString, Image paramImage) {
    this(paramString);
    this.b = this.b;
    this.p = paramImage;
  }
  
  public void a(int paramInt) {
    this.x = paramInt;
    if (paramInt == 4)
      b(false); 
  }
  
  public CustomButton(String paramString, Image paramImage, Dimension paramDimension) {
    this(paramString, paramImage);
    if (paramDimension != null)
      this.r = paramDimension; 
  }
  
  public CustomButton(String paramString, Image paramImage, Dimension paramDimension1, Dimension paramDimension2) {
    this(paramString, paramImage, paramDimension1);
    this.t = paramDimension2;
  }
  
  public void a(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public void b(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public void a(String paramString) {
    this.a = paramString;
    this.v = e();
    repaint();
  }
  
  public void a(Image paramImage) {
    this.p = paramImage;
  }
  
  public String a() {
    return this.a;
  }
  
  public void b(int paramInt) {
    this.w = paramInt;
  }
  
  public void setToolTipText(String paramString) {
    this.b = paramString;
  }
  
  public String getToolTipText() {
    return this.b;
  }
  
  public void setBackground(Color paramColor) {
    this.g = paramColor;
    this.e = paramColor.darker();
    super.setBackground(paramColor);
    repaint();
  }
  
  public void a(Color paramColor) {
    this.h = paramColor;
  }
  
  public void a(Dimension paramDimension) {
    this.t = paramDimension;
  }
  
  private Image b() {
    if ((getParent().getSize()).width <= 0 || (getParent().getSize()).height <= 0 || (getSize()).height <= 0)
      return null; 
    this.s = getParent().getSize();
    Image image1 = createImage((getParent().getSize()).width, (getParent().getSize()).height);
    Image image2 = createImage((getSize()).width, (getSize()).height);
    Graphics graphics = image2.getGraphics();
    graphics.drawImage(image1, -(getLocation()).x, -(getLocation()).y, null);
    return image2;
  }
  
  private int c() {
    return (this.t == null) ? this.p.getHeight(null) : this.t.height;
  }
  
  private int d() {
    return (this.t == null) ? this.p.getWidth(null) : this.t.width;
  }
  
  public void paint(Graphics paramGraphics) {
    this.v = e();
    this.g = getBackground();
    int i = 0;
    int j = 0;
    if (this.p != null) {
      if (this.a != null && this.x == 1) {
        i = ((getSize()).height - c() - getFontMetrics(getFont()).getHeight()) / 2;
      } else {
        i = ((getSize()).height - c()) / 2;
      } 
      if (this.x == 1) {
        j = ((getSize()).width - d()) / 2;
      } else if (this.x == 4) {
        j = (getSize()).width - d() - 3;
      } else if (this.x == 2) {
        j = 3;
      } 
    } 
    int k = (this.p != null && this.x == 1) ? ((getSize()).height - getFontMetrics(getFont()).getHeight() / 3) : (((getSize()).height + getFontMetrics(getFont()).getHeight() / 2) / 2 + 1);
    paramGraphics.setColor(this.g);
    paramGraphics.fillRect(0, 0, (getSize()).width, (getSize()).height);
    if (this.q == null)
      this.q = b(); 
    if (this.m && this.q != null)
      paramGraphics.drawImage(this.q, 0, 0, null); 
    if (isEnabled() && this.i) {
      paramGraphics.setColor(Color.lightGray);
      paramGraphics.draw3DRect(0, 0, (getSize()).width, (getSize()).height, false);
      paramGraphics.draw3DRect(1, 1, (getSize()).width - 2, (getSize()).height - 2, false);
      paramGraphics.setColor(this.g.darker());
      if (this.p != null)
        if (this.t == null) {
          paramGraphics.drawImage(this.p, j + 1, i + 1, this);
        } else {
          paramGraphics.drawImage(this.p, j + 1, i + 1, this.t.width, this.t.height, this);
        }  
      paramGraphics.setColor(getForeground());
      if (this.a != null)
        paramGraphics.drawString(this.a, this.v, k); 
      if (this.h != null)
        a(paramGraphics, 0); 
    } else if (isEnabled() && this.j) {
      paramGraphics.setColor(Color.lightGray);
      paramGraphics.draw3DRect(0, 0, (getSize()).width, (getSize()).height, true);
      paramGraphics.setColor(this.g);
      paramGraphics.draw3DRect(0, 0, (getSize()).width - 1, (getSize()).height - 1, true);
      paramGraphics.setColor(getForeground());
      if (this.a != null)
        paramGraphics.drawString(this.a, this.v - 1, k - 1); 
      if (this.p != null)
        if (this.t == null) {
          paramGraphics.drawImage(this.p, j, i, this);
        } else {
          paramGraphics.drawImage(this.p, j, i, this.t.width, this.t.height, this);
        }  
      if (this.h != null)
        a(paramGraphics, -1); 
    } else {
      paramGraphics.setColor(this.g);
      if (this.p != null)
        if (this.t == null) {
          paramGraphics.drawImage(this.p, j + 1, i + 1, this);
        } else {
          paramGraphics.drawImage(this.p, j + 1, i + 1, this.t.width, this.t.height, this);
        }  
      paramGraphics.setColor(getForeground());
      if (this.a != null)
        paramGraphics.drawString(this.a, this.v, k); 
      if (this.h != null)
        a(paramGraphics, 1); 
      if (this.n && isEnabled()) {
        paramGraphics.setColor(Color.lightGray);
        paramGraphics.draw3DRect(1, 1, getWidth() - 3, getHeight() - 3, false);
      } 
      if (!isEnabled()) {
        Color color = new Color(128, 128, 128, 128);
        paramGraphics.setColor(color);
        paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      } 
    } 
  }
  
  private void a(Graphics paramGraphics, int paramInt) {
    paramGraphics.setColor(this.h);
    paramGraphics.fillRect(getWidth() - this.w - 2 + paramInt, (getHeight() - this.w) / 2 + paramInt, this.w, this.w);
  }
  
  public void a(ActionListener paramActionListener) {
    this.o.addElement(paramActionListener);
  }
  
  protected void a(ActionEvent paramActionEvent) {
    Enumeration<ActionListener> enumeration = this.o.elements();
    while (enumeration.hasMoreElements()) {
      ActionListener actionListener = enumeration.nextElement();
      if (actionListener != null) {
        actionListener.actionPerformed(paramActionEvent);
        continue;
      } 
      System.out.println("FlatButton:: Can not call actionPerformed(ActionEvent) on null Listener");
    } 
  }
  
  protected void processMouseEvent(MouseEvent paramMouseEvent) {
    if (isEnabled()) {
      if (paramMouseEvent.getID() == 501 && (paramMouseEvent.getModifiers() | 0x4) != paramMouseEvent.getModifiers()) {
        this.i = true;
        repaint(0L);
      } 
      if (paramMouseEvent.getID() == 504) {
        this.j = true;
        repaint(0L);
      } 
      if (paramMouseEvent.getID() == 502) {
        if (this.j && this.i) {
          String str = (this.a == null || this.a.length() < 1) ? this.b : this.a;
          ActionEvent actionEvent = new ActionEvent(this, 1001, str, paramMouseEvent.getModifiers());
          a(actionEvent);
        } 
        this.i = false;
        repaint(0L);
      } 
      if (paramMouseEvent.getID() == 505) {
        this.j = false;
        repaint();
      } 
    } 
    super.processMouseEvent(paramMouseEvent);
  }
  
  public void b(Dimension paramDimension) {
    this.r = paramDimension;
  }
  
  public void setFont(Font paramFont) {
    this.k = true;
    super.setFont(paramFont);
    if (getParent() != null)
      getParent().invalidate(); 
  }
  
  private int e() {
    return (this.a == null || getParent() == null) ? 0 : (this.y ? (((getSize()).width - getFontMetrics(getFont()).stringWidth(this.a)) / 2) : 5);
  }
  
  public void validate() {
    if (this.m && !isValid() && this.q != null)
      this.q = b(); 
    super.validate();
    if (!this.k)
      setFont(getParent().getFont()); 
    this.v = e();
    repaint();
    if (this.c != null && this.p == null)
      this.p = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/" + this.c)); 
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.m && this.q != null && this.s != null && (this.s.width < (getLocation()).x + (getSize()).width || this.s.height < (getLocation()).y + (getSize()).height))
      this.q = b(); 
  }
  
  public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 == 32) {
      if (this.r == null) {
        getParent().invalidate();
        getParent().doLayout();
        try {
          getParent().getParent().doLayout();
        } catch (Exception exception) {}
      } 
      repaint();
    } 
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public Dimension getPreferredSize() {
    if (this.r != null)
      return this.r; 
    FontMetrics fontMetrics = getFontMetrics(getFont());
    int i = 5;
    int j = 7;
    if (this.a != null) {
      i += fontMetrics.getHeight();
      j += fontMetrics.stringWidth(this.a);
    } 
    if (this.p != null) {
      int k = (this.t == null) ? this.p.getHeight(null) : this.t.height;
      int m = (this.t == null) ? this.p.getWidth(null) : this.t.height;
      if (this.x == 1) {
        i += k;
        j = (j < m + 7) ? (m + 5) : j;
      } else {
        i = (i > k + 5) ? i : (k + 5);
        j = m + j + 10;
      } 
    } 
    if (this.h != null)
      j = this.w; 
    return new Dimension(j, i);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */