package Q;

import com.efiAnalytics.ui.dq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class c implements ActionListener {
  dq a = null;
  
  JDialog b = null;
  
  c(a parama, dq paramdq, JDialog paramJDialog) {
    this.a = paramdq;
    this.b = paramJDialog;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a != null) {
      if (this.a.b())
        this.b.dispose(); 
    } else {
      this.b.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Q/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */