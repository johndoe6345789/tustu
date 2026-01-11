package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class hk extends MouseAdapter {
  hk(hj paramhj) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    if (System.currentTimeMillis() - 700L > this.a.j && paramMouseEvent.getModifiers() == 0) {
      this.a.j = System.currentTimeMillis();
      if (hj.a(this.a) != null)
        hj.a(this.a).a(); 
      this.a.d();
    } 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if ((this.a.i && (paramMouseEvent.getPoint()).x < 5) || (paramMouseEvent.getPoint()).x > this.a.n.getWidth() || (paramMouseEvent.getPoint()).y < 10 || (paramMouseEvent.getPoint()).y > this.a.n.getHeight() - 10) {
      hj.a(this.a, hj.b(this.a));
      hj.a(this.a).b();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */