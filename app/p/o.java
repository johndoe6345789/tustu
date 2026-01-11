package p;

import bH.X;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class o implements ChangeListener {
  o(m paramm, g paramg, JLabel paramJLabel) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    String str = this.c.d.getValue() + " s.";
    this.b.setText(X.a(str, ' ', 8));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */