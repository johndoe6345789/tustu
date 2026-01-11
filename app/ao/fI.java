package ao;

import V.a;
import ak.aE;
import bH.X;
import h.i;
import java.util.ArrayList;
import java.util.List;

public class fI {
  static String a = "^|^";
  
  static String b = ",";
  
  public static void a(fH paramfH) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramfH.b()).append(a);
    stringBuilder.append(paramfH.e()).append(a);
    stringBuilder.append(paramfH.f()).append(a);
    stringBuilder.append(paramfH.g()).append(a);
    stringBuilder.append(paramfH.c()).append(a);
    stringBuilder.append(paramfH.h()).append(a);
    stringBuilder.append(paramfH.i()).append(a);
    stringBuilder.append(paramfH.j()).append(a);
    stringBuilder.append(paramfH.d()).append(a);
    stringBuilder.append(paramfH.k()).append(a);
    stringBuilder.append(paramfH.l()).append(a);
    stringBuilder.append(paramfH.m()).append(a);
    i.c("SCATTER_PLOT_VIEW_" + paramfH.a(), stringBuilder.toString());
  }
  
  public static fH a(String paramString) {
    String str = i.f("SCATTER_PLOT_VIEW_" + paramString, null);
    if (str == null)
      return null; 
    fH fH = new fH(paramString);
    try {
      aE aE = new aE(str, a);
      if (aE.a())
        fH.b(aE.b()); 
      if (aE.a())
        fH.a(Double.parseDouble(aE.b())); 
      if (aE.a())
        fH.b(Double.parseDouble(aE.b())); 
      if (aE.a())
        fH.a(Boolean.valueOf(aE.b()).booleanValue()); 
      if (aE.a())
        fH.c(aE.b()); 
      if (aE.a())
        fH.c(Double.parseDouble(aE.b())); 
      if (aE.a())
        fH.d(Double.parseDouble(aE.b())); 
      if (aE.a())
        fH.b(Boolean.valueOf(aE.b()).booleanValue()); 
      if (aE.a())
        fH.d(aE.b()); 
      if (aE.a())
        fH.e(Double.parseDouble(aE.b())); 
      if (aE.a())
        fH.f(Double.parseDouble(aE.b())); 
      if (aE.a())
        fH.c(Boolean.valueOf(aE.b()).booleanValue()); 
      return fH;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Unable to load Histogram View: " + paramString);
    } 
  }
  
  public static List a() {
    String[] arrayOfString = i.f("SCATTER_PLOT_VIEW_");
    ArrayList<String> arrayList = new ArrayList();
    arrayOfString = X.a(arrayOfString);
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayList.add(X.b(arrayOfString[b], "SCATTER_PLOT_VIEW_", "")); 
    return arrayList;
  }
  
  public static void b(String paramString) {
    i.d("SCATTER_PLOT_VIEW_" + paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */