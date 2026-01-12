package ao;

import bH.X;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class gC implements ChangeListener {
  gC(go paramgo) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    go.a(this.a);
    String str = X.a(this.a.a(), 2);
    this.a.r.setToolTipText("Minimum Total Hit Weight: " + str);
    this.a.p.setText(str);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
