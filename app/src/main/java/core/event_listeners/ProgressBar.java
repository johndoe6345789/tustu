package ao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ap extends JComponent {
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

  Vector n = null;

  Image o;

  Image p;

  Dimension q = null;

  Dimension r = null;

  Dimension s = null;

  int t = 4;

  int u = 0;

  int v = 6;

  boolean w = true;

  public ap(String paramString) {
    this.a = paramString;
    setFont(new Font("Helvetica", 0, 10));
    enableEvents(16L);
    this.n = new Vector();
    setOpaque(true);
    repaint();
  }

  public ap(String paramString, Image paramImage) {
    this(paramString);
    this.o = paramImage;
  }

  public ap(String paramString, Image paramImage, Dimension paramDimension) {
    this(paramString, paramImage);
    if (paramDimension != null) this.q = paramDimension;
  }

  public ap(
      String paramString, Image paramImage, Dimension paramDimension1, Dimension paramDimension2) {
    this(paramString, paramImage, paramDimension1);
    this.s = paramDimension2;
  }

  public void a(String paramString) {
    this.a = paramString;
    this.u = c();
    repaint();
  }

  public String a() {
    return this.a;
  }

  public void setToolTipText(String paramString) {
    super.setToolTipText(paramString);
    this.b = paramString;
  }

  public void setBackground(Color paramColor) {
    this.g = paramColor;
    this.e = paramColor.darker();
    super.setBackground(paramColor);
    repaint();
  }

  private Image b() {
    if ((getParent().getSize()).width <= 0
        || (getParent().getSize()).height <= 0
        || (getSize()).height <= 0) return null;
    Image image = createImage((getSize()).width, (getSize()).height);
    Graphics graphics = image.getGraphics();
    return image;
  }

  public void paint(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setRenderingHint(
        RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    this.u = c();
    this.g = getBackground();
    paramGraphics.setFont(getFont());
    int i = 0;
    if (this.o != null)
      if (this.a != null) {
        i =
            (this.s == null)
                ? (((getSize()).height
                        - this.o.getHeight(null)
                        - getFontMetrics(getFont()).getHeight())
                    / 2)
                : (((getSize()).height - this.s.height - getFontMetrics(getFont()).getHeight())
                    / 2);
      } else {
        i =
            (this.s == null)
                ? (((getSize()).height - this.o.getHeight(null)) / 2)
                : (((getSize()).height - this.s.height) / 2);
      }
    int j =
        (this.o != null)
            ? ((getSize()).height - getFontMetrics(getFont()).getHeight() / 3)
            : (((getSize()).height + getFontMetrics(getFont()).getHeight() / 2) / 2 + 1);
    paramGraphics.setColor(this.g);
    paramGraphics.fillRect(0, 0, (getSize()).width, (getSize()).height);
    if (this.i) {
      paramGraphics.setColor(Color.lightGray);
      paramGraphics.draw3DRect(0, 0, (getSize()).width, (getSize()).height, false);
      paramGraphics.draw3DRect(1, 1, (getSize()).width - 2, (getSize()).height - 2, false);
      paramGraphics.setColor(this.g.darker());
      if (this.o != null)
        if (this.s == null) {
          paramGraphics.drawImage(
              this.o, ((getSize()).width - this.o.getWidth(null)) / 2 + 1, i + 1, this);
        } else {
          paramGraphics.drawImage(
              this.o,
              ((getSize()).width - this.s.width) / 2 + 1,
              i + 1,
              this.s.width,
              this.s.height,
              this);
        }
      paramGraphics.setColor(UIManager.getColor("Button.foreground"));
      if (this.a != null) paramGraphics.drawString(this.a, this.u, j);
      if (this.h != null) a(paramGraphics, 0);
    } else if (this.j) {
      paramGraphics.setColor(Color.lightGray);
      paramGraphics.draw3DRect(0, 0, (getSize()).width, (getSize()).height, true);
      paramGraphics.setColor(this.g);
      paramGraphics.draw3DRect(0, 0, (getSize()).width - 1, (getSize()).height - 1, true);
      paramGraphics.setColor(getForeground());
      paramGraphics.setColor(UIManager.getColor("Button.foreground"));
      if (this.a != null) paramGraphics.drawString(this.a, this.u - 1, j - 1);
      if (this.o != null)
        if (this.s == null) {
          paramGraphics.drawImage(this.o, ((getSize()).width - this.o.getWidth(null)) / 2, i, this);
        } else {
          paramGraphics.drawImage(
              this.o, ((getSize()).width - this.s.width) / 2, i, this.s.width, this.s.height, this);
        }
      if (this.h != null) a(paramGraphics, -1);
    } else {
      paramGraphics.setColor(this.g);
      if (this.o != null)
        if (this.s == null) {
          paramGraphics.drawImage(
              this.o, ((getSize()).width - this.o.getWidth(null)) / 2 + 1, i + 1, this);
        } else {
          paramGraphics.drawImage(
              this.o,
              ((getSize()).width - this.s.width) / 2 + 1,
              i + 1,
              this.s.width,
              this.s.height,
              this);
        }
      paramGraphics.setColor(UIManager.getColor("Button.foreground"));
      if (this.a != null) paramGraphics.drawString(this.a, this.u, j);
      if (this.h != null) a(paramGraphics, 1);
    }
  }

  private void a(Graphics paramGraphics, int paramInt) {
    paramGraphics.setColor(this.h);
    paramGraphics.fillRect(
        getWidth() - this.v - 2 + paramInt, (getHeight() - this.v) / 2 + paramInt, this.v, this.v);
  }

  public void a(ActionListener paramActionListener) {
    this.n.addElement(paramActionListener);
  }

  protected void a(ActionEvent paramActionEvent) {
    Enumeration<ActionListener> enumeration = this.n.elements();
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
    if (paramMouseEvent.getID() == 501
        && (paramMouseEvent.getModifiers() | 0x4) != paramMouseEvent.getModifiers()) {
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
    super.processMouseEvent(paramMouseEvent);
  }

  public void a(Dimension paramDimension) {
    this.q = paramDimension;
  }

  public void setFont(Font paramFont) {
    this.k = true;
    super.setFont(paramFont);
    if (getParent() != null) getParent().invalidate();
  }

  private int c() {
    return (this.a == null)
        ? 0
        : (this.w ? (((getSize()).width - getFontMetrics(getFont()).stringWidth(this.a)) / 2) : 4);
  }

  public void validate() {
    if (this.m && !isValid() && this.p != null) this.p = b();
    super.validate();
    if (!this.k) setFont(getParent().getFont());
    this.u = c();
    repaint();
    if (this.c != null && this.o == null)
      this.o = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/" + this.c));
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.m
        && this.p != null
        && this.r != null
        && (this.r.width < (getLocation()).x + (getSize()).width
            || this.r.height < (getLocation()).y + (getSize()).height)) this.p = b();
  }

  public boolean imageUpdate(
      Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 == 32) {
      if (this.q == null) {
        aq aq = new aq(this);
        SwingUtilities.invokeLater(aq);
      }
      repaint();
    }
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public Dimension getPreferredSize() {
    if (this.q != null) return this.q;
    int i = 5;
    int j = 7;
    if (this.a != null && !this.a.isEmpty()) {
      FontMetrics fontMetrics = getFontMetrics(getFont());
      if (this.a != null) {
        i += fontMetrics.getHeight();
        j += fontMetrics.stringWidth(this.a);
      }
    }
    if (this.o != null)
      if (this.s == null) {
        i += this.o.getHeight(this);
        j = (j < this.o.getWidth(this) + 7) ? (this.o.getWidth(this) + 5) : j;
      } else {
        i += this.s.height;
        j = (j < this.s.width + 7) ? (this.s.width + 5) : j;
      }
    if (this.h != null) j = this.v;
    return new Dimension(j, i);
  }

  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
