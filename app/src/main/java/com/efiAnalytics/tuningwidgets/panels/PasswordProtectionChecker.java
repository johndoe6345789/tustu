package com.efiAnalytics.tuningwidgets.panels;

import G.ArrayListExceptionprintstacktraceInGPackage;
import G.Manager;
import G.R;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import r.IOPropertiesUsingFile;

public class PasswordProtectionChecker {
  static Map IOPropertiesUsingFile = new HashMap<>();

  static int b =
      IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.ag, 10) * 60000;

  public static boolean IOPropertiesUsingFile(
      R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, Component paramComponent) {
    List list = parambv.ab();
    for (String str : list) {
      Manager Manager = paramR.c(str);
      if (Manager == null) {
        bV.d("Password Protection is not configured correctly for this Dialog.", paramComponent);
        continue;
      }
      long l = 0L;
      try {
        l = (long) Manager.j(paramR.h());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(PasswordProtectionChecker.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        bV.d("Error Checking Password!!! See Log for details.", paramComponent);
        return false;
      }
      if (l != 0L) {
        Long long_ = (Long) IOPropertiesUsingFile.get(Long.valueOf(l));
        if (long_ != null && System.currentTimeMillis() - long_.longValue() < b) {
          IOPropertiesUsingFile.put(Long.valueOf(l), Long.valueOf(System.currentTimeMillis()));
          return true;
        }
        String str1 = parambv.M() + " is Password protected. Enter the password.";
        while (true) {
          String str2 = bV.IOPropertiesUsingFile(paramComponent, str1);
          if (str2 == null) return false;
          CRC32 cRC32 = new CRC32();
          cRC32.reset();
          cRC32.update(str2.getBytes());
          if (cRC32.getValue() == l) {
            IOPropertiesUsingFile.put(Long.valueOf(l), Long.valueOf(System.currentTimeMillis()));
            return true;
          }
          bV.d("Invalid Password", paramComponent);
        }
      }
    }
    return true;
  }

  public static boolean IOPropertiesUsingFile(
      R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    List list = parambv.ab();
    for (String str : list) {
      Manager Manager = paramR.c(str);
      if (Manager == null) {
        D.b("Password Protection is not configured correctly for this Dialog.");
        continue;
      }
      long l = 0L;
      try {
        l = (long) Manager.j(paramR.h());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(PasswordProtectionChecker.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        return false;
      }
      return (l != 0L);
    }
    return false;
  }

  public static void IOPropertiesUsingFile(int paramInt) {
    b = paramInt * 60000;
  }

  public static void IOPropertiesUsingFile() {
    IOPropertiesUsingFile.clear();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
