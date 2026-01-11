package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bC;
import G.i;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.p;
import c.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ew;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import r.a;
import r.i;
import s.g;

public class bq extends g implements aN, h, d, bc, ChangeListener {
  protected bC a = null;
  
  protected R b = null;
  
  protected JSlider c = null;
  
  private double m = 1.0D;
  
  protected JLabel d = new JLabel("", 0);
  
  protected bb e = null;
  
  boolean f = false;
  
  boolean g = false;
  
  ew h = null;
  
  boolean i = false;
  
  aM j = null;
  
  bs k = null;
  
  static long l = 0L;
  
  public bq(R paramR, bC parambC) {
    this.a = parambC;
    this.b = paramR;
    this.g = parambC.g();
    c_(parambC.aJ());
    setBorder(BorderFactory.createTitledBorder(""));
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    String str = this.a.l();
    if (str != null)
      str = g.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    this.e = new bb(str);
    if (this.a.e()) {
      this.e.setBackground(Color.BLUE);
      this.e.setForeground(Color.WHITE);
    } else if (this.a.d()) {
      this.e.setBackground(Color.RED);
      this.e.setForeground(Color.WHITE);
    } 
    this.e.setHorizontalAlignment(0);
    jPanel.add("South", this.e);
    this.d.setMinimumSize(new Dimension(eJ.a(50), eJ.a(20)));
    this.d.setPreferredSize(new Dimension(eJ.a(50), eJ.a(20)));
    if (this.a.b() != null) {
      this.j = paramR.c(this.a.b());
      if (parambC != null && parambC.b() != null && this.j != null && !this.j.i().equals("array")) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1, 0, 2, 2));
        if (i.a().a("lkjfgblkjgdoijre98u")) {
          a a = new a(paramR, parambC.b());
          jPanel1.add(a);
        } 
        l l = new l(paramR, parambC.b());
        jPanel1.add(l);
        jPanel.add("West", jPanel1);
      } 
      if (this.j != null) {
        String str2 = this.j.p();
        if (str2 != null && !str2.equals("") && this.e.getText() != null && !this.e.getText().endsWith(str2)) {
          String str3 = g.b(str2);
          str = str + "(" + str3 + ")";
          this.e.setText(str);
        } 
        boolean bool = false;
        if (this.a.a() == bC.b)
          bool = true; 
        this.m = 1.0D / this.j.B();
        int j = (int)(this.j.r() * this.m);
        int k = (int)(this.j.s() * this.m);
        this.c = new JSlider(bool, j, k, j);
        h();
        this.k = new bs(this);
        try {
          i.a(paramR.c(), this.j, this.k);
        } catch (a a) {
          Logger.getLogger(bq.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
        this.c.setPaintTicks(true);
        if (this.j.i().equals("scalar")) {
          c();
          this.c.addChangeListener(this);
          JPanel jPanel1 = new JPanel();
          jPanel1.setLayout(new BorderLayout(1, 1));
          jPanel1.add("Center", this.d);
          jPanel.add("East", jPanel1);
          jPanel.add("Center", this.c);
        } else {
          this.e.setText("Unsupported data type: " + this.j.i());
        } 
      } else {
        this.e.setEnabled(false);
        this.e.setText(" ");
      } 
      int i = a.a().a(a.aH, a.a().o());
      String str1 = getFont().getFamily();
      if (i > 12) {
        setFont(new Font(str1, 1, i));
      } else {
        setFont(new Font(str1, 0, i));
      } 
    } 
    if (this.c != null)
      this.c.addFocusListener(new br(this)); 
    add("North", jPanel);
  }
  
  public void requestFocus() {
    if (this.c != null)
      this.c.requestFocus(); 
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.c != null)
      this.c.setFont(paramFont); 
    if (this.e != null)
      this.e.setFont(paramFont); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    a(this, paramBoolean);
    c();
    if (this.h != null);
  }
  
  private void a(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container)
        a((Container)arrayOfComponent[b], paramBoolean); 
    } 
  }
  
  public void c() {
    if (this.a.b() != null) {
      aM aM1 = b_().c(this.a.b());
      if (this.c != null)
        try {
          double d1 = aM1.i(b_().p())[this.a.f()][this.a.h()];
          int i = (int)Math.round(d1 * this.m);
          if (i != this.c.getValue())
            this.c.setValue(i); 
        } catch (g g1) {
          D.a(g1.getMessage(), (Exception)g1, this);
        }  
      if (this.d != null)
        try {
          String str = aM1.b(b_().p())[this.a.f()][this.a.h()];
          if (this.d.isEnabled()) {
            this.d.setText(str);
          } else {
            this.d.setText("");
          } 
        } catch (g g1) {
          D.a(g1.getMessage(), (Exception)g1, this);
        }  
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    c();
  }
  
  public int d() {
    return 0;
  }
  
  public void e() {
    if (d() == 0) {
      a(this.c.getValue() / this.m);
    } else {
      f();
    } 
  }
  
  private static void a(String paramString, Component paramComponent) {
    if (System.currentTimeMillis() - l > 500L) {
      l = System.currentTimeMillis();
      bV.d(paramString, paramComponent);
      l = System.currentTimeMillis();
    } 
  }
  
  public void a(double paramDouble) {
    aM aM1 = b_().c(this.a.b());
    try {
      if (aM1.i().equals("scalar")) {
        aM1.a(b_().p(), paramDouble);
      } else if (aM1.i().equals("array")) {
        if (paramDouble > aM1.s()) {
          String str = this.a.b() + " value of " + paramDouble + " is too high.\nMust be less than : " + aM1.s();
          a(str, this);
          f();
          c();
        } else if (paramDouble < aM1.r()) {
          String str = this.a.b() + " value of " + paramDouble + " is too low.\nMust be greater than : " + aM1.r();
          a(str, this);
          f();
          c();
        } else {
          double[][] arrayOfDouble = aM1.i(b_().p());
          arrayOfDouble[this.a.f()][this.a.h()] = paramDouble;
          aM1.a(b_().p(), arrayOfDouble);
        } 
      } else {
        D.c("Didn't update it: " + aM1);
      } 
      if (this.g)
        b_().I(); 
    } catch (g g1) {
      g1.printStackTrace();
      bV.d("Failed to update " + this.a.b() + "\n Error logged", this);
    } catch (NumberFormatException numberFormatException) {
      bV.d("Must be numeric", this);
      f();
    } catch (j j) {
      if (j.a() == 2) {
        String str = this.a.b() + " value of " + j.b() + " is too low.\nMust be greater than : " + j.c();
        if (j.d() >= 0)
          str = "Col:" + (j.e() + 1) + "\n" + str; 
        if (j.d() >= 0)
          str = "Row:" + (j.d() + 1) + "\n" + str; 
        bV.d(str, this);
        a(j.c());
        c();
      } else if (j.a() == 1) {
        String str = this.a.b() + " value of " + j.b() + " is too high!.\nMust be less than : " + j.c();
        if (j.d() >= 0)
          str = "Col:" + (j.e() + 1) + "\n" + str; 
        if (j.d() >= 0)
          str = "Row:" + (j.d() + 1) + "\n" + str; 
        bV.d(str, this);
        a(j.c());
        c();
      } 
      f();
    } 
  }
  
  public Insets getInsets() {
    return new Insets(1, 1, 1, 1);
  }
  
  public void close() {
    g();
    aR.a().a(this);
    if (this.k != null)
      aR.a().a(this.k); 
  }
  
  public void f() {
    this.f = true;
    bt bt = new bt(this);
    bt.start();
  }
  
  public void g() {
    this.f = false;
  }
  
  public void setBackground(Color paramColor) {
    if (this.c != null)
      this.c.setBackground(paramColor); 
  }
  
  public R b_() {
    return this.b;
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    e();
  }
  
  public void a() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.a(a_(), this.b);
        setEnabled(bool);
      } catch (Exception exception) {
        D.a(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void h() {
    if (this.j != null) {
      this.m = 1.0D / this.j.B();
      int i = (int)(this.j.r() * this.m);
      int j = (int)(this.j.s() * this.m);
      this.c.setMinimum(i);
      this.c.setMaximum(j);
      if ((j - i) % 4 == 0) {
        int k = (j - i) / 4;
        this.c.setMajorTickSpacing(k);
      } else if ((j - i) % 5 == 0) {
        int k = (j - i) / 5;
        this.c.setMajorTickSpacing(k);
      } else if ((j - i) % 2 == 0) {
        int k = (j - i) / 2;
        this.c.setMajorTickSpacing(k);
      } 
      if ((j - i) % 20 == 0) {
        int k = (j - i) / 20;
        this.c.setMinorTickSpacing(k);
      } else if ((j - i) % 10 == 0) {
        int k = (j - i) / 10;
        this.c.setMinorTickSpacing(k);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */