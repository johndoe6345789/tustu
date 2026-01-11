package t;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class W implements ChangeListener {
  W(w paramw) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider)paramChangeEvent.getSource();
    int i = jSlider.getValue();
    if (w.a(this.a, jSlider, w.y))
      this.a.a.g(i); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */