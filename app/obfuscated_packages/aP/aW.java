package aP;

import com.efiAnalytics.apps.ts.dashboard.x;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class aW extends MouseAdapter {
  static int a = -1;
  
  static int b = 150;
  
  int c = 350;
  
  int d = a;
  
  long e = a;
  
  int f = a;
  
  long g = a;
  
  bW h;
  
  boolean i = false;
  
  public aW(bW parambW) {
    this.h = parambW;
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() > 0);
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    x x = this.h.e();
    if (x == null || !x.L())
      a(paramMouseEvent); 
  }
  
  public void a(MouseEvent paramMouseEvent) {
    long l = System.currentTimeMillis() - this.g;
    if (this.d != a && l > b) {
      int i = paramMouseEvent.getX() - this.f;
      long l1 = (i * 1000) / l;
      if (Math.abs(l1) > this.c) {
        if (l1 < 0L) {
          this.h.a(true);
        } else {
          this.h.b(true);
        } 
        a();
      } 
    } 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.d = paramMouseEvent.getX();
    this.f = paramMouseEvent.getX();
    this.e = System.currentTimeMillis();
    this.g = System.currentTimeMillis();
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    a();
  }
  
  public void a() {
    this.d = a;
    this.e = a;
    this.f = a;
    this.g = a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */