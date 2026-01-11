package t;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Statechanged implements ChangeListener {
  aJ(aF paramaF) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider)paramChangeEvent.getSource()).getValue();
    if (!aF.a(this.a) && this.a.a((JSlider)paramChangeEvent.getSource(), aF.n)) {
      this.a.c().e(i);
      this.a.k.setText("" + i);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */