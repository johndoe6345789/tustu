package v;

import V.ExceptionInVPackage;
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
import r.ExceptionInVPackage;
import r.ThreadedFile;
import s.SComponentGolf;

public class VComponentFoxtrot {
  public static R ExceptionInVPackage(Component paramComponent, String paramString) {
    R r = w.ExceptionInVPackage(paramString);
    if (r.ExceptionInVPackage()) {
      boolean bool;
      if (ExceptionInVPackage.ExceptionInVPackage()
          .c(ExceptionInVPackage.ad, Boolean.FALSE.booleanValue())) {
        String str =
            "Your installation of "
                + ExceptionInVPackage.b
                + " does not have ExceptionInVPackage Ecu Definition file to support the firmware"
                + " found.\n\n\n"
                + "Required Serial Signature:\n"
                + paramString
                + "\n\nHowever this file is available on EFI Analytics servers.\nWould you like "
                + ExceptionInVPackage.b
                + " to download the file for you?\nFile Size: "
                + X.ExceptionInVPackage(r.b())
                + "\n";
        String[] arrayOfString = {
          SComponentGolf.b("Yes"), SComponentGolf.b("No"), SComponentGolf.b("Always Yes")
        };
        bool =
            JOptionPane.showOptionDialog(
                paramComponent,
                str,
                "Internet Download",
                -1,
                3,
                null,
                (Object[]) arrayOfString,
                arrayOfString[0]);
        if (bool == 2) {
          ExceptionInVPackage.ExceptionInVPackage()
              .b(ExceptionInVPackage.ad, Boolean.toString(true));
          bool = false;
        }
      } else {
        bool = false;
      }
      if (!bool) {
        JDialog jDialog =
            bV.ExceptionInVPackage(
                ExceptionInVPackage(), "Downloading Ecu Definition file for " + paramString);
        try {
          R r1 = w.ExceptionInVPackage(paramString, ThreadedFile.c());
          if (r1 != null) return r1;
          throw new ExceptionInVPackage("Error downloading ECU Definition");
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(f.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
          throw new ExceptionInVPackage(ExceptionInVPackage.getMessage());
        } catch (Exception exception) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String) null, exception);
          throw new ExceptionInVPackage("Unexpected Error tring to download Definition File.");
        } finally {
          jDialog.dispose();
        }
      }
      return null;
    }
    return null;
  }

  private static Window ExceptionInVPackage() {
    Window[] arrayOfWindow = JWindow.getWindows();
    return (arrayOfWindow.length > 0) ? arrayOfWindow[0] : null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
