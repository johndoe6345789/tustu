package ao;

import com.efiAnalytics.ui.eJ;
import i.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class m extends JPanel implements l, a {
  fs a = new fs("", 5);
  
  hx b = null;
  
  int c = 0;
  
  boolean d = true;
  
  ArrayList e = new ArrayList();
  
  hg f = new hg();
  
  public m(hx paramhx) {
    this.b = paramhx;
    setLayout(new BorderLayout());
    this.f.a(this);
    add(this.f, "Center");
    JPanel jPanel = new JPanel();
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/down.gif"));
    ap ap = new ap(null, image, null, eJ.a(16, 16));
    ap.setBackground(Color.GRAY);
    ap.a(new n(this));
    jPanel.add(ap);
    this.a.addKeyListener(new o(this));
    jPanel.add(this.a);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/up.gif"));
    ap = new ap(null, image, null, eJ.a(16, 16));
    ap.setBackground(Color.GRAY);
    ap.a(new p(this));
    jPanel.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/compare.gif"));
    ap = new ap(null, image, null, eJ.a(16, 16));
    ap.a(new q(this));
    jPanel.add(ap);
    add(jPanel, "East");
  }
  
  public void a(String paramString) {
    if (paramString == null || paramString.equals(""))
      paramString = "0"; 
    c(Integer.parseInt(paramString));
  }
  
  public void c(int paramInt) {
    this.c = paramInt;
    this.a.setText("" + paramInt);
    this.f.c(paramInt);
    f(paramInt);
  }
  
  public int a() {
    return this.c;
  }
  
  public void b() {
    c(++this.c);
  }
  
  public void c() {
    c(--this.c);
  }
  
  public void a(l paraml) {
    this.e.add(paraml);
  }
  
  public void d() {
    b(this.d = !this.d);
  }
  
  public void a(int paramInt) {
    c(paramInt);
  }
  
  public void b(int paramInt) {
    a(paramInt);
  }
  
  public void a(boolean paramBoolean) {}
  
  public void d(int paramInt) {
    this.f.a(paramInt);
  }
  
  public void e(int paramInt) {
    this.f.b(paramInt);
  }
  
  protected void b(boolean paramBoolean) {
    for (l l1 : this.e) {
      if (l1 != null)
        l1.a(paramBoolean); 
    } 
  }
  
  protected void f(int paramInt) {
    for (l l1 : this.e) {
      if (l1 != null)
        l1.b(paramInt); 
    } 
  }
  
  public void addKeyListener(KeyListener paramKeyListener) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].addKeyListener(paramKeyListener); 
  }
  
  public void setBackground(Color paramColor) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].setBackground(paramColor); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */