package br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class BrInterfaceWhiskey implements ActionListener {
  BrInterfaceWhiskey(P paramP) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    P.a(this.a, (JComponent)paramActionEvent.getSource());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */