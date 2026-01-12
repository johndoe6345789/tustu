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

public class AkComponentVictor extends g {
  public AkComponentVictor() {
    super(",", false);
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
      if (!str1.startsWith("#") && !str1.startsWith(".") && !str1.startsWith("Data Filename:")) {
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
          if (str2.equals("Offset (ms)")) {
            d.ExceptionInVPackage(3);
            d.ExceptionInVPackage("Time");
            d.b("s");
            str2 = "Time";
            d.ExceptionInVPackage(0.001F);
          }
          try {
            if (str2.indexOf("[") > 1 && str2.contains("]")) {
              int i = str2.indexOf("[");
              int j = str2.indexOf("]", i);
              String str4 = str2.substring(i + 1, j).trim();
              d.b(str4);
              str2 = (str2.substring(0, i) + str2.substring(j + 1, str2.length())).trim();
              this.t = true;
            }
            if (str2.indexOf("(") > 1 && str2.contains(")")) {
              int i = str2.indexOf("(");
              int j = str2.indexOf(")", i);
              String str4 = str2.substring(i + 1, j).trim();
              d.b(str4);
              str2 = (str2.substring(0, i) + str2.substring(j + 1, str2.length())).trim();
            }
          } catch (Exception exception) {
            D.c("Thought I could parse units, but it failed on field \"" + str2 + "\"");
          }
          if (str2.trim().equals("time")) str2 = "Time";
          str2 = str2.trim();
          String str3 = str2;
          for (byte b1 = 0; b1 < 100 && i(str3); b1++) str3 = str2 + b1;
          str2 = str3;
          d.ExceptionInVPackage(str2);
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
            ((d) this.g.get(b)).b(str1);
            if (str1.equals("On/Off")) {
              ((d) this.g.get(b)).b(4);
            } else if (str1.equals("High/Low")) {
              ((d) this.g.get(b)).b(6);
            } else if (str1.equals("Active/Inactive")) {
              ((d) this.g.get(b)).b(7);
            } else if (str1.equals("Yes/No")) {
              ((d) this.g.get(b)).b(5);
            }
            b++;
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

  protected String l() {
    if (p()) {
      ExceptionInVPackage(false);
      return this.o;
    }
    this.o = this.n;
    this.n = this.e.ExceptionInVPackage();
    if (this.n != null && this.n.equals("")) this.n = this.e.ExceptionInVPackage();
    this.p++;
    if (this.o == null) throw new VInterfaceFoxtrot("No records available.");
    if (this.g.size() > 0 && this.o.trim().equals("")) {
      this.o = "MARK Corrupt file blank record";
      System.out.println("Found ExceptionInVPackage bad row");
    }
    if (this.o.startsWith("\"")) this.o = X.b(this.o, "\"", "");
    return this.o;
  }

  public float[] c() {
    String str1 = null;
    try {
      if (this.t && this.p >= 2000 && k())
        throw new ExceptionInVPackage(
            "This Edition is limited to loading 2000 rows of data. \n"
                + "Please Register to load large log files.");
      str1 = l();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("IO Error reading row from file on row " + this.p + ".");
    }
    if (str1.startsWith(r())) {
      String str = "0";
      if (this.i != null && this.i.length > 0) str = this.i[0] + "";
      str1 = str + str1;
    }
    if (this.m == -1L) this.m = this.h.length() / (str1.length() + 3);
    str1 = d(str1);
    if (str1.endsWith(r())) str1 = str1 + " ";
    if (str1.startsWith("\"")) str1 = str1.substring(1);
    if (str1.endsWith("\"")) str1 = str1.substring(0, str1.length() - 1);
    String str2 = r();
    aE aE = new aE(str1, str2);
    this.i = new float[aE.c()];
    for (byte b = 0; b < this.i.length; b++) {
      String str = null;
      try {
        str = aE.b().trim();
      } catch (Exception exception) {
        D.c("Error Parsing record:\n" + str1);
        str = "0";
        exception.printStackTrace();
      }
      if (str.startsWith("S ")) {
        str = X.b(str, "S ", "-");
      } else if (str.startsWith("E ")) {
        str = X.b(str, "E ", "");
      } else if (str.startsWith("N ")) {
        str = X.b(str, "N ", "");
      } else if (str.startsWith("W ")) {
        str = X.b(str, "W ", "-");
      }
      if (str.indexOf(":") != -1) {
        this.i[b] = g(str);
      } else if (str.startsWith("0x")) {
        try {
          this.i[b] = Integer.parseInt(str.substring(2), 16);
        } catch (NumberFormatException numberFormatException) {
          this.i[b] = 0.0F;
        }
      } else if (str.equals("Off")
          || str.equals("Inactive")
          || str.equals("Low")
          || str.equals("Failure")
          || str.equals("No")
          || str.equals("Too Low")) {
        this.i[b] = 0.0F;
      } else if (str.equals("On")
          || str.equals("Active")
          || str.equals("High")
          || str.equals("Ok")
          || str.equals("Yes")
          || str.equals("Too High")) {
        this.i[b] = 1.0F;
      } else if (str.equals("")) {
        this.i[b] = Float.NaN;
      } else {
        try {
          str = X.b(str, ",", ".");
          this.i[b] = Float.parseFloat(str);
        } catch (NumberFormatException numberFormatException) {
          this.i[b] = Float.NaN;
        }
      }
    }
    return this.i;
  }

  protected boolean c(String paramString1, String paramString2) {
    try {
      if (paramString1.startsWith("\"")) paramString1 = paramString1.substring(1);
      String str = paramString1.substring(0, paramString1.indexOf("\""));
      Double.parseDouble(str);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public String i() {
    return X.q;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
