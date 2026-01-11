package aP;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import s.b;
import s.f;

class gU extends MouseAdapter {
  f a = null;
  
  public gU(dB paramdB, f paramf) {
    this.a = paramf;
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3)
      paramMouseEvent.consume(); 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      a();
      paramMouseEvent.consume();
    } 
  }
  
  private void a() {
    b.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */