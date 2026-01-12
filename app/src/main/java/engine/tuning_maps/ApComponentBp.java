package aP;

import G.ArrayListExceptionprintstacktraceInGPackage;
import G.Manager;
import G.R;
import V.ExceptionExtensionGetmessage;
import V.ExceptionPrintstacktrace;
import bA.JMenuItemExtensionInBaPackage;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import x.JMenuExtensionSetpopupmenuvisible;

class ApComponentBp implements ActionListener {
  ApComponentBp(
      bl parambl,
      R paramR,
      ArrayListExceptionprintstacktraceInGPackage parambv,
      JMenuExtensionSetpopupmenuvisible parama,
      JMenuItemExtensionInBaPackage parame) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    Manager Manager = this.JMenuExtensionSetpopupmenuvisible.c(this.b.aa());
    if (Manager == null) {
      bV.d("Invalid Password Parameter.", (Component) this.c);
    } else {
      try {
        Manager.JMenuExtensionSetpopupmenuvisible(this.JMenuExtensionSetpopupmenuvisible.h(), 0.0D);
        this.d.setEnabled(false);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bl.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(bl.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionGetmessage);
        bV.d("Invalid Password?", (Component) this.c);
      }
      W.JMenuExtensionSetpopupmenuvisible();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
