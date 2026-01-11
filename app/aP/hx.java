package aP;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class hx extends WindowAdapter {
  hs a;
  
  public hx(hs paramhs1, hs paramhs2) {
    this.a = paramhs2;
  }
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    hs.e(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */