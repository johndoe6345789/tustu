package ao;

import bH.D;
import bH.S;
import bH.X;
import bx.AbstractInBxPackage;
import bx.BxInterfaceJuliet;
import bx.ExceptionInBxPackage;
import com.efiAnalytics.ui.bV;
import g.IOJFileChooser;
import h.IOProperties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;

public class M extends AbstractInBxPackage {
  private static M AbstractInBxPackage = null;

  public static M AbstractInBxPackage() {
    if (AbstractInBxPackage == null) {
      AbstractInBxPackage = new M();
      AbstractInBxPackage.f();
    }
    return AbstractInBxPackage;
  }

  public boolean AbstractInBxPackage(BxInterfaceJuliet paramj) {
    boolean bool;
    String str = paramj.AbstractInBxPackage();
    if (str.length() > 20) throw new ExceptionInBxPackage("Filter Name Exceeds Max Length of 20");
    try {
      bool = N.AbstractInBxPackage(paramj.c());
    } catch (bC bC) {
      throw new ExceptionInBxPackage(bC.getMessage());
    } catch (fr fr) {
      bool = true;
    }
    return bool;
  }

  public void AbstractInBxPackage(ArrayList<BxInterfaceJuliet> paramArrayList) {
    paramArrayList.clear();
    String[] arrayOfString = IOProperties.f("DATA_FILTER_");
    arrayOfString = S.AbstractInBxPackage(arrayOfString);
    boolean bool = false;
    if (arrayOfString == null || arrayOfString.length == 0) {
      arrayOfString = IOProperties.g("DATA_FILTER_");
      bool = true;
    }
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str1 = X.b(arrayOfString[b], "DATA_FILTER_", "");
      String str2 = "";
      String str3 =
          bool ? IOProperties.c(arrayOfString[b]) : IOProperties.e("DATA_FILTER_" + str1, "");
      if (str3.contains(";")) {
        str2 = str3.substring(str3.indexOf(";") + 1);
        str3 = str3.substring(0, str3.indexOf(";"));
      }
      if (str3.equals("")) D.b("Data filter defined with no formula! Name: " + str1);
      BxInterfaceJuliet BxInterfaceJuliet = new BxInterfaceJuliet();
      BxInterfaceJuliet.AbstractInBxPackage(str1);
      BxInterfaceJuliet.b(str2);
      BxInterfaceJuliet.c(str3);
      paramArrayList.add(BxInterfaceJuliet);
    }
  }

  public void b(ArrayList<BxInterfaceJuliet> paramArrayList) {
    g();
    for (byte b = 0; b < paramArrayList.size(); b++) {
      BxInterfaceJuliet BxInterfaceJuliet = paramArrayList.get(b);
      String str = BxInterfaceJuliet.b();
      if (str == null || str.equals("")) str = " ";
      IOProperties.c(
          "DATA_FILTER_" + BxInterfaceJuliet.AbstractInBxPackage(),
          BxInterfaceJuliet.c() + ";" + str);
    }
  }

  private void g() {
    String[] arrayOfString = IOProperties.f("DATA_FILTER_");
    for (byte b = 0; b < arrayOfString.length; b++) IOProperties.d(arrayOfString[b]);
  }

  public void b() {
    String[] arrayOfString = {"filters"};
    cd cd = bq.AbstractInBxPackage().b();
    String str =
        IOJFileChooser.AbstractInBxPackage(cd, "Import Data Filters", arrayOfString, "*.filters");
    if (str == null || str.equals("")) return;
    int IOProperties =
        JOptionPane.showConfirmDialog(
            cd, "Warning!!!!\nAny Data Filters of the same name will be overridden\n\nContinue?");
    if (IOProperties != 0) return;
    Properties properties = new Properties();
    try {
      properties.load(new FileInputStream(str));
    } catch (Exception exception) {
      bV.d("Unable to open settings file " + str + "\nSee log for more detail.", cd);
      exception.printStackTrace();
    }
    for (String str1 : properties.keySet()) {
      if (str1.startsWith("DATA_FILTER_")) {
        String str2 = X.b(str1, "DATA_FILTER_", "");
        String str3 = "";
        String str4 = properties.getProperty("DATA_FILTER_" + str2, "");
        if (str4.contains(";")) {
          str3 = str4.substring(str4.indexOf(";") + 1);
          str4 = str4.substring(0, str4.indexOf(";"));
        }
        if (str4.equals("")) D.b("Data filter defined with no formula! Name: " + str2);
        BxInterfaceJuliet BxInterfaceJuliet = new BxInterfaceJuliet();
        BxInterfaceJuliet.AbstractInBxPackage(str2);
        BxInterfaceJuliet.b(str3);
        BxInterfaceJuliet.c(str4);
        b(BxInterfaceJuliet);
      }
    }
  }

  public void c() {
    String[] arrayOfString = {"filters"};
    String str =
        IOJFileChooser.AbstractInBxPackage(
            bq.AbstractInBxPackage().b(), "Export Filters", arrayOfString, "*.filters");
    if (str == null || str.equals("")) return;
    if (!str.toLowerCase().endsWith("filters")) str = str + ".filters";
    Properties properties = new Properties();
    for (String str1 : IOProperties.e.keySet()) {
      if (str1.startsWith("DATA_FILTER_")) {
        String str2 = IOProperties.e.getProperty(str1);
        properties.setProperty(str1, str2);
      }
    }
    File file = new File(str);
    try {
      properties.store(new FileOutputStream(file), "MegaLogViewer DataFilters");
    } catch (Exception exception) {
      bV.d(
          "Unable to save settings to " + str + "\nSee log for more detail.",
          bq.AbstractInBxPackage().b());
      exception.printStackTrace();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
