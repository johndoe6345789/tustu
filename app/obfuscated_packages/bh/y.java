package bh;

import G.R;
import G.T;
import G.ac;
import G.ah;
import bB.a;
import bB.b;
import bB.r;
import bH.X;
import h.i;
import java.util.Iterator;

public class y implements b {
  public r a(String paramString) {
    String str = i.a("FIELD_MIN_MAX_" + paramString, null);
    a a = new a();
    a.a(paramString);
    if (str != null && str.indexOf(";") != -1) {
      try {
        String[] arrayOfString = str.split(";");
        String str1 = arrayOfString[0];
        String str2 = (arrayOfString.length > 1) ? arrayOfString[1] : "Auto";
        String str3 = (arrayOfString.length > 2) ? arrayOfString[2] : "Auto";
        if (str1.contains("Auto")) {
          a.a(Double.NaN);
        } else {
          a.a(Double.parseDouble(str1));
        } 
        if (str2.contains("Auto")) {
          a.b(Double.NaN);
        } else {
          a.b(Double.parseDouble(str2));
        } 
        if (str3.contains("Auto")) {
          a.a(-1);
        } else {
          a.a(Integer.parseInt(str3));
        } 
      } catch (Exception exception) {}
    } else {
      ah ah = b(paramString);
      if (ah != null) {
        a.a(ah.a());
        a.b(ah.d());
        a.a(ah.l());
      } else {
        a.a(Double.NaN);
        a.b(Double.NaN);
        a.a(-1);
      } 
    } 
    return (r)a;
  }
  
  public r a(r paramr) {
    a a = null;
    String str = i.c("FIELD_MIN_MAX_" + paramr.e());
    if (str != null)
      try {
        a = new a();
        a.a(paramr.e());
        String[] arrayOfString = str.split(";");
        String str1 = arrayOfString[0];
        String str2 = (arrayOfString.length > 1) ? arrayOfString[1] : "Auto";
        String str3 = (arrayOfString.length > 2) ? arrayOfString[2] : "Auto";
        if (str1.contains("Auto")) {
          a.a(Double.NaN);
        } else {
          a.a(Double.parseDouble(str1));
        } 
        if (str2.contains("Auto")) {
          a.b(Double.NaN);
        } else {
          a.b(Double.parseDouble(str2));
        } 
        if (str3.contains("Auto")) {
          a.a(-1);
        } else {
          a.a(Integer.parseInt(str3));
        } 
      } catch (Exception exception) {
        return null;
      }  
    a = new a();
    a.a(paramr.e());
    ah ah = b(paramr.e());
    if (ah != null) {
      a.a(ah.a());
      a.b(ah.d());
      a.a(ah.l());
    } else {
      a.a(Double.NaN);
      a.b(Double.NaN);
      a.a(-1);
    } 
    return (r)a;
  }
  
  private ah b(String paramString) {
    if (paramString.contains(".")) {
      String str1 = paramString.substring(0, paramString.indexOf('.'));
      String str2 = paramString.substring(paramString.indexOf('.') + 1);
      R r1 = T.a().c(str1);
      if (r1 != null) {
        ac ac1 = a(r1, str2);
        if (ac1 != null) {
          ah ah = b(r1, ac1.a());
          if (ah != null)
            return ah; 
        } 
      } 
    } 
    R r = T.a().c();
    ac ac = a(r, paramString);
    return (ac != null && ac.a() != null && !ac.a().isEmpty()) ? b(r, ac.a()) : null;
  }
  
  private ac a(R paramR, String paramString) {
    for (ac ac : paramR.g()) {
      String str = X.b(ac.b(), "-", " ");
      if (str.equals(paramString))
        return ac; 
    } 
    return null;
  }
  
  private ah b(R paramR, String paramString) {
    Iterator<ah> iterator = paramR.B();
    while (iterator.hasNext()) {
      ah ah = iterator.next();
      if (ah.i().equals(paramString))
        return ah; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */