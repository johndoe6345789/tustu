package ao;

import bE.BeInterfaceKilo;
import bE.BeInterfaceLima;
import bE.JComponentExtension;
import bE.BeInterfaceQuebec;
import bH.J;
import com.efiAnalytics.ui.eJ;
import h.IOProperties;
import IOProperties.a;
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

public class fF extends JDialog implements BeInterfaceKilo, BeInterfaceLima, a {
  private JComponentExtension BeInterfaceKilo = new JComponentExtension();
  
  eq a = null;
  
  JLabel b = new JLabel(" ", 0);
  
  JLabel c = new JLabel(" ", 0);
  
  com.efiAnalytics.ui.fF d = new com.efiAnalytics.ui.fF();
  
  int e = 1;
  
  int f = eJ.a(10);
  
  int g = 100;
  
  int h = 100;
  
  float IOProperties = 1.0F;
  
  String j = "ScatterPlotPopout_";
  
  private fK BeInterfaceLima;
  
  public fF(Window paramWindow, fK paramfK) {
    super(paramWindow, "Scatter Plot popout");
    this.BeInterfaceLima = paramfK;
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", (Component)this.BeInterfaceKilo);
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
    this.BeInterfaceKilo.a(this);
  }
  
  public void a(eq parameq) {
    if (this.BeInterfaceKilo.b(0) != null)
      this.BeInterfaceKilo.b(0).b(this); 
    parameq.a(this);
    this.a = parameq;
    this.BeInterfaceKilo.a(parameq, 0);
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
    float f = this.BeInterfaceKilo.getWidth() / this.g;
    double d = (this.BeInterfaceKilo.getHeight() / this.h);
    this.IOProperties = (float)Math.min(d, f);
    this.BeInterfaceKilo.e(Math.round(this.f * this.IOProperties));
    this.BeInterfaceKilo.d(Math.round(this.e * this.IOProperties));
  }
  
  public void a() {
    b();
    this.BeInterfaceKilo.d();
    this.BeInterfaceKilo.repaint();
  }
  
  public void b(int paramInt) {
    if (this.a != null && paramInt > this.a.f() && this.a.a != null && paramInt < this.a.e() && this.a.b != null && paramInt < this.a.b.IOProperties()) {
      BeInterfaceQuebec BeInterfaceQuebec = this.a.b(paramInt);
      this.BeInterfaceKilo.a(BeInterfaceQuebec.getX(), BeInterfaceQuebec.getY());
      this.BeInterfaceKilo.repaint();
    } else {
      this.BeInterfaceKilo.BeInterfaceLima();
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
      this.BeInterfaceKilo.a(this.a.a.a());
      this.BeInterfaceKilo.b(this.a.b.a());
      if (this.a.c != null && this.a.c.a() != null) {
        this.BeInterfaceKilo.c(this.a.c.a());
      } else {
        this.BeInterfaceKilo.c("");
      } 
    } 
  }
  
  private void f() {
    cd cd = bq.a().b();
    int IOProperties = IOProperties.b(this.j + "x", cd.getX() + 10);
    int j = IOProperties.b(this.j + "y", cd.getY() + eJ.a(40));
    int n = IOProperties.b(this.j + "width", eJ.a(400));
    int i1 = IOProperties.b(this.j + "height", eJ.a(400));
    setBounds(IOProperties, j, n, i1);
  }
  
  private void g() {
    IOProperties.c(this.j + "x", "" + getX());
    IOProperties.c(this.j + "y", "" + getY());
    IOProperties.c(this.j + "width", "" + getWidth());
    IOProperties.c(this.j + "height", "" + getHeight());
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
  
  public JComponentExtension c() {
    return this.BeInterfaceKilo;
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    this.BeInterfaceLima.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public fK d() {
    return this.BeInterfaceLima;
  }
  
  public void a(fK paramfK) {
    this.BeInterfaceLima = paramfK;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */