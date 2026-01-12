package t;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class SliderValueChangeListener implements ChangeListener {
  SliderValueChangeListener(w paramw) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider) paramChangeEvent.getSource();
    int i = jSlider.getValue();
    this.a.a.l(i);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
