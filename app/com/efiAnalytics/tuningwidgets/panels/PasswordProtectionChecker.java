package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.aM;
import G.bv;
import V.g;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import r.a;

public class PasswordProtectionChecker {
  static Map a = new HashMap<>();
  
  static int b = a.a().b(a.ag, 10) * 60000;
  
  public static boolean a(R paramR, bv parambv, Component paramComponent) {
    List list = parambv.ab();
    for (String str : list) {
      aM aM = paramR.c(str);
      if (aM == null) {
        bV.d("Password Protection is not configured correctly for this Dialog.", paramComponent);
        continue;
      } 
      long l = 0L;
      try {
        l = (long)aM.j(paramR.h());
      } catch (g g) {
        Logger.getLogger(PasswordProtectionChecker.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        bV.d("Error Checking Password!!! See Log for details.", paramComponent);
        return false;
      } 
      if (l != 0L) {
        Long long_ = (Long)a.get(Long.valueOf(l));
        if (long_ != null && System.currentTimeMillis() - long_.longValue() < b) {
          a.put(Long.valueOf(l), Long.valueOf(System.currentTimeMillis()));
          return true;
        } 
        String str1 = parambv.M() + " is Password protected. Enter the password.";
        while (true) {
          String str2 = bV.a(paramComponent, str1);
          if (str2 == null)
            return false; 
          CRC32 cRC32 = new CRC32();
          cRC32.reset();
          cRC32.update(str2.getBytes());
          if (cRC32.getValue() == l) {
            a.put(Long.valueOf(l), Long.valueOf(System.currentTimeMillis()));
            return true;
          } 
          bV.d("Invalid Password", paramComponent);
        } 
      } 
    } 
    return true;
  }
  
  public static boolean a(R paramR, bv parambv) {
    List list = parambv.ab();
    for (String str : list) {
      aM aM = paramR.c(str);
      if (aM == null) {
        D.b("Password Protection is not configured correctly for this Dialog.");
        continue;
      } 
      long l = 0L;
      try {
        l = (long)aM.j(paramR.h());
      } catch (g g) {
        Logger.getLogger(PasswordProtectionChecker.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        return false;
      } 
      return (l != 0L);
    } 
    return false;
  }
  
  public static void a(int paramInt) {
    b = paramInt * 60000;
  }
  
  public static void a() {
    a.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */