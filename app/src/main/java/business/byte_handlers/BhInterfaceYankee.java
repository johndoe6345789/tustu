package business.byte_handlers;

import G.R;
import G.T;
import G.SerializableImplExceptionprintstacktrace;
import G.GInterfaceAh;
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
      GInterfaceAh GInterfaceAh = BbInterfaceBravo(paramString);
      if (GInterfaceAh != null) {
        BbInterfaceAlpha.BbInterfaceAlpha(GInterfaceAh.BbInterfaceAlpha());
        BbInterfaceAlpha.BbInterfaceBravo(GInterfaceAh.d());
        BbInterfaceAlpha.BbInterfaceAlpha(GInterfaceAh.l());
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
    GInterfaceAh GInterfaceAh = BbInterfaceBravo(paramr.e());
    if (GInterfaceAh != null) {
      BbInterfaceAlpha.BbInterfaceAlpha(GInterfaceAh.BbInterfaceAlpha());
      BbInterfaceAlpha.BbInterfaceBravo(GInterfaceAh.d());
      BbInterfaceAlpha.BbInterfaceAlpha(GInterfaceAh.l());
    } else {
      BbInterfaceAlpha.BbInterfaceAlpha(Double.NaN);
      BbInterfaceAlpha.BbInterfaceBravo(Double.NaN);
      BbInterfaceAlpha.BbInterfaceAlpha(-1);
    } 
    return (BbInterfaceRomeo)BbInterfaceAlpha;
  }
  
  private GInterfaceAh BbInterfaceBravo(String paramString) {
    if (paramString.contains(".")) {
      String str1 = paramString.substring(0, paramString.indexOf('.'));
      String str2 = paramString.substring(paramString.indexOf('.') + 1);
      R r1 = T.BbInterfaceAlpha().c(str1);
      if (r1 != null) {
        SerializableImplExceptionprintstacktrace ac1 = BbInterfaceAlpha(r1, str2);
        if (ac1 != null) {
          GInterfaceAh GInterfaceAh = BbInterfaceBravo(r1, ac1.BbInterfaceAlpha());
          if (GInterfaceAh != null)
            return GInterfaceAh; 
        } 
      } 
    } 
    R BbInterfaceRomeo = T.BbInterfaceAlpha().c();
    SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace = BbInterfaceAlpha(BbInterfaceRomeo, paramString);
    return (SerializableImplExceptionprintstacktrace != null && SerializableImplExceptionprintstacktrace.BbInterfaceAlpha() != null && !SerializableImplExceptionprintstacktrace.BbInterfaceAlpha().isEmpty()) ? BbInterfaceBravo(BbInterfaceRomeo, SerializableImplExceptionprintstacktrace.BbInterfaceAlpha()) : null;
  }
  
  private SerializableImplExceptionprintstacktrace BbInterfaceAlpha(R paramR, String paramString) {
    for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace : paramR.g()) {
      String str = X.BbInterfaceBravo(SerializableImplExceptionprintstacktrace.BbInterfaceBravo(), "-", " ");
      if (str.equals(paramString))
        return SerializableImplExceptionprintstacktrace; 
    } 
    return null;
  }
  
  private GInterfaceAh BbInterfaceBravo(R paramR, String paramString) {
    Iterator<GInterfaceAh> iterator = paramR.B();
    while (iterator.hasNext()) {
      GInterfaceAh GInterfaceAh = iterator.next();
      if (GInterfaceAh.IOProperties().equals(paramString))
        return GInterfaceAh; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */