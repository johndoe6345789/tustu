package bh;

import G.R;
import G.T;
import G.ac;
import G.ah;
import bB.BbInterfaceAlpha;
import bB.BbInterfaceBravo;
import bB.BbInterfaceRomeo;
import bH.X;
import h.IOProperties;
import java.util.Iterator;

public class BhInterfaceYankee implements BbInterfaceBravo {
  public BbInterfaceRomeo BbInterfaceAlpha(String paramString) {
    String str = IOProperties.BbInterfaceAlpha("FIELD_MIN_MAX_" + paramString, null);
    BbInterfaceAlpha BbInterfaceAlpha = new BbInterfaceAlpha();
    BbInterfaceAlpha.BbInterfaceAlpha(paramString);
    if (str != null && str.indexOf(";") != -1) {
      try {
        String[] arrayOfString = str.split(";");
        String str1 = arrayOfString[0];
        String str2 = (arrayOfString.length > 1) ? arrayOfString[1] : "Auto";
        String str3 = (arrayOfString.length > 2) ? arrayOfString[2] : "Auto";
        if (str1.contains("Auto")) {
          BbInterfaceAlpha.BbInterfaceAlpha(Double.NaN);
        } else {
          BbInterfaceAlpha.BbInterfaceAlpha(Double.parseDouble(str1));
        } 
        if (str2.contains("Auto")) {
          BbInterfaceAlpha.BbInterfaceBravo(Double.NaN);
        } else {
          BbInterfaceAlpha.BbInterfaceBravo(Double.parseDouble(str2));
        } 
        if (str3.contains("Auto")) {
          BbInterfaceAlpha.BbInterfaceAlpha(-1);
        } else {
          BbInterfaceAlpha.BbInterfaceAlpha(Integer.parseInt(str3));
        } 
      } catch (Exception exception) {}
    } else {
      ah ah = BbInterfaceBravo(paramString);
      if (ah != null) {
        BbInterfaceAlpha.BbInterfaceAlpha(ah.BbInterfaceAlpha());
        BbInterfaceAlpha.BbInterfaceBravo(ah.d());
        BbInterfaceAlpha.BbInterfaceAlpha(ah.l());
      } else {
        BbInterfaceAlpha.BbInterfaceAlpha(Double.NaN);
        BbInterfaceAlpha.BbInterfaceBravo(Double.NaN);
        BbInterfaceAlpha.BbInterfaceAlpha(-1);
      } 
    } 
    return (BbInterfaceRomeo)BbInterfaceAlpha;
  }
  
  public BbInterfaceRomeo BbInterfaceAlpha(BbInterfaceRomeo paramr) {
    BbInterfaceAlpha BbInterfaceAlpha = null;
    String str = IOProperties.c("FIELD_MIN_MAX_" + paramr.e());
    if (str != null)
      try {
        BbInterfaceAlpha = new BbInterfaceAlpha();
        BbInterfaceAlpha.BbInterfaceAlpha(paramr.e());
        String[] arrayOfString = str.split(";");
        String str1 = arrayOfString[0];
        String str2 = (arrayOfString.length > 1) ? arrayOfString[1] : "Auto";
        String str3 = (arrayOfString.length > 2) ? arrayOfString[2] : "Auto";
        if (str1.contains("Auto")) {
          BbInterfaceAlpha.BbInterfaceAlpha(Double.NaN);
        } else {
          BbInterfaceAlpha.BbInterfaceAlpha(Double.parseDouble(str1));
        } 
        if (str2.contains("Auto")) {
          BbInterfaceAlpha.BbInterfaceBravo(Double.NaN);
        } else {
          BbInterfaceAlpha.BbInterfaceBravo(Double.parseDouble(str2));
        } 
        if (str3.contains("Auto")) {
          BbInterfaceAlpha.BbInterfaceAlpha(-1);
        } else {
          BbInterfaceAlpha.BbInterfaceAlpha(Integer.parseInt(str3));
        } 
      } catch (Exception exception) {
        return null;
      }  
    BbInterfaceAlpha = new BbInterfaceAlpha();
    BbInterfaceAlpha.BbInterfaceAlpha(paramr.e());
    ah ah = BbInterfaceBravo(paramr.e());
    if (ah != null) {
      BbInterfaceAlpha.BbInterfaceAlpha(ah.BbInterfaceAlpha());
      BbInterfaceAlpha.BbInterfaceBravo(ah.d());
      BbInterfaceAlpha.BbInterfaceAlpha(ah.l());
    } else {
      BbInterfaceAlpha.BbInterfaceAlpha(Double.NaN);
      BbInterfaceAlpha.BbInterfaceBravo(Double.NaN);
      BbInterfaceAlpha.BbInterfaceAlpha(-1);
    } 
    return (BbInterfaceRomeo)BbInterfaceAlpha;
  }
  
  private ah BbInterfaceBravo(String paramString) {
    if (paramString.contains(".")) {
      String str1 = paramString.substring(0, paramString.indexOf('.'));
      String str2 = paramString.substring(paramString.indexOf('.') + 1);
      R r1 = T.BbInterfaceAlpha().c(str1);
      if (r1 != null) {
        ac ac1 = BbInterfaceAlpha(r1, str2);
        if (ac1 != null) {
          ah ah = BbInterfaceBravo(r1, ac1.BbInterfaceAlpha());
          if (ah != null)
            return ah; 
        } 
      } 
    } 
    R BbInterfaceRomeo = T.BbInterfaceAlpha().c();
    ac ac = BbInterfaceAlpha(BbInterfaceRomeo, paramString);
    return (ac != null && ac.BbInterfaceAlpha() != null && !ac.BbInterfaceAlpha().isEmpty()) ? BbInterfaceBravo(BbInterfaceRomeo, ac.BbInterfaceAlpha()) : null;
  }
  
  private ac BbInterfaceAlpha(R paramR, String paramString) {
    for (ac ac : paramR.g()) {
      String str = X.BbInterfaceBravo(ac.BbInterfaceBravo(), "-", " ");
      if (str.equals(paramString))
        return ac; 
    } 
    return null;
  }
  
  private ah BbInterfaceBravo(R paramR, String paramString) {
    Iterator<ah> iterator = paramR.B();
    while (iterator.hasNext()) {
      ah ah = iterator.next();
      if (ah.IOProperties().equals(paramString))
        return ah; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */