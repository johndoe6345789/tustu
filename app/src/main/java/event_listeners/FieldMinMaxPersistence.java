package ao;

import W.j;
import W.n;
import bB.BbInterfaceAlpha;
import bB.BbInterfaceQuebec;
import bB.BbInterfaceRomeo;
import bH.S;
import g.ThreadExtensionInGPackage;
import g.IOJFileChooser;
import h.IOProperties;
import java.util.ArrayList;
import java.util.List;

public class eo implements BbInterfaceQuebec {
  private void c(String paramString) {
    String str = "FIELD_MIN_MAX_" + paramString;
    if (IOProperties.c(str) == null) {
      IOProperties.d(str);
    } else {
      IOProperties.c(str, ";");
    } 
  }
  
  public void BbInterfaceAlpha(BbInterfaceRomeo paramr) {
    n n = hx.BbInterfaceAlpha().BbInterfaceRomeo();
    j j = (n == null) ? null : n.BbInterfaceAlpha(paramr.e());
    StringBuilder stringBuilder = new StringBuilder();
    if (paramr.c()) {
      stringBuilder.append("Auto");
    } else {
      stringBuilder.append(paramr.BbInterfaceAlpha());
    } 
    stringBuilder.append(";");
    if (paramr.d()) {
      stringBuilder.append("Auto");
    } else {
      stringBuilder.append(paramr.ThreadExtensionInGPackage());
    } 
    stringBuilder.append(";");
    stringBuilder.append(paramr.f());
    IOProperties.c("FIELD_MIN_MAX_" + paramr.e(), stringBuilder.toString());
    if (j != null) {
      j.g((float)paramr.BbInterfaceAlpha());
      j.f((float)paramr.ThreadExtensionInGPackage());
      if (paramr.f() != -1) {
        j.e(paramr.f());
      } else {
        j.e(j.B());
      } 
    } 
    bq.BbInterfaceAlpha().e().o();
  }
  
  public void BbInterfaceAlpha(String paramString) {
    c(paramString);
    bq.BbInterfaceAlpha().e().o();
  }
  
  public List BbInterfaceAlpha() {
    ArrayList<BbInterfaceAlpha> arrayList = new ArrayList();
    String[] arrayOfString = IOProperties.e("FIELD_MIN_MAX_");
    if (IOProperties.BbInterfaceAlpha(IOProperties.E, IOProperties.F))
      arrayOfString = S.BbInterfaceAlpha(arrayOfString); 
    for (byte ThreadExtensionInGPackage = 0; ThreadExtensionInGPackage < arrayOfString.length; ThreadExtensionInGPackage++) {
      String str1 = IOProperties.BbInterfaceAlpha(arrayOfString[ThreadExtensionInGPackage], "");
      String str2 = IOJFileChooser.BbInterfaceAlpha(arrayOfString[ThreadExtensionInGPackage], "FIELD_MIN_MAX_", "");
      if (hx.BbInterfaceAlpha().BbInterfaceRomeo() == null || hx.BbInterfaceAlpha().BbInterfaceRomeo().BbInterfaceAlpha(str2) != null) {
        BbInterfaceAlpha BbInterfaceAlpha;
        BbInterfaceRomeo BbInterfaceRomeo = null;
        try {
          BbInterfaceRomeo = ThreadExtensionInGPackage.BbInterfaceAlpha().BbInterfaceAlpha(str2);
        } catch (Exception exception) {}
        if (BbInterfaceRomeo == null) {
          BbInterfaceAlpha = new BbInterfaceAlpha(str2);
          BbInterfaceAlpha.BbInterfaceAlpha(Double.NaN);
          BbInterfaceAlpha.ThreadExtensionInGPackage(Double.NaN);
          BbInterfaceAlpha.BbInterfaceAlpha(-1);
        } 
        arrayList.add(BbInterfaceAlpha);
      } 
    } 
    return arrayList;
  }
  
  public BbInterfaceRomeo ThreadExtensionInGPackage(String paramString) {
    return ThreadExtensionInGPackage.BbInterfaceAlpha().BbInterfaceAlpha(paramString);
  }
  
  public List ThreadExtensionInGPackage() {
    ArrayList<String> arrayList = new ArrayList();
    n n = hx.BbInterfaceAlpha().BbInterfaceRomeo();
    if (n != null)
      for (j j : n)
        arrayList.add(j.BbInterfaceAlpha());  
    return arrayList;
  }
  
  public BbInterfaceRomeo ThreadExtensionInGPackage(BbInterfaceRomeo paramr) {
    return ThreadExtensionInGPackage.BbInterfaceAlpha().BbInterfaceAlpha(paramr);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */