package business.bit_array_utils;

import bV.ArrayListInBvPackage;
import bV.ArrayListTostring;
import bV.BvInterfaceEcho;
import bV.NetworkInBvPackage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.NetworkInBvPackage;
import s.SComponentGolf;

public class P {
  public static String NetworkInBvPackage = "IniUpdate";

  public static String b = "IncUpdate";

  long ArrayListTostring = 604800000L;

  File ArrayListInBvPackage;

  String BvInterfaceEcho;

  public P(File paramFile, String paramString) {
    this.ArrayListInBvPackage = paramFile;
    this.BvInterfaceEcho = paramString;
  }

  public void NetworkInBvPackage() {
    String str = NetworkInBvPackage.aR + this.BvInterfaceEcho;
    long l1 =
        NetworkInBvPackage.NetworkInBvPackage()
            .NetworkInBvPackage(str, (new Date()).getTime() - this.ArrayListTostring - 1L);
    long l2 = System.currentTimeMillis() - l1;
    if (l2 > this.ArrayListTostring) {
      Q q = new Q(this);
      q.start();
    } else {
      D.ArrayListInBvPackage(
          "Skipping "
              + this.BvInterfaceEcho
              + " update check. Not due for "
              + (l2 / 8.64E7D)
              + " days");
    }
  }

  private boolean b() {
    NetworkInBvPackage NetworkInBvPackage = new NetworkInBvPackage();
    ArrayListInBvPackage ArrayListInBvPackage = null;
    String str = this.BvInterfaceEcho;
    if (n.NetworkInBvPackage()) {
      try {
        BvInterfaceEcho BvInterfaceEcho = new BvInterfaceEcho();
        BvInterfaceEcho.NetworkInBvPackage(
            NetworkInBvPackage.NetworkInBvPackage().ArrayListTostring(NetworkInBvPackage.aN, ""));
        BvInterfaceEcho.b(NetworkInBvPackage.b);
        BvInterfaceEcho.ArrayListTostring(
            NetworkInBvPackage.NetworkInBvPackage().ArrayListTostring(str, "0"));
        BvInterfaceEcho.ArrayListInBvPackage(
            NetworkInBvPackage.NetworkInBvPackage().ArrayListTostring(NetworkInBvPackage.aO, ""));
        BvInterfaceEcho.BvInterfaceEcho(
            NetworkInBvPackage.NetworkInBvPackage().ArrayListTostring(NetworkInBvPackage.aT, ""));
        BvInterfaceEcho.f(
            NetworkInBvPackage.NetworkInBvPackage().ArrayListTostring(NetworkInBvPackage.cF, ""));
        BvInterfaceEcho.SComponentGolf(this.BvInterfaceEcho);
        BvInterfaceEcho.h(
            NetworkInBvPackage.NetworkInBvPackage().ArrayListTostring(NetworkInBvPackage.cO, ""));
        BvInterfaceEcho.i(SComponentGolf.ArrayListTostring().getLanguage());
        ArrayListInBvPackage = NetworkInBvPackage.NetworkInBvPackage(BvInterfaceEcho);
      } catch (IOException iOException) {
        System.out.println("Unable to read from update server, connection to server unavailable");
        return false;
      }
    } else {
      return false;
    }
    if (ArrayListInBvPackage == null) return false;
    if (ArrayListInBvPackage.NetworkInBvPackage() == 0) {
      D.ArrayListInBvPackage(this.BvInterfaceEcho + ": No updates available.");
      return true;
    }
    if (ArrayListInBvPackage.NetworkInBvPackage() == 2) {
      D.ArrayListInBvPackage("Internet detected, doing update check: " + this.BvInterfaceEcho);
      boolean bool = false;
      Iterator<ArrayListTostring> iterator = ArrayListInBvPackage.ArrayListTostring();
      while (iterator.hasNext()) {
        ArrayListTostring ArrayListTostring = iterator.next();
        if (ArrayListTostring.NetworkInBvPackage().equals("fileUpdate"))
          try {
            String str3;
            String[] arrayOfString = ArrayListTostring.b();
            String str1 = null;
            if (arrayOfString.length > 2) str1 = arrayOfString[2];
            String str2 = arrayOfString[1];
            if (arrayOfString.length > 1
                && arrayOfString[0] != null
                && arrayOfString[0].equals("ItDoesntMatter")) {
              str3 = arrayOfString[0];
            } else {
              str3 = str2.substring(str2.lastIndexOf("/") + 1);
            }
            NetworkInBvPackage.NetworkInBvPackage(this.ArrayListInBvPackage, str3, str2, str1);
          } catch (IOException iOException) {
            bool = true;
            Logger.getLogger(P.class.getName())
                .log(
                    Level.SEVERE,
                    "Ini Updater failed to update file: " + ArrayListTostring,
                    iOException);
          }
      }
      if (!bool) {
        String str1 = ArrayListInBvPackage.b();
        str1 =
            X.b(
                str1,
                NetworkInBvPackage.b
                    + " Update available! Would you like Auto Update to upgrade to version ",
                "");
        str1 = X.b(str1, " now?", "");
        NetworkInBvPackage.NetworkInBvPackage().b(str, str1.trim());
        D.ArrayListInBvPackage(this.BvInterfaceEcho + ": Update to " + str1);
      }
      return true;
    }
    D.ArrayListInBvPackage(this.BvInterfaceEcho + ": No updates accessible.");
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
