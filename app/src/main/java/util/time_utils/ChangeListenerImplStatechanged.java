package t;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ChangeListenerImplStatechanged implements ChangeListener {
  ChangeListenerImplStatechanged(aF paramaF) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider) paramChangeEvent.getSource()).getValue();
    if (!aF.a(this.a) && this.a.a((JSlider) paramChangeEvent.getSource(), aF.m)) {
      this.a.c().b(i);
      this.a.i.setText("" + i);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
