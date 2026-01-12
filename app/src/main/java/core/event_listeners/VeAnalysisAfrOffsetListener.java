package ao;

import h.IOProperties;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class eO implements ChangeListener {
  eO(eK parameK) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    int IOProperties = ((JSlider) paramChangeEvent.getSource()).getValue();
    IOProperties.c("WBafrOffSet", "" + IOProperties);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
