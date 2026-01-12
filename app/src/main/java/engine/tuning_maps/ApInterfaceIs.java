package aP;

import V.ExceptionInVPackage;
import bH.A;
import bH.D;
import bH.X;
import bH.ae;
import bH.t;
import bV.ArrayListInBvPackage;
import bV.ExceptionInVPackage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;

public class ApInterfaceIs {
  long ExceptionInVPackage = 604800000L;

  static String b = "startScreenVersions.";

  String c = "1.5";

  iU ArrayListInBvPackage = null;

  public void ExceptionInVPackage(File paramFile, String paramString, iV paramiV) {
    String str1 = ExceptionInVPackage.aR + "." + paramString;
    String str2 = X.b(ExceptionInVPackage.c, RInterfaceIndia.c, "").trim() + paramString;
    String str3 = b + paramString;
    String str4 = ExceptionInVPackage.ExceptionInVPackage().c(str3, this.c);
    long l1 = System.currentTimeMillis() - this.ExceptionInVPackage;
    long l2 = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(str1, -1L);
    boolean bool =
        (ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aQ, true)
                || !A.RInterfaceIndia()
                    .ExceptionInVPackage(
                        ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.cF, "")))
            ? true
            : false;
    if (l2 < l1 && bool) {
      try {
        ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
        ArrayListInBvPackage ArrayListInBvPackage = null;
        try {
          ArrayListInBvPackage =
              ExceptionInVPackage.ExceptionInVPackage(
                  ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aN, ""),
                  ExceptionInVPackage.b,
                  str4,
                  ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aO, ""),
                  ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aT, ""),
                  ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.cF, ""),
                  str2,
                  ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.cO, ""));
        } catch (IOException iOException) {
          System.out.println(
              "Unable to read from start screen update server, connection to server unavailable");
          return;
        }
        if (ArrayListInBvPackage == null) {
          D.ArrayListInBvPackage("Start Screen update Failed.");
          return;
        }
        if (ArrayListInBvPackage.ExceptionInVPackage() == 0) {
          try {
            ExceptionInVPackage.ExceptionInVPackage().b(str1, "" + (new Date()).getTime());
            ExceptionInVPackage.ExceptionInVPackage().e();
            return;
          } catch (ExceptionInVPackage a1) {
            Logger.getLogger(iS.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
          }
        } else if (ArrayListInBvPackage.ExceptionInVPackage() == 2) {
          try {
            t.b(paramFile);
            File file = new File(paramFile, "tmp");
            file.mkdirs();
            file.delete();
            ExceptionInVPackage.ExceptionInVPackage(paramFile, ArrayListInBvPackage);
            String str = ArrayListInBvPackage.b();
            str =
                X.b(
                    str,
                    ExceptionInVPackage.b
                        + " Update available! Would you like Auto Update to upgrade to version ",
                    "");
            str = X.b(str, " now?", "");
            ExceptionInVPackage(paramFile);
            ExceptionInVPackage.ExceptionInVPackage().b(str3, str.trim());
            D.ArrayListInBvPackage("Updated Start Screen: " + str2);
            if (paramiV != null) paramiV.ExceptionInVPackage();
          } catch (IOException iOException) {
            D.ExceptionInVPackage(
                "Failed to update Start Screen: "
                    + paramString
                    + ", Error: "
                    + iOException.getMessage());
          }
        } else if (ArrayListInBvPackage.ExceptionInVPackage() == 1) {
          hq.ExceptionInVPackage().ExceptionInVPackage(ArrayListInBvPackage.b());
        } else if (ArrayListInBvPackage.ExceptionInVPackage() != 8
            && ArrayListInBvPackage.ExceptionInVPackage() == 4) {

        }
        ExceptionInVPackage.ExceptionInVPackage().b(str1, "" + (new Date()).getTime());
        ExceptionInVPackage.ExceptionInVPackage().e();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(iS.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
      }
    } else {
      System.out.println(str2 + ": No check, last update check=" + (new Date(l2)).toString());
    }
  }

  private void ExceptionInVPackage(File paramFile) {
    String[] arrayOfString = paramFile.list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].toLowerCase().endsWith(".zip"))
        try {
          hq.ExceptionInVPackage().ExceptionInVPackage("Updating Start Screen.");
          File file = new File(paramFile, arrayOfString[b]);
          if (ae.ExceptionInVPackage(file.getAbsolutePath(), paramFile.getAbsolutePath(), null)
              .equals(ae.ExceptionInVPackage)) (new File(paramFile, arrayOfString[b])).delete();
        } catch (ZipException zipException) {
          zipException.printStackTrace();
        } catch (IOException iOException) {
          iOException.printStackTrace();
        }
    }
  }

  public void b(File paramFile, String paramString, iV paramiV) {
    iT iT = new iT(this, paramFile, paramString, paramiV);
    b().ExceptionInVPackage(iT);
  }

  private iU b() {
    if (this.ArrayListInBvPackage == null || !this.ArrayListInBvPackage.isAlive())
      this.ArrayListInBvPackage = new iU(this);
    return this.ArrayListInBvPackage;
  }

  public void ExceptionInVPackage() {
    String str = b + "ad";
    ExceptionInVPackage.ExceptionInVPackage().b(str, this.c);
    str = b + "main";
    ExceptionInVPackage.ExceptionInVPackage().b(str, this.c);
    str = b + "register";
    ExceptionInVPackage.ExceptionInVPackage().b(str, this.c);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
