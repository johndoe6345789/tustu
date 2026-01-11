package aP;

import V.a;
import bH.A;
import bH.D;
import bH.X;
import bH.ae;
import bH.t;
import bV.a;
import bV.d;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import r.a;
import r.i;

public class iS {
  long a = 604800000L;
  
  static String b = "startScreenVersions.";
  
  String c = "1.5";
  
  iU d = null;
  
  public void a(File paramFile, String paramString, iV paramiV) {
    String str1 = a.aR + "." + paramString;
    String str2 = X.b(a.c, i.c, "").trim() + paramString;
    String str3 = b + paramString;
    String str4 = a.a().c(str3, this.c);
    long l1 = System.currentTimeMillis() - this.a;
    long l2 = a.a().a(str1, -1L);
    boolean bool = (a.a().c(a.aQ, true) || !A.i().a(a.a().c(a.cF, ""))) ? true : false;
    if (l2 < l1 && bool) {
      try {
        a a = new a();
        d d = null;
        try {
          d = a.a(a.a().c(a.aN, ""), a.b, str4, a.a().c(a.aO, ""), a.a().c(a.aT, ""), a.a().c(a.cF, ""), str2, a.a().c(a.cO, ""));
        } catch (IOException iOException) {
          System.out.println("Unable to read from start screen update server, connection to server unavailable");
          return;
        } 
        if (d == null) {
          D.d("Start Screen update Failed.");
          return;
        } 
        if (d.a() == 0) {
          try {
            a.a().b(str1, "" + (new Date()).getTime());
            a.a().e();
            return;
          } catch (a a1) {
            Logger.getLogger(iS.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
          } 
        } else if (d.a() == 2) {
          try {
            t.b(paramFile);
            File file = new File(paramFile, "tmp");
            file.mkdirs();
            file.delete();
            a.a(paramFile, d);
            String str = d.b();
            str = X.b(str, a.b + " Update available! Would you like Auto Update to upgrade to version ", "");
            str = X.b(str, " now?", "");
            a(paramFile);
            a.a().b(str3, str.trim());
            D.d("Updated Start Screen: " + str2);
            if (paramiV != null)
              paramiV.a(); 
          } catch (IOException iOException) {
            D.a("Failed to update Start Screen: " + paramString + ", Error: " + iOException.getMessage());
          } 
        } else if (d.a() == 1) {
          hq.a().a(d.b());
        } else if (d.a() != 8 && d.a() == 4) {
        
        } 
        a.a().b(str1, "" + (new Date()).getTime());
        a.a().e();
      } catch (a a) {
        Logger.getLogger(iS.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      } 
    } else {
      System.out.println(str2 + ": No check, last update check=" + (new Date(l2)).toString());
    } 
  }
  
  private void a(File paramFile) {
    String[] arrayOfString = paramFile.list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].toLowerCase().endsWith(".zip"))
        try {
          hq.a().a("Updating Start Screen.");
          File file = new File(paramFile, arrayOfString[b]);
          if (ae.a(file.getAbsolutePath(), paramFile.getAbsolutePath(), null).equals(ae.a))
            (new File(paramFile, arrayOfString[b])).delete(); 
        } catch (ZipException zipException) {
          zipException.printStackTrace();
        } catch (IOException iOException) {
          iOException.printStackTrace();
        }  
    } 
  }
  
  public void b(File paramFile, String paramString, iV paramiV) {
    iT iT = new iT(this, paramFile, paramString, paramiV);
    b().a(iT);
  }
  
  private iU b() {
    if (this.d == null || !this.d.isAlive())
      this.d = new iU(this); 
    return this.d;
  }
  
  public void a() {
    String str = b + "ad";
    a.a().b(str, this.c);
    str = b + "main";
    a.a().b(str, this.c);
    str = b + "register";
    a.a().b(str, this.c);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */