package aP;

import V.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;

class dF implements ActionListener {
  dF(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    a.a().b(a.cn, str);
    try {
      a.a().e();
    } catch (a a) {
      Logger.getLogger(dB.class.getName()).log(Level.WARNING, "Error saving user properties", (Throwable)a);
    } 
    dB.b(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */