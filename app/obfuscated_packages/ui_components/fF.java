package ao;

import bE.k;
import bE.l;
import bE.m;
import bE.q;
import bH.J;
import com.efiAnalytics.ui.eJ;
import h.i;
import i.a;
import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class fF extends JDialog implements k, l, a {
  private m k = new m();
  
  eq a = null;
  
  JLabel b = new JLabel(" ", 0);
  
  JLabel c = new JLabel(" ", 0);
  
  com.efiAnalytics.ui.fF d = new com.efiAnalytics.ui.fF();
  
  int e = 1;
  
  int f = eJ.a(10);
  
  int g = 100;
  
  int h = 100;
  
  float i = 1.0F;
  
  String j = "ScatterPlotPopout_";
  
  private fK l;
  
  public fF(Window paramWindow, fK paramfK) {
    super(paramWindow, "Scatter Plot popout");
    this.l = paramfK;
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", (Component)this.k);
    jPanel.add("North", this.b);
    jPanel.add("West", (Component)this.d);
    jPanel.add("South", this.c);
    this.b.setOpaque(true);
    this.d.setOpaque(true);
    this.c.setOpaque(true);
    this.b.setBackground(Color.BLACK);
    this.d.setBackground(Color.BLACK);
    this.c.setBackground(Color.BLACK);
    this.b.setForeground(Color.WHITE);
    this.d.setForeground(Color.WHITE);
    this.c.setForeground(Color.WHITE);
    this.b.setFont(new Font("Times", 1, eJ.a(18)));
    add("Center", jPanel);
    hx.a().a(this);
    f();
    addComponentListener(new fG(this));
    this.k.a(this);
  }
  
  public void a(eq parameq) {
    if (this.k.b(0) != null)
      this.k.b(0).b(this); 
    parameq.a(this);
    this.a = parameq;
    this.k.a(parameq, 0);
    a();
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public void b(int paramInt1, int paramInt2) {
    this.g = paramInt1;
    this.h = paramInt2;
    e();
  }
  
  private void e() {
    float f = this.k.getWidth() / this.g;
    double d = (this.k.getHeight() / this.h);
    this.i = (float)Math.min(d, f);
    this.k.e(Math.round(this.f * this.i));
    this.k.d(Math.round(this.e * this.i));
  }
  
  public void a() {
    b();
    this.k.d();
    this.k.repaint();
  }
  
  public void b(int paramInt) {
    if (this.a != null && paramInt > this.a.f() && this.a.a != null && paramInt < this.a.e() && this.a.b != null && paramInt < this.a.b.i()) {
      q q = this.a.b(paramInt);
      this.k.a(q.getX(), q.getY());
      this.k.repaint();
    } else {
      this.k.l();
    } 
  }
  
  public void a(int paramInt) {
    b(paramInt);
  }
  
  protected void b() {
    if (this.a.a != null && this.a.b != null && this.a.a.a().length() > 0 && this.a.b.a().length() > 0) {
      String str;
      if (this.a.c != null && this.a.c.a().trim().length() > 0) {
        str = this.a.b.a() + " vs " + this.a.a.a() + " vs " + this.a.c.a();
      } else {
        str = this.a.b.a() + " vs " + this.a.a.a();
      } 
      this.b.setText(str);
      this.c.setText(this.a.a.a());
      this.d.setText(this.a.b.a());
      this.k.a(this.a.a.a());
      this.k.b(this.a.b.a());
      if (this.a.c != null && this.a.c.a() != null) {
        this.k.c(this.a.c.a());
      } else {
        this.k.c("");
      } 
    } 
  }
  
  private void f() {
    cd cd = bq.a().b();
    int i = i.b(this.j + "x", cd.getX() + 10);
    int j = i.b(this.j + "y", cd.getY() + eJ.a(40));
    int n = i.b(this.j + "width", eJ.a(400));
    int i1 = i.b(this.j + "height", eJ.a(400));
    setBounds(i, j, n, i1);
  }
  
  private void g() {
    i.c(this.j + "x", "" + getX());
    i.c(this.j + "y", "" + getY());
    i.c(this.j + "width", "" + getWidth());
    i.c(this.j + "height", "" + getHeight());
  }
  
  public void processEvent(AWTEvent paramAWTEvent) {
    if ((paramAWTEvent.getID() == 101 || paramAWTEvent.getID() == 100) && !J.b()) {
      g();
      e();
    } 
    if (paramAWTEvent.getID() == 201 && J.b())
      g(); 
    super.processEvent(paramAWTEvent);
  }
  
  public m c() {
    return this.k;
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    this.l.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public fK d() {
    return this.l;
  }
  
  public void a(fK paramfK) {
    this.l = paramfK;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */