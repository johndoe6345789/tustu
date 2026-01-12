package t;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ChangeListenerInTPackage implements ChangeListener {
  ChangeListenerInTPackage(aD paramaD) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    aD.a(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
