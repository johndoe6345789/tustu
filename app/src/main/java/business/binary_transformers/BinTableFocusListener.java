package business.binary_transformers;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class BinTableFocusListener implements FocusListener {
  BinTableFocusListener(T paramT) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    T.a(this.a, this.a.a.b(0));
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    T.b(this.a, this.a.a.b(0));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */