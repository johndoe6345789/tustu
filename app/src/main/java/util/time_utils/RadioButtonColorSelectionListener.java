package t;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

class RadioButtonColorSelectionListener implements ActionListener {
  RadioButtonColorSelectionListener(d paramd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JRadioButton jRadioButton = (JRadioButton)paramActionEvent.getSource();
    this.a.a(jRadioButton.getText());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */