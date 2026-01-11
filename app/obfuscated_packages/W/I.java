package W;

import G.r;
import G.s;
import V.a;
import V.g;
import bH.D;
import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class I {
  public ArrayList a(String paramString) {
    File file = new File(paramString);
    BufferedReader bufferedReader = s.a(file);
    String str = "";
    ArrayList<H> arrayList = new ArrayList();
    while ((str = bufferedReader.readLine()) != null) {
      if (str.trim().startsWith("#")) {
        str = str.trim().substring(1).trim();
        if (str.indexOf(';') != -1)
          str = str.substring(0, str.indexOf(';')).trim(); 
        if ((str.startsWith("set") || str.startsWith("unset")) && str.indexOf("MSLVV_COMPATIBLE") == -1 && str.indexOf("TUNERSTUDIO") == -1 && str.indexOf("INI_VERSION_2") == -1) {
          H h = new H();
          h.a(str.substring(str.lastIndexOf(" ")).trim());
          h.a(str.startsWith("set"));
          arrayList.add(h);
        } 
      } 
    } 
    return arrayList;
  }
  
  public s[] a(s[] paramArrayOfs, String paramString) {
    long l = System.nanoTime();
    J j = null;
    try {
      j = (new ab()).a(paramString);
    } catch (g g) {
      String str = "Error in [SettingGroups]\nReported Error:\n" + g.getMessage();
      g.printStackTrace();
      throw new a(str);
    } 
    ArrayList<s> arrayList1 = new ArrayList();
    for (M m : j.a()) {
      String str = m.b();
      if (str.startsWith("#") && str.lastIndexOf(" ") != -1) {
        String str1 = str.substring(str.lastIndexOf(" ") + 1);
        for (byte b1 = 0; b1 < paramArrayOfs.length; b1++) {
          if (!arrayList1.contains(paramArrayOfs[b1]) && paramArrayOfs[b1].d(str1))
            arrayList1.add(paramArrayOfs[b1]); 
        } 
      } 
    } 
    ArrayList<s> arrayList2 = new ArrayList();
    for (byte b = 0; b < paramArrayOfs.length; b++) {
      if (arrayList1.contains(paramArrayOfs[b]))
        arrayList2.add(paramArrayOfs[b]); 
    } 
    paramArrayOfs = new s[arrayList2.size()];
    D.c("Filtered ConfigurationOptionGroup in " + ((System.nanoTime() - l) / 1000000L) + "ms.");
    return arrayList2.<s>toArray(paramArrayOfs);
  }
  
  public ArrayList a(J paramJ) {
    ArrayList<s> arrayList = new ArrayList();
    s s = null;
    N n = paramJ.b("SettingGroups");
    for (M m : n) {
      String str = m.b();
      try {
        if (str.startsWith("settingGroup")) {
          s = new s();
          String str1 = Q.a(str);
          String[] arrayOfString = Q.c(str1);
          s.v(arrayOfString[0].trim());
          s.b(arrayOfString[0].trim());
          if (arrayOfString.length > 1) {
            s.c(X.b(arrayOfString[1], "\"", ""));
          } else {
            s.c(s.c());
          } 
          arrayList.add(s);
          continue;
        } 
        if (str.startsWith("settingOption")) {
          r r = new r();
          String str1 = Q.a(str);
          String[] arrayOfString = Q.c(str1);
          String str2 = arrayOfString[0];
          if (str2.equals("") || str2.equals("DEFAULT") || (arrayOfString.length > 2 && arrayOfString[2].indexOf("true") != -1)) {
            r.a(true);
            r.v(str2);
            r.b(true);
          } else {
            r.v(str2);
          } 
          if (arrayOfString.length > 0) {
            String str3 = X.b(arrayOfString[1], "\"", "");
            r.a(str3);
          } else {
            r.a(r.aL());
          } 
          s.a(r);
        } 
      } catch (Exception exception) {
        String str1 = "Invalid Ini entry for reference table, Ignored:\n" + str + "\n";
        D.a(str1);
        exception.printStackTrace();
        throw new g(str1);
      } 
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */