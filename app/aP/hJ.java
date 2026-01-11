package aP;

import G.R;
import G.Y;
import r.a;
import r.i;
import s.g;
import u.g;

class hJ implements g {
  R a;
  
  Y b;
  
  boolean c = false;
  
  hJ(hH paramhH, R paramR, Y paramY) {
    this.a = paramR;
    this.b = paramY;
  }
  
  public String a() {
    return "Use Controller Settings";
  }
  
  public String b() {
    String str;
    if (i.a().a("-=fds[pfds[pgd-0")) {
      str = g.b("Save a Restore Point and Update the " + a.b + " settings with the current Controller settings.");
    } else {
      str = g.b("Update the " + a.b + " settings with the current Controller settings.");
    } 
    return str;
  }
  
  public boolean d() {
    if (i.a().a("-=fds[pfds[pgd-0"))
      f.a().d(this.a, g.b(a.b + " settings before accepting Controller values in a Difference Report.")); 
    if (hH.a(this.d, this.a, this.b, false)) {
      String str;
      if (i.a().a("-=fds[pfds[pgd-0")) {
        str = g.b("The Controller settings have been loaded successfully.") + "\n" + g.b("A Restore point has been saved containing the previous " + a.b + " settings.");
      } else {
        str = g.b("The Controller settings have been loaded successfully.");
      } 
      hq.a().b(str);
      f.a().e(this.a);
      return true;
    } 
    hq.a().b("Failed to load the Controller settings. Check logs for details.");
    return false;
  }
  
  public boolean c() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */