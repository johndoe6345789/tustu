package ao;

import bH.D;
import bH.S;
import bH.X;
import bx.a;
import bx.j;
import bx.x;
import com.efiAnalytics.ui.bV;
import g.k;
import h.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;

public class M extends a {
  private static M a = null;
  
  public static M a() {
    if (a == null) {
      a = new M();
      a.f();
    } 
    return a;
  }
  
  public boolean a(j paramj) {
    boolean bool;
    String str = paramj.a();
    if (str.length() > 20)
      throw new x("Filter Name Exceeds Max Length of 20"); 
    try {
      bool = N.a(paramj.c());
    } catch (bC bC) {
      throw new x(bC.getMessage());
    } catch (fr fr) {
      bool = true;
    } 
    return bool;
  }
  
  public void a(ArrayList<j> paramArrayList) {
    paramArrayList.clear();
    String[] arrayOfString = i.f("DATA_FILTER_");
    arrayOfString = S.a(arrayOfString);
    boolean bool = false;
    if (arrayOfString == null || arrayOfString.length == 0) {
      arrayOfString = i.g("DATA_FILTER_");
      bool = true;
    } 
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str1 = X.b(arrayOfString[b], "DATA_FILTER_", "");
      String str2 = "";
      String str3 = bool ? i.c(arrayOfString[b]) : i.e("DATA_FILTER_" + str1, "");
      if (str3.contains(";")) {
        str2 = str3.substring(str3.indexOf(";") + 1);
        str3 = str3.substring(0, str3.indexOf(";"));
      } 
      if (str3.equals(""))
        D.b("Data filter defined with no formula! Name: " + str1); 
      j j = new j();
      j.a(str1);
      j.b(str2);
      j.c(str3);
      paramArrayList.add(j);
    } 
  }
  
  public void b(ArrayList<j> paramArrayList) {
    g();
    for (byte b = 0; b < paramArrayList.size(); b++) {
      j j = paramArrayList.get(b);
      String str = j.b();
      if (str == null || str.equals(""))
        str = " "; 
      i.c("DATA_FILTER_" + j.a(), j.c() + ";" + str);
    } 
  }
  
  private void g() {
    String[] arrayOfString = i.f("DATA_FILTER_");
    for (byte b = 0; b < arrayOfString.length; b++)
      i.d(arrayOfString[b]); 
  }
  
  public void b() {
    String[] arrayOfString = { "filters" };
    cd cd = bq.a().b();
    String str = k.a(cd, "Import Data Filters", arrayOfString, "*.filters");
    if (str == null || str.equals(""))
      return; 
    int i = JOptionPane.showConfirmDialog(cd, "Warning!!!!\nAny Data Filters of the same name will be overridden\n\nContinue?");
    if (i != 0)
      return; 
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
        if (str4.equals(""))
          D.b("Data filter defined with no formula! Name: " + str2); 
        j j = new j();
        j.a(str2);
        j.b(str3);
        j.c(str4);
        b(j);
      } 
    } 
  }
  
  public void c() {
    String[] arrayOfString = { "filters" };
    String str = k.a(bq.a().b(), "Export Filters", arrayOfString, "*.filters");
    if (str == null || str.equals(""))
      return; 
    if (!str.toLowerCase().endsWith("filters"))
      str = str + ".filters"; 
    Properties properties = new Properties();
    for (String str1 : i.e.keySet()) {
      if (str1.startsWith("DATA_FILTER_")) {
        String str2 = i.e.getProperty(str1);
        properties.setProperty(str1, str2);
      } 
    } 
    File file = new File(str);
    try {
      properties.store(new FileOutputStream(file), "MegaLogViewer DataFilters");
    } catch (Exception exception) {
      bV.d("Unable to save settings to " + str + "\nSee log for more detail.", bq.a().b());
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */