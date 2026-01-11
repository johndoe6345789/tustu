package aY;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class d implements ActionListener {
  d(a parama) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JToggleButton jToggleButton = (JToggleButton)paramActionEvent.getSource();
    if (jToggleButton.isSelected()) {
      this.a.a();
    } else {
      this.a.b();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */