package aP;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ChangeListenerInApPackage implements ChangeListener {
  ip(ii paramii) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider)paramChangeEvent.getSource()).getValue();
    ii.a(this.a).b(i);
    ii.b(this.a).setText("" + i);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */