package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.X;
import W.m;
import bH.D;
import bH.I;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkInterfaceJuliet extends g {
  float ExceptionInVPackage = -1.0F;

  public AkInterfaceJuliet() {
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
      byte b = 0;
      if (!str1.startsWith("Data Filename:")) {
        str1 = X.b(str1, r() + r(), r() + " " + r());
        StringTokenizer stringTokenizer = new StringTokenizer(str1, r());
        while (stringTokenizer.hasMoreTokens()) {
          String str2 = stringTokenizer.nextToken().trim();
          if (str2.startsWith("\"")) str2 = X.b(str2, "\"", "").trim();
          if (str2.equals(" ")) str2 = "Col" + b;
          if (str2.equalsIgnoreCase("lambda")) str2 = "Lambda";
          if (str2.contains("-")) str2 = X.b(str2, "-", " ");
          if (str2.contains("  ")) str2 = X.b(str2, "  ", " ");
          d d = new d();
          try {
            if (str2.equals("LogEntrySeconds")) {
              String str3 = "s";
              d.b(str3);
              str2 = "Time";
            }
            if (str2.equals("LogEntryDate")) d.b(3);
          } catch (Exception exception) {
            D.c("Thought I could parse units, but it failed on field \"" + str2 + "\"");
          }
          str2 = str2.trim();
          for (byte b1 = 0; b1 < 100 && i(str2); b1++) str2 = str2 + b1;
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

  protected void e(String paramString) {
    if (paramString.indexOf("Device Time") > -1) throw new m("Log Restart");
    super.e(paramString);
  }

  public float[] c() {
    float[] arrayOfFloat = super.c();
    if (this.g.size() > arrayOfFloat.length) {
      float[] arrayOfFloat1 = new float[this.g.size()];
      System.arraycopy(arrayOfFloat, 0, arrayOfFloat1, 0, arrayOfFloat.length);
      arrayOfFloat = arrayOfFloat1;
    }
    return arrayOfFloat;
  }

  protected float g(String paramString) {
    int i = 0;
    int j = 0;
    float VInterfaceFoxtrot = 0.0F;
    try {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, ":");
      if (stringTokenizer.countTokens() > 2) {
        String str = stringTokenizer.nextToken();
        if ((str.contains("/") || str.contains("-")) && str.contains(" "))
          str = str.substring(str.indexOf(" ") + 1);
        i = Integer.parseInt(str);
      }
      j = Integer.parseInt(stringTokenizer.nextToken());
      VInterfaceFoxtrot = Float.parseFloat(stringTokenizer.nextToken());
      float f1 = (i * 3600 + j * 60) + VInterfaceFoxtrot;
      if (this.ExceptionInVPackage < 0.0F) this.ExceptionInVPackage = f1;
      return f1 - this.ExceptionInVPackage;
    } catch (Exception exception) {
      return 0.0F;
    }
  }

  public String i() {
    return X.t;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
