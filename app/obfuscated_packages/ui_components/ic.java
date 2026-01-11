package ao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ic extends MouseAdapter {
  public ic(hZ paramhZ) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 3) {
      this.a.a(paramMouseEvent.getX(), paramMouseEvent.getY());
      paramMouseEvent.consume();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */