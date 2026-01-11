package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerInApPackage implements ActionListener {
  aH(aG paramaG) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().equals("min")) {
      this.a.b.setText(this.a.a());
    } else if (paramActionEvent.getActionCommand().equals("max")) {
      this.a.c.setText(this.a.a());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */