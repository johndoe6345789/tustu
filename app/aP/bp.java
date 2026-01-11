package aP;

import G.R;
import G.aM;
import G.bv;
import V.g;
import V.j;
import bA.e;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import x.a;

class bp implements ActionListener {
  bp(bl parambl, R paramR, bv parambv, a parama, e parame) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    aM aM = this.a.c(this.b.aa());
    if (aM == null) {
      bV.d("Invalid Password Parameter.", (Component)this.c);
    } else {
      try {
        aM.a(this.a.h(), 0.0D);
        this.d.setEnabled(false);
      } catch (g g) {
        Logger.getLogger(bl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } catch (j j) {
        Logger.getLogger(bl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
        bV.d("Invalid Password?", (Component)this.c);
      } 
      W.a();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */