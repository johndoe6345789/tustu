package aP;

import G.R;
import G.bI;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bx implements ActionListener {
  R a;
  
  bI b;
  
  bx(bl parambl, R paramR, bI parambI) {
    this.a = paramR;
    this.b = parambI;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      Component component = this.c.getComponent();
      component = bV.b(component);
      f.a().a(this.a, this.b, component);
    } catch (Exception exception) {
      D.a("Error showing dialog:\n" + exception.getMessage(), exception, null);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */