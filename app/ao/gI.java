package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gI implements ActionListener {
  gI(go paramgo) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    go.c(this.a, paramActionEvent.getActionCommand());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */