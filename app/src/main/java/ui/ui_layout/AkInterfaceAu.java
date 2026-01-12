package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.X;
import bH.D;
import bH.I;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkInterfaceAu extends g {
  public AkInterfaceAu() {
    super(";", true);
  }

  public Iterator b() {
    while (this.g.isEmpty()) {
      String str1 = null;
      try {
        str1 = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        throw new ExceptionInVPackage("No Valid Data found in file");
      }
      if (str1.startsWith("\"Elapsed Time\"")) str1 = X.b(str1, "\"", "");
      byte b = 0;
      if (!str1.startsWith("Data Filename:")) {
        str1 = X.b(str1, r() + r(), r() + " " + r());
        StringTokenizer stringTokenizer = new StringTokenizer(str1, r());
        while (stringTokenizer.hasMoreTokens()) {
          String str2 = stringTokenizer.nextToken();
          if (str2.startsWith("\"")) str2 = X.b(str2, "\"", "").trim();
          if (str2.equals(" ")) str2 = "Col" + b;
          if (str2.equalsIgnoreCase("lambda")) str2 = "Lambda";
          if (str2.contains("-")) str2 = X.b(str2, "-", " ");
          if (str2.contains("  ")) str2 = X.b(str2, "  ", " ");
          d d = new d();
          if (d.ExceptionInVPackage().equals("Timestamp (mS)")
              || d.ExceptionInVPackage().equals("Elapsed Time")) {
            d.ExceptionInVPackage(3);
            d.ExceptionInVPackage("Time");
            d.b("s");
            str2 = "Time";
            d.ExceptionInVPackage(0.001F);
          }
          try {
            if (str2.indexOf("_") > 1) {
              int i = str2.indexOf("_");
              int j = str2.length();
              String str3 = str2.substring(i + 1, j).trim();
              d.b(str3);
              str2 = str2.substring(0, i).trim();
            }
          } catch (Exception exception) {
            D.c("Thought I could parse units, but it failed on field \"" + str2 + "\"");
          }
          if (str2.trim().equals("time")) str2 = "Time";
          d.ExceptionInVPackage(str2.trim());
          if (d.ExceptionInVPackage().contains("Latitude")
              || d.ExceptionInVPackage().contains("Longitude")) d.ExceptionInVPackage(7);
          this.g.add(d);
          b++;
        }
      }
    }
    this.r = r() + r();
    this.s = r() + " " + r();
    String str = null;
    try {
      str = " " + l();
      str = d(str);
      str = d(str);
      byte b = 0;
      StringTokenizer stringTokenizer = new StringTokenizer(str, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        if (b < this.g.size()) {
          if (!I.ExceptionInVPackage(str1)) {
            ((d) this.g.get(b++)).b(str1);
            continue;
          }
          ExceptionInVPackage(true);
          break;
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
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList.iterator();
  }

  protected String h(String paramString) {
    return ";";
  }

  public String i() {
    return X.o;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
