package aP;

import G.R;
import G.Manager;
import G.ArrayListExceptionprintstacktraceInGPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import x.JMenuExtensionSetpopupmenuvisible;

class ApComponentBo implements ActionListener {
  bo(bl parambl, JMenuExtensionSetpopupmenuvisible parama, R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = bV.JMenuExtensionSetpopupmenuvisible((Component)this.JMenuExtensionSetpopupmenuvisible, "Password to access this dialog.");
    if (str != null && str.length() > 0) {
      CRC32 cRC32 = new CRC32();
      cRC32.reset();
      cRC32.update(str.getBytes());
      Manager Manager = this.b.c(this.c.aa());
      if (Manager == null) {
        bV.d("Invalid Password Parameter.", (Component)this.JMenuExtensionSetpopupmenuvisible);
      } else {
        try {
          Manager.JMenuExtensionSetpopupmenuvisible(this.b.h(), cRC32.getValue());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(bl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          Logger.getLogger(bl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
          bV.d("Invalid Password?", (Component)this.JMenuExtensionSetpopupmenuvisible);
        } 
        W.JMenuExtensionSetpopupmenuvisible();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */