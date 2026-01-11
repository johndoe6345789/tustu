package t;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class V implements ChangeListener {
  V(w paramw) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider)paramChangeEvent.getSource();
    int i = jSlider.getValue();
    if (w.a(this.a, jSlider, w.x))
      this.a.a.f(i); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */