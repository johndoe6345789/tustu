package v;

import V.a;
import W.R;
import W.w;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import r.a;
import r.j;
import s.g;

public class f {
  public static R a(Component paramComponent, String paramString) {
    R r = w.a(paramString);
    if (r.a()) {
      boolean bool;
      if (a.a().c(a.ad, Boolean.FALSE.booleanValue())) {
        String str = "Your installation of " + a.b + " does not have a Ecu Definition file to support the firmware found.\n\n\nRequired Serial Signature:\n" + paramString + "\n\nHowever this file is available on EFI Analytics servers.\nWould you like " + a.b + " to download the file for you?\nFile Size: " + X.a(r.b()) + "\n";
        String[] arrayOfString = { g.b("Yes"), g.b("No"), g.b("Always Yes") };
        bool = JOptionPane.showOptionDialog(paramComponent, str, "Internet Download", -1, 3, null, (Object[])arrayOfString, arrayOfString[0]);
        if (bool == 2) {
          a.a().b(a.ad, Boolean.toString(true));
          bool = false;
        } 
      } else {
        bool = false;
      } 
      if (!bool) {
        JDialog jDialog = bV.a(a(), "Downloading Ecu Definition file for " + paramString);
        try {
          R r1 = w.a(paramString, j.c());
          if (r1 != null)
            return r1; 
          throw new a("Error downloading ECU Definition");
        } catch (a a) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          throw new a(a.getMessage());
        } catch (Exception exception) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, exception);
          throw new a("Unexpected Error tring to download Definition File.");
        } finally {
          jDialog.dispose();
        } 
      } 
      return null;
    } 
    return null;
  }
  
  private static Window a() {
    Window[] arrayOfWindow = JWindow.getWindows();
    return (arrayOfWindow.length > 0) ? arrayOfWindow[0] : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */