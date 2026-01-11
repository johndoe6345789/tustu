package t;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class aG implements ChangeListener {
  aG(aF paramaF) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    int i = ((JSlider)paramChangeEvent.getSource()).getValue();
    if (!aF.a(this.a) && this.a.a((JSlider)paramChangeEvent.getSource(), aF.l)) {
      this.a.c().a(i);
      this.a.h.setText("" + i);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */