package aP;

import javax.swing.JCheckBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class aN implements ChangeListener {
  aN(aM paramaM) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    JCheckBox jCheckBox = (JCheckBox)paramChangeEvent.getSource();
    this.a.g.setEnabled(jCheckBox.isSelected());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */