package bt;

import G.aM;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class aA implements FocusListener {
  aA(an paraman) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    an.a(this.a, ((aM)this.a.b.get(0)).aL());
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    an.b(this.a, ((aM)this.a.b.get(0)).aL());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */