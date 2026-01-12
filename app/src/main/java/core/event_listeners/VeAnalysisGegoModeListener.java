package ao;

import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class fg implements ChangeListener {
  fg(eK parameK) {}

  public void stateChanged(ChangeEvent paramChangeEvent) {
    JRadioButton jRadioButton = (JRadioButton) paramChangeEvent.getSource();
    if (jRadioButton.isSelected()) eK.a(this.a, "Gego");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
