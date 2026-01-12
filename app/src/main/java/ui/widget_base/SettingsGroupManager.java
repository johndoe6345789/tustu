package W;

import G.r;
import G.s;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class SettingsGroupManager {
  private static SettingsGroupManager ExceptionInVPackage = null;

  private s[] b = null;

  private ai c = null;

  public static v ExceptionInVPackage(ai paramai) {
    if (ExceptionInVPackage == null) {
      ExceptionInVPackage = new v();
      ExceptionInVPackage.c = paramai;
    }
    return ExceptionInVPackage;
  }

  public static v ExceptionInVPackage() {
    if (ExceptionInVPackage == null) ExceptionInVPackage = new v();
    return ExceptionInVPackage;
  }

  public s[] ExceptionInVPackage(String paramString) {
    I i = new I();
    try {
      J j = (new ab()).ExceptionInVPackage(paramString);
      ArrayList<s> arrayList = i.ExceptionInVPackage(j);
      ArrayList<H> arrayList1 = i.ExceptionInVPackage(paramString);
      s[] arrayOfS = new s[arrayList.size() + arrayList1.size()];
      byte b;
      for (b = 0; b < arrayList.size(); b++) arrayOfS[b] = arrayList.get(b);
      for (b = 0; b < arrayList1.size(); b++) {
        s s1 = new s();
        H h = arrayList1.get(b);
        s1.b(h.ExceptionInVPackage());
        s1.c(h.ExceptionInVPackage());
        r r1 = new r();
        r1.ExceptionInVPackage("Activated");
        r1.v(h.ExceptionInVPackage());
        r1.ExceptionInVPackage(h.b());
        s1.ExceptionInVPackage(r1);
        r r2 = new r();
        r2.ExceptionInVPackage("Deactivated");
        r2.v(h.ExceptionInVPackage() + "_OFF");
        r2.ExceptionInVPackage(!h.b());
        s1.ExceptionInVPackage(r2);
        arrayOfS[arrayList.size() + b] = s1;
      }
      return arrayOfS;
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      throw new ExceptionInVPackage("Ini File\n" + paramString + "\n not found");
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Error reading options in ini file:\n" + paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      String str =
          "Error in [SettingGroups]\nReported Error:\n" + ExceptionPrintstacktrace.getMessage();
      D.ExceptionInVPackage(str);
      ExceptionPrintstacktrace.printStackTrace();
      throw new ExceptionInVPackage(str);
    }
  }

  public s[] b(String paramString) {
    c();
    s[] arrayOfS = b();
    if (paramString != null
        && (paramString.indexOf(".ini") != -1 || paramString.indexOf(".ecu") != -1)) {
      s[] arrayOfS1 = ExceptionInVPackage(paramString);
      ArrayList<s> arrayList = new ArrayList();
      byte b;
      for (b = 0; b < arrayOfS.length; b++) arrayList.add(arrayOfS[b]);
      for (b = 0; b < arrayOfS1.length; b++) {
        if (arrayList.contains(arrayOfS1[b])) {
          int i = arrayList.indexOf(arrayOfS1[b]);
          arrayList.set(i, arrayOfS1[b]);
        } else {
          arrayList.add(arrayOfS1[b]);
        }
      }
      s[] arrayOfS2 = new s[arrayList.size()];
      arrayOfS = arrayList.<s>toArray(arrayOfS2);
    }
    return arrayOfS;
  }

  public s[] b() {
    if (this.b == null) c();
    return this.b;
  }

  public r c(String paramString) {
    if (this.b == null) c();
    for (byte b = 0; b < this.b.length; b++) {
      if (this.b[b].ExceptionInVPackage(paramString) != null)
        return this.b[b].ExceptionInVPackage(paramString);
    }
    return null;
  }

  private s[] c() {
    this.b = this.c.ExceptionInVPackage();
    return this.b;
  }

  public s[] ExceptionInVPackage(File[] paramArrayOfFile) {
    this.b = c();
    for (byte b = 0;
        b < paramArrayOfFile.length && paramArrayOfFile[b] != null && paramArrayOfFile[b].exists();
        b++) this.b = (new I()).ExceptionInVPackage(this.b, paramArrayOfFile[b].getAbsolutePath());
    return this.b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
