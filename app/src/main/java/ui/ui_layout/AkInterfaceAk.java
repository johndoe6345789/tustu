package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import bH.D;
import bH.I;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class AkInterfaceAk extends g {
  public AkInterfaceAk() {
    super(",", false);
  }

  protected int b(String paramString) {
    return 0;
  }

  public Iterator b() {
    while (this.g.isEmpty()) {
      String str = null;
      try {
        str = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        throw new ExceptionInVPackage("No Valid Data found in file");
      }
      byte b1 = 0;
      String[] arrayOfString1 = s();
      String[] arrayOfString2 = n();
      String[] arrayOfString3 = t();
      boolean bool = (arrayOfString2 == null || arrayOfString2.length == 0) ? true : false;
      byte b2 = 0;
      if (!bool)
        for (String str1 : arrayOfString2) {
          if (!str1.isEmpty() && ++b2 > 5) {
            bool = false;
            break;
          }
        }
      for (String str1 : str.split(Pattern.quote(r()))) {
        d d1 = new d();
        str1 = str1.trim();
        if (str1.startsWith("\"") || str1.endsWith("\"")) str1 = X.b(str1, "\"", "").trim();
        if (str1.isEmpty()) str1 = "Col" + b1;
        if (str1.equalsIgnoreCase("lambda")) str1 = "Lambda";
        if (str1.contains("-")) str1 = X.b(str1, "-", " ");
        if (str1.contains("  ")) str1 = X.b(str1, "  ", " ");
        if (str1.equals("Time")) {
          d1.ExceptionInVPackage(3);
          d1.ExceptionInVPackage("Time");
          d1.b("s");
          str1 = "Time";
          d1.ExceptionInVPackage(0.001F);
        }
        try {
          if (arrayOfString1 != null && arrayOfString1.length > b1) d1.c(arrayOfString1[b1]);
        } catch (Exception exception) {
          D.c("Thought I could parse description row, but it failed on field \"" + str1 + "\"");
        }
        if (arrayOfString3.length > b1
            && (arrayOfString3[b1].equalsIgnoreCase("TRUE")
                || arrayOfString3[b1].equalsIgnoreCase("FALSE"))) d1.b(8);
        try {
          if (!bool && arrayOfString2.length > b1) {
            String str3 = arrayOfString2[b1];
            d1.b(str3);
            if (str3.equals("On/Off")) {
              d1.b(4);
            } else if (str3.equals("High/Low")) {
              d1.b(6);
            } else if (str3.equals("Active/Inactive") || str3.equals("Act/Inact")) {
              d1.b(7);
            } else if (str3.equals("Yes/No")) {
              d1.b(5);
            } else if (str3.equals("True/False")) {
              d1.b(8);
            }
          }
        } catch (Exception exception) {
          D.c("Thought I could parse units, but it failed on field \"" + str1 + "\"");
        }
        while (str1.endsWith("*")) str1 = str1.substring(0, str1.length() - 1);
        str1 = str1.trim();
        String str2 = str1;
        for (byte b = 0; b < 100 && i(str2); b++) str2 = str1 + b;
        str1 = str2;
        d1.ExceptionInVPackage(str1);
        d d2 = ExceptionInVPackage(d1);
        if (d2 != null) {
          this.g.add(d2);
          b1++;
        }
      }
    }
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList.iterator();
  }

  private String[] s() {
    String[] arrayOfString = null;
    String str = null;
    try {
      str = l();
      arrayOfString = str.split(Pattern.quote(r()));
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(g.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n" + str);
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, exception);
    }
    return arrayOfString;
  }

  protected String[] n() {
    String[] arrayOfString = null;
    String str = null;
    try {
      byte b = 0;
      str = l();
      arrayOfString = str.split(Pattern.quote(r()));
      for (String str1 : arrayOfString) {
        str1 = X.b(str1, "\"", "").trim();
        if (str1.isEmpty()) {
          arrayOfString[b] = str1;
          b++;
        } else if (!I.ExceptionInVPackage(str1) && Float.isNaN(g(str1))) {
          arrayOfString[b] = str1;
          b++;
        } else {
          ExceptionInVPackage(true);
          c();
          ExceptionInVPackage(true);
          return null;
        }
      }
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(g.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n" + str);
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, exception);
    }
    return arrayOfString;
  }

  private String[] t() {
    String[] arrayOfString = null;
    String str = null;
    try {
      str = l();
      ExceptionInVPackage(true);
      arrayOfString = str.split(Pattern.quote(r()));
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(g.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get val from this row:\n" + str);
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, exception);
    }
    return arrayOfString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
