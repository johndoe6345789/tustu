package business.byte_readers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

class BrInterfaceXray implements ActionListener {
  BrInterfaceXray(P paramP) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JRadioButton jRadioButton = (JRadioButton)paramActionEvent.getSource();
    ((CardLayout)this.a.d.getLayout()).show(this.a.d, jRadioButton.getActionCommand());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */