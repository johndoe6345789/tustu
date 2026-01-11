package system.query_engine;

import com.efiAnalytics.ui.dq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class ActionListenerInQPackage implements ActionListener {
  dq a = null;
  
  JDialog b = null;
  
  ActionListenerInQPackage(a parama, dq paramdq, JDialog paramJDialog) {
    this.a = paramdq;
    this.b = paramJDialog;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a != null) {
      if (this.a.a())
        this.b.dispose(); 
    } else {
      this.b.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Q/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */