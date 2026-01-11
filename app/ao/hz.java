package ao;

import W.n;
import com.efiAnalytics.ui.eJ;
import i.b;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.UIManager;

public class hz extends JComponent implements b {
  long a = 0L;
  
  long b = 800L;
  
  double c = 0.0D;
  
  int d = eJ.a(4);
  
  int e = eJ.a(4);
  
  ArrayList f = null;
  
  ArrayList g = new ArrayList();
  
  boolean h = true;
  
  Color i = Color.red;
  
  n j = null;
  
  Color k = UIManager.getColor("ProgressBar.foreground");
  
  public hz() {
    hA hA = new hA(this);
    addMouseListener(hA);
    addMouseMotionListener(hA);
  }
  
  public void a(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  private int c() {
    return getWidth() - this.e - this.d;
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(this.k);
    paramGraphics.fillRect(this.e, eJ.a(6), (int)(c() * this.c) + 1, getHeight() - eJ.a(12));
    paramGraphics.setColor(Color.gray);
    paramGraphics.draw3DRect(eJ.a(1), eJ.a(2), getWidth() - eJ.a(3), getHeight() - eJ.a(5), false);
    if (this.f != null) {
      Iterator<Double> iterator = this.f.iterator();
      while (iterator.hasNext()) {
        double d = ((Double)iterator.next()).doubleValue();
        paramGraphics.setColor(this.i);
        paramGraphics.drawLine((int)(c() * d) + this.e, eJ.a(6), (int)(c() * d) + this.e, getHeight() - eJ.a(7));
      } 
    } 
  }
  
  public void b(double paramDouble) {
    this.c = paramDouble;
    repaint();
  }
  
  public void a() {
    this.c = 0.0D;
    this.f = null;
    d();
  }
  
  public void c(double paramDouble) {
    if (this.f == null)
      this.f = new ArrayList(); 
    this.f.add(Double.valueOf(paramDouble));
  }
  
  public void a(double paramDouble) {
    if (System.currentTimeMillis() - this.a > this.b) {
      this.c = paramDouble;
      if (this.j != null && paramDouble == 1.0D) {
        HashMap hashMap = this.j.a();
        if (hashMap != null) {
          Iterator<Integer> iterator = hashMap.keySet().iterator();
          while (iterator.hasNext()) {
            try {
              double d1 = ((Integer)iterator.next()).intValue();
              double d2 = d1 / this.j.d();
              c(d2);
            } catch (Exception exception) {
              System.out.println("Error adding Mark to status bar");
              exception.printStackTrace();
            } 
          } 
        } 
      } 
      d();
    } 
  }
  
  public void a(n paramn) {
    this.j = paramn;
    d();
  }
  
  private void d() {
    repaint(30L);
  }
  
  public void b(n paramn) {}
  
  private void a(int paramInt) {
    double d = (paramInt - this.e);
    int i = c();
    if (d / i >= 0.0D && d / i <= 1.0D)
      d(d / i); 
    hx.a().f();
  }
  
  private void d(double paramDouble) {
    for (hB hB : this.g)
      hB.b(paramDouble); 
  }
  
  public void a(hB paramhB) {
    this.g.add(paramhB);
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(eJ.a(50), eJ.a(15));
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.a(150), eJ.a(20));
  }
  
  public void b() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */