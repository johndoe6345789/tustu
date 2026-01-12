package business.bean_encoders.bE_components;

import bH.X;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fh;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.UIManager;

public class JComponentExtension extends JComponent implements l {
  public static int a = 0;

  public static int b = 1;

  public static int c = 2;

  private int y = b;

  ArrayList d = new ArrayList();

  ArrayList e = new ArrayList();

  ArrayList f = new ArrayList();

  Image g = null;

  Image h = null;

  private Insets z = eJ.a(new Insets(5, 25, 15, 5));

  private Insets A = eJ.a(new Insets(20, 20, 0, 55));

  private Color B = Color.darkGray;

  private Color C = Color.WHITE;

  private boolean D = true;

  private boolean E = false;

  private boolean F = true;

  private float[] G = new float[] {2.0F, 5.0F, 2.0F, 5.0F};

  Stroke i = new BasicStroke(1.0F, 0, 0, 10.0F, this.G, 0.0F);

  Stroke j = new BasicStroke(eJ.a(2));

  Stroke k = new BasicStroke(eJ.a(1));

  Stroke l = new BasicStroke(eJ.a(3));

  Stroke m = new BasicStroke(eJ.a(5));

  private int H = -1;

  private int I = -1;

  private boolean J = true;

  Stroke n = new BasicStroke(eJ.a(1));

  double o = Double.NaN;

  double p = Double.NaN;

  private int K = -1;

  private int L = -1;

  private int M = -1;

  int q = -1;

  int r = -1;

  int s = -1;

  private int N = 4;

  private int O = 4;

  private int P = Integer.MAX_VALUE;

  private int Q = eJ.a(2);

  private int R = eJ.a(7);

  private boolean S = false;

  int[][] t = null;

  int u = 0;

  int v = Integer.MAX_VALUE;

  private String T = "X";

  private String U = "Y";

  private String V = "Z";

  double[][] w = null;

  Point x = null;

  private final List W = new ArrayList();

  public JComponentExtension() {
    this.e.add(Color.cyan);
    this.e.add(Color.red);
    this.e.add(Color.yellow);
    this.e.add(Color.magenta);
    b();
    setBackground(Color.black);
    o o = new o(this);
    addMouseMotionListener(o);
    addMouseListener(o);
    addMouseWheelListener(o);
  }

  public void b() {
    Font font = UIManager.getFont("Label.font");
    int i = eJ.a(11);
    if (font != null) i = Math.round(font.getSize2D() * i / eJ.a());
    setFont(new Font("SansSerif", 0, i));
    this.A = new Insets(i * 2, i * 2, 0, i * 5);
  }

  public void paint(Graphics paramGraphics) {
    Image image = t();
    Graphics graphics = image.getGraphics();
    graphics.setFont(getFont());
    graphics.drawImage(s(), 0, 0, this);
    a(graphics);
    b(graphics);
    paramGraphics.drawImage(this.h, 0, 0, this);
    paintChildren(paramGraphics);
  }

  private void a(Graphics paramGraphics) {
    Point point = m();
    if (point != null) {
      int i = eJ.a(14);
      Graphics2D graphics2D = (Graphics2D) paramGraphics;
      graphics2D.setRenderingHint(
          RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paramGraphics.setColor(Color.BLACK);
      graphics2D.setStroke(this.m);
      paramGraphics.drawOval(point.x - i / 2, point.y - i / 2, i, i);
      graphics2D.setStroke(this.l);
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.drawOval(point.x - i / 2, point.y - i / 2, i, i);
    }
  }

  private void b(Graphics paramGraphics) {
    if (!j() || h() < 0 || i() < 0) return;
    paramGraphics.setFont(getFont());
    paramGraphics.setColor(this.C);
    ((Graphics2D) paramGraphics).setStroke(this.n);
    Rectangle rectangle = c();
    if (!rectangle.contains(h(), i())) return;
    int i = eJ.a(150);
    paramGraphics.setColor(g());
    paramGraphics.drawLine(h(), rectangle.y, h(), rectangle.height + rectangle.y);
    paramGraphics.drawLine(rectangle.x, i(), rectangle.width + rectangle.x, i());
    q q = a(this.d.get(0), h(), i());
    int j = this.z.left + i - paramGraphics.getFontMetrics().stringWidth(this.T);
    String str1 = this.T + " : " + X.b(q.getX(), this.K);
    paramGraphics.drawString(str1, j, this.z.top + paramGraphics.getFont().getSize());
    j = this.z.left + i - paramGraphics.getFontMetrics().stringWidth(this.U);
    String str2 = this.U + " : " + X.b(q.getY(), this.L);
    paramGraphics.drawString(str2, j, this.z.top + paramGraphics.getFont().getSize() * 2);
    int k = h();
    int n = i();
    j = this.z.left + i - paramGraphics.getFontMetrics().stringWidth("Hits");
    if (this.t != null && this.t.length > k && (this.t[0]).length > n)
      paramGraphics.drawString(
          "Hits : " + a(k, n), j, this.z.top + paramGraphics.getFont().getSize() * 3);
    if (!Double.isNaN(q.a()) && !Double.isInfinite(q.a())) {
      j = this.z.left + i - paramGraphics.getFontMetrics().stringWidth(this.V);
      paramGraphics.drawString(
          this.V + " : " + X.b(q.a(), this.M),
          j,
          this.z.top + paramGraphics.getFont().getSize() * 4);
    }
    Point point = this.x;
    if (point != null) paramGraphics.drawRect(point.x, point.y, h() - point.x, i() - point.y);
  }

  private int a(int paramInt1, int paramInt2) {
    int i = 0;
    for (int j = paramInt1 - 2; j <= paramInt1 + 2 && j < this.t.length; j++) {
      for (int k = paramInt2 - 2; k <= paramInt2 + 2 && k < (this.t[0]).length; k++) {
        if (this.t[j][k] > i)
          ;
        i += this.t[j][k];
      }
    }
    return i;
  }

  private double b(int paramInt1, int paramInt2) {
    double d = Double.NaN;
    byte b = 0;
    int i;
    for (i = paramInt1 - 2; i <= paramInt1 + 2 && i < this.w.length; i++) {
      for (int j = paramInt2 - 2; j <= paramInt2 + 2 && j < (this.w[0]).length; j++) {
        if (this.w[i][j] != Double.NEGATIVE_INFINITY) b++;
      }
    }
    for (i = paramInt1 - 2; i <= paramInt1 + 2 && i < this.w.length; i++) {
      for (int j = paramInt2 - 2; j <= paramInt2 + 2 && j < (this.w[0]).length; j++) {
        if (k() == b) {
          if (Double.isNaN(d) && this.w[i][j] != Double.NEGATIVE_INFINITY) {
            d = this.w[i][j] / b;
          } else if (this.w[i][j] != Double.NEGATIVE_INFINITY) {
            d += this.w[i][j] / b;
          }
        } else if (k() == c) {
          if (this.w[i][j] != Double.NEGATIVE_INFINITY && (Double.isNaN(d) || d > this.w[i][j]))
            d = this.w[i][j];
        } else if (this.w[i][j] != Double.NEGATIVE_INFINITY
            && (Double.isNaN(d) || d < this.w[i][j])) {
          d = this.w[i][j];
        }
      }
    }
    return d;
  }

  public Rectangle c() {
    return new Rectangle(
        this.z.left,
        this.z.top,
        getWidth() - this.z.left - this.z.right + 1,
        getHeight() - this.z.top - this.z.bottom + 1);
  }

  private void c(Graphics paramGraphics) {
    for (byte b = 0; b < this.d.size(); b++) {
      paramGraphics.setColor(a(b));
      p p = this.d.get(b);
      a(paramGraphics, p);
    }
  }

  private void a(Graphics paramGraphics, p paramp) {
    long l1 = System.nanoTime();
    Graphics2D graphics2D = (Graphics2D) paramGraphics;
    graphics2D.setStroke(this.j);
    this.t = new int[getWidth()][getHeight()];
    int i = 0;
    Rectangle rectangle = c();
    rectangle.height++;
    rectangle.width++;
    if (this.w == null || this.w.length != getWidth() || (this.w[0]).length != getHeight())
      this.w = new double[getWidth()][getHeight()];
    this.w = a(this.w);
    ArrayList<q> arrayList = new ArrayList();
    for (int j = paramp.f(); j < paramp.e(); j++) {
      q q = paramp.b(j);
      if (!q.b()) {
        Point point1 = a(paramp, q.getX(), q.getY());
        if (rectangle.contains(point1)) {
          this.t[point1.x][point1.y] = this.t[point1.x][point1.y] + 1;
          if (i < this.t[point1.x][point1.y]) i = this.t[point1.x][point1.y];
          arrayList.add(q);
        }
      }
    }
    this.v = i;
    b(paramGraphics, paramp);
    Point point = null;
    for (q q : arrayList) {
      Point point1 = a(paramp, q.getX(), q.getY());
      if (this.t[point1.x][point1.y] <= this.R) {
        k = this.Q + this.t[point1.x][point1.y] / 3;
      } else {
        k = this.R;
      }
      int k = eJ.a(k);
      if (!Double.isNaN(paramp.i()) && !Double.isNaN(paramp.h()))
        if (k() == b) {
          if (this.w[point1.x][point1.y] == Double.NEGATIVE_INFINITY) {
            this.w[point1.x][point1.y] = q.a() / this.t[point1.x][point1.y];
          } else {
            this.w[point1.x][point1.y] =
                this.w[point1.x][point1.y] + q.a() / this.t[point1.x][point1.y];
          }
        } else if (k() == c) {
          if (q.a() < this.w[point1.x][point1.y]
              || this.w[point1.x][point1.y] == Double.NEGATIVE_INFINITY)
            this.w[point1.x][point1.y] = q.a();
        } else if (q.a() > this.w[point1.x][point1.y]) {
          this.w[point1.x][point1.y] = q.a();
        }
      Color color = a(paramp, this.w[point1.x][point1.y], a(point1.x, point1.y));
      paramGraphics.setColor(color);
      graphics2D.setStroke(this.j);
      graphics2D.fillOval(point1.x - k / 2, point1.y - k / 2, k, k);
      if (this.S && point != null) {
        graphics2D.setStroke(this.k);
        paramGraphics.drawLine(point.x, point.y, point1.x, point1.y);
      }
      point = point1;
    }
  }

  private double[][] a(double[][] paramArrayOfdouble) {
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfdouble[0]).length; b1++)
        paramArrayOfdouble[b][b1] = Double.NEGATIVE_INFINITY;
    }
    return paramArrayOfdouble;
  }

  private void b(Graphics paramGraphics, p paramp) {
    double d1;
    this.W.clear();
    int i = eJ.a(12);
    int j = (int) (getHeight() * 0.6D);
    int k = (int) (getHeight() * 0.2D);
    byte b1 = 5;
    int n = (getHeight() <= eJ.a(25)) ? 1 : (getHeight() / eJ.a(25));
    if (n > this.P - 1) n = this.P - 1;
    if (n < 1) return;
    int i1 = getWidth() - i - b1;
    if (Double.isNaN(paramp.i()) || Double.isNaN(paramp.h())) {
      d1 = (this.v / (n + 1));
    } else {
      d1 = (paramp.i() - paramp.h()) / (n + 1);
    }
    double d2 = d1 / 2.0D;
    int i2 = j / (n + 1);
    paramGraphics.setFont(getFont());
    for (byte b2 = 0; b2 <= n; b2++) {
      int i3 = k + j - (b2 + 1) * i2;
      double d3 = 0.0D;
      double d4 = b2 / n * this.v;
      if (Double.isNaN(paramp.i()) || Double.isNaN(paramp.h())) {
        d3 = d4;
      } else {
        d3 = b2 / n * (paramp.i() - paramp.h()) + paramp.h();
      }
      String str = X.b(d3, this.s);
      int i4 = paramGraphics.getFontMetrics().stringWidth(str);
      Color color = a(paramp, d3, (int) d4);
      paramGraphics.setColor(color);
      paramGraphics.fillRect(i1, i3, i, i2);
      if (b2 == 0) {
        this.W.add(new n(this, d3, d3 + d1, color));
        paramGraphics.setColor(a(0));
        paramGraphics.drawString(str, i1 - i4 - 3, i3 + i2);
      } else if (b2 == n) {
        this.W.add(new n(this, d3 - d1, d3, color));
        paramGraphics.setColor(a(0));
        paramGraphics.drawString(
            str, i1 - i4 - 3, i3 + i2 - i2 - paramGraphics.getFont().getSize());
      } else {
        this.W.add(new n(this, d3 - d2, d3 + d2, color));
        paramGraphics.setColor(a(0));
        paramGraphics.drawString(
            str, i1 - i4 - 3, i3 + i2 - (i2 - paramGraphics.getFont().getSize()) / 2);
      }
    }
  }

  private Color a(p paramp, double paramDouble, int paramInt) {
    if (Double.isNaN(paramp.i()) || Double.isNaN(paramp.h())) {
      if (this.t != null) {
        if (paramInt > this.v) paramInt = this.v;
        if (!this.W.isEmpty() && this.P < Integer.MAX_VALUE)
          for (n n : this.W) {
            if (paramInt > n.a() && paramInt <= n.b()) return n.c();
          }
        return fh.b(paramInt, this.u, this.v, 0);
      }
      return getForeground();
    }
    if (!this.W.isEmpty() && this.P < Integer.MAX_VALUE)
      for (n n : this.W) {
        if (paramDouble >= n.a() && paramDouble <= n.b()) return n.c();
      }
    return fh.b(paramDouble, paramp.h(), paramp.i(), 0);
  }

  private Image s() {
    if (this.g == null) {
      this.g = createImage(getWidth(), getHeight());
      Graphics graphics = this.g.getGraphics();
      graphics.setColor(getBackground());
      graphics.fillRect(0, 0, getWidth(), getHeight());
      d(graphics);
      c(graphics);
    }
    return this.g;
  }

  private Image t() {
    if (this.h != null
        && (this.h.getWidth(null) != getWidth() || this.h.getHeight(null) != getHeight())) d();
    if (this.h == null) this.h = createImage(getWidth(), getHeight());
    return this.h;
  }

  private void d(Graphics paramGraphics) {
    paramGraphics.setColor(f());
    Insets insets = e();
    int i = getWidth() - insets.left - insets.right;
    int j = getHeight() - insets.top - insets.bottom;
    paramGraphics.drawRect(insets.left, insets.top, i, j);
    paramGraphics.setFont(getFont());
    int k = paramGraphics.getFont().getSize();
    FontMetrics fontMetrics = paramGraphics.getFontMetrics(getFont());
    ((Graphics2D) paramGraphics).setStroke(this.i);
    byte b;
    for (b = 0; b <= this.O; b++) {
      int n = insets.top + b * j / this.O;
      paramGraphics.setColor(this.B);
      paramGraphics.drawLine(insets.left, n, insets.left + i, n);
      if (this.D && this.d.size() > 0) {
        byte b1 = this.F ? 1 : this.d.size();
        for (byte b2 = 0; b2 < b1; b2++) {
          p p = this.d.get(b2);
          String str = X.b(p.d() - (p.d() - p.c()) * b / this.O, this.r);
          int i1 = fontMetrics.stringWidth(str);
          int i2 = n + k / 2;
          if (b == this.O) i2 = n;
          if (b == 0) i2 = n + k;
          paramGraphics.setColor(a(b2));
          paramGraphics.drawString(str, this.z.left - i1 - eJ.a(5), i2);
        }
      }
    }
    for (b = 0; b <= this.N; b++) {
      int n = insets.left + b * i / this.N;
      paramGraphics.setColor(this.B);
      paramGraphics.drawLine(n, insets.top, n, insets.top + j);
      try {
        if (this.D && this.d.size() > 0) {
          byte b1 = this.F ? 1 : this.d.size();
          for (byte b2 = 0; b2 < b1; b2++) {
            p p = this.d.get(b2);
            q q = a(p, n, insets.top + j);
            String str = X.b(q.getX(), this.q);
            int i1 = fontMetrics.stringWidth(str);
            int i2 = n - i1 / 2;
            if (b == this.N) i2 = n - i1;
            if (b == 0) i2 = n;
            paramGraphics.setColor(a(b2));
            paramGraphics.drawString(str, i2, insets.top + j + k * (b2 + 1));
          }
        }
      } catch (Exception exception) {
      }
    }
  }

  private void u() {
    if (this.F) {
      this.z =
          new Insets(
              this.A.top,
              this.A.left + eJ.a(25) * this.d.size(),
              this.A.bottom + eJ.a(25) * this.d.size(),
              this.A.right);
    } else {
      this.z =
          new Insets(this.A.top, this.A.left + eJ.a(25), this.A.bottom + eJ.a(25), this.A.right);
    }
  }

  public void a(p paramp) {
    this.d.add(paramp);
    paramp.a(this);
    u();
  }

  public void a(p paramp, int paramInt) {
    if (this.d.size() > paramInt) {
      ((p) this.d.get(paramInt)).b(this);
      this.d.set(paramInt, paramp);
    } else {
      this.d.add(paramInt, paramp);
    }
    paramp.a(this);
    u();
  }

  public Color a(int paramInt) {
    return this.e.get(paramInt % this.e.size());
  }

  public Point a(p paramp, double paramDouble1, double paramDouble2) {
    int i = getWidth() - this.z.left - this.z.right;
    int j = getHeight() - this.z.top - this.z.bottom;
    double d1 = (paramDouble1 - paramp.a()) / (paramp.b() - paramp.a());
    int k = (int) (Math.round(d1 * i) + this.z.left);
    double d2 = (paramDouble2 - paramp.c()) / (paramp.d() - paramp.c());
    int n = getHeight() - this.z.bottom - (int) Math.round(d2 * j);
    return new Point(k, n);
  }

  public q a(p paramp, int paramInt1, int paramInt2) {
    double d1;
    double d2;
    double d3 = Double.NaN;
    if (paramInt1 < this.z.left) {
      d1 = paramp.a();
    } else if (paramInt1 > getWidth() - this.z.right) {
      d1 = paramp.b();
    } else {
      int i = paramInt1 - this.z.left;
      float f1 = (getWidth() - this.z.left - this.z.right);
      float f2 = i / f1;
      d1 = paramp.a() + f2 * (paramp.b() - paramp.a());
    }
    if (paramInt2 < this.z.top) {
      d2 = paramp.d();
    } else if (paramInt2 > getHeight() - this.z.bottom) {
      d2 = paramp.c();
    } else {
      int i = paramInt2 - this.z.top;
      float f1 = (getHeight() - this.z.top - this.z.bottom);
      float f2 = i / f1;
      d2 = paramp.d() - f2 * (paramp.d() - paramp.c());
    }
    if (this.w != null && this.w.length > paramInt1 && (this.w[0]).length > paramInt2)
      d3 = b(paramInt1, paramInt2);
    return new b(d1, d2, d3);
  }

  public void d() {
    this.g = null;
    this.h = null;
  }

  public Insets e() {
    return this.z;
  }

  public Color f() {
    return this.B;
  }

  public p b(int paramInt) {
    return (paramInt >= this.d.size()) ? null : this.d.get(paramInt);
  }

  public Color g() {
    return this.C;
  }

  public int h() {
    return this.H;
  }

  public int i() {
    return this.I;
  }

  public boolean j() {
    return this.J;
  }

  public void a() {
    d();
    repaint();
  }

  public void a(String paramString) {
    this.T = paramString;
  }

  public void b(String paramString) {
    this.U = paramString;
  }

  public int k() {
    return this.y;
  }

  public void c(int paramInt) {
    this.y = paramInt;
  }

  public void c(String paramString) {
    this.V = paramString;
  }

  public void a(k paramk) {
    this.f.add(paramk);
  }

  private void a(
      double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    for (k k : this.f) k.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }

  public void a(double paramDouble1, double paramDouble2) {
    if (b(0) != null) {
      Point point = a(b(0), paramDouble1, paramDouble2);
      this.o = paramDouble1;
      this.p = paramDouble2;
      this.H = point.x;
      this.I = point.y;
    }
  }

  public void l() {
    this.o = Double.NaN;
  }

  public Point m() {
    return Double.isNaN(this.o) ? null : a(b(0), this.o, this.p);
  }

  public int n() {
    return this.Q;
  }

  public void d(int paramInt) {
    this.Q = paramInt;
  }

  public int o() {
    return this.R;
  }

  public void e(int paramInt) {
    this.R = paramInt;
  }

  public void a(boolean paramBoolean) {
    this.S = paramBoolean;
  }

  public void a(double paramDouble) {
    double d1 = ((p) this.d.get(0)).a();
    double d2 = ((p) this.d.get(0)).b();
    double d3 = ((p) this.d.get(0)).c();
    double d4 = ((p) this.d.get(0)).d();
    q q = a(this.d.get(0), h(), i());
    double d5 = d2 - q.getX();
    double d6 = q.getX() - d1;
    double d7 = d4 - q.getY();
    double d8 = q.getY() - d3;
    double d9 = q.getX() + d5 / paramDouble;
    double d10 = q.getX() - d6 / paramDouble;
    double d11 = q.getY() + d7 / paramDouble;
    double d12 = q.getY() - d8 / paramDouble;
    a(d10, d9, d12, d11);
  }

  public int p() {
    return this.N;
  }

  public void f(int paramInt) {
    this.N = paramInt;
  }

  public int q() {
    return this.O;
  }

  public void g(int paramInt) {
    this.O = paramInt;
  }

  public void h(int paramInt) {
    this.K = paramInt;
  }

  public void i(int paramInt) {
    this.L = paramInt;
  }

  public void j(int paramInt) {
    this.M = paramInt;
  }

  public int r() {
    return this.P;
  }

  public void k(int paramInt) {
    this.P = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
