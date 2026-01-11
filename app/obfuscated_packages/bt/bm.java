package bt;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class bm extends FocusAdapter {
  bm(bl parambl) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    bl.a(this.a, this.a.a.b());
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    if (this.a.a != null)
      bl.b(this.a, this.a.a.b()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */