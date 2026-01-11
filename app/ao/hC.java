package ao;

import V.a;
import ak.aE;
import bH.D;
import bH.X;
import h.i;
import java.util.ArrayList;
import java.util.List;

public class hC {
  static String a = "^|^";
  
  static String b = ",";
  
  public static void a(hD paramhD) {
    if (paramhD.c().equals(" ") && paramhD.d().equals(" ") && paramhD.e().equals(" "))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramhD.a()).append(a);
    stringBuilder.append(paramhD.b()).append(a);
    stringBuilder.append(paramhD.j()).append(a);
    stringBuilder.append(paramhD.k()).append(a);
    stringBuilder.append(paramhD.l()).append(a);
    stringBuilder.append(paramhD.c()).append(a);
    stringBuilder.append(paramhD.d()).append(a);
    stringBuilder.append(paramhD.e()).append(a);
    stringBuilder.append(paramhD.h()).append(a);
    if (paramhD.f() == null || paramhD.g() == null)
      throw new a("Can not save without X & Y Axis."); 
    byte b;
    for (b = 0; b < (paramhD.f()).length; b++) {
      stringBuilder.append(paramhD.f()[b]);
      if (b < (paramhD.f()).length - 1)
        stringBuilder.append(b); 
    } 
    stringBuilder.append(a);
    for (b = 0; b < (paramhD.g()).length; b++) {
      stringBuilder.append(paramhD.g()[b]);
      if (b < (paramhD.g()).length - 1)
        stringBuilder.append(b); 
    } 
    stringBuilder.append(a);
    stringBuilder.append(paramhD.m());
    stringBuilder.append(a);
    stringBuilder.append(paramhD.n());
    stringBuilder.append(a);
    stringBuilder.append(paramhD.o());
    stringBuilder.append(a);
    stringBuilder.append(paramhD.p());
    stringBuilder.append(a);
    stringBuilder.append(paramhD.q());
    stringBuilder.append(a);
    stringBuilder.append(paramhD.r());
    i.c("TABLE_GEN_VIEW_" + paramhD.i(), stringBuilder.toString());
  }
  
  public static hD a(String paramString) {
    String str = i.f("TABLE_GEN_VIEW_" + paramString, null);
    if (str == null)
      return null; 
    hD hD = new hD();
    try {
      aE aE = new aE(str, a);
      hD.a(Integer.parseInt(aE.b()));
      hD.b(Integer.parseInt(aE.b()));
      hD.c(Integer.parseInt(aE.b()));
      hD.d(Integer.parseInt(aE.b()));
      hD.e(Integer.parseInt(aE.b()));
      hD.a(aE.b());
      hD.b(aE.b());
      hD.c(aE.b());
      hD.d(aE.b());
      String[] arrayOfString1 = X.c(aE.b(), b);
      hD.a(arrayOfString1);
      String[] arrayOfString2 = X.c(aE.b(), b);
      String[] arrayOfString3 = new String[arrayOfString2.length];
      for (byte b = 0; b < arrayOfString3.length; b++)
        arrayOfString3[b] = arrayOfString2[arrayOfString2.length - 1 - b]; 
      hD.b(arrayOfString2);
      if (aE.a())
        hD.f(aE.b()); 
      if (aE.a()) {
        try {
          hD.f(Integer.parseInt(aE.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Color Mode");
          exception.printStackTrace();
        } 
        try {
          hD.g(Integer.parseInt(aE.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Display Mode");
          exception.printStackTrace();
        } 
        hD.g(aE.b());
        try {
          hD.h(Integer.parseInt(aE.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Min Window Weight");
          exception.printStackTrace();
        } 
        try {
          hD.i(Integer.parseInt(aE.b()));
        } catch (Exception exception) {
          D.c("Failed to parse Min Total Weight");
          exception.printStackTrace();
        } 
      } 
      return hD;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Unable to load Histogram View: " + paramString);
    } 
  }
  
  public static List a() {
    String[] arrayOfString = i.f("TABLE_GEN_VIEW_");
    ArrayList<String> arrayList = new ArrayList();
    arrayOfString = X.a(arrayOfString);
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayList.add(X.b(arrayOfString[b], "TABLE_GEN_VIEW_", "")); 
    return arrayList;
  }
  
  public static void b(String paramString) {
    i.d("TABLE_GEN_VIEW_" + paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */