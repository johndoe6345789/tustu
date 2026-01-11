package ao;

import bH.D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class al implements ActionListener {
  boolean a = false;
  
  al(aj paramaj) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (this.a)
      return; 
    this.a = true;
    try {
      JToggleButton jToggleButton = (JToggleButton)paramActionEvent.getSource();
      String str = jToggleButton.getActionCommand();
      if (jToggleButton.isSelected()) {
        if (aj.c(this.b) == null || aj.c(this.b).equals(str)) {
          if (aj.d(this.b) != null && aj.c(this.b) == null)
            aj.b(this.b, null); 
          aj.c(this.b, str);
          aj.d(this.b, (String)null);
        } else {
          if (aj.d(this.b) != null && !aj.d(this.b).equals(str))
            aj.a(this.b, aj.d(this.b), false); 
          aj.d(this.b, str);
        } 
      } else if (aj.c(this.b) == null || aj.c(this.b).equals(str)) {
        if (aj.d(this.b) != null) {
          D.c("Switched Main Data: " + str);
          String str1 = aj.d(this.b);
          aj.d(this.b, (String)null);
          aj.c(this.b, str1);
        } else {
          aj.c(this.b, (String)null);
        } 
      } else if (aj.d(this.b) == null || aj.d(this.b).equals(str)) {
        aj.d(this.b, (String)null);
      } 
    } finally {
      this.a = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */