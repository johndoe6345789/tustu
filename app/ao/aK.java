package ao;

import W.j;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class aK implements ChangeListener {
  aK(aw paramaw, j paramj) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSlider jSlider = (JSlider)paramChangeEvent.getSource();
    this.a.i(jSlider.getValue());
    this.b.i();
    this.b.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */