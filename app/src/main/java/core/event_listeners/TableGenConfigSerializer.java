package ao;

import V.ExceptionInVPackage;
import ak.AkInterfaceAe;
import bH.D;
import bH.X;
import h.IOProperties;
import java.util.ArrayList;
import java.util.List;

public class hC {
  static String ExceptionInVPackage = "^|^";

  static String b = ",";

  public static void ExceptionInVPackage(hD paramhD) {
    if (paramhD.c().equals(" ") && paramhD.d().equals(" ") && paramhD.e().equals(" ")) return;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramhD.ExceptionInVPackage()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.b()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.j()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.k()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.l()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.c()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.d()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.e()).append(ExceptionInVPackage);
    stringBuilder.append(paramhD.h()).append(ExceptionInVPackage);
    if (paramhD.f() == null || paramhD.g() == null)
      throw new ExceptionInVPackage("Can not save without X & Y Axis.");
    byte b;
    for (b = 0; b < (paramhD.f()).length; b++) {
      stringBuilder.append(paramhD.f()[b]);
      if (b < (paramhD.f()).length - 1) stringBuilder.append(b);
    }
    stringBuilder.append(ExceptionInVPackage);
    for (b = 0; b < (paramhD.g()).length; b++) {
      stringBuilder.append(paramhD.g()[b]);
      if (b < (paramhD.g()).length - 1) stringBuilder.append(b);
    }
    stringBuilder.append(ExceptionInVPackage);
    stringBuilder.append(paramhD.m());
    stringBuilder.append(ExceptionInVPackage);
    stringBuilder.append(paramhD.n());
    stringBuilder.append(ExceptionInVPackage);
    stringBuilder.append(paramhD.o());
    stringBuilder.append(ExceptionInVPackage);
    stringBuilder.append(paramhD.p());
    stringBuilder.append(ExceptionInVPackage);
    stringBuilder.append(paramhD.q());
    stringBuilder.append(ExceptionInVPackage);
    stringBuilder.append(paramhD.r());
    IOProperties.c("TABLE_GEN_VIEW_" + paramhD.IOProperties(), stringBuilder.toString());
  }

  public static hD ExceptionInVPackage(String paramString) {
    String str = IOProperties.f("TABLE_GEN_VIEW_" + paramString, null);
    if (str == null) return null;
    hD hD = new hD();
    try {
      AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(str, ExceptionInVPackage);
      hD.ExceptionInVPackage(Integer.parseInt(AkInterfaceAe.b()));
      hD.b(Integer.parseInt(AkInterfaceAe.b()));
      hD.c(Integer.parseInt(AkInterfaceAe.b()));
      hD.d(Integer.parseInt(AkInterfaceAe.b()));
      hD.e(Integer.parseInt(AkInterfaceAe.b()));
      hD.ExceptionInVPackage(AkInterfaceAe.b());
      hD.b(AkInterfaceAe.b());
      hD.c(AkInterfaceAe.b());
      hD.d(AkInterfaceAe.b());
      String[] arrayOfString1 = X.c(AkInterfaceAe.b(), b);
      hD.ExceptionInVPackage(arrayOfString1);
      String[] arrayOfString2 = X.c(AkInterfaceAe.b(), b);
      String[] arrayOfString3 = new String[arrayOfString2.length];
      for (byte b = 0; b < arrayOfString3.length; b++)
        arrayOfString3[b] = arrayOfString2[arrayOfString2.length - 1 - b];
      hD.b(arrayOfString2);
      if (AkInterfaceAe.ExceptionInVPackage()) hD.f(AkInterfaceAe.b());
      if (AkInterfaceAe.ExceptionInVPackage()) {
        try {
          hD.f(Integer.parseInt(AkInterfaceAe.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Color Mode");
          exception.printStackTrace();
        }
        try {
          hD.g(Integer.parseInt(AkInterfaceAe.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Display Mode");
          exception.printStackTrace();
        }
        hD.g(AkInterfaceAe.b());
        try {
          hD.h(Integer.parseInt(AkInterfaceAe.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Min Window Weight");
          exception.printStackTrace();
        }
        try {
          hD.IOProperties(Integer.parseInt(AkInterfaceAe.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Min Total Weight");
          exception.printStackTrace();
        }
      }
      return hD;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Unable to load Histogram View: " + paramString);
    }
  }

  public static List ExceptionInVPackage() {
    String[] arrayOfString = IOProperties.f("TABLE_GEN_VIEW_");
    ArrayList<String> arrayList = new ArrayList();
    arrayOfString = X.ExceptionInVPackage(arrayOfString);
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayList.add(X.b(arrayOfString[b], "TABLE_GEN_VIEW_", ""));
    return arrayList;
  }

  public static void b(String paramString) {
    IOProperties.d("TABLE_GEN_VIEW_" + paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
