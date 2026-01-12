package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.ManagerUsingReader;
import W.T;
import W.X;
import bH.D;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkInterfaceAi extends g {
  public AkInterfaceAi() {
    super(",", true);
  }

  public boolean ExceptionInVPackage(String paramString) {
    FileInputStream fileInputStream = null;
    try {
      this.h = new File(paramString);
      fileInputStream = new FileInputStream(this.h);
      this.e = new ManagerUsingReader(new InputStreamReader(fileInputStream));
      this.n = this.e.ExceptionInVPackage();
      while (this.n.indexOf("Sample #") == -1 && !this.n.startsWith(",Time"))
        this.n = this.e.ExceptionInVPackage();
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    }
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
      if (str1.startsWith(",Time")) str1 = "Record" + str1;
      str1 = X.b(str1, r() + r(), r() + " " + r());
      StringTokenizer stringTokenizer = new StringTokenizer(str1, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str2 = stringTokenizer.nextToken();
        d d = new d();
        if (str2.startsWith("\"")) str2 = X.b(str2, "\"", "");
        if (str2.trim().equals("")) str2 = "Col" + b;
        String str3 = str2.trim();
        str3 = ExceptionInVPackage(this.g, str3);
        d.ExceptionInVPackage(str3);
        if (str3.indexOf(":") != -1) d.b(4);
        this.g.add(d);
        b++;
      }
    }
    String str = null;
    try {
      str = " " + l();
      str = X.b(str, r() + r(), r() + " " + r());
      str = X.b(str, r() + r(), r() + " " + r());
      byte b = 0;
      StringTokenizer stringTokenizer = new StringTokenizer(str, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        if (b < this.g.size()) {
          if (!b_(str1)) {
            ((d) this.g.get(b++)).b(str1);
            continue;
          }
          ExceptionInVPackage(true);
          break;
        }
      }
    } catch (IOException iOException) {
      Logger.getLogger(aI.class.getName()).log(Level.SEVERE, (String) null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(aI.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n" + str);
      Logger.getLogger(aI.class.getName()).log(Level.SEVERE, (String) null, exception);
    }
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList.iterator();
  }

  protected boolean b_(String paramString) {
    try {
      double d = Double.parseDouble(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  protected String m() {
    return ",";
  }

  public String i() {
    return X.m;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
