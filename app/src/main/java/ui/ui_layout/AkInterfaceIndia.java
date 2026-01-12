package ak;

import V.ExceptionInVPackage;
import W.ManagerUsingReader;
import W.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkInterfaceIndia extends g {
  Properties ExceptionInVPackage = null;

  public AkInterfaceIndia() {
    super(",", false);
    this.ExceptionInVPackage = new Properties();
    this.t = true;
    try {
      this.ExceptionInVPackage.load(new FileInputStream("FieldMaps/EMtron.properties"));
    } catch (IOException iOException) {
      Logger.getLogger(I.class.getName()).log(Level.SEVERE, (String) null, iOException);
    }
  }

  public Iterator b() {
    ArrayList<d> arrayList = new ArrayList();
    Iterator<d> iterator = super.b();
    while (iterator.hasNext()) {
      d d = iterator.next();
      String str1 = d.ExceptionInVPackage();
      String str2 = this.ExceptionInVPackage.getProperty(str1);
      if (str2 != null) d.ExceptionInVPackage(str2);
      arrayList.add(d);
    }
    return arrayList.iterator();
  }

  protected int b(String paramString) {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    String str5 = "";
    byte b = 0;
    ManagerUsingReader ManagerUsingReader = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      ManagerUsingReader = new ManagerUsingReader(new InputStreamReader(fileInputStream));
      str1 = ManagerUsingReader.ExceptionInVPackage();
      if (str1 == null) return b - 1;
      while (b == 0 || (!b_(str1) && str2.indexOf(".ecf") != -1)) {
        if (str1 == null) return b - 1;
        if (!str1.startsWith("MARK")) {
          str5 = str4;
          str4 = str3;
          str3 = str2;
          str2 = str1;
          b++;
        }
        str1 = ManagerUsingReader.ExceptionInVPackage();
      }
      if (this.u) l(h(str1));
      int i = d(str1, r());
      if (b >= 4 && d(str5, r()) == i && b(str5, r())) return b - 4;
      if (b >= 3 && d(str4, r()) == i && b(str4, r())) return b - 3;
      if (d(str3, r()) == i && b(str3, r())) return b - 2;
      return b - 1;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } finally {
      if (ManagerUsingReader != null)
        try {
          ManagerUsingReader.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, iOException);
        }
    }
  }

  public String i() {
    return X.R;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
