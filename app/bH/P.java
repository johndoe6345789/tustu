package bH;

import bV.a;
import bV.c;
import bV.d;
import bV.e;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import s.g;

public class P {
  public static String a = "IniUpdate";
  
  public static String b = "IncUpdate";
  
  long c = 604800000L;
  
  File d;
  
  String e;
  
  public P(File paramFile, String paramString) {
    this.d = paramFile;
    this.e = paramString;
  }
  
  public void a() {
    String str = a.aR + this.e;
    long l1 = a.a().a(str, (new Date()).getTime() - this.c - 1L);
    long l2 = System.currentTimeMillis() - l1;
    if (l2 > this.c) {
      Q q = new Q(this);
      q.start();
    } else {
      D.d("Skipping " + this.e + " update check. Not due for " + (l2 / 8.64E7D) + " days");
    } 
  }
  
  private boolean b() {
    a a = new a();
    d d = null;
    String str = this.e;
    if (n.a()) {
      try {
        e e = new e();
        e.a(a.a().c(a.aN, ""));
        e.b(a.b);
        e.c(a.a().c(str, "0"));
        e.d(a.a().c(a.aO, ""));
        e.e(a.a().c(a.aT, ""));
        e.f(a.a().c(a.cF, ""));
        e.g(this.e);
        e.h(a.a().c(a.cO, ""));
        e.i(g.c().getLanguage());
        d = a.a(e);
      } catch (IOException iOException) {
        System.out.println("Unable to read from update server, connection to server unavailable");
        return false;
      } 
    } else {
      return false;
    } 
    if (d == null)
      return false; 
    if (d.a() == 0) {
      D.d(this.e + ": No updates available.");
      return true;
    } 
    if (d.a() == 2) {
      D.d("Internet detected, doing update check: " + this.e);
      boolean bool = false;
      Iterator<c> iterator = d.c();
      while (iterator.hasNext()) {
        c c = iterator.next();
        if (c.a().equals("fileUpdate"))
          try {
            String str3;
            String[] arrayOfString = c.b();
            String str1 = null;
            if (arrayOfString.length > 2)
              str1 = arrayOfString[2]; 
            String str2 = arrayOfString[1];
            if (arrayOfString.length > 1 && arrayOfString[0] != null && arrayOfString[0].equals("ItDoesntMatter")) {
              str3 = arrayOfString[0];
            } else {
              str3 = str2.substring(str2.lastIndexOf("/") + 1);
            } 
            a.a(this.d, str3, str2, str1);
          } catch (IOException iOException) {
            bool = true;
            Logger.getLogger(P.class.getName()).log(Level.SEVERE, "Ini Updater failed to update file: " + c, iOException);
          }  
      } 
      if (!bool) {
        String str1 = d.b();
        str1 = X.b(str1, a.b + " Update available! Would you like Auto Update to upgrade to version ", "");
        str1 = X.b(str1, " now?", "");
        a.a().b(str, str1.trim());
        D.d(this.e + ": Update to " + str1);
      } 
      return true;
    } 
    D.d(this.e + ": No updates accessible.");
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */