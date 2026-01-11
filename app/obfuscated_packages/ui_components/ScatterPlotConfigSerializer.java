package ao;

import V.ExceptionInVPackage;
import ak.aE;
import bH.X;
import h.IOProperties;
import java.util.ArrayList;
import java.util.List;

public class fI {
  static String ExceptionInVPackage = "^|^";
  
  static String b = ",";
  
  public static void ExceptionInVPackage(fH paramfH) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramfH.b()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.e()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.f()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.g()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.c()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.h()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.IOProperties()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.j()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.d()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.k()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.l()).append(ExceptionInVPackage);
    stringBuilder.append(paramfH.m()).append(ExceptionInVPackage);
    IOProperties.c("SCATTER_PLOT_VIEW_" + paramfH.ExceptionInVPackage(), stringBuilder.toString());
  }
  
  public static fH ExceptionInVPackage(String paramString) {
    String str = IOProperties.f("SCATTER_PLOT_VIEW_" + paramString, null);
    if (str == null)
      return null; 
    fH fH = new fH(paramString);
    try {
      aE aE = new aE(str, ExceptionInVPackage);
      if (aE.ExceptionInVPackage())
        fH.b(aE.b()); 
      if (aE.ExceptionInVPackage())
        fH.ExceptionInVPackage(Double.parseDouble(aE.b())); 
      if (aE.ExceptionInVPackage())
        fH.b(Double.parseDouble(aE.b())); 
      if (aE.ExceptionInVPackage())
        fH.ExceptionInVPackage(Boolean.valueOf(aE.b()).booleanValue()); 
      if (aE.ExceptionInVPackage())
        fH.c(aE.b()); 
      if (aE.ExceptionInVPackage())
        fH.c(Double.parseDouble(aE.b())); 
      if (aE.ExceptionInVPackage())
        fH.d(Double.parseDouble(aE.b())); 
      if (aE.ExceptionInVPackage())
        fH.b(Boolean.valueOf(aE.b()).booleanValue()); 
      if (aE.ExceptionInVPackage())
        fH.d(aE.b()); 
      if (aE.ExceptionInVPackage())
        fH.e(Double.parseDouble(aE.b())); 
      if (aE.ExceptionInVPackage())
        fH.f(Double.parseDouble(aE.b())); 
      if (aE.ExceptionInVPackage())
        fH.c(Boolean.valueOf(aE.b()).booleanValue()); 
      return fH;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Unable to load Histogram View: " + paramString);
    } 
  }
  
  public static List ExceptionInVPackage() {
    String[] arrayOfString = IOProperties.f("SCATTER_PLOT_VIEW_");
    ArrayList<String> arrayList = new ArrayList();
    arrayOfString = X.ExceptionInVPackage(arrayOfString);
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayList.add(X.b(arrayOfString[b], "SCATTER_PLOT_VIEW_", "")); 
    return arrayList;
  }
  
  public static void b(String paramString) {
    IOProperties.d("SCATTER_PLOT_VIEW_" + paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */