package aP;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ListenerStatechanged implements ChangeListener {
  jd(jc paramjc) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JSpinner jSpinner = (JSpinner)paramChangeEvent.getSource();
    this.a.b(((Integer)jSpinner.getValue()).intValue());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */