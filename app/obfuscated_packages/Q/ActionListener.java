package Q;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import s.SComponentGolf;

class ActionListener implements ActionListener {
  b(a parama) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = ((JRadioButton)paramActionEvent.getSource()).getText();
    this.a.j = Integer.parseInt(str);
    if (this.a.j < 3)
      bV.d(SComponentGolf.b(SComponentGolf.b("Please explain what you have had issues with below so they can be addressed.")), this.a.b); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Q/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */