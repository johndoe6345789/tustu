package v;

import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.ui.cq;
import java.awt.Component;
import java.io.File;
import java.util.HashMap;
import r.ThreadedFile;

public class VComponentBravo {
  public static HashMap a(Component[] paramArrayOfComponent) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfComponent.length; b2++) {
      if (paramArrayOfComponent[b2] instanceof Gauge) {
        Gauge gauge = (Gauge)paramArrayOfComponent[b2];
        if (gauge.getBackgroundImageFileName() != null && !gauge.getBackgroundImageFileName().equals("")) {
          String str = gauge.getBackgroundImageFileName();
          if (hashMap.get(str) == null) {
            File file = new File(str);
            String str1 = "IMG_ID_" + file.getName() + "_" + b1++;
            hashMap.put(str, str1);
            gauge.setBackgroundImageFileName(str1);
          } else {
            String str1 = (String)hashMap.get(str);
            gauge.setBackgroundImageFileName(str1);
          } 
        } 
        if (gauge.getNeedleImageFileName() != null && !gauge.getNeedleImageFileName().equals("")) {
          String str = gauge.getNeedleImageFileName();
          if (hashMap.get(str) == null) {
            File file = new File(str);
            String str1 = "IMG_ID_" + file.getName() + "_" + b1++;
            hashMap.put(str, str1);
            gauge.setNeedleImageFileName(str1);
          } else {
            String str1 = (String)hashMap.get(str);
            gauge.setNeedleImageFileName(str1);
          } 
        } 
        if (gauge.getFontFamily() != null && gauge.getFontFamily().length() > 0) {
          File file = cq.a().a(gauge.getFontFamily(), ThreadedFile.F());
          if (file != null) {
            String str = file.getAbsolutePath();
            if (hashMap.get(str) == null)
              hashMap.put(str, gauge.getFontFamily()); 
          } else {
            D.b("Font File not found for: " + gauge.getFontFamily() + ", not saved to .dash file");
          } 
        } 
      } 
      if (paramArrayOfComponent[b2] instanceof Indicator) {
        Indicator indicator = (Indicator)paramArrayOfComponent[b2];
        if (indicator.getFontFamily() != null && indicator.getFontFamily().length() > 0) {
          File file = cq.a().a(indicator.getFontFamily(), ThreadedFile.F());
          if (file != null) {
            String str = file.getAbsolutePath();
            if (hashMap.get(str) == null)
              hashMap.put(str, indicator.getFontFamily()); 
          } 
        } 
      } 
      if (paramArrayOfComponent[b2] instanceof Indicator) {
        Indicator indicator = (Indicator)paramArrayOfComponent[b2];
        if (indicator.getOnImageFileName() != null && !indicator.getOnImageFileName().equals("")) {
          String str = indicator.getOnImageFileName();
          if (hashMap.get(str) == null) {
            File file = new File(str);
            String str1 = "IMG_ID_" + file.getName() + "_" + b1++;
            hashMap.put(str, str1);
            indicator.setOnImageFileName(str1);
          } else {
            String str1 = (String)hashMap.get(str);
            indicator.setOnImageFileName(str1);
          } 
        } 
      } 
      if (paramArrayOfComponent[b2] instanceof Indicator) {
        Indicator indicator = (Indicator)paramArrayOfComponent[b2];
        if (indicator.getOffImageFileName() != null && !indicator.getOffImageFileName().equals("")) {
          String str = indicator.getOffImageFileName();
          if (hashMap.get(str) == null) {
            File file = new File(str);
            String str1 = "IMG_ID_" + file.getName() + "_" + b1++;
            hashMap.put(str, str1);
            indicator.setOffImageFileName(str1);
          } else {
            String str1 = (String)hashMap.get(str);
            indicator.setOffImageFileName(str1);
          } 
        } 
      } 
    } 
    return hashMap;
  }
  
  public static Component[] a(HashMap paramHashMap, Component[] paramArrayOfComponent) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (String str1 : paramHashMap.keySet()) {
      String str2 = (String)paramHashMap.get(str1);
      hashMap.put(str2, str1);
    } 
    return b(hashMap, paramArrayOfComponent);
  }
  
  public static Component[] b(HashMap paramHashMap, Component[] paramArrayOfComponent) {
    for (byte b1 = 0; b1 < paramArrayOfComponent.length; b1++) {
      if (paramArrayOfComponent[b1] instanceof Gauge) {
        Gauge gauge = (Gauge)paramArrayOfComponent[b1];
        if (gauge.getBackgroundImageFileName() != null && !gauge.getBackgroundImageFileName().equals("")) {
          String str = gauge.getBackgroundImageFileName();
          gauge.setBackgroundImageFileName((String)paramHashMap.get(str));
        } 
        if (gauge.getNeedleImageFileName() != null && !gauge.getNeedleImageFileName().equals("")) {
          String str = gauge.getNeedleImageFileName();
          gauge.setNeedleImageFileName((String)paramHashMap.get(str));
        } 
      } 
      if (paramArrayOfComponent[b1] instanceof Indicator) {
        Indicator indicator = (Indicator)paramArrayOfComponent[b1];
        if (indicator.getOnImageFileName() != null && !indicator.getOnImageFileName().equals("")) {
          String str = indicator.getOnImageFileName();
          indicator.setOnImageFileName((String)paramHashMap.get(str));
        } 
      } 
      if (paramArrayOfComponent[b1] instanceof Indicator) {
        Indicator indicator = (Indicator)paramArrayOfComponent[b1];
        if (indicator.getOffImageFileName() != null && !indicator.getOffImageFileName().equals("")) {
          String str = indicator.getOffImageFileName();
          indicator.setOffImageFileName((String)paramHashMap.get(str));
        } 
      } 
    } 
    return paramArrayOfComponent;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */