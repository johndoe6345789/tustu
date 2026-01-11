package aP;

import V.ExceptionInVPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;

class ApInterfaceDf implements ActionListener {
  dF(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = paramActionEvent.getActionCommand();
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.cn, str);
    try {
      ExceptionInVPackage.ExceptionInVPackage().e();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(dB.class.getName()).log(Level.WARNING, "Error saving user properties", (Throwable)ExceptionInVPackage);
    } 
    dB.b(this.ExceptionInVPackage);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */