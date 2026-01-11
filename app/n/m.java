package n;

import G.R;
import G.T;
import V.g;
import W.aa;
import W.d;
import aE.a;
import ac.v;
import bH.D;
import bH.X;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import r.i;

public class m implements v {
  public String a() {
    return "LogStart_MAIN_TUNE";
  }
  
  public String b() {
    return "msq";
  }
  
  public boolean c() {
    return false;
  }
  
  public String d() {
    if (!i.a().a(" 09s98r32-po3q9264") || !a.a().c(a.ae, a.af)) {
      D.d("Not saving tune to data log, option disabled.");
      return null;
    } 
    a a = a.A();
    String str = null;
    if (a != null) {
      File file = a.c(a.u());
      if (file.exists() && file.lastModified() > System.currentTimeMillis() - 172800000L)
        try {
          str = new String(d.a(file));
        } catch (IOException iOException) {
          Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Error reading " + file.getName(), iOException);
        }  
    } 
    if (str != null)
      return str; 
    D.c("No currenttune, will generate new msq for infodata.");
    aa aa = new aa();
    R r = T.a().c();
    if (r != null) {
      try {
        File file = File.createTempFile(X.a(), "msq");
        aa.a(r, file.getAbsolutePath(), new o());
        str = new String(d.a(file));
      } catch (IOException iOException) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Failed to create temp file for start tune Info Data", iOException);
      } catch (g g) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Failed to save temp file msq for start tune Info Data", (Throwable)g);
      } 
    } else {
      D.c("Main Config is null, skipping tune info data.");
    } 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */