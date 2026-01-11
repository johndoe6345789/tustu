package aP;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class fC extends MouseAdapter {
  fC(dB paramdB) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      hz.a(this.a.h);
      paramMouseEvent.consume();
    } else {
      (new Thread(new fD(this))).start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */