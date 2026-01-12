package aP;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCw;
import G.R;
import G.T;
import V.ExceptionInVPackage;
import W.R;
import W.w;
import W.z;
import aE.ExceptionInVPackage;
import bH.D;
import bH.X;
import bH.n;
import bH.t;
import c.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import n.NInterfaceKilo;
import r.ExceptionInVPackage;
import r.ThreadedFile;
import s.SComponentGolf;

public class ThreadedExceptioninvpackage implements GInterfaceCw {
  public static boolean ExceptionInVPackage = false;

  public boolean ExceptionInVPackage(
      String paramString1, String paramString2, AeInterfaceMikeTostring parambT) {
    ExceptionInVPackage ExceptionInVPackage = ExceptionInVPackage.A();
    R r = T.ExceptionInVPackage().c(paramString1);
    if (r != null) r.O().m("");
    if (parambT.d()) {
      String str =
          SComponentGolf.b(
                  "Successfully connected to your "
                      + ExceptionInVPackage.ExceptionInVPackage(paramString2, ExceptionInVPackage.f)
                      + ", but no firmware is loaded or the bootload jumper is on.")
              + "\n\n"
              + SComponentGolf.b("This must be corrected before connecting.");
      bV.d(str, dd.ExceptionInVPackage().c());
      return false;
    }
    if (ExceptionInVPackage) {
      ExceptionInVPackage(ExceptionInVPackage, paramString1, paramString2, parambT);
      hq.ExceptionInVPackage().d("Updating config file for " + paramString1);
      return false;
    }
    JFrame jFrame = dd.ExceptionInVPackage().c();
    iA iA = new iA(jFrame, ExceptionInVPackage, paramString1, parambT, paramString2);
    bV.ExceptionInVPackage(jFrame, iA);
    iA.setVisible(true);
    return iA.b();
  }

  public static File ExceptionInVPackage(AeInterfaceMikeTostring parambT) {
    if (!n.b()) {
      String str =
          ExceptionInVPackage(
                  ExceptionInVPackage.b + " does not currently have access to the Internet.")
              + "\n"
              + ExceptionInVPackage(
                  "To download the ECU Definition file required for this firmware, "
                      + ExceptionInVPackage.b
                      + " requires Internet access.")
              + "\n\n"
              + ExceptionInVPackage(
                  "Please enable Internet access with " + ExceptionInVPackage.b + " open.")
              + "\n"
              + ExceptionInVPackage(
                  "You do not need to be connected to your controller, "
                      + ExceptionInVPackage.b
                      + " knows what file it needs.")
              + "\n"
              + ExceptionInVPackage(
                  "After closing this dialog the file will automatically download it once Internet"
                      + " is detected.")
              + "\n"
              + ExceptionInVPackage("You will be notified when download is complete");
      String[] arrayOfString = {
        ExceptionInVPackage("Download when Internet available"),
        ExceptionInVPackage("Browse for file")
      };
      int i = hq.ExceptionInVPackage().ExceptionInVPackage(str, arrayOfString);
      if (i == 0) {
        NInterfaceKilo.ExceptionInVPackage().ExceptionInVPackage(parambT);
        return null;
      }
      throw new FileNotFoundException("The correct ECU Definition not available.");
    }
    R r = w.ExceptionInVPackage(parambT.b());
    if (r.ExceptionInVPackage()) {
      boolean bool;
      if (!ExceptionInVPackage
          && !ExceptionInVPackage.ExceptionInVPackage()
              .c(ExceptionInVPackage.ad, Boolean.FALSE.booleanValue())) {
        String str =
            "Your installation of "
                + ExceptionInVPackage.b
                + " does not have ExceptionInVPackage Ecu Definition file to support the firmware"
                + " found.\n\n\n"
                + "Required Serial Signature:\n"
                + parambT
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
                dd.ExceptionInVPackage().c(),
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
                dd.ExceptionInVPackage().c(), "Downloading Ecu Definition file for " + parambT.c());
        try {
          R r1 = w.ExceptionInVPackage(parambT.b(), ThreadedFile.c());
          if (r1.ExceptionInVPackage()) return r1.c();
          bV.d(r1.d(), dd.ExceptionInVPackage().c());
          return null;
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.d(ExceptionInVPackage.getMessage(), dd.ExceptionInVPackage().c());
        } finally {
          jDialog.dispose();
        }
      }
    } else {
      throw new FileNotFoundException("The correct ECU Definition not available.");
    }
    return null;
  }

  private static String ExceptionInVPackage(String paramString) {
    return SComponentGolf.b(paramString);
  }

  public void ExceptionInVPackage(String paramString, ExceptionInVPackage parama, File paramFile) {
    if (paramString.equals(parama.u())) {
      String str1 =
          paramFile.getName().toLowerCase().endsWith(".ecu")
              ? "mainController.ecu"
              : "mainController.ini";
      parama.l(str1);
      parama.remove("firmwareDescription");
    }
    File file = parama.f(paramString);
    if (file == null)
      bV.d("No target file name for device:" + paramString, dd.ExceptionInVPackage().c());
    if (paramFile == null || !paramFile.exists()) {
      bV.d(
          "The " + ExceptionInVPackage.f + " Configuration file can not be found:\n" + paramString,
          dd.ExceptionInVPackage().c());
      return;
    }
    try {
      D.d("Copying " + paramFile.getName() + " to " + parama.u() + "'s projectCfg");
      t.ExceptionInVPackage(paramFile, file);
    } catch (ExceptionInVPackage a1) {
      hq.ExceptionInVPackage()
          .b("Can not copy \n" + paramFile.getAbsolutePath() + "\nTo:\n" + file.getAbsolutePath());
    }
    try {
      if (!paramFile.getParentFile().equals(ThreadedFile.c())) {
        D.d("Copying " + paramFile.getName() + " to ecuDef dir for future use.");
        t.ExceptionInVPackage(
            paramFile, new File(ThreadedFile.c(), z.b(z.ExceptionInVPackage(paramFile))));
      }
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage(
          "Can not copy \n" + paramFile.getAbsolutePath() + "\nTo:\n" + file.getAbsolutePath());
    }
    try {
      parama.b();
    } catch (ExceptionInVPackage a1) {
      hq.ExceptionInVPackage().b("Error saving project.");
    }
    String str = z.ExceptionInVPackage(paramFile);
    if (paramString.equals(parama.u()))
      if (dd.ExceptionInVPackage().h() != null) {
        dd.ExceptionInVPackage().h().c(str);
      } else if (dd.ExceptionInVPackage().b() != null) {
        dd.ExceptionInVPackage().b().c(str);
      }
    f.ExceptionInVPackage().z();
  }

  public boolean ExceptionInVPackage(
      ExceptionInVPackage parama,
      String paramString1,
      String paramString2,
      AeInterfaceMikeTostring parambT) {
    File file = null;
    String str1 = ExceptionInVPackage.ExceptionInVPackage(paramString2, ExceptionInVPackage.f);
    try {
      file = ThreadedFile.d(parambT.b());
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage(
          "Signature Mismatch - Error retrieving ExceptionInVPackage file that matches the"
              + " controller signature:"
              + parambT);
    }
    if (file != null) {
      String str =
          SComponentGolf.b(
                  ExceptionInVPackage.b
                      + " has an ECU Definition (ini) file to support your Controllers firmware.")
              + "\n\n   "
              + SComponentGolf.b("Firmware on " + str1)
              + ": "
              + parambT.c()
              + "\n   "
              + SComponentGolf.b("Required Serial Signature")
              + ": "
              + parambT.b()
              + "\n\n"
              + SComponentGolf.b(
                  "Would you like to update your project with "
                      + ExceptionInVPackage.b
                      + "'s correct ECU Definition?")
              + "\n\n"
              + SComponentGolf.b(
                  "Click Yes to use " + ExceptionInVPackage.b + "'s ECU Definition File.")
              + "\n"
              + SComponentGolf.b("Click No to browse to your own ECU Definition File.");
      if (ExceptionInVPackage || hq.ExceptionInVPackage().c(str)) {
        (new iI(this, paramString1, parama, file)).start();
        return true;
      }
    } else {
      try {
        file = ExceptionInVPackage(parambT);
        if (file != null) {
          (new iI(this, paramString1, parama, file)).start();
          return true;
        }
      } catch (FileNotFoundException fileNotFoundException) {
        D.d(
            "Could not get ECU Definition for signature: "
                + parambT
                + ", Error: "
                + fileNotFoundException.getLocalizedMessage());
      }
    }
    if (file == null) {
      String str =
          ExceptionInVPackage.b
              + " does not have an ECU Definition (ini) file that is \n"
              + "compatible with the firmware installed on this Controller.\n\n"
              + "    Firmware on "
              + str1
              + ": "
              + parambT.c()
              + "\n    Required Serial Signature: "
              + parambT.b()
              + "\n\n"
              + "To correct this please browse to the ECU Definition (ini) file\n"
              + "that was provided with your firmware.\n";
      hq.ExceptionInVPackage().b(str);
    }
    String[] arrayOfString = {"ini", "ecu"};
    String str2 =
        bV.b(dd.ExceptionInVPackage().c(), "Find ecu definition file", arrayOfString, "", "");
    if (str2 != null && !str2.equals("")) {
      file = new File(str2);
      if (!file.exists()) return false;
      String str = z.ExceptionInVPackage(str2);
      if (str == null || !str.equals(parambT.b())) {
        String str3 =
            "The file:\n"
                + str2
                + "\n does not appear correct for the firmware on your "
                + str1
                + "!\n\n"
                + "The correct ECU Definition (ini) file is required for proper operation\n"
                + "and to prevent corruption to the settings on your "
                + str1
                + "!!!\n\nAre you sure you wish to use this ECU Definition?";
        if (!hq.ExceptionInVPackage().c(str3)) return false;
      }
      try {
        t.ExceptionInVPackage(str2, ThreadedFile.m() + parambT.b() + ".ini");
      } catch (ExceptionInVPackage a1) {
        D.b("Unable to copy ini file to app ecu dir");
      }
      (new iI(this, paramString1, parama, file)).start();
      return true;
    }
    return false;
  }

  public File ExceptionInVPackage() {
    String[] arrayOfString = {"ini", "ecu"};
    File file = null;
    do {
      String str =
          bV.b(dd.ExceptionInVPackage().c(), "Find ecu definition file", arrayOfString, "", "");
      file = new File(str);
      if (str == null || str.equals("")) continue;
      if (file.exists() && file.length() > 0L) {
        String str1 = z.ExceptionInVPackage(str);
        try {
          t.ExceptionInVPackage(str, z.b(str1));
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          D.b("Unable to copy ini file to app ecu dir");
        }
        return file;
      }
      bV.d(
          file + "\nIs not ExceptionInVPackage valid Firmware Definition File.",
          dd.ExceptionInVPackage().c());
    } while (file != null && !file.exists());
    return null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
