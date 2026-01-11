package aP;

import G.R;
import G.aM;
import G.bv;
import V.g;
import V.j;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import x.a;

class bo implements ActionListener {
  bo(bl parambl, a parama, R paramR, bv parambv) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = bV.a((Component)this.a, "Password to access this dialog.");
    if (str != null && str.length() > 0) {
      CRC32 cRC32 = new CRC32();
      cRC32.reset();
      cRC32.update(str.getBytes());
      aM aM = this.b.c(this.c.aa());
      if (aM == null) {
        bV.d("Invalid Password Parameter.", (Component)this.a);
      } else {
        try {
          aM.a(this.b.h(), cRC32.getValue());
        } catch (g g) {
          Logger.getLogger(bl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } catch (j j) {
          Logger.getLogger(bl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
          bV.d("Invalid Password?", (Component)this.a);
        } 
        W.a();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */