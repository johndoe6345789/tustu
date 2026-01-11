package aP;

import G.R;
import G.Y;
import V.g;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.List;
import r.i;
import u.g;

class hL implements g {
  R a;
  
  Y b;
  
  File c;
  
  boolean d = false;
  
  hL(hH paramhH, R paramR, Y paramY, File paramFile) {
    this.a = paramR;
    this.b = paramY;
    this.c = paramFile;
  }
  
  public String a() {
    return "Load Settings from " + this.c.getName();
  }
  
  public String b() {
    return "Will load all differences in " + this.c.getName() + " to replace current settings.";
  }
  
  public boolean d() {
    boolean bool = bV.a("Are you sure you want to load all settings from " + this.c.getName() + "?", dd.a().c(), true);
    if (bool) {
      if (i.a().a("-=fds[pfds[pgd-0")) {
        String str = "Save before loading " + this.c.getName() + " from a Difference report.";
        f.a().d(this.a, str);
      } 
      iw iw = new iw(this.a, dd.a().b(), 0);
      iw.a();
      if (this.c == null || !this.c.exists()) {
        for (byte b = 0; b < this.b.e(); b++) {
          try {
            this.a.h().a(b, 0, this.b.b(b));
            this.a.h().g();
          } catch (g g1) {
            g1.printStackTrace();
            String str = "A strange error occured!\nI am not sure what would cause this, but it appears that it happened.\nPlease report it.";
            bV.d(str, null);
            return false;
          } 
        } 
        this.a.I();
      } else {
        f.a().a(dd.a().c(), this.a, this.c.getAbsolutePath(), (List)null);
      } 
      this.d = true;
      return true;
    } 
    return false;
  }
  
  public boolean c() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */