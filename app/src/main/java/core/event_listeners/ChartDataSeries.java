package ao;

import W.j;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

final class ab implements ChangeListener {
  public ab(j paramj) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider)paramChangeEvent.getSource();
    hx.a().b(this.a, jSlider.getValue());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */