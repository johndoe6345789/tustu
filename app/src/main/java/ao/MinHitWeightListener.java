package ao;

import bH.X;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class gB implements ChangeListener {
  gB(go paramgo) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    go.a(this.a);
    String str = X.a(go.k(this.a), 2);
    this.a.q.setToolTipText("<html>Minimum Individual Hit Weight is the minimum weight of<br>each hit before it will be included.<br>Value of 0-1 where the closer to 1, <br>the more centered a hit needs to be before it is included.<br>0 all hits will be counted with the associated weighting,<br>a value of 1 requires a direct center hit to be included. ");
    this.a.o.setText(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */