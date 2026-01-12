package aP;

import A.AInterfaceWhiskey;
import V.ExceptionInVPackage;
import bH.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;

public class ApInterfaceRomeo implements AInterfaceWhiskey {
  private static R ExceptionInVPackage = null;

  public static R ExceptionInVPackage() {
    if (ExceptionInVPackage == null) ExceptionInVPackage = new R();
    return ExceptionInVPackage;
  }

  public void ExceptionInVPackage(String paramString) {
    ArrayList<String> arrayList = b();
    arrayList.add(paramString);
    ExceptionInVPackage(arrayList);
  }

  public ArrayList b() {
    String str = ExceptionInVPackage.ExceptionInVPackage().c("badComPorts", "");
    ArrayList<String> arrayList = new ArrayList();
    StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
    while (stringTokenizer.hasMoreTokens()) arrayList.add(stringTokenizer.nextToken());
    return arrayList;
  }

  protected void ExceptionInVPackage(ArrayList paramArrayList) {
    String str = "";
    Iterator<String> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) str = str + (String) iterator.next() + ":";
    ExceptionInVPackage.ExceptionInVPackage().b("badComPorts", str);
    try {
      ExceptionInVPackage.ExceptionInVPackage().e();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.c("error saving user properties, trying again.");
      try {
        ExceptionInVPackage.ExceptionInVPackage().e();
        D.c("succeeded on 2nd attempt; saving user properties.");
      } catch (ExceptionInVPackage a1) {
        Logger.getLogger(R.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
      }
    }
  }

  public void b(String paramString) {
    ArrayList arrayList = b();
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (str.equals(paramString)) iterator.remove();
    }
    ExceptionInVPackage(arrayList);
  }

  public boolean c(String paramString) {
    return b().contains(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
