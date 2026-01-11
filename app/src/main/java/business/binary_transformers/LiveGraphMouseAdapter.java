package business.binary_transformers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class LiveGraphMouseAdapter extends MouseAdapter {
  LiveGraphMouseAdapter(s params) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.a.a(true);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.a.a(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */