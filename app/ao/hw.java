package ao;

import java.awt.MouseInfo;
import java.awt.Point;

class hw extends Thread {
  boolean a = false;
  
  long b = 0L;
  
  long c = 0L;
  
  Object d = new Object();
  
  hw(hj paramhj) {}
  
  public void run() {
    while (true) {
      synchronized (this.d) {
        try {
          this.d.wait(500L);
        } catch (Exception exception) {}
      } 
      if ((this.a && System.currentTimeMillis() - this.c > 500L) || (System.currentTimeMillis() - this.b > 2000L && !c())) {
        this.e.e();
        this.a = false;
      } 
    } 
  }
  
  private boolean c() {
    try {
      Point point1 = MouseInfo.getPointerInfo().getLocation();
      Point point2 = this.e.getLocationOnScreen();
      return (point1.x > point2.x && point1.y > point2.y && point1.x < point2.x + this.e.getWidth() && point1.y < point2.y + this.e.getHeight());
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public void a() {
    this.a = false;
    this.b = System.currentTimeMillis();
  }
  
  public void b() {
    this.a = true;
    this.c = System.currentTimeMillis();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */